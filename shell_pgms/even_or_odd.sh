echo "enter the number"
read n
if [ $(( $n % 2 )) -eq 0 ];then
echo " numnber is even"
else
echo "number is odd"
fi