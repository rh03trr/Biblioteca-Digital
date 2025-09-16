package Biblioteca;

public class Ubicacion {
    private String estante;
    private int fila;
    private String seccion;
    
    public Ubicacion(String estante, int fila, String seccion) {
        this.estante = estante;
        this.fila = fila;
        this.seccion = seccion;
    }

    public String getEstante() {
        return estante;
    }
    
    public int getFila() {
        return fila;
    }
    
    public String getSeccion() {
        return seccion;
    }
    
    public String obtenerUbicacion() {
        return "Estante: " + estante + "\nFila: " + fila + "\nSección: " + seccion;
    }
    
    @Override
    public String toString() {
        return obtenerUbicacion();
    }
}
