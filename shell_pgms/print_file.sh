echo "enter file name: "
read file
echo "enter starting line numeber: "
read start
tail -n +$start "$file"


# to print lines from 5 to 10
# sed -n '5,10p' data.txt 

