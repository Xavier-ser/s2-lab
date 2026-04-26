from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")

db = client['college']
collection = db['studlist']


client = MongoClient("mongodb://localhost:27017/")

db = client["college"]
collection = db["studlist"]

print("\n1. Female students in MCA (fname, lname, mark):")
for doc in collection.find(
                        {"gender":"female", "course":"MCA"},
                        {"_id": 0, "name.fname": 1, "name.lname": 1, "mark": 1}):
    print(doc)

print("\n 2. Student with highest mark in MCA: ")
for doc in collection.find({"course": "MCA"}).sort("mark", -1).limit(1):
    print(doc)


print("\n3. Male students with A+ grade:")
for doc in collection.find(
        {"gender": "male", "grade": "A+"},{"_id": 0, "name.fname": 1, "name.lname": 1, "mark": 1}):
    print(doc)

print("\n4. Top three students in Mechanical department:")
for doc in collection.find(
        {"course": "Mechanical"},
        {"_id": 0, "name.fname": 1, "name.lname": 1}
    ).sort("mark", -1).limit(3):
    print(doc)

print("\n5. Female students scoring more than 90:")
for doc in collection.find(
        {"gender": "female", "mark": {"$gt": 90}},
        {"_id": 0, "name.fname": 1, "name.lname": 1, "grade": 1, "mark": 1, "phone": 1}):
    print(doc)

print("\n6. Students scoring >80 and <90:")
for doc in collection.find(
        {"mark": {"$gt": 80, "$lt": 90}},{"_id": 0, "name.fname": 1, "name.lname": 1, "mark": 1}):
    print(doc)

print("\n\n\n7. Students whose name starts with 'V':")
for doc in collection.find(
        {"name.fname": {"$regex": "^V", "$options": "i"}}):
    print(doc)

print("\n\n\n8. Students from Kollam:")
for doc in collection.find(
        {"address.place": "Kollam"}):
    print(doc)

print("\n\n\n9. Students not from Kollam or Thiruvananthapuram:")
for doc in collection.find(
        {"address.place": {"$nin": ["Kollam", "Thiruvananthapuram"]}}):
    print(doc)

print("\n\n\n10. Female students from Kollam or Thiruvananthapuram:")
for doc in collection.find(
        {
            "gender": "female",
            "address.place": {"$in": ["Kollam", "Thiruvananthapuram"]}
        }):
    print(doc)

client.close()