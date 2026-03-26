#!/bin/bash

echo "Owner   Size   FileName"
echo "------------------------"

# List files in long format and extract specific columns
ls -l | awk '{print $3, $5, $9}'