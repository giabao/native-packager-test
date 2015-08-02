# native-packager-test
report bug for [sbt-native-packager](https://github.com/sbt/sbt-native-packager)

This bug is reported in playframework / [issue 4921](https://github.com/playframework/playframework/issues/4921)
(but its a bug of sbt-native-packager)

### Steps to reproduce the issue:

1. in a Windows machine:
    ```
git clone https://github.com/giabao/native-packager-test.git
cd native-packager-test
sbt dist
```

2. upload `target\universal\native-packager-test-0.1-SNAPSHOT.zip` to a Linux machine

3. in the Linux machine:
    ```
unzip native-packager-test-0.1-SNAPSHOT.zip
cd native-packager-test-0.1-SNAPSHOT
./bin/native-packager-test
```

4. The output is:
    ```
conf%2Fapplication.ini%0D
path.last == '\r'? true
file exists?false
file exists if we strip last char from path?true
```

### Note
+ If we build from linux => everything OK.
+ This error is caused by the line endings in file `application.ini`.
