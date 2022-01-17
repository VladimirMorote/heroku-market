package com.vlady.market.persistence.entity;



import com.vlady.market.persistence.entity.Categoria;

import javax.persistence.*;


@Entity
@Table(name="productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;

    private Boolean estado;

    @Column(name="id_categoria")
    private Integer idCategoria;

    @Column(name="codigo_barras")
    private Double codigoBarras;

    @Column(name="precio_venta")
    private Double precioVenta;

    @Column(name="cantidad_stock")
    private Integer cantidadStock;

    @ManyToMany
    @JoinColumn(name="id_categoria", insertable = false, updatable = false )
    private Categoria categoria;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Double getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(Double codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
}
