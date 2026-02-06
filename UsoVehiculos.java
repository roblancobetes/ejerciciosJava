public class UsoVehiculos {

    public static void main(String[] args) {

        Coche micoche = new Coche("A", 2017, "Seat Ibiza", 100000, true);

        Coche cochePepito = new Coche("E", 1993, "Seat Ibiza", 1000000, false);

        Coche[] listaCoches = {micoche, cochePepito};

        for (Coche coche : listaCoches) {

            String cadena;

            if (coche.isTieneAire()) cadena = " y tiene aire acondicionado";

            else cadena = " y no tiene aire acondicionado";

            System.out.println("Mi coche es un " + coche.getModelo() + ", tiene etiqueta " + 
            coche.getEtiqueta() + cadena);
            
        }
  
    }

}

class Coche {

    //Método constructor (genera nuevos coches con los atributos especificados)
    public Coche(String etiqueta, int fechaMatriculacion, String modelo, int numKilometros, boolean tieneAire) {

            this.etiqueta = etiqueta;

            this.fechaMatriculacion = fechaMatriculacion;

            this.modelo = modelo;

            this.numKilometros = numKilometros;

            this.tieneAire = tieneAire;

    }

    private String modelo;

    private int numKilometros;

    private int fechaMatriculacion;

    private boolean tieneAire;

    private String etiqueta;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumKilometros() {
        return numKilometros;
    }

    public void setNumKilometros(int numKilometros) {
        this.numKilometros = numKilometros;
    }

    public int getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(int fechaMatriculacion) {
        if (fechaMatriculacion < 1920 || fechaMatriculacion > 2026) throw new IllegalArgumentException("Fecha no válida");
        else this.fechaMatriculacion = fechaMatriculacion;
    }

    public boolean isTieneAire() {
        return tieneAire;
    }

    public void setTieneAire(boolean tieneAire) {
        this.tieneAire = tieneAire;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

}