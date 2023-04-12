module javafxtp4 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;

	opens application to javafx.graphics, javafx.fxml;
	opens application.controllers to javafx.graphics, javafx.fxml;
}
