
# Run ls command with nice value 10 (lower priority than default 0)
nice -n 10 ls -l

echo "Process priority details:"
ps -l | grep $$