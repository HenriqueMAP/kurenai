module com.jounin.kurenai {

    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;

    opens com.jounin.kurenai.controller to javafx.fxml;
    opens com.jounin.kurenai.controller.fxml to javafx.fxml;
//    opens com.jounin.kurenai.image to javafx.fxml;
//    opens com.jounin.kurenai.model to javafx.fxml;
    opens com.jounin.kurenai.view to javafx.fxml;

    exports com.jounin.kurenai.controller;
    exports com.jounin.kurenai.controller.fxml;
    exports com.jounin.kurenai.view;
}