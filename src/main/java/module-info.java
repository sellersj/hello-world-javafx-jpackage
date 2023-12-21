module com.github.sellersj.helloworld.javafx.jpackage {

    requires javafx.controls;

    opens com.example.jpackagejavafx to javafx.graphics;

    // the package name of this maven project
    exports com.example.jpackagejavafx;

}