import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.image.*;
import javafx.stage.Stage;

public class StudentRegistration extends Application {
    Scene scene, scene2, scene3, scene4;
    @Override
    public void start(Stage primaryStage) {
        //Top Menu Bar
        Rectangle topBar = new Rectangle(0,0,1200,140);
        topBar.setFill(Color.web("#0F4D92"));
        topBar.setMouseTransparent(true);
        
        //Student Info text
        Text studentInfo = new Text("Student Info");
        studentInfo.setFont(new Font("Times New Roman",27));
        studentInfo.setStyle("-fx-font-weight:bold");
        studentInfo.setFill(Color.CYAN);
        
        //change color if mouse hovers over
        studentInfo.setOnMouseEntered(event -> {
            studentInfo.setFill(Color.WHITESMOKE);
        });
        studentInfo.setOnMouseExited(event -> {
            studentInfo.setFill(Color.CYAN);
        });
        
        //Enrolled Courses text
        Text enrolledCourse = new Text("Enrolled Courses");
        enrolledCourse.setFont(new Font("Times New Roman",27));
        enrolledCourse.setStyle("-fx-font-weight:bold");
        enrolledCourse.setFill(Color.WHITESMOKE);
        
        //change color if mouse hovers over
        enrolledCourse.setOnMouseEntered(event -> {
            enrolledCourse.setFill(Color.CYAN);
        });
        enrolledCourse.setOnMouseExited(event -> {
            enrolledCourse.setFill(Color.WHITESMOKE);
        });
        
        //Selected Courses text
        Text selectedCourse = new Text("Selected Courses");
        selectedCourse.setFont(new Font("Times New Roman",27));
        selectedCourse.setStyle("-fx-font-weight:bold");
        selectedCourse.setFill(Color.WHITESMOKE);
        
        //change color if mouse hovers over
        selectedCourse.setOnMouseEntered(event -> {
            selectedCourse.setFill(Color.CYAN);
        });
        selectedCourse.setOnMouseExited(event -> {
            selectedCourse.setFill(Color.WHITESMOKE);
        });
        
        //Search Courses text
        Text searchCourse = new Text("Search Courses");
        searchCourse.setFont(new Font("Times New Roman",27));
        searchCourse.setStyle("-fx-font-weight:bold");
        searchCourse.setFill(Color.WHITESMOKE);
        
        //change color if mouse hovers over
        searchCourse.setOnMouseEntered(event -> {
            searchCourse.setFill(Color.CYAN);
        });
        searchCourse.setOnMouseExited(event -> {
            searchCourse.setFill(Color.WHITESMOKE);
        });
        
        //HBox to hold all menu texts
        HBox menuHBox = new HBox(100, studentInfo, enrolledCourse, selectedCourse, searchCourse);
        menuHBox.setLayoutX(100);
        menuHBox.setLayoutY(102);
        
        //Enrollment Subsystem text
        Text title = new Text("Enrollment Subsystem");
        title.setFont(new Font("Times New Roman",48));
        title.setStyle("-fx-font-weight:regular");
        title.setFill(Color.WHITESMOKE);
        
        //Logout text
        Text logout = new Text("Logout");
        logout.setFont(new Font("Times New Roman",18));
        logout.setStyle("-fx-font-weight:regular");
        logout.setFill(Color.WHITESMOKE);
        
        //change color if mouse hovers over
        logout.setOnMouseEntered(event -> {
            logout.setFill(Color.CYAN);
        });
        logout.setOnMouseExited(event -> {
            logout.setFill(Color.WHITESMOKE);
        });
        
        //Text in topBox
        HBox loginHbox = new HBox(675, title, logout);
        loginHbox.setLayoutX(25);
        loginHbox.setLayoutY(10.0);
        
        Pane mouseinvisible = new Pane(topBar); 
        mouseinvisible.setMouseTransparent(true);
        
        //Background squares
        Rectangle rect = new Rectangle(50, 200, 1100, 570);
        rect.setFill(Color.web("#0F4D92")); 
        
        Rectangle rect2 = new Rectangle(70, 220, 1060, 300);
        rect2.setFill(Color.WHITE);
        
        Rectangle rect3 = new Rectangle(70, 625, 1060, 125);
        rect3.setFill(Color.WHITE);
        
        //Student info texts
        Text studentTitle = new Text(75, 250, "Student Info");
        studentTitle.setFont(new Font("Times New Roman",32));
        studentTitle.setStyle("-fx-font-weight:bold");
        studentTitle.setFill(Color.BLACK);
        
        Text studentID = new Text(75, 275, "Student ID: 512351235");
        studentID.setFont(new Font("Times New Roman",18));
        studentID.setStyle("-fx-font-weight:regular");
        studentID.setFill(Color.BLACK);
        
        Text studentName = new Text(75, 300, "Student Name: Jim Bob");
        studentName.setFont(new Font("Times New Roman",18));
        studentName.setStyle("-fx-font-weight:regular");
        studentName.setFill(Color.BLACK);
        
        Text studentMajor = new Text(75, 325, "Student Major: Computer Science");
        studentMajor.setFont(new Font("Times New Roman",18));
        studentMajor.setStyle("-fx-font-weight:regular");
        studentMajor.setFill(Color.BLACK);
       
        Pane mousevisible = new Pane(menuHBox,loginHbox); 
        Pane rootPane = new Pane(mouseinvisible, mousevisible, rect, rect2, studentTitle, studentID, studentName, studentMajor, rect3);
        Scene scene = new Scene(rootPane, 1200, 800,Color.WHITESMOKE);

        // SCENE 2 = Selected Courses Page
        
        //Top blue bar
        Rectangle topBar2 = new Rectangle(0,0,1200,140);
        topBar2.setFill(Color.web("#0F4D92"));
        topBar2.setMouseTransparent(true);
        
        //Student info text
        Text studentInfo2 = new Text("Student Info");
        studentInfo2.setFont(new Font("Times New Roman",27));
        studentInfo2.setStyle("-fx-font-weight:bold");
        studentInfo2.setFill(Color.WHITESMOKE);
        
        //change color if mouse hovers over
        studentInfo2.setOnMouseEntered(event -> {
            studentInfo2.setFill(Color.CYAN);
        });
        studentInfo2.setOnMouseExited(event -> {
            studentInfo2.setFill(Color.WHITESMOKE);
        });
        
        //Enrolled courses text
        Text enrolledCourse2 = new Text("Enrolled Courses");
        enrolledCourse2.setFont(new Font("Times New Roman",27));
        enrolledCourse2.setStyle("-fx-font-weight:bold");
        enrolledCourse2.setFill(Color.CYAN);
        
        //change color if mouse hovers over
        enrolledCourse2.setOnMouseEntered(event -> {
            enrolledCourse2.setFill(Color.WHITESMOKE);
        });
        enrolledCourse2.setOnMouseExited(event -> {
            enrolledCourse2.setFill(Color.CYAN);
        });
        
        //Selected Course text
        Text selectedCourse2 = new Text("Selected Courses");
        selectedCourse2.setFont(new Font("Times New Roman",27));
        selectedCourse2.setStyle("-fx-font-weight:bold");
        selectedCourse2.setFill(Color.WHITESMOKE);
        
        //change color if mouse hovers over
        selectedCourse2.setOnMouseEntered(event -> {
            selectedCourse2.setFill(Color.CYAN);
        });
        selectedCourse2.setOnMouseExited(event -> {
            selectedCourse2.setFill(Color.WHITESMOKE);
        });
        
        //Search courses text
        Text searchCourse2 = new Text("Search Courses");
        searchCourse2.setFont(new Font("Times New Roman",27));
        searchCourse2.setStyle("-fx-font-weight:bold");
        searchCourse2.setFill(Color.WHITESMOKE);
        
        //change color if mouse hovers over
        searchCourse2.setOnMouseEntered(event -> {
            searchCourse2.setFill(Color.CYAN);
        });
        searchCourse2.setOnMouseExited(event -> {
            searchCourse2.setFill(Color.WHITESMOKE);
        });
        
        //HBox for menu texts
        HBox menuHBox2 = new HBox(100, studentInfo2, enrolledCourse2, selectedCourse2, searchCourse2);
        menuHBox2.setLayoutX(100);
        menuHBox2.setLayoutY(102);
        
        //Enrollment Subsystem text
        Text title2 = new Text("Enrollment Subsystem");
        title2.setFont(new Font("Times New Roman",48));
        title2.setStyle("-fx-font-weight:regular");
        title2.setFill(Color.WHITESMOKE);
        
        //Logout text
        Text logout2 = new Text("Logout");
        logout2.setFont(new Font("Times New Roman",18));
        logout2.setStyle("-fx-font-weight:regular");
        logout2.setFill(Color.WHITESMOKE);
        
        //change color if mouse hovers over
        logout2.setOnMouseEntered(event -> {
            logout2.setFill(Color.CYAN);
        });
        logout2.setOnMouseExited(event -> {
            logout2.setFill(Color.WHITESMOKE);
        });
        
        HBox loginHbox2 = new HBox(675, title2, logout2);
        loginHbox2.setLayoutX(25);
        loginHbox2.setLayoutY(10.0);

        Pane mouseinvisible2 = new Pane(topBar2); 
        mouseinvisible2.setMouseTransparent(true);
        
        //Background rectangles
        Rectangle rect4 = new Rectangle(50, 200, 1100, 570);
        rect4.setFill(Color.web("#0F4D92")); 
        
        Rectangle rect5 = new Rectangle(70, 220, 1060, 300);
        rect5.setFill(Color.WHITE);
        
        Rectangle rect6 = new Rectangle(70, 625, 1060, 125);
        rect6.setFill(Color.WHITE);
        
        Text enrolledTitle = new Text(75, 250, "Enrolled Info");
        enrolledTitle.setFont(new Font("Times New Roman",32));
        enrolledTitle.setStyle("-fx-font-weight:bold");
        enrolledTitle.setFill(Color.BLACK);
        
        //Drop and swap buttons
        Button dropButton = new Button("DROP");
        Button swapButton = new Button("SWAP");
        
        HBox button2 = new HBox(60, dropButton, swapButton);
        button2.setLayoutX(880.0);
        button2.setLayoutY(700.0);
        
        Pane mousevisible2 = new Pane(menuHBox2,loginHbox2);
        Pane rootPane2 = new Pane(mouseinvisible2,mousevisible2, rect4, rect5, enrolledTitle, rect6, button2);
        scene2 = new Scene(rootPane2, 1200, 800,Color.WHITESMOKE);
        
        // SCENE 3 = Enrolled Courses page
        Rectangle topBar3 = new Rectangle(0,0,1200,140);
        topBar3.setFill(Color.web("#0F4D92"));
        topBar3.setMouseTransparent(true);
        
        Text studentInfo3 = new Text("Student Info");
        studentInfo3.setFont(new Font("Times New Roman",27));
        studentInfo3.setStyle("-fx-font-weight:bold");
        studentInfo3.setFill(Color.WHITESMOKE);
        
        studentInfo3.setOnMouseEntered(event -> {
            studentInfo3.setFill(Color.CYAN);
        });
        studentInfo3.setOnMouseExited(event -> {
            studentInfo3.setFill(Color.WHITESMOKE);
        });
        
        Text enrolledCourse3 = new Text("Enrolled Courses");
        enrolledCourse3.setFont(new Font("Times New Roman",27));
        enrolledCourse3.setStyle("-fx-font-weight:bold");
        enrolledCourse3.setFill(Color.WHITESMOKE);
        
        enrolledCourse3.setOnMouseEntered(event -> {
            enrolledCourse3.setFill(Color.CYAN);
        });
        enrolledCourse3.setOnMouseExited(event -> {
            enrolledCourse3.setFill(Color.WHITESMOKE);
        });
        
        Text selectedCourse3 = new Text("Selected Courses");
        selectedCourse3.setFont(new Font("Times New Roman",27));
        selectedCourse3.setStyle("-fx-font-weight:bold");
        selectedCourse3.setFill(Color.CYAN);
        
        selectedCourse3.setOnMouseEntered(event -> {
            selectedCourse3.setFill(Color.WHITESMOKE);
        });
        selectedCourse3.setOnMouseExited(event -> {
            selectedCourse3.setFill(Color.CYAN);
        });
        
        Text searchCourse3 = new Text("Search Courses");
        searchCourse3.setFont(new Font("Times New Roman",27));
        searchCourse3.setStyle("-fx-font-weight:bold");
        searchCourse3.setFill(Color.WHITESMOKE);
        
        searchCourse3.setOnMouseEntered(event -> {
            searchCourse3.setFill(Color.CYAN);
        });
        searchCourse3.setOnMouseExited(event -> {
            searchCourse3.setFill(Color.WHITESMOKE);
        });
        
        HBox menuHBox3 = new HBox(100, studentInfo3, enrolledCourse3, selectedCourse3, searchCourse3);
        menuHBox3.setLayoutX(100);
        menuHBox3.setLayoutY(102);
        
        Text title3 = new Text("Enrollment Subsystem");
        title3.setFont(new Font("Times New Roman",48));
        title3.setStyle("-fx-font-weight:regular");
        title3.setFill(Color.WHITESMOKE);
        
        Text logout3 = new Text("Logout");
        logout3.setFont(new Font("Times New Roman",18));
        logout3.setStyle("-fx-font-weight:regular");
        logout3.setFill(Color.WHITESMOKE);
        logout3.setOnMouseEntered(event -> {
            logout3.setFill(Color.CYAN);
        });
        logout3.setOnMouseExited(event -> {
            logout3.setFill(Color.WHITESMOKE);
        });
        
        HBox loginHbox3 = new HBox(675, title3, logout3);
        loginHbox3.setLayoutX(25);
        loginHbox3.setLayoutY(10.0);
        
        Pane mouseinvisible3 = new Pane(topBar3); 
        mouseinvisible3.setMouseTransparent(true);
        
        Rectangle rect7 = new Rectangle(50, 200, 1100, 570);
        rect7.setFill(Color.web("#0F4D92")); 
        
        Rectangle rect8 = new Rectangle(70, 220, 1060, 300);
        rect8.setFill(Color.WHITE);
        
        Rectangle rect9 = new Rectangle(70, 625, 1060, 125);
        rect9.setFill(Color.WHITE);
        
        Text selectedTitle = new Text(75, 250, "Selected Courses");
        selectedTitle.setFont(new Font("Times New Roman",32));
        selectedTitle.setStyle("-fx-font-weight:bold");
        selectedTitle.setFill(Color.BLACK);
        
        Button removeButton = new Button("REMOVE");
        Button enrollButton = new Button("ENROLL");
        
        HBox button3 = new HBox(60, removeButton, enrollButton);
        button3.setLayoutX(880.0);
        button3.setLayoutY(700.0);
        
        Pane mousevisible3 = new Pane(menuHBox3,loginHbox3); 
        Pane rootPane3 = new Pane(mouseinvisible3, mousevisible3, rect7, rect8, selectedTitle, rect9, button3);
        Scene scene3 = new Scene(rootPane3, 1200, 800,Color.WHITESMOKE);
 
        
        // SCENE 4 = Search Course page
        Rectangle topBar4 = new Rectangle(0,0,1200,140);
        topBar4.setFill(Color.web("#0F4D92"));
        topBar4.setMouseTransparent(true);
        
        //Student info text
        Text studentInfo4 = new Text("Student Info");
        studentInfo4.setFont(new Font("Times New Roman",27));
        studentInfo4.setStyle("-fx-font-weight:bold");
        studentInfo4.setFill(Color.WHITESMOKE);
        
        //change color if mouse hovers over
        studentInfo4.setOnMouseEntered(event -> {
            studentInfo4.setFill(Color.CYAN);
        });
        studentInfo4.setOnMouseExited(event -> {
            studentInfo4.setFill(Color.WHITESMOKE);
        });
        
        //Enrolled Courses text
        Text enrolledCourse4 = new Text("Enrolled Courses");
        enrolledCourse4.setFont(new Font("Times New Roman",27));
        enrolledCourse4.setStyle("-fx-font-weight:bold");
        enrolledCourse4.setFill(Color.WHITESMOKE);
        
        //change color if mouse hovers over
        enrolledCourse4.setOnMouseEntered(event -> {
            enrolledCourse4.setFill(Color.CYAN);
        });
        enrolledCourse4.setOnMouseExited(event -> {
            enrolledCourse4.setFill(Color.WHITESMOKE);
        });
        
        //Selected Courses text
        Text selectedCourse4 = new Text("Selected Courses");
        selectedCourse4.setFont(new Font("Times New Roman",27));
        selectedCourse4.setStyle("-fx-font-weight:bold");
        selectedCourse4.setFill(Color.WHITESMOKE);
        
        //change color if mouse hovers over
        selectedCourse4.setOnMouseEntered(event -> {
            selectedCourse4.setFill(Color.CYAN);
        });
        selectedCourse4.setOnMouseExited(event -> {
            selectedCourse4.setFill(Color.WHITESMOKE);
        });
        
        //Search courses text
        Text searchCourse4 = new Text("Search Courses");
        searchCourse4.setFont(new Font("Times New Roman",27));
        searchCourse4.setStyle("-fx-font-weight:bold");
        searchCourse4.setFill(Color.CYAN);
        
        //change color if mouse hovers over
        searchCourse4.setOnMouseEntered(event -> {
            searchCourse4.setFill(Color.WHITESMOKE);
        });
        searchCourse4.setOnMouseExited(event -> {
            searchCourse4.setFill(Color.CYAN);
        });
        
        //Menu text HBox
        HBox menuHBox4 = new HBox(100, studentInfo4, enrolledCourse4, selectedCourse4, searchCourse4);
        menuHBox4.setLayoutX(100);
        menuHBox4.setLayoutY(102);
        
        Text title4 = new Text("Enrollment Subsystem");
        title4.setFont(new Font("Times New Roman",48));
        title4.setStyle("-fx-font-weight:regular");
        title4.setFill(Color.WHITESMOKE);
        
        Text logout4 = new Text("Logout");
        logout4.setFont(new Font("Times New Roman",18));
        logout4.setStyle("-fx-font-weight:regular");
        logout4.setFill(Color.WHITESMOKE);
        
        //change color if mouse hovers over
        logout4.setOnMouseEntered(event -> {
            logout4.setFill(Color.CYAN);
        });
        logout4.setOnMouseExited(event -> {
            logout4.setFill(Color.WHITESMOKE);
        });
       
        HBox loginHbox4 = new HBox(675, title4, logout4);
        loginHbox4.setLayoutX(25);
        loginHbox4.setLayoutY(10.0);
        
        Pane mouseinvisible4 = new Pane(topBar4); 
        mouseinvisible4.setMouseTransparent(true);
        
        //Background rectangles
        Rectangle rect10 = new Rectangle(50, 200, 1100, 570);
        rect10.setFill(Color.web("#0F4D92")); 
        
        Rectangle rect11 = new Rectangle(70, 220, 1060, 300);
        rect11.setFill(Color.WHITE);
        
        Rectangle rect12 = new Rectangle(70, 625, 1060, 125);
        rect12.setFill(Color.WHITE);
        
        Text searchTitle = new Text(75, 250, "Search Courses");
        searchTitle.setFont(new Font("Times New Roman",32));
        searchTitle.setStyle("-fx-font-weight:bold");
        searchTitle.setFill(Color.BLACK);
        
        //Select button
        Button selectButton = new Button("Select");
        
        HBox button4 = new HBox(selectButton);
        button4.setLayoutX(1000.0);
        button4.setLayoutY(700.0);

        Pane mousevisible4 = new Pane(menuHBox4,loginHbox4); 
        Pane rootPane4 = new Pane(mouseinvisible4, mousevisible4, rect10, rect11, searchTitle, rect12, button4);
        Scene scene4 = new Scene(rootPane4, 1200, 800, Color.WHITESMOKE);
        
        //Change from scene to scene by clicking texts
        // Changing from scene1 (Student Info)
        
        studentInfo.setOnMouseClicked(event -> {
            primaryStage.setScene(scene);
        });
        
        enrolledCourse.setOnMouseClicked(event -> {
            primaryStage.setScene(scene2);
        });
        
        selectedCourse.setOnMouseClicked(event -> {
            primaryStage.setScene(scene3);
        });
        
        searchCourse.setOnMouseClicked(event -> {
            primaryStage.setScene(scene4);
        });
        
        // Changing from scene2 (Enrolled Courses)
        
        studentInfo2.setOnMouseClicked(event -> {
            primaryStage.setScene(scene);
        });
        
        enrolledCourse2.setOnMouseClicked(event -> {
            primaryStage.setScene(scene2);
        });
        
        selectedCourse2.setOnMouseClicked(event -> {
            primaryStage.setScene(scene3);
        });
        
        searchCourse2.setOnMouseClicked(event -> {
            primaryStage.setScene(scene4);
        });
        
        // Changing from scene3 (Selected Courses)
        
        studentInfo3.setOnMouseClicked(event -> {
            primaryStage.setScene(scene);
        });
        
        enrolledCourse3.setOnMouseClicked(event -> {
            primaryStage.setScene(scene2);
        });
        
        selectedCourse3.setOnMouseClicked(event -> {
            primaryStage.setScene(scene3);
        });
        
        searchCourse3.setOnMouseClicked(event -> {
            primaryStage.setScene(scene4);
        });
        
        // Changing from scene4 (Search Courses)
        studentInfo4.setOnMouseClicked(event -> {
            primaryStage.setScene(scene);
        });
        
        enrolledCourse4.setOnMouseClicked(event -> {
            primaryStage.setScene(scene2);
        });
        
        selectedCourse4.setOnMouseClicked(event -> {
            primaryStage.setScene(scene3);
        });
        
        searchCourse4.setOnMouseClicked(event -> {
            primaryStage.setScene(scene4);
        });
 
        //Setup for scene1
        primaryStage.setTitle("Enrollment Subsystem");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}