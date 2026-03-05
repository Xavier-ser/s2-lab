
#!/bin/bash
# Fibonacci Series Program

echo "Fibonacci Series Program"
echo "========================"
echo "Enter the number of terms:"
read n

# Check if input is valid
if ! [[ "$n" =~ ^[0-9]+$ ]] || [ "$n" -lt 1 ]; then
    echo "Error: Please enter a valid positive integer"
    exit 1
fi

echo ""
echo "First $n Fibonacci numbers:"
echo ""

# Initialize first two terms
a=0
b=1

# Generate and print Fibonacci series
for ((i=1; i<=n; i++))
do
    echo -n "$a "
    # Calculate next Fibonacci number
    temp=$((a + b))
    a=$b
    b=$temp
done

echo ""
echo ""
