**Download JUNIT5 jar files from here:**

https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.8.2/

    wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.8.2/junit-platform-console-standalone-1.8.2.jar


**Download JUNIT API jar from here**

https://repo1.maven.org/maven2/org/junit/jupiter/junit-jupiter-api/5.8.2/

    wget https://repo1.maven.org/maven2/org/junit/jupiter/junit-jupiter-api/5.8.2/junit-jupiter-api-5.8.2.jar

**Place them in the root directory**

**Compile Java Code**

```
javac -cp "junit-platform-console-standalone-1.8.2.jar:." App.java AppTest.java
```


**Test your code**

