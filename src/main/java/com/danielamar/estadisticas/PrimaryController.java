package com.danielamar.estadisticas;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML private TextArea txtListaAlumnos;
    @FXML private TextField txtAprobados;
    @FXML private TextField txtReprobados;
    @FXML private TextField txtMejor;
    @FXML private TextField txtPeor;
    @FXML private TextField txtPromedio;

    private ArrayList<Alumno> AlumnosA;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        AlumnosA = new ArrayList<>();
        AlumnosA.add(new Alumno("uno", 1));
        AlumnosA.add(new Alumno("dos", 2));
        AlumnosA.add(new Alumno("tres", 3));
        AlumnosA.add(new Alumno("cuatro", 4));
        AlumnosA.add(new Alumno("cinco", 5));
        AlumnosA.add(new Alumno("seis", 6));
        AlumnosA.add(new Alumno("siete", 7));
        AlumnosA.add(new Alumno("ocho", 8));
        AlumnosA.add(new Alumno("nueve", 9));
        AlumnosA.add(new Alumno("diez", 10));
       

        
        String textoAlumnos = "";
        for (int i = 0; i < AlumnosA.size(); i++) {
            textoAlumnos += AlumnosA.get(i).toString() + "\n";
        }
        txtListaAlumnos.setText(textoAlumnos);

       
        CalculoEstadisticas calc = new CalculoEstadisticas(AlumnosA);

        
        txtAprobados.setText(calc.getPorcentajeAprobados() + "%");
        txtReprobados.setText(calc.getPorcentajeReprobados() + "%");
        txtMejor.setText(String.valueOf(calc.getMejorCalificacion()));
        txtPeor.setText(String.valueOf(calc.getPeorCalificacion()));
        txtPromedio.setText(String.valueOf(calc.getPromedio()));
    }
}
