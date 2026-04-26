from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client["student"]
collection = db["stud"]

# Sort by name ascending (A → Z)
records = collection.find({}, {"_id": 0, "name": 1}).sort("name", 1)

for record in records:
    print(record["name"])