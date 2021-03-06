package lab8p2_emiliocantarero_12111141;

import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Partida implements Serializable {

    private String nombre;
    private Date fecha;
    ArrayList<Estrella> estrellas = new ArrayList();
    ArrayList<Jugador> jugadores = new ArrayList();

    private static final long SerialVersionUID = 777L;

    public Partida() {
    }

    public Partida(String nombre) throws IOException {

        this.nombre = nombre;
        this.fecha = new Date();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Estrella> getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(ArrayList<Estrella> estrellas) {
        this.estrellas = estrellas;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public String fecha() {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sd.format(this.fecha);
        return fecha;
    }

    
}
