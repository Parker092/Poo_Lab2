package entidades;

/**
 *
 * @author PARKER(L)
 */
public class edificio extends estructura{
    private String tipoEdificio;
    //private int material;
    
    public edificio(String nmb, String direccion, String tipo, double anch, double largo, int mater){
        this.setNombreEdificio(nmb);
        this.setDireccionEdificio(direccion);
        this.setTipoEdificio(tipo);
        this.setDimAncho(anch);
        this.setDimLargo(largo);
        this.setMaterial(mater);
    }

    public String getTipoEdificio() {
        return tipoEdificio;
    }
    public void setTipoEdificio(String tipoEdificio) {
        this.tipoEdificio = tipoEdificio;
    } 
}
