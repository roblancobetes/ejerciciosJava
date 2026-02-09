public class UsoVehiculos {

    public static void main(String[] args) {

        Coche micoche = new Coche("A", 2017, "Seat Ibiza", 100000, true);

        Coche cochePepito = new Coche("E", 1993, "Seat Ibiza", 1000000, false);

        Furgoneta miFurgoneta = new Furgoneta("D", 2010, "Seat Furgoneta", 50000, false, 2000);

        Coche[] listaCoches = {micoche, cochePepito, miFurgoneta};

        cochePepito.instalarAire();

        miFurgoneta.instalarAire();

        System.out.println("La capacidad de carga es " + ((Furgoneta)listaCoches[2]).getCapacidadCarga());

        for (Coche coche : listaCoches) {

            String cadena;

            if (coche.isTieneAire()) cadena = " y tiene aire acondicionado";

            else cadena = " y no tiene aire acondicionado";

            System.out.println("Mi coche, de ID " + coche.getIdCoche() + " es un " + coche.getModelo() + ", tiene etiqueta " + 
            coche.getEtiqueta() + cadena);

            System.out.println("Y estimo un precio de " + coche.precio());
            
        }

        System.out.print("El número total de coches en el garaje es de " + Coche.getNumeroCoches());

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

            Coche.numeroCoches++;

            if (Coche.numeroCoches > Coche.MAX_COCHES) throw new IllegalArgumentException("Número máximo de coches excedido");

            this.idCoche = Coche.numeroCoches;

    }

    //Atributos privados de instancias
    private String modelo;

    private int numKilometros;

    private int fechaMatriculacion;

    private final int idCoche;

    private boolean tieneAire;

    private String etiqueta;

    public static final int MAX_COCHES = 100;

    //Atributos static
    private static int numeroCoches = 0;

    public static int getNumeroCoches() {

        return Coche.numeroCoches;

    }

    //Métodos getters y setters
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

    //Métodos definidos
    public int precio() {

        int precio = 5000;

        precio -= (int) 10*(2026-this.fechaMatriculacion);

        if (this.tieneAire) precio += 1000;
        else precio -= 1000;

        if (this.etiqueta.equals("A")||this.etiqueta.equals("ECO")) precio += 1000;
        else precio -= 1000;

        return precio;

    }

    public void instalarAire() {

        this.tieneAire = true;

    }

    public int getIdCoche() {
        return idCoche;
    }

}

class Furgoneta extends Coche {

    //Método constructor de una nueva furgoneta
    public Furgoneta(String etiqueta, int fechaMatriculacion, String modelo, int numKilometros, boolean tieneAire, int capacidadCarga) {

        //Llama al método constructor de la clase Coche
        super(etiqueta, fechaMatriculacion, modelo, numKilometros, tieneAire);

        this.capacidadCarga = capacidadCarga;

    }

    private int capacidadCarga;

    public int getCapacidadCarga() {
        return this.capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }




}