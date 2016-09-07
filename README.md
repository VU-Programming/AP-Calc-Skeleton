#Calculator assignment for Advanced Programming.

## How to build
Run `./gradlew jar`.
Then run `java -jar build/libs/AP1-1.0.jar`

## Test with random input
`python util/generate_expressions.py | java -jar build/libs/AP1-1.0.jar`

## How to hand in
Execute `./gradlew archive`.

Hand in the file `build/archive/AP1.zip`

## Info
To build the project we will use gradle. 
By executing `gradle build` in the top level directory of the project, the 
project will be built. If you do not have gradle installed, do not worry! 
The template includes a gradle wrapper (./gradlew), that will download gradle 
on-the-fly when executed. You can use the command `./gradlew` instead of 
`gradle` in all subsequent examples.


We have applied the idea (IntelliJ) and eclipse plugin to the gradle file. 
If you want to import the project into eclipse, execute `gradle eclipse` 
in the top-level directory. This will generate a project file that can be 
imported in Eclipse. Likewise, if you run `gradle idea`, gradle will 
generate an IntelliJ project for you.

### Import in IntelliJ
[How to import in IntelliJ](https://www.jetbrains.com/help/idea/2016.2/importing-project-from-gradle-model.html).

### Import in Eclipse
Run `./gradlew eclipse` in the project directory, and then [follow this](http://help.eclipse.org/kepler/index.jsp?topic=%2Forg.eclipse.platform.doc.user%2Ftasks%2Ftasks-importproject.htm).

