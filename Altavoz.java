public class Altavoz {
    
    //Volumen del altavoz
    private int volumenAltavoz;
    //Estado del altavoz
    private boolean altavozEncendido;
    // Nombre de la marca del altavoz
    private String marcaAltavoz;
    public Altavoz(boolean encendido, int porcentajeVolumen) {
        volumenAltavoz = porcentajeVolumen;
        altavozEncendido = encendido;
        marcaAltavoz = "jbl";
    }
    public int getVolumenAltavoz() {
        return volumenAltavoz;
    }
    public String getMarcaAltavoz() {
        return marcaAltavoz;
    }
    public boolean getAltavozEncendido() {
        return altavozEncendido;
    }
    public void setMarcaAltavoz(String marca) {
        marcaAltavoz = marca;
    }
    public void cambiarVolumen(int volumen) {
        volumenAltavoz = volumen;
    }
    public void apretarBoton(boolean botonEncendido) {
        altavozEncendido = botonEncendido;
    }
    public void imprimirDetalles() {
        System.out.println("Marca: " + marcaAltavoz + "|" + "Encendido: " + altavozEncendido + "|" + "Volumen: " + volumenAltavoz);
    }
}