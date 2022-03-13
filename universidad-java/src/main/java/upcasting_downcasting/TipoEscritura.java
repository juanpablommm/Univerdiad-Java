package upcasting_downcasting;

public enum TipoEscritura {

    CLASICA("Escritura a manito limpia"),
    MODERNA("Escritura con pc");
    
    private final String tiposEscritura;

    private TipoEscritura(String tiposEscritura) {
        this.tiposEscritura = tiposEscritura;
    }

    public String getTiposEscritura() {
        return tiposEscritura;
    }
}
