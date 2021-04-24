/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productoControlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import lombok.Getter;
import productoModelo.Producto;

/**
 *
 * @sergio santos mendez
 */
@Named
@ViewScoped
public class ProductoControlador implements Serializable {

    @Getter
    private Producto productos;

    @Getter
    private List<Producto> productoLista;

    

    @PostConstruct
    public void init() {

        this.productos = new Producto();
        this.productoLista = new ArrayList<>();
    }
    public void agregar() {
        productos.setId(this.productoLista.size() + 1);
        productos.setPrecioSinIva(productos.getPrecio() / 1.12);
        productos.setPrecio(productos.getPrecioSinIva()*0.12);
        productos.setPrecioIVA(productos.getPrecioSinIva() + (productos.getPrecioSinIva() * 0.12));
        this.productoLista.add(productos);
        this.productos = new Producto();

    }

}
