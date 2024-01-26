# hello-world-javafx-jpackage

## Toolchain required
This setup requires that you have a matching toolchain file that points to the correct jdk needed.

## Troubleshooting

### Macos
* Right-click on YourApplication.app (in the Applications Folder)...Show Package Contents.
* In the MacOS folder, right-click on the Terminal icon showing your app's name. Open with Terminal....
* This will show you any errors fired during the launch sequence.
[Source](https://stackoverflow.com/a/73100783/2055199)

### Launching from Eclipse
To launch this from eclipse, you need to add the following to the vm args
```
--module-path ${project_classpath:hello-world-javafx-jpackage} --add-modules javafx.controls
```

More possible ways of doing this are
https://stackoverflow.com/a/55300492/2055199

### Examples from github
I found https://github.com/sualeh/build-jpackage very useful