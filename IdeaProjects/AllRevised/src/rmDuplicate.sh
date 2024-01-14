#!/bin/bash

# Change to the directory containing the Java files
cd /Users/anushthan/Library/Mobile\ Documents/com~apple~CloudDocs/Development/Java/IdeaProjects/AllRevised/src/cWH


# Find all the duplicate files
duplicates=$(find . -type f -name "* 2.java")

# Remove the duplicate files
for file in $duplicates; do
    rm "$file"
done