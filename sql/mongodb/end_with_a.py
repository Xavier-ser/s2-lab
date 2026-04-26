from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client["student"]
collection = db["stud"]

# Names ending with 'a'
result = collection.find(
    {"name": {"$regex": "a$", "$options": "i"}},  # a$ means ends with 'a'
    {"_id": 0, "name": 1}
)

for r in result:
    print(r["name"])