from pymongo import MongoClient

# Connect to MongoDB (localhost:27017)
client = MongoClient("mongodb://localhost:27017/")

# Create / Access database
db = client["student"]

# Create / Access collection
collection = db["stud"]

# Data to insert
student = [
    {"rollno": 1, "name": "Aarjav"},
    {"rollno": 2, "name": "Abhay"},
    {"rollno": 3, "name": "Vrinda"},
    {"rollno": 4, "name": "Aravindh"},
    {"rollno": 5, "name": "Mr Jithu"},
    {"rollno": 6, "name": "Nandana"}
    
]

# Insert 5 rows
collection.insert_many(student)

print("5 records inserted successfully!")