echo "enter number a"
read a

echo "enter number b"
read b

echo "enter number c"
read c


if [ $a -ge $b ] && [ $a -ge $c ]; then
echo "$a is largest" 

elif [ $b -ge $a ] && [ $b -ge $c ]; then
echo "$b is largest "

else
echo "$c is largest"

fi