package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{

	@FXML
	private TextField txtNumeroUm;

	@FXML
	private TextField txtNumeroDois;

	@FXML

	private Label labelResultado;

	@FXML
	private Button btSoma;

	@FXML
	public void onBtSomaAction() {
		try {
		Locale.setDefault(Locale.US);
		double  numeroUm = Double.parseDouble(txtNumeroUm.getText()) ;
		double  numeroDois = Double.parseDouble(txtNumeroDois.getText());
		double soma = numeroUm + numeroDois;
		
		labelResultado.setText(String.format("%.2f",soma));
		
		}
		
		catch (NumberFormatException e){
			Alerts.showAlert("Error", null, e.getMessage(), AlertType.ERROR);
			
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		//url caminho da tela, quase nunca usa...
		//rb são recursos, mas nao muito usado...
		
		Constraints.setTextFieldDouble(txtNumeroUm);
		Constraints.setTextFieldDouble(txtNumeroDois);
		Constraints.setTextFieldMaxLength(txtNumeroUm, 12);
		Constraints.setTextFieldMaxLength(txtNumeroDois, 12);
		
	}

}
