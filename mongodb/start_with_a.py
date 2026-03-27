from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client["student"]
collection = db["stud"]

pipeline = [
    {
        "$match": {
            "name": {"$regex": "^A", "$options": "i"}  # name starts with A (case-insensitive)
        }
    },
    {
        "$project": {
            "_id": 0,
            "rollno": 1,
            "name": 1,
            "total": {"$add": ["$mark1", "$mark2", "$mark3"]}
        }
    },
    {
        "$match": {
            "total": {"$gt": 100}   # total greater than 100
        }
    }
]

result = collection.aggregate(pipeline)

for r in result:
    print(r)