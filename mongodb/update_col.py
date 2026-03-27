from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client["student"]
collection = db["stud"]

collection.update_one({"rollno": 1}, {"$set": {"mark": 5}})
collection.update_one({"rollno": 2}, {"$set": {"mark": 90}})
collection.update_one({"rollno": 3}, {"$set": {"mark": 78}})
collection.update_one({"rollno": 4}, {"$set": {"mark": 88}})
collection.update_one({"rollno": 5}, {"$set": {"mark": 12}})

print("Marks added successfully.")