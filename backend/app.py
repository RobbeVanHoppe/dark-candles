from flask import Flask

app = Flask(__name__)

app.Route("/api/users")
def get_users():
    return sample_users.json