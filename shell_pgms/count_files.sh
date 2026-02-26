#!/bin/bash

# Prompt the user to enter a directory path
echo "Enter directory path:"
read dir

# Check whether the given path is a valid directory
if [ -d "$dir" ]; then
    
    # Use find command to list only regular files (-type f)
    # Pipe the output to wc -l to count the number of files
    count=$(find "$dir" -type f | wc -l)
    
    # Display the total file count
    echo "Number of files: $count"

else
    # If the directory does not exist, display error message
    echo "Directory does not exist."
fi