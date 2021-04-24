/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productoModelo;

import lombok.Data;

/**
 * 
 * @sergio santos mendez
 */
@Data
public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private double precioSinIva;
    private double precioIVA;
  
 
    
    public Producto(){
    this.nombre ="";
    };
    

    public String getNombre() {
        return this.nombre.toUpperCase();
    }


}
