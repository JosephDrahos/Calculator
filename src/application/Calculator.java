package application;

import java.util.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.beans.value.*;

import static java.lang.Character.isDigit;

public class Calculator extends Application {

    String calculation = new String();


    @Override
    public void start(Stage FullStage) {
        try {

            AnchorPane root = new AnchorPane();
            //root.setStyle("fx-background-color: #444444");
            //root.setSpacing(10.0f);

            Button num1 = new Button(); // First button
            num1.setText("1");
            num1.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            num1.setMinWidth(100);
            num1.setMinHeight(100);


            Button num2 = new Button(); // First button
            num2.setText("2");
            num2.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            num2.setMinWidth(100);
            num2.setMinHeight(100);

            Button num3 = new Button(); // First button
            num3.setText("3");
            num3.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            num3.setMinWidth(100);
            num3.setMinHeight(100);

            Button num4 = new Button(); // First button
            num4.setText("4");
            num4.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            num4.setMinWidth(100);
            num4.setMinHeight(100);

            Button num5 = new Button(); // First button
            num5.setText("5");
            num5.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            num5.setMinWidth(100);
            num5.setMinHeight(100);


            Button num6 = new Button(); // First button
            num6.setText("6");
            num6.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            num6.setMinWidth(100);
            num6.setMinHeight(100);

            Button num7 = new Button(); // First button
            num7.setText("7");
            num7.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            num7.setMinWidth(100);
            num7.setMinHeight(100);

            Button num8 = new Button(); // First button
            num8.setText("8");
            num8.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            num8.setMinWidth(100);
            num8.setMinHeight(100);

            Button num9 = new Button(); // First button
            num9.setText("9");
            num9.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            num9.setMinWidth(100);
            num9.setMinHeight(100);

            Button num0 = new Button(); // First button
            num0.setText("0");
            num0.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            num0.setMinWidth(210);
            num0.setMinHeight(100);

            Button btnClr = new Button(); // First button
            btnClr.setText("C");
            btnClr.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            btnClr.setMinWidth(100);
            btnClr.setMinHeight(100);


            Button btnDiv = new Button(); // First button
            btnDiv.setText("/");
            btnDiv.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            btnDiv.setMinWidth(100);
            btnDiv.setMinHeight(100);

            Button btnMult = new Button(); // First button
            btnMult.setText("X");
            btnMult.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            btnMult.setMinWidth(100);
            btnMult.setMinHeight(100);

            Button btnAdd = new Button(); // First button
            btnAdd.setText("+");
            btnAdd.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            btnAdd.setMinWidth(100);
            btnAdd.setMinHeight(100);

            Button btnSub = new Button(); // First button
            btnSub.setText("-");
            btnSub.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            btnSub.setMinWidth(100);
            btnSub.setMinHeight(100);


            Button btnSq = new Button(); // First button
            btnSq.setText("x^2");
            btnSq.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            btnSq.setMinWidth(100);
            btnSq.setMinHeight(100);

            Button btnSqrt = new Button(); // First button
            btnSqrt.setText("√");
            btnSqrt.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            btnSqrt.setMinWidth(100);
            btnSqrt.setMinHeight(100);

            Button btnEql = new Button(); // First button
            btnEql.setText("=");
            btnEql.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            btnEql.setMinWidth(210);
            btnEql.setMinHeight(100);

            Button btnNeg = new Button(); // First button
            btnNeg.setText("Neg");
            btnNeg.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            btnNeg.setMinWidth(100);
            btnNeg.setMinHeight(100);

            Button btnPwr = new Button(); // First button
            btnPwr.setText("^");
            btnPwr.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            btnPwr.setMinWidth(100);
            btnPwr.setMinHeight(100);

            Button btnDec = new Button();
            btnDec.setText(".");
            btnDec.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            btnDec.setMinWidth(100);
            btnDec.setMinHeight(100);

            Button btnClrE = new Button();
            btnClrE.setText("CE");
            btnClrE.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            btnClrE.setMinWidth(100);
            btnClrE.setMinHeight(100);

            TextField summationZone = new TextField();
            summationZone.setMinSize(400,75);
            summationZone.getStyleClass().add(".textfield");

            Slider numSlider = new Slider();
            numSlider.setStyle(" -fx-font-size: 18;");
            numSlider.getStyleClass().add(".slider");
            //numSlider.setMinSize(0, 400);

            num0.setLayoutX(0);
            num0.setLayoutY(660);

            btnEql.setLayoutX(220);
            btnEql.setLayoutY(660);

            num1.setLayoutX(0);
            num1.setLayoutY(550);

            num2.setLayoutX(110);
            num2.setLayoutY(550);

            num3.setLayoutX(220);
            num3.setLayoutY(550);

            btnDec.setLayoutX(330);
            btnDec.setLayoutY(550);

            num4.setLayoutX(0);
            num4.setLayoutY(440);

            num5.setLayoutX(110);
            num5.setLayoutY(440);

            num6.setLayoutX(220);
            num6.setLayoutY(440);

            btnSub.setLayoutX(330);
            btnSub.setLayoutY(440);

            num7.setLayoutX(0);
            num7.setLayoutY(330);

            num8.setLayoutX(110);
            num8.setLayoutY(330);

            num9.setLayoutX(220);
            num9.setLayoutY(330);

            btnAdd.setLayoutX(330);
            btnAdd.setLayoutY(330);

            btnSqrt.setLayoutX(0);
            btnSqrt.setLayoutY(220);

            btnNeg.setLayoutX(110);
            btnNeg.setLayoutY(220);

            btnSq.setLayoutX(220);
            btnSq.setLayoutY(220);

            btnDiv.setLayoutX(330);
            btnDiv.setLayoutY(220);

            btnClrE.setLayoutX(0);
            btnClrE.setLayoutY(110);

            btnClr.setLayoutX(110);
            btnClr.setLayoutY(110);

            btnPwr.setLayoutX(220);
            btnPwr.setLayoutY(110);

            btnMult.setLayoutX(330);
            btnMult.setLayoutY(110);

            summationZone.setLayoutX(0);
            summationZone.setLayoutY(20);

            numSlider.setRotate(270);
            numSlider.setLayoutX(400);
            numSlider.setLayoutY(440);

            root.getChildren().addAll(num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,btnAdd,btnClr,btnDiv,btnEql,btnMult,btnNeg,btnPwr,btnSq,btnSqrt,btnSub,summationZone,btnClrE,btnDec,numSlider);

            num0.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("0");
                    summationZone.setText(calculation);
                }
            });

            num1.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("1");
                    summationZone.setText(calculation);
                }
            });

            num2.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("2");
                    summationZone.setText(calculation);
                }
            });

            num3.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("3");
                    summationZone.setText(calculation);
                }
            });

            num4.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("4");
                    summationZone.setText(calculation);
                }
            });

            num5.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("5");
                    summationZone.setText(calculation);
                }
            });

            num6.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("6");
                    summationZone.setText(calculation);
                }
            });

            num7.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("7");
                    summationZone.setText(calculation);
                }
            });

            num8.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("8");
                    summationZone.setText(calculation);
                }
            });

            num9.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("9");
                    summationZone.setText(calculation);
                }
            });

            btnAdd.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat(" + ");
                    summationZone.setText(calculation);
                }
            });

            btnClr.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = "";
                    summationZone.setText(calculation);
                }
            });

            btnDiv.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat(" / ");
                    summationZone.setText(calculation);
                }
            });

            btnMult.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat(" * ");
                    summationZone.setText(calculation);
                }
            });

            btnNeg.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = evaluate(calculation,"-",true);
                    summationZone.setText(calculation);
                }
            });

            btnPwr.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat(" ^ ");
                    summationZone.setText(calculation);
                }
            });

            btnSq.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = evaluate(calculation,"sq",true);
                    summationZone.setText(calculation);

                }
            });

            btnSub.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat(" - ");
                    summationZone.setText(calculation);
                }
            });

            btnEql.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = evaluate(calculation,"eq",false);
                    summationZone.setText(calculation);
                }
            });

            btnSqrt.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {

                    calculation = evaluate(calculation,"sqrt",true);
                    summationZone.setText(calculation);
                }
            });

            btnDec.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat(".");
                    summationZone.setText(calculation);
                }
            });

            btnClrE.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = evaluate(calculation,"CE",false);
                    summationZone.setText(calculation);
                }
            });

            summationZone.addEventFilter( KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
                // shift focus between buttons if f is pressed
                public void handle( KeyEvent ke ) {
                    if(ke.getCode() == KeyCode.ENTER){
                        calculation = evaluate(calculation,"eq",false);
                        summationZone.setText(calculation);
                    }
                    else{
                        calculation = summationZone.getText();
                    }

                }
            });

            numSlider.valueProperty().addListener(new ChangeListener<Number>(){
                @Override
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue){
                    if(calculation.isEmpty()){
                    }
                    else if(calculation.charAt(calculation.length()-1) == ' '){
                    }
                    else if(calculation.contains("+") || calculation.contains("-") || calculation.contains("/") || calculation.contains("*") || calculation.contains("^")){
                        for(int i = calculation.length()-1; i>=0;i-- ){
                            if(calculation.charAt(i) == ' ') {
                                calculation = calculation.substring(0, i+1);
                                break;
                            }
                        }
                    }else{
                        calculation = "";
                    }
                    calculation += Integer.toString(newValue.intValue());
                    summationZone.setText(calculation);

                }

            });


            Scene scene = new Scene(root, 500, 775);
            scene.getStylesheets().add("application/Calc.css");
            FullStage.setScene(scene);
            FullStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String evaluate(String input, String op, Boolean unary){
        try {
            Scanner inScanner = new Scanner(input);
            Double arg1 = inScanner.nextDouble();

            if (unary) {

                if (op == "sqrt") {
                    return Double.toString(Math.sqrt(arg1));
                } else if (op == "-") {
                    return Double.toString(-1 * arg1);
                } else if (op == "sq") {
                    return Double.toString(arg1 * arg1);
                }

            } else if (op == "CE") {

                if (input.isEmpty()) {
                    return "";
                } else if (input.charAt(input.length() - 1) == ' ') {
                    return input.substring(0, input.length() - 3);
                } else {
                    for (int i = input.length() - 1; i >= 0; i--) {
                        if (input.charAt(i) == ' ') {
                            return input.substring(0, i + 1);
                        }
                    }
                    return "";
                }
            } else if (op == "eq") {
                while (inScanner.hasNext()) {
                    op = inScanner.next();
                    Double arg2 = inScanner.nextDouble();

                    if (op.contains("-")) {
                        arg1 = arg1 - arg2;
                    } else if (op.contains("+")) {
                        arg1 = arg1 + arg2;

                    } else if (op.contains("*")) {
                        arg1 = arg1 * arg2;
                    } else if (op.contains("/")) {
                        arg1 = arg1 / arg2;
                    } else if (op.contains("^")) {
                        arg1 = Math.pow(arg1, arg2);
                    }
                }
            }
            return Double.toString(arg1);
        }catch(Exception e){
            return "ERROR";
        }
    }

  public static void main(String[] args) { launch(args); }
}

