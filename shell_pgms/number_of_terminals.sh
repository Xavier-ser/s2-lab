user=$(whoami)

count=$(who | grep -w "$user" | wc -l)
echo "user '$user' logged '$count' times(s)"
