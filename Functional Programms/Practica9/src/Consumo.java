/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author losel
 */
public class Consumo {
    private String fecha, codigoArticulo, codigoBarra;
    private int numeroConsumo, unidades;

    public Consumo(int numeroConsumo, String fecha, String codigoArticulo, int unidades, String codigoBarra) {
        this.numeroConsumo = numeroConsumo;
        this.fecha = fecha;
        this.codigoArticulo = codigoArticulo;
        this.unidades = unidades;
        this.codigoBarra = codigoBarra; 
    }

    public String getFecha() {
        return fecha;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public int getNumeroConsumo() {
        return numeroConsumo;
    }

    public int getUnidades() {
        return unidades;
    }
}
