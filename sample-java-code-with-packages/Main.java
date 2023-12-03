package packageExample.Source;
public class Main {
    public static void main(String[] args) {
        System.out.println("We are learning Maven!"); 
    }
}


# Execute: javac -d . Main.java

#List Directory contents and you find that a folder is created:
# ls
# Main.java  packageExample

# tree
# .
# ├── Main.java
# └── packageExample
#     └── Source
#        └── Main.class

# Execute: java packageExample/Source/Main

# OR

# Execute: java packageExample.Source.Main
