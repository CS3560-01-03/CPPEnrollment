package com.enrollment.enrollmentproject;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;

import java.sql.*;

public class Controller {
    @FXML
    private TableView<Object> tableview = new TableView<Object>();
    @FXML
    private TableColumn<ModelTable, String> col_course = new TableColumn<ModelTable,String>();
    @FXML
    private TableColumn<ModelTable, String> col_course_title = new TableColumn<ModelTable,String>();
    @FXML
    private TableColumn<ModelTable, String> col_units = new TableColumn<ModelTable,String>();
    @FXML
    private TableColumn<ModelTable, String> col_time = new TableColumn<ModelTable,String>();
    @FXML
    private TableColumn<ModelTable, String> col_waitlist = new TableColumn<ModelTable,String>();
    @FXML
    private TableColumn<ModelTable, String> col_capacity = new TableColumn<ModelTable,String>();
    @FXML
    private TableColumn<ModelTable, String> col_room = new TableColumn<ModelTable,String>();
    @FXML
    private TableColumn<ModelTable, String> col_professor = new TableColumn<ModelTable,String>();

    // Used for reading info AND putting it into a TableView (0 variables)
    public TableView<Object> connectTable(String query){
        tableview.getItems().clear();
        tableview.getColumns().clear();
        ObservableList<Object> data = FXCollections.observableArrayList();
        try {
            Connection connectDB = DBConnector.getConnection();

            Statement statement = connectDB.createStatement();

            ResultSet rs = statement.executeQuery(query);//search_query

            //TABLE COLUMN ADDED DYNAMICALLY
            for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++){
                // We are using non property style for making dynamic table
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });
                tableview.getColumns().addAll(col);
                System.out.println("Column ["+i+"] ");
            }

            while(rs.next()){ // For each entry in query
                ObservableList<String> row = FXCollections.observableArrayList();
                // Add the column info
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1] added " + row );
                data.add(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        tableview.setItems(data);
        tableview.setPrefSize(1050,383);
        return tableview;
    }


    // Used for reading info AND putting it into a TableView (1 variable)
    public TableView<Object> connectTable(String query, String input1){
        tableview.getItems().clear();
        tableview.getColumns().clear();
        ObservableList<Object> data = FXCollections.observableArrayList();
        PreparedStatement ps = null;
        try {
            Connection connectDB = DBConnector.getConnection();

            ps = connectDB.prepareStatement(query);
            ps.setString(1, input1);

            ResultSet rs = ps.executeQuery();

            //TABLE COLUMN ADDED DYNAMICALLY
            for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++){
                // We are using non property style for making dynamic table
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });
                tableview.getColumns().addAll(col);
                System.out.println("Column ["+i+"] ");
            }

            while(rs.next()){ // For each entry in query
                ObservableList<String> row = FXCollections.observableArrayList();
                // Add the column info
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1] added " + row );
                data.add(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        tableview.setItems(data);
        tableview.setPrefSize(1050,383);
        return tableview;
    }



    // Used for just reading info
    public ObservableList<Object> connectSelect(String query){
        ObservableList<Object> data = FXCollections.observableArrayList();
        try {
            Connection connectDB = DBConnector.getConnection();

            Statement statement = connectDB.createStatement();

            ResultSet rs = statement.executeQuery(query);


            while(rs.next()){ // For each entry in query
                ObservableList<String> row = FXCollections.observableArrayList();
                // Add the column info
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1]: " + row );

                data.add(row);
            }
            //System.out.println(data);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return data;
    }

    // Used for just reading info with a query using 3 variables
    public ObservableList<Object> connectSelect(String query, String input1, String input2, String input3){
        ObservableList<Object> data = FXCollections.observableArrayList();
        PreparedStatement ps = null;
        try {
            Connection connectDB = DBConnector.getConnection();

            ps = connectDB.prepareStatement(query);
            ps.setString(1, input1);
            ps.setString(2, input2);
            ps.setString(3, input3);
            ResultSet rs = ps.executeQuery();


            while(rs.next()){ // For each entry in query
                ObservableList<String> row = FXCollections.observableArrayList();
                // Add the column info
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1]: " + row );

                data.add(row);
            }
            //System.out.println(data);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return data;
    }

    // Used for just reading info with a query using 2 variables
    public ObservableList<Object> connectSelect(String query, String input1, String input2){
        ObservableList<Object> data = FXCollections.observableArrayList();
        PreparedStatement ps = null;
        try {
            Connection connectDB = DBConnector.getConnection();

            ps = connectDB.prepareStatement(query);
            ps.setString(1, input1);
            ps.setString(2, input2);
            ResultSet rs = ps.executeQuery();


            while(rs.next()){ // For each entry in query
                ObservableList<String> row = FXCollections.observableArrayList();
                // Add the column info
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                //System.out.println("Row [1]: " + row );

                data.add(row);

            }
            //System.out.println(data);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return data;
    }

    // Used for just reading info with a query using 1 variable
    public ObservableList<Object> connectSelect(String query, String input1){
        ObservableList<Object> data = FXCollections.observableArrayList();
        PreparedStatement ps = null;
        try {
            Connection connectDB = DBConnector.getConnection();

            ps = connectDB.prepareStatement(query);
            ps.setString(1, input1);
            ResultSet rs = ps.executeQuery();


            while(rs.next()){ // For each entry in query
                ObservableList<String> row = FXCollections.observableArrayList();
                // Add the column info
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                //System.out.println("Row [1]: " + row );

                data.add(row);

            }
            //System.out.println(data);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return data;
    }


    // Used for insert/etc queries with using 3 variables
    public void connectInsert(String query, String input1, String input2, String input3){
        PreparedStatement ps = null;
        try {
            Connection connectDB = DBConnector.getConnection();

            ps = connectDB.prepareStatement(query);
            ps.setString(1, input1);
            ps.setString(2, input2);
            ps.setString(3, input3);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    // Used for REMOVE queries with using 2 variables
    public void connectRemove(String query, String input1, String input2){
        PreparedStatement ps = null;
        try {
            Connection connectDB = DBConnector.getConnection();

            ps = connectDB.prepareStatement(query);
            ps.setString(1, input1);
            ps.setString(2, input2);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}















/*
try {
        Connection con = DBConnector.getConnection();

        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM course_section_info");

        while(rs.next()){

        }

        } catch (SQLException e) {
        e.printStackTrace();
        }

        col_course.setCellValueFactory(new PropertyValueFactory<>("Course"));
        col_course_title.setCellValueFactory(new PropertyValueFactory<>("Course Title"));
        col_units.setCellValueFactory(new PropertyValueFactory<>("Units"));
        col_time.setCellValueFactory(new PropertyValueFactory<>("Time"));
        col_capacity.setCellValueFactory(new PropertyValueFactory<>("Capacity"));
        col_waitlist.setCellValueFactory(new PropertyValueFactory<>("Waitlist"));
        col_room.setCellValueFactory(new PropertyValueFactory<>("Room"));
        col_professor.setCellValueFactory(new PropertyValueFactory<>("Professor"));
        searchtable.setItems(oblist_search);

        availableCoursesScrollPane.setContent(searchtable);*/