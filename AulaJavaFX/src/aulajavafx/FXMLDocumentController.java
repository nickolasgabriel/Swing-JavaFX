package aulajavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class FXMLDocumentController implements Initializable { 
    
    @FXML
    private Label lbl;
    private Button btn;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        lbl.setText("Você clicou no botão");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
