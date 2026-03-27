from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client["student"]
collection = db["stud"]

# Fetch student with rollno 2
student = collection.find_one({"rollno": 2}, {"_id": 0})

if student:
    total = student["mark1"] + student["mark2"] + student["mark3"]
    print("Total Marks of Roll No 2:", total)
else:
    print("Student not found")