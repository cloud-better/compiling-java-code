```
javac -cp "junit-platform-console-standalone-1.8.2.jar:." App.java AppTest.java
```

```
java -jar junit-platform-console-standalone-1.8.2.jar --class-path . --scan-class-path --include-classname AppTest
```

**Output**
Tests are not detected!

```
╷
├─ JUnit Jupiter ✔
└─ JUnit Vintage ✔

Test run finished after 50 ms
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
