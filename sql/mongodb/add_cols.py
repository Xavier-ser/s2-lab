from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client["student"]
collection = db["stud"]

# Student 1
collection.update_one(
    {"rollno": 1},
    {
        "$set": {
            "mark1": 17,
            "mark2": 9,
            "mark3": 12
        },
        "$unset": {"mark": ""}
    }
)

# Student 2
collection.update_one(
    {"rollno": 2},
    {
        "$set": {
            "mark1": 100,
            "mark2": 99,
            "mark3": 98
        },
        "$unset": {"mark": ""}
    }
)

# Student 3
collection.update_one(
    {"rollno": 3},
    {
        "$set": {
            "mark1": 22,
            "mark2": 32,
            "mark3": 28
        },
        "$unset": {"mark": ""}
    }
)

# Student 4
collection.update_one(
    {"rollno": 4},
    {
        "$set": {
            "mark1": 0,
            "mark2": 5,
            "mark3": 22
        },
        "$unset": {"mark": ""}
    }
)

# Student 5
collection.update_one(
    {"rollno": 5},
    {
        "$set": {
            "mark1": 18,
            "mark2": 10,
            "mark3": 33
        },
        "$unset": {"mark": ""}
    }
)

print("Marks updated separately for each student.")