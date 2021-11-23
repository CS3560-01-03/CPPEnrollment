package com.enrollment.enrollmentproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import javafx.stage.Stage;




public class StudentRegistration extends Application {
    Scene scene, scene2, scene3, scene4;
    @Override
    public void start(Stage primaryStage) {
        String student_id = "1";

        String whatIWantFromView = "Course, `Course Title`, Time, Capacity, Waitlist, Room, Professor, Units, `Semester Year`";
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

        //Hbox to hold all of menu texts
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

        Rectangle rect2 = new Rectangle(70, 220, 1060, 420);
        rect2.setFill(Color.WHITE);

        Rectangle rect3 = new Rectangle(70, 675, 1060, 75);
        rect3.setFill(Color.WHITE);

        //Student Info texts
        Text studentTitle = new Text(75, 250, "Student Info");
        studentTitle.setFont(new Font("Times New Roman",32));
        studentTitle.setStyle("-fx-font-weight:bold");
        studentTitle.setFill(Color.BLACK);

        Controller student_info_query = new Controller();
        Object student_data = student_info_query.connectSelect("SELECT * FROM student WHERE studentID = ?", student_id).get(0);
        String[] student_data_split = student_data.toString().split(",");

        Text studentID = new Text(75, 275, "Student ID: " + student_data_split[0].substring(1));
        studentID.setFont(new Font("Times New Roman",18));
        studentID.setStyle("-fx-font-weight:regular");
        studentID.setFill(Color.BLACK);

        Text studentName = new Text(75, 300, "Student Name: " + student_data_split[2].substring(0, student_data_split[2].length()-1));
        studentName.setFont(new Font("Times New Roman",18));
        studentName.setStyle("-fx-font-weight:regular");
        studentName.setFill(Color.BLACK);

        Text studentMajor = new Text(75, 325, "Student Major: " + student_data_split[1]);
        studentMajor.setFont(new Font("Times New Roman",18));
        studentMajor.setStyle("-fx-font-weight:regular");
        studentMajor.setFill(Color.BLACK);

        Pane mousevisible = new Pane(menuHBox,loginHbox);
        Pane rootPane = new Pane(mouseinvisible, mousevisible, rect, rect2, studentTitle, studentID, studentName, studentMajor, rect3);
        Scene scene = new Scene(rootPane, 1200, 800,Color.WHITESMOKE);



        // SCENE 2 = Enrolledd Courses page
        // Top blue bar
        Rectangle topBar2 = new Rectangle(0,0,1200,140);
        topBar2.setFill(Color.web("#0F4D92"));
        topBar2.setMouseTransparent(true);

        //Student Info text
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

        //Selected Courses text
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

        //Search Courses text
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

        //Hbox for menu texts
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

        Rectangle rect5 = new Rectangle(70, 220, 1060, 420);
        rect5.setFill(Color.WHITE);

        Rectangle rect6 = new Rectangle(70, 675, 1060, 75);
        rect6.setFill(Color.WHITE);

        Text enrolledTitle = new Text(75, 250, "Enrolled Info");
        enrolledTitle.setFont(new Font("Times New Roman",32));
        enrolledTitle.setStyle("-fx-font-weight:bold");
        enrolledTitle.setFill(Color.BLACK);
        enrolledTitle.setText("Enrolled Info " + "(" + student_data_split[2].substring(0, student_data_split[2].length()-1) + " ID: " + student_data_split[0].substring(1) + ")");

        //Drop and swap buttons
        Button dropButton = new Button("DROP");
        Button swapButton = new Button("SWAP");

        HBox button2 = new HBox(60, dropButton, swapButton);
        button2.setLayoutX(880.0);
        button2.setLayoutY(700.0);

        // CREATE NEW TABLE VIEW AND WHATEVER NEEDED TO SHOW A TABLE IN RIGHT LOCATION
        ScrollPane enrolledCoursesScrollPane = new ScrollPane();

        Controller enrolledCourses = new Controller();
        TableView<Object> enrolled_table = enrolledCourses.connectTable("SELECT " + whatIWantFromView + " FROM (enrolled_info) WHERE studentID = ?", student_id);//"SELECT * FROM enrolled_info WHERE studentID = ?", student_id
        enrolledCoursesScrollPane.setContent(enrolled_table);
        enrolledCoursesScrollPane.setTranslateX(69);
        enrolledCoursesScrollPane.setTranslateY(260);

        enrolledCoursesScrollPane.setPrefSize(1061,385);

        Pane mousevisible2 = new Pane(menuHBox2,loginHbox2);
        Pane rootPane2 = new Pane(mouseinvisible2,mousevisible2, rect4, rect5, enrolledTitle, enrolledCoursesScrollPane, rect6, button2);
        scene2 = new Scene(rootPane2, 1200, 800,Color.WHITESMOKE);

        // Removes the course from courses_enrolled
        dropButton.setOnMouseClicked(event -> {
            String[] selected_data_split = enrolled_table.getSelectionModel().getSelectedItem().toString().split(",");
            String course_subject = selected_data_split[0].substring(1,selected_data_split[0].length()-6);
            String course_code = selected_data_split[0].substring(selected_data_split[0].length()-6,selected_data_split[0].length()-2);
            String course_section = selected_data_split[0].substring(selected_data_split[0].length()-1);
            Object course_id = enrolledCourses.connectSelect("SELECT courseID FROM course WHERE courseSubject = ? AND courseCode = ? ", course_subject, course_code).get(0).toString().substring(1,2);

            enrolledCourses.connectRemove(
                    "DELETE FROM courses_enrolled WHERE (`studentID` = ?) and (`courseID` = ?)",
                    student_id, course_id.toString());
            System.out.println( course_subject + course_code + "." + course_section + " Dropped.");
            enrolledCoursesScrollPane.setContent(enrolledCourses.connectTable("SELECT " + whatIWantFromView + " FROM enrolled_info WHERE studentID IN(?)", student_id));
        });



        // SCENE 3 = Selected Courses page
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

        Rectangle rect8 = new Rectangle(70, 220, 1060, 420);
        rect8.setFill(Color.WHITE);

        Rectangle rect9 = new Rectangle(70, 675, 1060, 75);
        rect9.setFill(Color.WHITE);

        Text selectedTitle = new Text(75, 250, "Selected Courses");
        selectedTitle.setFont(new Font("Times New Roman",32));
        selectedTitle.setStyle("-fx-font-weight:bold");
        selectedTitle.setFill(Color.BLACK);

        selectedTitle.setText("Selected Courses " + "(" + student_data_split[2].substring(0, student_data_split[2].length()-1) + " ID: " + student_data_split[0].substring(1) + ")");

        Button removeButton = new Button("REMOVE");
        Button enrollButton = new Button("ENROLL");

        HBox button3 = new HBox(60, removeButton, enrollButton);
        button3.setLayoutX(880.0);
        button3.setLayoutY(700.0);

        // CREATE NEW TABLE VIEW AND WHATEVER NEEDED TO SHOW A TABLE IN RIGHT LOCATION
        ScrollPane selectedCoursesScrollPane = new ScrollPane();
        Controller selectedCourses = new Controller();
        TableView<Object> selected_table = selectedCourses.connectTable("SELECT " + whatIWantFromView + " FROM (cart_info) WHERE studentID = ?", student_id);

        selectedCoursesScrollPane.setContent(selected_table);
        selectedCoursesScrollPane.setTranslateX(69);
        selectedCoursesScrollPane.setTranslateY(260);
        selectedCoursesScrollPane.setPrefSize(1061,385);

        Pane mousevisible3 = new Pane(menuHBox3,loginHbox3);
        Pane rootPane3 = new Pane(mouseinvisible3, mousevisible3, rect7, rect8, selectedTitle, selectedCoursesScrollPane, rect9, button3);
        Scene scene3 = new Scene(rootPane3, 1200, 800,Color.WHITESMOKE);

        // Removes the course from cart
        removeButton.setOnMouseClicked(event -> {
            String[] selected_data_split = selected_table.getSelectionModel().getSelectedItem().toString().split(",");
            String course_subject = selected_data_split[0].substring(1,selected_data_split[0].length()-6);
            String course_code = selected_data_split[0].substring(selected_data_split[0].length()-6,selected_data_split[0].length()-2);
            String course_section = selected_data_split[0].substring(selected_data_split[0].length()-1);
            Object course_id = selectedCourses.connectSelect("SELECT courseID FROM course WHERE courseSubject = ? AND courseCode = ? ", course_subject, course_code).get(0).toString().substring(1,2);

            selectedCourses.connectRemove(
                    "DELETE FROM cart WHERE (`studentID` = ?) and (`courseID` = ?)",
                    student_id, course_id.toString());
            System.out.println( course_subject + course_code + "." + course_section + " Removed.");
            selectedCoursesScrollPane.setContent(selectedCourses.connectTable("SELECT " + whatIWantFromView + " FROM (cart_info) WHERE studentID = ?", student_id));//"SELECT * FROM cart_info"
        });

        // Adds the course to courses_enrolled
        enrollButton.setOnMouseClicked(event -> {
            String[] selected_data_split = selected_table.getSelectionModel().getSelectedItem().toString().split(",");
            String course_subject = selected_data_split[0].substring(1,selected_data_split[0].length()-6);
            String course_code = selected_data_split[0].substring(selected_data_split[0].length()-6,selected_data_split[0].length()-2);
            String course_section = selected_data_split[0].substring(selected_data_split[0].length()-1);
            Object course_id = selectedCourses.connectSelect("SELECT courseID FROM course WHERE courseSubject = ? AND courseCode = ? ", course_subject, course_code).get(0).toString().substring(1,2);

            selectedCourses.connectInsert(
                    "INSERT INTO courses_enrolled VALUES (?, ?, ?)",
                    student_id, course_id.toString(), course_section);
            selectedCourses.connectRemove(
                    "DELETE FROM cart WHERE (`studentID` = ?) and (`courseID` = ?)",
                    student_id, course_id.toString());
            System.out.println( course_subject + course_code + "." + course_section + " Enrolled and Removed.");
            selectedCoursesScrollPane.setContent(selectedCourses.connectTable("SELECT " + whatIWantFromView + " FROM (cart_info) WHERE studentID = ?", student_id));
        });


        // SCENE 4 = Search Course page
        // Blue part at top
        Rectangle topBar4 = new Rectangle(0,0,1200,140);
        topBar4.setFill(Color.web("#0F4D92"));
        topBar4.setMouseTransparent(true);

        // Tabs
        //Student Info text
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

        //Search Courses text
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

        // HeaderTitle
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

        Rectangle rect11 = new Rectangle(70, 220, 1060, 420);
        rect11.setFill(Color.WHITE);

        Rectangle rect12 = new Rectangle(70, 675, 1060, 75);
        rect12.setFill(Color.WHITE);

        Text searchTitle = new Text(75, 250, "Search Courses");
        searchTitle.setFont(new Font("Times New Roman",32));
        searchTitle.setStyle("-fx-font-weight:bold");
        searchTitle.setFill(Color.BLACK);

        //Add button
        Button addButton = new Button("ADD");

        HBox button4 = new HBox(addButton);
        button4.setLayoutX(1000.0);
        button4.setLayoutY(700.0);

        // CREATE NEW TABLE VIEW AND WHATEVER NEEDED TO SHOW A TABLE IN RIGHT LOCATION
        ScrollPane availableCoursesScrollPane = new ScrollPane();

        Controller coursesQuery = new Controller();
        TableView<Object> avail_table = coursesQuery.connectTable("SELECT * FROM course_section_info ORDER BY course");
        availableCoursesScrollPane.setContent(avail_table);
        availableCoursesScrollPane.setTranslateX(69);
        availableCoursesScrollPane.setTranslateY(260);

        availableCoursesScrollPane.setPrefSize(1061,385);

        Pane mousevisible4 = new Pane(menuHBox4,loginHbox4);
        Pane rootPane4 = new Pane(mouseinvisible4, mousevisible4, rect10, rect11, searchTitle, availableCoursesScrollPane, rect12, button4);
        Scene scene4 = new Scene(rootPane4, 1200, 800, Color.WHITESMOKE);

        // Adds the course to cart
        addButton.setOnMouseClicked(event -> {
            String[] selected_data_split = avail_table.getSelectionModel().getSelectedItem().toString().split(",");
            String course_subject = selected_data_split[0].substring(1,selected_data_split[0].length()-6);
            String course_code = selected_data_split[0].substring(selected_data_split[0].length()-6,selected_data_split[0].length()-2);
            String course_section = selected_data_split[0].substring(selected_data_split[0].length()-1);
            Object course_id = coursesQuery.connectSelect("SELECT courseID FROM course WHERE courseSubject = ? AND courseCode = ? ", course_subject, course_code).get(0).toString().substring(1,2);
            System.out.println(course_id);
            coursesQuery.connectInsert(
                    "INSERT INTO cart VALUES (?, ?, ?)",
                    student_id, course_id.toString(), course_section);
            System.out.println(course_subject + course_code + "." + course_section+ " " + course_id);
        });


        //Change from scene to scene by clicking texts
        //FROM Scene 1 (Student Info)
        studentInfo.setOnMouseClicked(event -> {
            primaryStage.setScene(scene);
        });

        enrolledCourse.setOnMouseClicked(event -> {
            enrolledCoursesScrollPane.setContent(enrolledCourses.connectTable("SELECT " + whatIWantFromView + " FROM (enrolled_info) WHERE studentID = ?", student_id));
            primaryStage.setScene(scene2);
        });

        selectedCourse.setOnMouseClicked(event -> {
            selectedCoursesScrollPane.setContent(selectedCourses.connectTable("SELECT " + whatIWantFromView + " FROM (cart_info) WHERE studentID = ?", student_id));
            primaryStage.setScene(scene3);
        });

        searchCourse.setOnMouseClicked(event -> {
            primaryStage.setScene(scene4);
        });



        //FROM Scene 2 (Enrolled Courses)
        studentInfo2.setOnMouseClicked(event -> {
            primaryStage.setScene(scene);
        });

        enrolledCourse2.setOnMouseClicked(event -> {
            enrolledCoursesScrollPane.setContent(enrolledCourses.connectTable("SELECT " + whatIWantFromView + " FROM (enrolled_info) WHERE studentID = ?", student_id));
            primaryStage.setScene(scene2);
        });

        selectedCourse2.setOnMouseClicked(event -> {
            selectedCoursesScrollPane.setContent(selectedCourses.connectTable("SELECT " + whatIWantFromView + " FROM (cart_info) WHERE studentID = ?", student_id));
            primaryStage.setScene(scene3);
        });

        searchCourse2.setOnMouseClicked(event -> {
            primaryStage.setScene(scene4);
        });



        //FROM Scene 3 (Selected Courses)
        studentInfo3.setOnMouseClicked(event -> {
            primaryStage.setScene(scene);
        });

        enrolledCourse3.setOnMouseClicked(event -> {
            enrolledCoursesScrollPane.setContent(enrolledCourses.connectTable("SELECT " + whatIWantFromView + " FROM (enrolled_info) WHERE studentID = ?", student_id));//"SELECT * FROM enrolled_info"
            primaryStage.setScene(scene2);
        });

        selectedCourse3.setOnMouseClicked(event -> {
            selectedCoursesScrollPane.setContent(selectedCourses.connectTable("SELECT " + whatIWantFromView + " FROM (cart_info) WHERE studentID = ?", student_id));
            primaryStage.setScene(scene3);
        });

        searchCourse3.setOnMouseClicked(event -> {
            primaryStage.setScene(scene4);
        });



        //FROM Scene 4 (Search Courses)
        studentInfo4.setOnMouseClicked(event -> {
            primaryStage.setScene(scene);
        });

        enrolledCourse4.setOnMouseClicked(event -> {
            enrolledCoursesScrollPane.setContent(enrolledCourses.connectTable("SELECT " + whatIWantFromView + " FROM (enrolled_info) WHERE studentID = ?", student_id));
            primaryStage.setScene(scene2);
        });

        selectedCourse4.setOnMouseClicked(event -> {
            selectedCoursesScrollPane.setContent(selectedCourses.connectTable("SELECT " + whatIWantFromView + " FROM (cart_info) WHERE studentID = ?", student_id));
            primaryStage.setScene(scene3);
        });

        searchCourse4.setOnMouseClicked(event -> {
            primaryStage.setScene(scene4);
        });


        //Setup for Scene
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
