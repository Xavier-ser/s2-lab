from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client["student"]
collection = db["stud"]

result = collection.delete_one({"rollno": 3})

print("Number of documents deleted:", result.deleted_count)