package cadastrodealuno;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class FXMLFormularioController implements Initializable 
{
    @FXML
    private TextField nomeTextField;
    
    @FXML
    private TextField sobrenomeTextField;
    
    @FXML
    private TextField e_mailTextField;
    
    @FXML 
    private ComboBox cursoCombox;
    
    @FXML
    private TextField diaTextField, mesTextField, anoTextField;
    
    @FXML
    private TextField matriculaTextField;
    
    @FXML
    private TextArea imprimeTextArea;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        cursoCombox.getItems().addAll(
        "Engenharia Elétrica","Engenharia da Computação",
        "Finanças","Medicina","Ciências Econômicas",
        "Música","Odontologia","Psicologia");
       cursoCombox.getSelectionModel().selectFirst();
    }
     
    public  void cadastrarButtonClicked()
    {
         JOptionPane.showMessageDialog(null, "Nome: " + nomeTextField.getText()+"\n" + "Sobrenome: " +
                sobrenomeTextField.getText()+"\n" + "E-mail: " + e_mailTextField.getText()+"\n" +
                        "Curso: " +cursoCombox.getSelectionModel().getSelectedItem().toString()+ "\n" + "Data de Nascimento: " + diaTextField.getText()
         + mesTextField.getText() + anoTextField.getText() + "\n" + "Número de Matrícula: " + matriculaTextField.getText() +"\n"
     );
         imprimeTextArea.setText("Nome: " + nomeTextField.getText()+"\n" + "Sobrenome: " +
                sobrenomeTextField.getText()+"\n" + "E-mail: " + e_mailTextField.getText()+"\n" +
                        "Curso: " +cursoCombox.getSelectionModel().getSelectedItem().toString()+ "\n" + "Data de Nascimento: " + diaTextField.getText()
         + mesTextField.getText() + anoTextField.getText() + "\n" + "Número de Matrícula: " + matriculaTextField.getText() +"\n");
    }
}
