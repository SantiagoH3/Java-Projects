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

#### DotCom Game.
We are against the computer, but unlike the real Battleship game, in this one you do not place any ships of your own. Instead, our job is to sink the computer's ships in the fewest number of guesses. In the next [project](https://github.com/SantiagoH3/Java-Projects/tree/master/DotCom/src) I have the way to solve and run the program correctly, then the classes and logic of the program are shown.
This is just an example:
```
enter a number  1
miss
enter a number  3
miss
enter a number  2
miss
enter a number  4
hit
enter a number  6
hit
enter a number  5
kill
You took 6 guesses
```
#### Page 118 - Be the JV.
The code in this exercise will update the variables `x` and `y` in the following seguence.

`y` is set to 7 and `x` is undefined before entering the for loop.  

`y` is increased to 8 and `x` is 1 in the first round of the for loop.  

`y` is increased to 9 and `x` is 2 in the second round of the for loop.

`y` is increased to 10 and `x` is 3 it the third round of the for loop.

`y` is increasde to 11 and `x` is 4 in the fourth round of the for loop.

`y` is first increased to 12 and `x` is 5 in the fifth round of the for loop. `x` now being larger than 4 causes y to be increased to 13 and then so is this number printed.  

`y` is first increased to 14 and `x` is 6 in the sixth round of the for loop. `x` being larger than 4 causes `y` to be increased to 15 and then so is this number printed. `y` now being larger than 14 causes `"x = "` and the value of `x` to be printed. The following break statement  will then end the execution of the for loop out of the for loop.

To conclude so will the program when run print out:  
```
13 15 x = 6
```
This is the link of the [code](https://github.com/SantiagoH3/Java-Projects/blob/master/BeTheCompilerChap05/src/Output.java)

### Chapter 6 - Get to know the Java API.


### Chapter 7 - Inheritance and polymorphism.


### Chapter 8 - Interfaces and abstract classes.


### Chapter 9 - Object Construction  

#### Page 252 - Sharpen your pencil  
Example code that illustrates constructor chaining. We have a class Hippo that inherits from another class called Animal. When a new Hippo is created so will the Animal constructor be run before the Hippo constructor. This can be verified by running the this [test program](https://github.com/SantiagoH3/Java-Projects/blob/master/TestHippo/src/TestHippo.java) that uses the classes [Hippo](https://github.com/SantiagoH3/Java-Projects/blob/master/TestHippo/src/Hippo.java) and [Animal](https://github.com/SantiagoH3/Java-Projects/blob/master/TestHippo/src/Animal.java).  

#### Page 266 - Be the Garbage collector
Assume the following code:
```Java  
public class GarbageCollector {
    public static GarbageCollector  doStuff() {
        GarbageCollector newGC = new GarbageCollector();
        doStuff2(newGC);
        return newGC;
    }

    public static void main(String[] args) {
        GarbageCollector gc1;
        GarbageCollector gc2 = new GarbageCollector();
        GarbageCollector gc3 = new GarbageCollector();
        GarbageCollector gc4 = gc3;
        gc1 = doStuff();

        // place for one statement from the list

        // call more methods

    }

    public static void doStuff2(GarbageCollector copyGC) {
        GarbageCollector localGC = copyGC;
    }
}

```  

Now assume that we have the following list of statements that are suggested to be inserted at (A) in the code above. The question is which can be inserted without compilation errors and then also which statements would cause exactly one extra object to be up for garbage collection?  

```
copyGC = null;
```
Will not compile because `copyGC` is out of scope when attempted to be used.  
```
gc2 = null;
```
Will compile and will cause `gc2` to be up for garbage collection.  
```
newGC = gc3;
```
Will not compile because `newGC` is out of scope when attempted to be used.  
```
gc1 = null
```
Will compile and will cause the `GC` instance that `gc1` used to refer to be up for garbage collection.  
```
newGC = null;  
```
Will not compile because `newGC` is out of scope when attempted to be used.  
```
gc4 = null;
```
Will compile but will not cause anything new to be up for garbage collection since `gc3` still refers to the same instance.  
```
gc3 = gc2;
```
Will compile but will not cause anything new to be up for garbage collection since `gc4` still refers instance that `gc3` used to refer to.
```
gc1 = gc4;
```  
Will compile and will cause the `GC` instance that `gc1` used to refer to be up for garbage collection. 
``` 
gc3 = null;
```
Will compile but will not cause anything new to be up for garbage collection since `gc4` still refers instance that `gc3` used to refer to.  

### Chapter 10 - Numbers and statics.


### Chapter 11 - Exception handling.


### Chapter 12 - Getting GUI.


### Chapter 13 - Using swing.
