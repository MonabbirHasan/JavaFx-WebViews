package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller implements Initializable{

	@FXML
	private WebView MyWebView;
	@FXML
	private TextField InputBox;
	@FXML
	private Button LoadPage;

	@FXML
	private WebEngine engine;
	
	private double WebZoom;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		engine=MyWebView.getEngine();
		WebZoom=1;
		
	}
	
	public void LoadPage(ActionEvent event) {
		engine.load(InputBox.getText());	
	}
	public void refreshPage() {
		engine.reload();
	}
	public void zoomIn() {
		WebZoom+=.25;
		MyWebView.setZoom(WebZoom);
	}
	public void zoomOut() {
		WebZoom-=.25;
		MyWebView.setZoom(WebZoom);
	}
}
