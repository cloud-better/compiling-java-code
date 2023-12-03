    javac -d . Greeter.java
    javac -d . HelloWorld.java
    
    tree
	.
	├── Greeter.java
	├── HelloWorld.java
	└── hello
	    ├── Greeter.class
	    └── HelloWorld.class
	    
    java hello/HelloWorld
    
    java hello.HelloWorld
