package sample;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.regex.Pattern;

public class Controller {


    @FXML
    private AnchorPane Anchorpane;

    @FXML
    private TextField Text1;

    @FXML
    private TextField Text2;

    @FXML
    private Button addition;

    @FXML
    private Button subtraction;

    @FXML
    private Button multiplication;

    @FXML
    private Button division;

    @FXML
    private Button sin;

    @FXML
    private Button cosin;

    @FXML
    private Button tan;

    @FXML
    private Button exponential;

    @FXML
    private Label label;

    Pattern validEditingState = Pattern.compile("-?(([1-9][0-9]*)|0)?(\\.[0-9]*)?");

    @FXML
    void Actioncosin(ActionEvent event) {

        String a=Text1.getText().trim();
        double n=Double.parseDouble(a);
        double sinvalue=Math.toRadians(n);
        double sin=Math.cos(sinvalue);
        String value=Double.toString(sin);
        label.setVisible(true);
        label.setText("Cosin("+n+")="+value);
    }

    @FXML
    void Actionexponential(ActionEvent event) {

        String n1=Text1.getText().trim();

        double num1=Integer.parseInt(n1);

        double pow=Math.exp(num1);

        String value=Double.toString(pow);
        label.setVisible(true);
        label.setText("e"+"^"+n1+"="+value);


    }

    @FXML
    void Actionsin(ActionEvent event) {

        String a=Text1.getText().trim();
        double n=Double.parseDouble(a);
        double sinvalue=Math.toRadians(n);
        double sin=Math.sin(sinvalue);
        String value=Double.toString(sin);
        label.setVisible(true);
        label.setText("Sin("+n+")="+value);

    }

    @FXML
    void Actiontan(ActionEvent event) {

        String a=Text1.getText().trim();
        double n=Double.parseDouble(a);
        double sinvalue=Math.toRadians(n);
        double sin=Math.tan(sinvalue);
        String value=Double.toString(sin);
        label.setVisible(true);
        label.setText("Tan("+n+")="+value);


    }


    @FXML
    void addition(ActionEvent event) {

        String Symbol="+";
        String n1 =Text1.getText().trim();
        int num1=Integer.parseInt(n1);

        String n2 =Text2.getText().trim();
        int num2=Integer.parseInt(n2);
        int num3=num1+num2;
        String n3=Integer.toString(num3);
        label.setVisible(true);
        label.setText("Addition of those number:"+(n1+Symbol+n2+"="+n3));


    }

    @FXML
    void division(ActionEvent event) {

        String Symbol="/";
        String n1 =Text1.getText().trim();
        int num1=Integer.parseInt(n1);

        String n2 =Text2.getText().trim();
        int num2=Integer.parseInt(n2);
        int num3=num1/num2;
        String n3=Integer.toString(num3);
        label.setVisible(true);
        label.setText("Division of those number:"+(n1+Symbol+n2+"="+n3));

    }

    @FXML
    void multiplication(ActionEvent event) {

        String Symbol="*";
        String n1 =Text1.getText().trim();
        int num1=Integer.parseInt(n1);

        String n2 =Text2.getText().trim();
        int num2=Integer.parseInt(n2);
        int num3=num1*num2;
        String n3=Integer.toString(num3);
        label.setVisible(true);
        label.setText("Multiplication of those number:"+(n1+Symbol+n2+"="+n3));

    }

    @FXML
    void subtraction(ActionEvent event) {

        String Symbol="-";
        String n1 =Text1.getText().trim();
        int num1=Integer.parseInt(n1);

        String n2 =Text2.getText().trim();
        int num2=Integer.parseInt(n2);
        int num3=num1-num2;
        String n3=Integer.toString(num3);
        label.setVisible(true);
        label.setText("Subtraction of those number:"+(n1+Symbol+n2+"="+n3));

    }

    @FXML
    void initialize() {


    }
}
