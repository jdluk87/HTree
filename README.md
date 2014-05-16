HTree-Java-Algorithm
====================

The H tree (so called because its repeating pattern resembles the letter "H") is a family of fractal sets 
whose Hausdorff dimension is equal to 2. They can be constructed by starting with a line segment of arbitrary 
length, drawing two shorter segments at right angles to the first through its endpoints, and continuing in the 
same vein, reducing (dividing) the length of the line segments drawn at each stage by √2. Surprisingly, 
continuing this process will eventually come arbitrarily close to every point in a rectangle, or in other words,
the H-fractal is a space-filling curve. It is also an example of a fractal canopy, in which the angle between
neighboring line segments is always 180 degrees.

For more information about HTree algorithm, please visit http://en.wikipedia.org/wiki/H_tree

To start the program, first compile the java file from shell with the command:
> javac Htree.java

Then execute the program with the command:
> java Htree n

where n is a positive integer representing the number of levels.

The project has been done as university project (Bachelor Degree in Computer Science) for the class of
Visualization Algorithm
