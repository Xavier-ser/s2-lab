#!/bin/bash

# Simple Menu Driven Calculator

while true
do
    echo "----------------------"
    echo " MENU DRIVEN CALCULATOR "
    echo "----------------------"
    echo "1. Addition"
    echo "2. Subtraction"
    echo "3. Multiplication"
    echo "4. Division"
    echo "5. Exit"
    echo "---------------------"

    read -p "Enter your choice: " choice

    if [ $choice -eq 5 ]
    then
        echo "Exiting..."
        break
    fi

    read -p "Enter first number: " a
    read -p "Enter second number: " b

    case $choice in

        1)
            result=$((a + b))
            echo "Result = $result"
            ;;

        2)
            result=$((a - b))
            echo "Result = $result"
            ;;

        3)
            result=$((a * b))
            echo "Result = $result"
            ;;

        4)
            if [ $b -eq 0 ]
            then
                echo "Division by zero not possible"
            else
                result=$((a / b))
                echo "Result = $result"
            fi
            ;;

        *)
            echo "Invalid Choice"
            ;;

    esac

    echo
done