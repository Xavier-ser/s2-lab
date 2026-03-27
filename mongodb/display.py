from pymongo import MongoClient

# Connect to MongoDB
client = MongoClient("mongodb://localhost:27017/")

# Access database and collection
db = client["student"]
collection = db["stud"]

# Fetch all records
records = collection.find()

# Display records
for record in records:
    print(record)