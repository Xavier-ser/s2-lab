from pymongo import MongoClient

# 1. Connect to MongoDB (default localhost:27017)
client = MongoClient("mongodb://localhost:27017/")

# 2. Create / Access Database
db = client["college"]

# 3. Create / Access Collection
students = db["students"]

# ---------------------------
# CREATE (Insert)
# ---------------------------

# Insert one document
one_doc = {"_id": 101, "name": "Abhay", "roll_no": 2}
students.insert_one(one_doc)

# Insert many documents
many_docs = [
    {"_id": 102, "name": "Virat", "roll_no": 18},
    {"_id": 103, "name": "Anu", "roll_no": 5}
]
students.insert_many(many_docs)

print("Documents inserted successfully.\n")

# ---------------------------
# READ (Find)
# ---------------------------

print("All Documents:")
for doc in students.find():
    print(doc)

# ---------------------------
# UPDATE
# ---------------------------

students.update_one(
    {"_id": 101},              # filter
    {"$set": {"roll_no": 10}}  # update operation
)

print("\nAfter Update (_id=101):")
print(students.find_one({"_id": 101}))

# ---------------------------
# DELETE
# ---------------------------

students.delete_one({"_id": 103})

print("\nAfter Deletion (_id=103 removed):")
for doc in students.find():
    print(doc)

# Close connection
client.close()