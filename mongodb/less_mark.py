from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client["student"]
collection = db["stud"]

pipeline = [
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
            "total": {"$lt": 45}
        }
    }
]

# Convert cursor to list to count results
result = list(collection.aggregate(pipeline))

# Print students
for r in result:
    print(r)

# Print count
print("Number of students with total < 45:", len(result))