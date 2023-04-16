from flask import Flask, jsonify, request, abort
import pyodbc

from model import users

app = Flask(__name__)


def connection():
    s = 'VIVOBOOK\SQLEXPRESS'  # Your server name
    d = 'dark-candles'
    # u = ''  # Your login
    # p = ''  # Your login password
    cstr = 'DRIVER={ODBC Driver 17 for SQL Server};SERVER=' +s+';DATABASE='+d+';Trusted_Connection=yes'
    conn = pyodbc.connect(cstr)
    return conn


@app.route("/api/testusers/")
def get_testusers():
    return users


@app.route("/api/users/", methods=["GET", "POST"])
def get_users():

    if request.method == "POST":
        conn = connection()
        cursor = conn.cursor()
        cursor.execute("INSERT INTO dbo.Users" +
                       "(Username, Password, FirstName, LastName, Street, Postcode, HouseNumber, PhoneNumber, Email)" +
                       "VALUES("+
                       )
    else:
        users = []
        conn = connection()
        cursor = conn.cursor()
        cursor.execute("SELECT * FROM dbo.Users")
        for row in cursor.fetchall():
            users.append({"UserId": row[0],
            "Username": row[1],
            "Password": row[2],
            "FirstName": row[3],
            "LastName": row[4],
            "Street": row[5],
            "PostCode": row[6],
            "HouseNumber": row[7],
            "PhoneNumber": row[8],
            "Email": row[9]})
        conn.close()
        return jsonify(users)

@app.route("/api/users/<int:index>")
def get_single_user(index):
    try:
        user = []
        conn = connection()
        cursor = conn.cursor()
        cursor.execute("SELECT * FROM dbo.Users WHERE UserId = " + str(index))
        for row in cursor.fetchall():
            user.append({"UserId": row[0],
            "Password": row[1],
            "FirstName": row[2],
            "LastName": row[3],
            "Street": row[4],
            "PostCode": row[5],
            "HouseNumber": row[6],
            "Email": row[7],
            "PhoneNumber": row[8]})
        conn.close()
        return user
    except:
        return abort(404)
