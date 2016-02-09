import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.control.DatePicker;
import java.time.LocalDate;


public class lab04 extends Application{

    public static BorderPane layout = new BorderPane();


    public void start (Stage primaryStage) throws Exception{
        primaryStage.setTitle("Lab 4");


        Label uName = new Label ("Username:");
        Label pWord = new Label ("Password:");
        Label name = new Label ("Full Name:");
        Label email = new Label ("E-Mail:");
        Label phone = new Label ("Phone #:");
        Label bDay = new Label ("Date of Birth:");

        TextField uNameField = new TextField ();
        PasswordField pWordField = new PasswordField();
        TextField nameField = new TextField ();
        TextField emailField = new TextField ();
        TextField phoneField = new TextField ();
        DatePicker bDayField = new DatePicker ();

        uNameField.setPromptText("username");
        nameField.setPromptText("firstName lastName");
        emailField.setPromptText("someone@email.com");
        phoneField.setPromptText("000-000-0000");

        Button register = new Button ("Register");


        GridPane grid = new GridPane();
        GridPane grid1 = new GridPane();

        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(15);
        grid.setHgap(10);


        grid.add(uName,0,0);
        grid.add(pWord,0,1);
        grid.add(name,0,2);
        grid.add(email,0,3);
        grid.add(phone,0,4);
        grid.add(bDay,0,5);
        grid.add(uNameField,1,0);
        grid.add(pWordField,1,1);
        grid.add(nameField,1,2);
        grid.add(emailField,1,3);
        grid.add(phoneField,1,4);
        grid.add(bDayField,1,5);
        grid.add(register,1,6);


        register.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                LocalDate birthday = bDayField.getValue();

                Label info1 = new Label("Name: "+name);
                Label info2 = new Label("E-mail: "+email);
                Label info3 = new Label("Phone Number: "+phone);
                Label info4 = new Label("Birthday: "+birthday);

                grid1.add(info1,0,0);
                grid1.add(info2,0,1);
                grid1.add(info3,0,2);
                grid1.add(info4,0,3);

                grid1.setVgap(15);


                layout.setCenter(grid1);
            }
        });





        Scene scene = new Scene(layout, 650, 400);

        layout.setLeft(grid);


        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main (String args []) {launch (args);}
}
