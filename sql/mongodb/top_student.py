from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client["student"]
collection = db["stud"]

# Sort by mark in descending order and get top record
top_student = collection.find_one(sort=[("mark", 1)])

top_student = collection.find_one(
    {},
    {"_id": 0, "name": 1},
    sort=[("mark", -1)]
)

print("Top Student:")
print(top_student)