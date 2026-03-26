read -p "enter a string: " str
lens=${#str}
for (( i=$lens-1; i>=0; i--))
do
rev_str="$rev_str${str:$i:1}"
done
echo "$rev_str"