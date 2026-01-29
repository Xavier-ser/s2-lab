    #!/bin/bash

    echo "enter first number: "
    read a

    echo "enter first number: "
    read b

    echo " enter operator "
    read op

    if [ $op = "+" ]; then
    result=$((a+b))
    elif [ $op = "-" ]; then
    result=$((a-b))
    elif [ $op = "*" ]; then
    result=$((a*b))
    elif [ $op = "/" ]; then
    result=$((a/b))
    
    elif [ $op = "%" ]; then
    result=$((a%b))

    fi 
    echo "result is $result"



    