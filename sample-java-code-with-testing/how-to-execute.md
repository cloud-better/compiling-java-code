**Download JUNIT5 jar files from here:**

    wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.8.2/junit-platform-console-standalone-1.8.2.jar


**Download JUNIT API jar from here**

    wget https://repo1.maven.org/maven2/org/junit/jupiter/junit-jupiter-api/5.8.2/junit-jupiter-api-5.8.2.jar

**Place them in the root directory**

**Compile Java Code**

```
javac -cp "junit-platform-console-standalone-1.8.2.jar:." Calculator.java CalculatorTest.java
```

**Test your code**

```
java -jar junit-platform-console-standalone-1.8.2.jar --class-path . --scan-class-path --include-classname CalculatorTest
```

**Output you should see**

```
╷
├─ JUnit Jupiter ✔
└─ JUnit Vintage ✔

Test run finished after 54 ms
[         2 containers found      ]
[         0 containers skipped    ]
[         2 containers started    ]
[         0 containers aborted    ]
[         2 containers successful ]
[         0 containers failed     ]
[         0 tests found           ]
[         0 tests skipped         ]
[         0 tests started         ]
[         0 tests aborted         ]
[         0 tests successful      ]
[         0 tests failed          ]

```
