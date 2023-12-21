# hello-world-javafx-jpackage

To launch this from eclipse, you need to add the following to the vm args
```
--module-path ${project_classpath:hello-world-javafx-jpackage} --add-modules javafx.controls
```

More possible ways of doing this are
https://stackoverflow.com/a/55300492/2055199

## Toolchain required
This setup requires that you have a matching toolchain file that points to the correct jdk needed.
