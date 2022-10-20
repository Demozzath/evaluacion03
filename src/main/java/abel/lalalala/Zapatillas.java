/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abel.lalalala;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author demozath
 */
@Entity
@Table(name = "zapatillas")
@NamedQueries({
    @NamedQuery(name = "Zapatillas.findAll", query = "SELECT z FROM Zapatillas z"),
    @NamedQuery(name = "Zapatillas.findById", query = "SELECT z FROM Zapatillas z WHERE z.id = :id"),
    @NamedQuery(name = "Zapatillas.findByTalla", query = "SELECT z FROM Zapatillas z WHERE z.talla = :talla"),
    @NamedQuery(name = "Zapatillas.findByMarca", query = "SELECT z FROM Zapatillas z WHERE z.marca = :marca"),
    @NamedQuery(name = "Zapatillas.findByModelo", query = "SELECT z FROM Zapatillas z WHERE z.modelo = :modelo"),
    @NamedQuery(name = "Zapatillas.findByCantidad", query = "SELECT z FROM Zapatillas z WHERE z.cantidad = :cantidad")})
public class Zapatillas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "talla")
    private String talla;
    @Size(max = 2147483647)
    @Column(name = "marca")
    private String marca;
    @Size(max = 2147483647)
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "cantidad")
    private Integer cantidad;

    public Zapatillas() {
    }

    public Zapatillas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zapatillas)) {
            return false;
        }
        Zapatillas other = (Zapatillas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "abel.lalalala.Zapatillas[ id=" + id + " ]";
    }
    
}
