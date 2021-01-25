package com.bytecode.rest.entity;

import com.bytecode.rest.entity.enums.TipoAccion;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "bitacora")
public class Bitacora implements Serializable {
    @Id
    @Column(name = "id_bitacora")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBitacora;

    @JoinColumn(name = "empleado")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Empleado empleado;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date fecha = new Date();

    @Enumerated(EnumType.STRING)
    private TipoAccion accion;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TipoAccion getAccion() {
        return accion;
    }

    public void setAccion(TipoAccion accion) {
        this.accion = accion;
    }

    public int getIdBitacora() {
        return idBitacora;
    }

    public void setIdBitacora(int idBitacora) {
        this.idBitacora = idBitacora;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
