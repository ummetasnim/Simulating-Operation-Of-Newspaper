/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulatingnewspaper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import modelclass.AppendableObjectOutputStream;
import modelclass.Employee;

/**
 * FXML Controller class
 *
 * @author ummet
 */
public class PressManagerEmployeefixSceneController implements Initializable {

    @FXML
    private TextField salaryTextField;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField designationTextField;
    @FXML
    private TextField contactnumTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField workscheduleTextField; 
    @FXML
    private DatePicker dojDatePicker; 
    @FXML
    private TableView<Employee> tableView;
    
    @FXML
    private TableColumn<Employee, String> firstNameColumn;
    @FXML
    private TableColumn<Employee, String> lastNameColumn;
    @FXML
    private TableColumn<Employee, String> designationColumn;
    @FXML
    private TableColumn<Employee, LocalDate> dateoOfJoiningcolumn;
    @FXML
    private TableColumn<Employee, String> contactNoColumn;
    @FXML
    private TableColumn<Employee, String> workfFxColumn;
    @FXML
    private TableColumn<Employee, String> salaryColumn; 
    
    ArrayList <Employee> employeelist = new ArrayList(); 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO 
        //set up the columns in the table
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("lastName"));
        designationColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("designation"));
        dateoOfJoiningcolumn.setCellValueFactory(new PropertyValueFactory<Employee, LocalDate>("dateofjoining"));
        contactNoColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("contactnumber"));
        workfFxColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("workschedule")); 
        salaryColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("salary"));
       
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try
        {
            f = new File("EmpDetails.bin");
            
            if(!f.exists())
            {
                System.out.println("file dosen't exist");
            }
            else
            {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                
                Employee e;
                while(true)
                {
                   e= (Employee)ois.readObject();
                   employeelist.add(e);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("exception:"+e);
        }
        finally
        {
            try{
                ois.close();
                ObservableList<Employee> people = FXCollections.observableArrayList();
            
                for(Employee e: employeelist){
                    people.add(e);
                }
                tableView.setItems(people);
            }
            catch(Exception e){
                    System.out.println("exception:"+e);
                    
            }
            
        }
       
    }   
 

    @FXML
    private void deleteEmployeeOnClickactn(ActionEvent event)  
    { 
        ObservableList<Employee> selectedRows, allPeople;
        allPeople = tableView.getItems();
        selectedRows = tableView.getSelectionModel().getSelectedItems();
        for(Employee e: selectedRows){allPeople.remove(e);}
    }
    @FXML
    private void addEmployeeOnClickactn(ActionEvent event) { 
         Employee newEmployee = new Employee( 
                                       firstNameTextField.getText(),
                                       lastNameTextField.getText(), 
                                       designationTextField.getText(), 
                                       dojDatePicker.getValue(),
                                       contactnumTextField.getText(), 
                                       workscheduleTextField.getText(),
                                       salaryTextField.getText() 
                                        );
            tableView.getItems().add(newEmployee); 
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try
        {
            f = new File("EmpDetails.bin");
            if(f.exists())
            {
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else
            {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newEmployee);
        }
        catch(Exception e)
        {
            
        }
        finally
        {
            try {
                oos.close();
            } catch (Exception e) {
              
            }
        }
        
        
    }

    @FXML
    private void prevSceneclickOnAction(ActionEvent event) throws IOException {  
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("PressManagerHomeScene.fxml"));
        Scene scene2 = new Scene(scene2Parent);
          
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow(); 
      
        window.setScene(scene2);
        window.show();
        
    }

    @FXML
    private void salaryOnMouseClick(MouseEvent event) { 
        salaryTextField.setText(null);
    }

    @FXML
    private void fstnameOnMouseClick(MouseEvent event) { 
        firstNameTextField.setText(null);
    }

    @FXML
    private void designationOnMouseClick(MouseEvent event) { 
        designationTextField.setText(null);
    }

    @FXML
    private void contactnoOnMouseClick(MouseEvent event) { 
        contactnumTextField.setText(null);
    }
    
    @FXML
    private void lastnameOnMouseClick(MouseEvent event) { 
        lastNameTextField.setText(null);
    }

    @FXML
    private void workscheduleOnMouseClick(MouseEvent event) { 
        workscheduleTextField.setText(null);
    }

    @FXML
    private void dojOnMouseclick(MouseEvent event) {   
        dojDatePicker.setValue(null);
    }
   
}


