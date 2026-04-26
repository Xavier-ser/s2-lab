from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client["student"]
collection = db["stud"]

record = collection.find_one({"rollno": 3})
print(record)

record = collection.find_one({"rollno": 3}, {"_id": 0})
print(record)

record = collection.find_one({"rollno": 3}, {"_id": 0}, {"name": -1})
print(record)

