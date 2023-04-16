import json

def load_users():
    with open("sample_users.json", "r") as file:
        return json.load(file)

users = load_users()