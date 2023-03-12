from flask import Flask, jsonify
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


@app.route("/api/users/")
def get_users():
    users = []
    conn = connection()
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM dbo.Users")
    for row in cursor.fetchall():
        users.append({"UserId": row[0],
        "Password": row[1],
        "FirstName": row[2],
        "LastName": row[3],
        "Street": row[4],
        "PostCode": row[5],
        "HouseNumber": row[6],
        "Email": row[7],
        "PhoneNumber": row[8]})
    conn.close()
    return jsonify(users)

@app.route("/api/users/<int:index>")
def get_single_user(index):
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
