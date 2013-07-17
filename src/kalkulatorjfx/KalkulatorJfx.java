package kalkulatorjfx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;

import javafx.stage.Stage;

/**
 *
 * @author LordofDestruction
 */
public class KalkulatorJfx extends Application {

/* Stworzone przyciski oraz pole tekstowe */
    
    @Override
    public void start(Stage primaryStage) {
        final Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();
        Button btn6 = new Button();
        Button btn7 = new Button();
        Button btn8 = new Button();
        Button btn9 = new Button();
        Button btnad = new Button();
        Button btnsub = new Button();
        Button btnmul = new Button();
        Button btndiv = new Button();
        Label label1 = new Label();
        TextField txtFld = new TextField("");
        HBox hb = new HBox();
        hb.getChildren().addAll(txtFld);
        hb.setSpacing(50);
/* Cień na przycisku "1" jednak nie wiem czemu nie mogę dodać cieni na
 * pozostałych przyciskach.
 */
        final DropShadow shadow = new DropShadow();
        btn1.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn1.setEffect(shadow);
            }
        });
        btn1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                btn1.setEffect(null);
            }
        });
/*Wyrównanie wielkości ikon 
 */

        btn1.setMaxWidth(Double.MAX_VALUE);
        btn2.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxWidth(Double.MAX_VALUE);
        btn4.setMaxWidth(Double.MAX_VALUE);
        btn5.setMaxWidth(Double.MAX_VALUE);
        btn6.setMaxWidth(Double.MAX_VALUE);
        btn7.setMaxWidth(Double.MAX_VALUE);
        btn8.setMaxWidth(Double.MAX_VALUE);
        btn9.setMaxWidth(Double.MAX_VALUE);
        btnad.setMaxWidth(Double.MAX_VALUE);
        btnsub.setMaxWidth(Double.MAX_VALUE);
        btnmul.setMaxWidth(Double.MAX_VALUE);
        btndiv.setMaxWidth(Double.MAX_VALUE);
        
 /*
  * Tekst na przyciskach
  */      

        btn1.setText("1");
        btn2.setText("2");
        btn3.setText("3");
        btn4.setText("4");
        btn5.setText("5");
        btn6.setText("6");
        btn7.setText("7");
        btn8.setText("8");
        btn9.setText("9");
        btnad.setText("+");
        btnsub.setText(" -");
        btnmul.setText(" x");
        btndiv.setText(" /");
        
/*
 * Printowanie wartości dwóch przycisków oknie output
 */

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("1");
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("2");
            }
        });

/* Kolumny i wiersze
 * 
 */  
        
        GridPane root = new GridPane();
        root.getColumnConstraints().add(new ColumnConstraints(10));
        root.getColumnConstraints().add(new ColumnConstraints(50));
        root.getColumnConstraints().add(new ColumnConstraints(50));
        root.getColumnConstraints().add(new ColumnConstraints(50));
        root.getRowConstraints().add(new RowConstraints(30));
        root.getRowConstraints().add(new RowConstraints(30));
        root.getRowConstraints().add(new RowConstraints(30));
        root.getRowConstraints().add(new RowConstraints(30));
        root.getRowConstraints().add(new RowConstraints(30));
        
 /*
  * Umiejscowienie przycisków na "siatce"
  */

        GridPane.setRowIndex(txtFld, 0);
        GridPane.setColumnIndex(txtFld, 3);
        GridPane.setRowIndex(btn1, 1);
        GridPane.setColumnIndex(btn1, 1);
        GridPane.setRowIndex(btn2, 1);
        GridPane.setColumnIndex(btn2, 2);
        GridPane.setRowIndex(btn3, 1);
        GridPane.setColumnIndex(btn3, 3);
        GridPane.setRowIndex(btn4, 2);
        GridPane.setColumnIndex(btn4, 1);
        GridPane.setRowIndex(btn5, 2);
        GridPane.setColumnIndex(btn5, 2);
        GridPane.setRowIndex(btn6, 2);
        GridPane.setColumnIndex(btn6, 3);
        GridPane.setRowIndex(btn7, 3);
        GridPane.setColumnIndex(btn7, 1);
        GridPane.setRowIndex(btn8, 3);
        GridPane.setColumnIndex(btn8, 2);
        GridPane.setRowIndex(btn9, 3);
        GridPane.setColumnIndex(btn9, 3);
        GridPane.setRowIndex(btnad, 1);
        GridPane.setColumnIndex(btnad, 4);
        GridPane.setRowIndex(btnsub, 2);
        GridPane.setColumnIndex(btnsub, 4);
        GridPane.setRowIndex(btnmul, 3);
        GridPane.setColumnIndex(btnmul, 4);
        GridPane.setRowIndex(btndiv, 4);
        GridPane.setColumnIndex(btndiv, 4);

 /*
  *  
  */
        
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btn5);
        root.getChildren().add(btn6);
        root.getChildren().add(btn7);
        root.getChildren().add(btn8);
        root.getChildren().add(btn9);
        root.getChildren().add(btnad);
        root.getChildren().add(btnsub);
        root.getChildren().add(btnmul);
        root.getChildren().add(btndiv);
        root.getChildren().add(txtFld);



/*
 * Scena czyli mój cały kalkulator
 */


        Scene scene = new Scene(root, 210, 210, Color.BISQUE);

        primaryStage.setTitle("Kalkulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
}
