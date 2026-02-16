echo "enter the file or directory to check : "
read name

if [ -d "$name" ];then
echo " $name is a directoryy"
else 
echo " $name is not a directory"
fi  