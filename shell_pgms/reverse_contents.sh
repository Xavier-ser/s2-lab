# echo "Enter the file name:"
# read file

# if [ ! "$file" ]
# then
#   echo "File not found"
# else
#   cat "$file" | tac
# fi



























echo "enter the filename : "
read file
if [! $file]; then
echo "file not found"
else
cat $file | tac
fi