from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client["student"]
collection = db["stud"]

result = collection.delete_many({
    "$expr": {
        "$lt": [
            {"$add": ["$mark1", "$mark2", "$mark3"]},
            100
        ]
    }
})

print("Number of documents deleted:", result.deleted_count)