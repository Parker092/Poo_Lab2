package entidades;

import interfaces.precios;
import interfaces.terreno;

/**
 *
 * @author PARKER(L)
 */
public class estructura implements terreno, precios{
    private String nombreEdificio;
    private String direccionEdificio;
    private double dimAncho;
    private double dimLargo;
    private int material;

    public String getNombreEdificio() {
        return nombreEdificio;
    }
    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public String getDireccionEdificio() {
        return direccionEdificio;
    }
    public void setDireccionEdificio(String direccionEdificio) {
        this.direccionEdificio = direccionEdificio;
    }

    public double getDimAncho() {
        return dimAncho;
    }
    public void setDimAncho(double dimAncho) {
        this.dimAncho = dimAncho;
    }

    public double getDimLargo() {
        return dimLargo;
    }
    public void setDimLargo(double dimLargo) {
        this.dimLargo = dimLargo;
    }

    @Override
    public double area() {
        double area;
        area = this.dimAncho*this.dimLargo;
        return area;
    }

    @Override
    public double costo() {
        double cst = 0;
        if (this.material==1) {
            cst = (this.area()*60.55);
                    
        }else  {
            if (this.material==2) {
                cst = (this.area()*80.65);
            }
}
        return cst;
    } 

    @Override
    public String material() {
        String matrl = null;
        switch (this.getMaterial()){
            case 1:
                matrl = "CEMENTO";
                break;
            case 2:
                matrl = "ORMIGON";
                break;
        }
        return matrl;
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }  
}
