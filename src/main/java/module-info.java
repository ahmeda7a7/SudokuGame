
module sudoku {
    requires javafx.controls;
    requires javafx.fxml;


    exports sudoku;
    opens sudoku to javafx.fxml;
}
