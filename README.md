# hello-world-javafx-jpackage

## Pre-built using github actions
As a demo some distributions are built using the github actions. If you go to 
the [actions section](https://github.com/sellersj/hello-world-javafx-jpackage/actions) and click on the
latest run and scroll to the bottom of the page where the "Artifacts" are, you should be able to download
them from there.

## Toolchain required
This setup requires that you have a matching [maven toolchain](https://maven.apache.org/guides/mini/guide-using-toolchains.html)
file that points to the correct jdk needed.

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