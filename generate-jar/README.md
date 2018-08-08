# Compile java file and generate jar
1. `javac Add.java -d ./build`
2. `cd build | touch manifest.mf`
3. fill `manifest.mf` with
```
Manifest-Version: 1.0
Main-Class: add.Add
```
4. `jar -cvfm Add.jar manifest.mf add/`

# run the jar
`java -jar Add.jar 2 3`
Suppose to generate
`2 + 3 = 5`