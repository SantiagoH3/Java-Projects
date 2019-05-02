# Java-Projects
My Java projects.

## Exercise Solutions.
Discussions and links to code for various exercises from the book Head First Java.

### Chapter 1 - A Quick Dip.

#### Page 9 - Writing a class with main.
Typing, compiling and running of a program called [MyFirstAppJava](https://github.com/SantiagoH3/Java-Projects/blob/master/MyFirstAppJava/src/MyFirstApp.java). The output of this program will be:  
```
I Rule!
The World is yours!
```
#### Page 12 - Example of a while loop.
Typing, compiling and running of a program called [Loopy](https://github.com/SantiagoH3/Java-Projects/blob/master/Loopy/src/Loopy.java). The output of this program will be:  
```
Before the Loop
In the Loop
Value of x is 1
In the Loop
Value of x is 2
In the Loop
Value of x is 3
This is after the loop
```
#### Page 14 - Example of a while loop of the Beer Song.
Typing, compiling and running of a program called [BeerSong](https://github.com/SantiagoH3/Java-Projects/blob/master/BeerSong/src/BeerSong.java). This is the song (https://www.youtube.com/watch?v=FITjBet3dio). I recommend just listening the song and not drinking the 99 beers ... alone.

#### Page 24 - Example of a while loop.
Typing, compiling and running of a program called [PoolPuzzleOne](https://github.com/SantiagoH3/Java-Projects/blob/master/PoolPuzzleOne/src/PoolPuzzleOne.java). The output of this program will be:
```
a noise 
annoys 
an oyster 
```

### Chapter 2 - Classes and Objects.

#### Page 38 - The Guessing Game.
The guessing game involves a `game` object and three `player` objects. The game generates a random number between `0 and 9`, and the three player objects try to guess it. You can found the project [here](https://github.com/SantiagoH3/Java-Projects/tree/master/GuessGame/src)

Classes:

[GuessGame.java](https://github.com/SantiagoH3/Java-Projects/blob/master/GuessGame/src/GuessGame.java)

[Player.java](https://github.com/SantiagoH3/Java-Projects/blob/master/GuessGame/src/Player.java)

[GameLauncher.java](https://github.com/SantiagoH3/Java-Projects/blob/master/GuessGame/src/GameLauncher.java)

#### Page 42 - Be the Compiler.
The code about tape decks will not compile because an object, called `t`, is used without being created. A fixed version of the code can be found [here](https://github.com/SantiagoH3/Java-Projects/blob/master/TapeDeck/src/TapeDeck.java). The output of this program will be:  
```
tape playing
tape recording
```

The code about DVD players will not compile because an method is called that isn't defined in the class DVDPlayer. A fixed version of the code can be found [here](https://github.com/SantiagoH3/Java-Projects/blob/master/DVDPlayer/src/DVDPlayerTestDrive.java). The output of this program will be:  
```
DVD playing
DVD recording
```

### Chapter 3 - Primitives and References.

#### Page 62 - Dog Array.
Typing, compiling and running of a program called [DogArray](https://github.com/SantiagoH3/Java-Projects/blob/master/DogArray/src/Dog.java). The output of this program will be:
```
null says uaf uaf!
last dog's name is Blacky
Terry says uaf uaf!
Jordan says uaf uaf!
Blacky says uaf uaf!
```

#### Page 63 - Be the Compiler.
The code with the Books class will not run as intended. It will cause a null-pointer exception at run time. The problem is that an array that can hold references to Books objects is created, but no actual Books objects are then created to be put in the array.  

A fixed version of the code can bee found [here](https://github.com/SantiagoH3/Java-Projects/blob/master/BooksArray/src/Books.java). The output when running the code will be:  
```
Remote Office not Required by Jason
The Java Cookbook by Sue
El mundo segun Rick by Rick Sanchez
``` 

The code with the Hobbits class will not run as intended. It will cause a array out of bounds exception at run time. The allowed array indexes to use will in this case be 0 to 2 but the original code will try to place a hobbit at index 3 that does not exist. Array indexes start at 0 and is it a common mistake to forget this.  

A fixed version of the code can bee found [here](https://github.com/SantiagoH3/Java-Projects/blob/master/HobbitsPro/src/Hobbits.java). The output when running the code will be:  
```
Bilbo is a good Hobbit name
Frodo is a good Hobbit name
Sam is a good Hobbit name
```

#### Page 64 - Code Magnets.
Rebuilding the program code snippets [here](https://github.com/SantiagoH3/Java-Projects/blob/master/TriangleExtraBonus/src/Triangle.java) to make the Java program work and produce the correct result. The output when running the code will be:
```
island = Fiji
island = Cozumel
island = Madagascar
island = Bermuda
```
### Chapter 4 - Methods use Instance Variables.

#### Page 84 - PoorDog.
Typing, compiling and running of a program called [PoorDog](https://github.com/SantiagoH3/Java-Projects/blob/master/PoorDog/src/PoorDogTestDrive.java). The output of this program will be:
```
Dog size is 0
Dog name is null
```

#### Page 87 - Sharpen your pencil.
Assume the method definition given below.  
```
int calcArea(int height, int width) {
	return height * width;
}
```
Example of legal statements that use the method are then the following.  
```
int a = calcArea(7, 12);  // Okay, the literals 7 and 12 will be interpreted as int values.
```
```
short c = 7;
calcArea(c, 12);  // Okay because a short will always fit in an int  
```
```
calcArea(2, 3);  // It is okay to not use the return value for anything.
```
Statements that would be illegal are for example the following.  
```
int d = calcArea(57);  // One of the arguments are missing.
```
```
long t = 42;
int a = calcArea(t, 12);  // Must cast the long to an int since t may be to big to fit in the int
```
```
int g = calcArea();	 // Both arguments are missing.
```
```
calcArea();  // Both arguments are missing.
```
```
byte h = calcArea(4, 20);  // The result may not fit in an byte variable since it is of type int
```
```
int j = calcArea(2, 3, 5);  // There is one argument too many
```

#### Page 88 - Be the Compiler.
The [code](https://github.com/SantiagoH3/Java-Projects/blob/master/XCopy/src/XCopy.java) with the class called XCopy will compile.  

The value that is changed inside the method go is just a copy of the value called `orig`. This means that `orig` will remain unchanged and will hold 42, y will be set to twice the value of `orig`.

The output when running the code will be:  
```
42 84  
```

The original code with the class called Clock will not compile. The problem is that the getter function doesn't return anything according to the declaration. This function should be declared to return a `String`.  

A fixed version of the code can be found [here](https://github.com/SantiagoH3/Java-Projects/blob/master/Clock/src/Clock.java).  

The output when running the code will be:  
```
time: 1245  
```
#### Page 91 - Pool Puzzle.
Rebuilding the program code snippets [here](https://github.com/SantiagoH3/Java-Projects/tree/master/Puzzle4/src) to make the Java program work and produce the correct result. The output when running the code will be:
```
result 543345
```

### Chapter 5 - Writing a program.
