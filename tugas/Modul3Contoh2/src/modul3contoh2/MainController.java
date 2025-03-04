/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package modul3contoh2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author Taofik Dimas
 */
public class MainController implements Initializable {
    
    @FXML
    private TextField inputUsername;
    
    @FXML
    private PasswordField inputPassword;
    
    @FXML
    private Button buttonLogin;
     
     @FXML
    private Label labelError;
    
    @FXML
    private void handleButtonLoginAction(ActionEvent event) throws Exception {
        checkLogin();
    }
    
    private void checkLogin()throws Exception {
    
    if(inputUsername.getText(). toString() .equals("admin") &&
            inputPassword.getText().toString() .equals("123")){
        labelError.setText("Login Sukses");
        
        Main main = new Main();
        main.changeScene("Dashboard.fxml");
    }
    else if(inputUsername.getText() .isEmpty()&&
            inputPassword.getText() .isEmpty()){
        labelError.setText("Isi Username dan Password !");
    }
    else{
        labelError.setText("User name atau Password salah !");
    }
}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
