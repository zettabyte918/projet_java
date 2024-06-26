package application;

import javafx.application.Application;
import javafx.stage.Stage;
import java.sql.*;

import application.utils.Utils;

public class Main extends Application {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	@Override
	public void start(Stage primaryStage) {
		try {
			// connect to db
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/app", "hossem", "Hossem@@@147");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Persons");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();

			Utils.navigateTo(primaryStage, "login");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
