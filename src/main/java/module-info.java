module com.example.desafiodiobancodigitalpoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafiodiobancodigitalpoo to javafx.fxml;
    exports com.example.desafiodiobancodigitalpoo;
}