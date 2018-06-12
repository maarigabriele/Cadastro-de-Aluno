package cadastrodealuno;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.*;
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
    private TextField nota1TextField;
    
    @FXML 
    private TextField nota2TextField;
    
    @FXML 
    private TextField nota3TextField;
    
    @FXML 
    private Button ProximoButton;
    
    @FXML 
    private Button ButtonAnterior;
    
    @FXML
    private Button ButtonExcluir;
   
    @FXML
    private TextArea imprimeTextArea;
    ControllerArray array = new ControllerArray();
    
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
        Aluno novo = new Aluno(cursoCombox.getSelectionModel().getSelectedItem().toString(),Float.parseFloat(nota1TextField.getText()),Float.parseFloat(nota2TextField.getText()),Float.parseFloat(nota3TextField.getText()));
        novo.setNome(nomeTextField.getText());
        novo.setSobrenome(sobrenomeTextField.getText());
        novo.setEmail(e_mailTextField.getText());
        novo.setMatricula(matriculaTextField.getText());
        novo.data_digitada.ano = Integer.parseInt(anoTextField.getText());
        novo.data_digitada.mes = Integer.parseInt(mesTextField.getText());
        novo.data_digitada.dia = Integer.parseInt(diaTextField.getText());
        
        array.getAlunos().add(novo);
        
        imprimeTextArea.setText(array.UltimoCadastrado());
}
    public void ProximoButton_Clicked()
    {
        imprimeTextArea.setText(array.ProximoAluno());
    }
    public void ButtonAnterior_Cliked()
    {
        imprimeTextArea.setText(array.AlunoAnterior());
    }
    public void ButtonExcluir_Cliked()
    {
        array.DeletarAluno();
        imprimeTextArea.setText("Cadastro Excluído");
    }
}
