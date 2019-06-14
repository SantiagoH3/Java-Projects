# Java-Projects
My Java projects.

## Exercise Solutions.
Discussions and links to code for various exercises from the book Head First Java.

### Chapter 1 - A Quick Dip.

#### Page 9 - Writing a class with main.
Typing, compiling and running of a program called [MyFirstAppJava](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter01/MyFirstAppJava/src/MyFirstApp.java). The output of this program will be:  
```
I Rule!
The World is yours!
```
#### Page 12 - Example of a while loop.
Typing, compiling and running of a program called [Loopy](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter01/Loopy/src/Loopy.java). The output of this program will be:  
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
Typing, compiling and running of a program called [BeerSong](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter01/BeerSong/src/BeerSong.java). This is the song (https://www.youtube.com/watch?v=FITjBet3dio). I recommend just listening the song and not drinking the 99 beers ... alone.

#### Page 24 - Example of a while loop.
Typing, compiling and running of a program called [PoolPuzzleOne](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter01/PoolPuzzleOne/src/PoolPuzzleOne.java). The output of this program will be:
```
a noise 
annoys 
an oyster 
```

### Chapter 2 - Classes and Objects.

#### Page 38 - The Guessing Game.
The guessing game involves a `game` object and three `player` objects. The game generates a random number between `0 and 9`, and the three player objects try to guess it. You can found the project [here](https://github.com/SantiagoH3/Java-Projects/tree/master/HeadFirstJava/Chapter02/GuessGame/src)

Classes:

[GuessGame.java](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter02/GuessGame/src/GuessGame.java)

[Player.java](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter02/GuessGame/src/Player.java)

[GameLauncher.java](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter02/GuessGame/src/GameLauncher.java)

#### Page 42 - Be the Compiler.
The code about tape decks will not compile because an object, called `t`, is used without being created. A fixed version of the code can be found [here](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter02/TapeDeck/src/TapeDeck.java). The output of this program will be:  
```
tape playing
tape recording
```

The code about DVD players will not compile because an method is called that isn't defined in the class DVDPlayer. A fixed version of the code can be found [here](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter02/DVDPlayer/src/DVDPlayerTestDrive.java). The output of this program will be:  
```
DVD playing
DVD recording
```

### Chapter 3 - Primitives and References.

#### Page 62 - Dog Array.
Typing, compiling and running of a program called [DogArray](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter03/DogArray/src/Dog.java). The output of this program will be:
```
null says uaf uaf!
last dog's name is Blacky
Terry says uaf uaf!
Jordan says uaf uaf!
Blacky says uaf uaf!
```

#### Page 63 - Be the Compiler.
The code with the Books class will not run as intended. It will cause a null-pointer exception at run time. The problem is that an array that can hold references to Books objects is created, but no actual Books objects are then created to be put in the array.  

A fixed version of the code can bee found [here](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter03/BooksArray/src/Books.java). The output when running the code will be:  
```
Remote Office not Required by Jason
The Java Cookbook by Sue
El mundo segun Rick by Rick Sanchez
``` 

The code with the Hobbits class will not run as intended. It will cause a array out of bounds exception at run time. The allowed array indexes to use will in this case be 0 to 2 but the original code will try to place a hobbit at index 3 that does not exist. Array indexes start at 0 and is it a common mistake to forget this.  

A fixed version of the code can bee found [here](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter03/HobbitsPro/src/Hobbits.java). The output when running the code will be:  
```
Bilbo is a good Hobbit name
Frodo is a good Hobbit name
Sam is a good Hobbit name
```

#### Page 64 - Code Magnets.
Rebuilding the program code snippets [here](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter03/TriangleExtraBonus/src/Triangle.java) to make the Java program work and produce the correct result. The output when running the code will be:
```
island = Fiji
island = Cozumel
island = Madagascar
island = Bermuda
```
### Chapter 4 - Methods use Instance Variables.

#### Page 84 - PoorDog.
Typing, compiling and running of a program called [PoorDog](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter04/PoorDog/src/PoorDogTestDrive.java). The output of this program will be:
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
The [code](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter04/XCopy/src/XCopy.java) with the class called XCopy will compile.  

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
Rebuilding the program code snippets [here](https://github.com/SantiagoH3/Java-Projects/tree/master/HeadFirstJava/Chapter04/Puzzle4/src) to make the Java program work and produce the correct result. The output when running the code will be:
```
result 543345
```

### Chapter 5 - Writing a program.

#### DotCom Game.
We are against the computer, but unlike the real Battleship game, in this one you do not place any ships of your own. Instead, our job is to sink the computer's ships in the fewest number of guesses. In the next [project](https://github.com/SantiagoH3/Java-Projects/tree/master/HeadFirstJava/Chapter05/DotCom/src) I have the way to solve and run the program correctly, then the classes and logic of the program are shown.
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
This is the link of the [code](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter05/BeTheCompilerChap05/src/Output.java)

### Chapter 6 - Get to know the Java API.

#### DotCom Game.
The DotCom Game full version, in this chapter I finished the project created in the last chapter.
In the final version of the DotCom [class](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter06/DotCom06/src/DotCom.java) we can found the next code:

A setter method that updates the DotCom's location (Random location provided by the GameHelper placeDotCom() method)
```Java
public void setLocationCells(ArrayList<String> loc)
        {
            locationCells = loc;
        }
```
The ArrayList indexOf() method in action. If the user guess in one of the entries in the ArrayList, indexOf() will return its ArrayList location. If not, indexOf() will return -1.
```int index = locationCells.indexOf(userInput);```

Using the isEmpty() method to see if all locations have been guessed.
```if (locationCells.isEmpty())```

In the java [class](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter06/DotCom06/src/DotComBust.java) called DotComBust we can found the next code:

Make an ArrayList of DotCom objects (in other words, a list that will hold only DotCom objects.
``` private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();```

Make three DotCom objects, giving names, and stick in the ArrayList.
```
DotCom one = new DotCom();
            one.setName("Pets.com");
            DotCom two = new DotCom();
            two.setName("eToys.com");
            DotCom three = new DotCom();
            three.setName("Go2.com");
            dotComsList.add(one);
            dotComsList.add(two);
dotComsList.add(three);
```
Call the setter method on this DotCom to give in the location you just got from the helper.
``` dotComSet.setLocationCells(newLocation);```

Call the next methods:
``` checkUserGuess(userGuess);```
``` finishGame();```

### Chapter 7 - Inheritance and polymorphism.

#### Page 193 - Be the Compiler.
The [code](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter07/MonsterTestDrive/src/MonsterTestDrive.java) with the class called MonsterTestDrive will compile.
```Java
class Monster {
    boolean frighten(int d) {
        System.out.println("arrrgh");
        return true;
    }
}
```
This implementation of frighten has been written with a boolean return type and an integer parameter. When you extend this class, the child class inherits this method. Say I create another child class [Vampire](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter07/MonsterTestDrive/src/MonsterTestDrive.java#L19)

At first glance this class has no methods or attributes associated with it; but in reality, due to class inheritance it implicitly has the frighten method declared in its parent class. This is what the compiler sees:
```Java
class Vampire extends monster{
      boolean frighten(int d){ // Method **from** the parent class
      //This is implicitly built into the subclass due to inheritance
           System.out.println("arrah");
           return false;
      }
 }
 ```
However, these methods are not set in stone. Within the child class it is possible to override parent class methods. This is what you have done in your vampier and dragon subclasses. This is an override because your methods have the same return type, same method name, and same parameters.
```Java
class Dragon extends Monster {
    boolean frighten(int degree) {
        System.out.println("breath fire");
        return true;
    }
}
```

#### Page 194 - Pool Puzzle.
In this project I complete the job using the snippets from the pool and place them into the blank lines in the code.
You can found the complete code [here](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter07/TestBoat/src/TestBoat.java)

### Chapter 8 - Interfaces and abstract classes.

#### Page 232 - Pool Puzzle.
Typing, compiling and running of a program called [PoolPuzzle](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter08/PoolPuzzleCH08/src/Puzzle.java). The output of this program will be:  
```
5 class Acts
7 class Clowns
7 class Puzzle
```

### Chapter 9 - Object Construction  

#### Page 252 - Sharpen your pencil  
Example code that illustrates constructor chaining. We have a class Hippo that inherits from another class called Animal. When a new Hippo is created so will the Animal constructor be run before the Hippo constructor. This can be verified by running the this [test program](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter09/TestHippo/src/TestHippo.java) that uses the classes [Hippo](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter09/TestHippo/src/Hippo.java) and [Animal](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter09/TestHippo/src/Animal.java).  

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

This is the link of the [code](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter09/GC/src/GarbageCollector.java)

### Chapter 10 - Numbers and statics.

#### Page 310 - Be the Compiler.
Use the possible output if this [code](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter10/BeTheCompilerCH10/src/StaticTests.java) can compile.

StaticSuper() is a constructor, and must have() in its signature. Notice that as the output below demonstrates, the static blocks for both classes run before either of the constructors run.
```Java
StaticSuper(){
        System.out.println("Super constructor");
}
```

#### Page 312 - Code Manegts.
In the following project the code fragments are reconstructed to make a program that produces the following result:
```
full moon on Fri Feb 06 04:09:02 MST 2004
full moon on Sat Mar 06 16:37:50 MST 2004
full moon on Mon Apr 05 06:06:38 MDT 2004
full moon on Tue May 04 18:35:26 MDT 2004
full moon on Thu Jun 03 07:04:14 MDT 2004
full moon on Fri Jul 02 19:33:02 MDT 2004
full moon on Sun Aug 01 08:01:50 MDT 2004
```
This in order to know the dates in which there was a full moon, which occur every 29.52 days approximantly. You can found the code [here](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter10/FullMoons/src/FullMoons.java)

### Chapter 11 - Exception handling.

#### Page 342 - A sound application.
In this [app](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter11/MiniMiniMusicApp/src/MiniMiniMusicApp.java) we can run and hear the sound of someone playing a single note of a piano.

First of all I import the `midi package`:
```import javax.sound.midi.*;```

Get a sequencer and open it: ``` Sequencer sequencer = MidiSystem.getSequencer();```

Ask the sequence for a Track. Track lives in the Sequence, and the `MIDI` data lives in the Track:
``` Track track = seq.createTrack();```

Put some MidiEvents into the Track:
```
ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1); // <-- means at tick one, the above event happens
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16); // <-- means at tick one, the above event happens
track.add(noteOff);
```
Start() the Sequencer(like pushing PLAY eaea): ``` sequencer.start();```

##### Page 346 - Change the instrument and note.
This version still plays just a single note, but you get to use command-line arguments to change the instrument and note, you can found the code [here](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter11/MiniMiniMusicCMDLine/src/MiniMiniMusicCMDLine.java).

### Chapter 12 - Getting GUI.

#### Page 379 - Two buttons.
Creating our first GUI project with two buttons [project](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter12/TwoButtons/src/TwoButtons.java).

#### Page 392 - Mini Music Player.
Finish the project of the Mini Music, using some packages for complete this project, also using a `for` like a piano to create events and call or new makeEvent() to make a message and event, then the result(the MidiEvent returned from makeEvent()) to the Track.
You can found the all code [here](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter12/MiniMusicPlayer3/src/MiniMusicPlayer3.java)

### Chapter 13 - Using swing.

#### Page 418 - Code Chicken.
Create the BeatBox project using the GUI with some checkboxes, labels, etc.
In the next [link](https://github.com/SantiagoH3/Java-Projects/blob/master/HeadFirstJava/Chapter13/BeatBox/src/BeatBox.java) you can found the code of this project.

- - -

### Interesting Java facts

In the next [link](https://github.com/SantiagoH3/Java-Projects/blob/master/InterestingJavaFacts.md) you can found some definitions, information, tables, related to the book, all with the purpose of knowing also the concept or the theory of the topics seen.
