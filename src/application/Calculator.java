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

public class Calculator extends Application {

    String calculation = new String();

    public void start(Stage FullStage) {
        try {

            AnchorPane root = new AnchorPane();
            //root.setStyle("fx-background-color: #444444");
            //root.setSpacing(10.0f);

            Button num1 = new Button(); // Button Number 1
            num1.setText("1");
            num1.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            num1.setMinWidth(100);
            num1.setMinHeight(100);


            Button num2 = new Button(); // Button Number 2
            num2.setText("2");
            num2.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            num2.setMinWidth(100);
            num2.setMinHeight(100);

            Button num3 = new Button(); // Button Number 3
            num3.setText("3");
            num3.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            num3.setMinWidth(100);
            num3.setMinHeight(100);

            Button num4 = new Button(); // Button Number 4
            num4.setText("4");
            num4.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            num4.setMinWidth(100);
            num4.setMinHeight(100);

            Button num5 = new Button(); // Button Number 5
            num5.setText("5");
            num5.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            num5.setMinWidth(100);
            num5.setMinHeight(100);


            Button num6 = new Button(); // Button Number 6
            num6.setText("6");
            num6.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            num6.setMinWidth(100);
            num6.setMinHeight(100);

            Button num7 = new Button(); // Button Number 7
            num7.setText("7");
            num7.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            num7.setMinWidth(100);
            num7.setMinHeight(100);

            Button num8 = new Button(); // Button Number 8
            num8.setText("8");
            num8.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            num8.setMinWidth(100);
            num8.setMinHeight(100);

            Button num9 = new Button(); // Button Number 9
            num9.setText("9");
            num9.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            num9.setMinWidth(100);
            num9.setMinHeight(100);

            Button num0 = new Button(); // Button Number 0
            num0.setText("0");
            num0.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            num0.setMinWidth(210);
            num0.setMinHeight(100);

            Button btnClr = new Button(); // Button Clear
            btnClr.setText("C");
            btnClr.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            btnClr.setMinWidth(100);
            btnClr.setMinHeight(100);


            Button btnDiv = new Button(); // Divide Operation
            btnDiv.setText("/");
            btnDiv.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            btnDiv.setMinWidth(100);
            btnDiv.setMinHeight(100);

            Button btnMult = new Button(); // Multiply Operation
            btnMult.setText("X");
            btnMult.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            btnMult.setMinWidth(100);
            btnMult.setMinHeight(100);

            Button btnAdd = new Button(); // Addition Operation
            btnAdd.setText("+");
            btnAdd.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            btnAdd.setMinWidth(100);
            btnAdd.setMinHeight(100);

            Button btnSub = new Button(); // Subtraction Operation
            btnSub.setText("-");
            btnSub.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            btnSub.setMinWidth(100);
            btnSub.setMinHeight(100);


            Button btnSq = new Button(); // Square Operation (x^2)
            btnSq.setText("x^2");
            btnSq.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            btnSq.setMinWidth(100);
            btnSq.setMinHeight(100);

            Button btnSqrt = new Button(); // Square root operation
            btnSqrt.setText("√");
            btnSqrt.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            btnSqrt.setMinWidth(100);
            btnSqrt.setMinHeight(100);

            Button btnEql = new Button(); // Summation of operands
            btnEql.setText("=");
            btnEql.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            btnEql.setMinWidth(210);
            btnEql.setMinHeight(100);

            Button btnNeg = new Button(); // Negation Operation
            btnNeg.setText("Neg");
            btnNeg.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            btnNeg.setMinWidth(100);
            btnNeg.setMinHeight(100);

            Button btnPwr = new Button(); // Set num to power (x^y)
            btnPwr.setText("^");
            btnPwr.setStyle("-fx-background-color: #228B22; -fx-font-size: 30; -fx-text-fill: #EEEEEE;");
            btnPwr.setMinWidth(100);
            btnPwr.setMinHeight(100);

            Button btnDec = new Button(); //Decimal point
            btnDec.setText(".");
            btnDec.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            btnDec.setMinWidth(100);
            btnDec.setMinHeight(100);

            Button btnClrE = new Button();  //Clear entry
            btnClrE.setText("CE");
            btnClrE.setStyle("-fx-background-color: #FFD700; -fx-font-size: 30; -fx-text-fill: #000000;");
            btnClrE.setMinWidth(100);
            btnClrE.setMinHeight(100);

            TextField summationZone = new TextField();  //Sets textfield at top of calculator
            summationZone.setMinSize(400,75);
            summationZone.getStyleClass().add(".textfield");

            Slider numSlider = new Slider();    //Created slider on side of calculator
            numSlider.setStyle(" -fx-font-size: 18;");
            numSlider.getStyleClass().add(".slider");

//*********************************************************************************************************
//The code below sets the location of all the buttons, textfield, and slider of the calculator

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
//**********************************************************************************************************
            //Adds all buttons, textfield, and slider to the root
            root.getChildren().addAll(num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,btnAdd,btnClr,btnDiv,btnEql,btnMult,btnNeg,btnPwr,btnSq,btnSqrt,btnSub,summationZone,btnClrE,btnDec,numSlider);

            //Prints "0" when clicked
            num0.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("0");
                    summationZone.setText(calculation);
                }
            });

            //Prints "1" when clicked
            num1.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("1");
                    summationZone.setText(calculation);
                }
            });

            //Prints "2" when clicked
            num2.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("2");
                    summationZone.setText(calculation);
                }
            });

            //Prints "3" when clicked
            num3.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("3");
                    summationZone.setText(calculation);
                }
            });

            //Prints "4" when clicked
            num4.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("4");
                    summationZone.setText(calculation);
                }
            });

            //Prints "5" when clicked
            num5.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("5");
                    summationZone.setText(calculation);
                }
            });

            //Prints "6" when clicked
            num6.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("6");
                    summationZone.setText(calculation);
                }
            });

            //Prints "7" when clicked
            num7.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("7");
                    summationZone.setText(calculation);
                }
            });

            //Prints "8" when clicked
            num8.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("8");
                    summationZone.setText(calculation);
                }
            });

            //Prints "9" when clicked
            num9.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat("9");
                    summationZone.setText(calculation);
                }
            });

            //Prints " + " when clicked
            btnAdd.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat(" + ");
                    summationZone.setText(calculation);
                }
            });

            //Clears text field when clicked
            btnClr.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = "";
                    summationZone.setText(calculation);
                }
            });

            //Prints " / " when clicked
            btnDiv.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat(" / ");
                    summationZone.setText(calculation);
                }
            });

            //Prints " * " when clicked
            btnMult.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat(" * ");
                    summationZone.setText(calculation);
                }
            });

            //Runs the "evaluate" function with the negation unary operation
            btnNeg.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = evaluate(calculation,"-",true);
                    summationZone.setText(calculation);
                }
            });

            //Prints " ^ " when clicked
            btnPwr.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat(" ^ ");
                    summationZone.setText(calculation);
                }
            });

            //Runs the "evaluate" function with the square unary operation
            btnSq.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = evaluate(calculation,"sq",true);
                    summationZone.setText(calculation);

                }
            });

            //Prints " - " when clicked
            btnSub.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat(" - ");
                    summationZone.setText(calculation);
                }
            });

            //Summates the string in the textfield
            btnEql.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = evaluate(calculation,"eq",false);
                    summationZone.setText(calculation);
                }
            });

            //Runs the "evaluate" function with the Square root unary operation
            btnSqrt.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {

                    calculation = evaluate(calculation,"sqrt",true);
                    summationZone.setText(calculation);
                }
            });

            //Print "." when clicked
            btnDec.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculation.concat(".");
                    summationZone.setText(calculation);
                }
            });

            //Runs the "evaluate" function and clears the last known entry of the string in the textfield
            btnClrE.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = evaluate(calculation,"CE",false);
                    summationZone.setText(calculation);
                }
            });

            //Allows for the user to type in calculations in the textfield as well as calculate when they press "enter"
            summationZone.addEventFilter( KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
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

            //Sets the slider to enter a value between 0 and 100
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
            scene.getStylesheets().add("application/Calc.css");     //Adds css file
            FullStage.setScene(scene);
            FullStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Evaluates the given input string against the operation which it is passed. Also checks
     * if the operation is unary or not
     * @param input
     * @param op
     * @param unary
     * @return
     */
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

