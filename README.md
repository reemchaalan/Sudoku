# Sudoku
Java Sudoku Solver

This is a little project I've created to practice my Java skills. I have three different types of objects:
1) The little square that you fill in (or is already filled in).
2) The enneads (which is a fun word for a "set of 9"). These will be the rows, columns, and blocks made of 9 squares.
3) The table itself, which is made up of enneads.

Some notes on how this works: Each empty square will have the value "0". Each square will aslo come with an array of "notes". If you've ever solved a tricky Sudoku puzzle, you know that having a list of Possible Values that you can put into each square can really help you fill in the table. These notes will be used to track what can and can't go into a square. For example, if you have an empty square in an empty row and an empty column, but with a "1" in the same block, then the possible values that the square can have are {2,3,4,5,6,7,8,9}
