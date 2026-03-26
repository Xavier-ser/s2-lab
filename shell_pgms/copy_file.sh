echo "enter the source file name: "
read src
echo "enter the file name:"
read dest
if [ -f $src ]
then 
cp $src $dest
echo "file copied successfully"
else
echo "source file does not exist"
fi