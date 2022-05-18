package com.example.prueba_ee;

import javax.persistence.*;

@Entity @Table(name="usuario")
public class Persona {
	
    @Id @Column @GeneratedValue(strategy=GenerationType.IDENTITY) private int id;
    @Column private String cedula;
    @Column private String primernombre;
	@Column private String segundonombre;
	@Column private String primerapellido;
	@Column private String segundoapellido;
	@Column private String clave;
	@Column private String email;
	@Column private String nitempresa;
	@Column private int rol;
	@Column private int estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCedula() {
		return cedula;
	}
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

    public String getPrimernombre() {
		return primernombre;
	}
	
	public void setPrimernombre(String primernombre) {
		this.primernombre = primernombre;
	}
	
	public String getSegundonombre() {
		return segundonombre;
	}
	
	public void setSegundonombre(String segundonombre) {
		this.segundonombre = segundonombre;
	}
	
	public String getPrimerapellido() {
		return primerapellido;
	}
	
	public void setPrimerapellido(String primerapellido) {
		this.primerapellido = primerapellido;
	}
	
	public String getSegundoapellido() {
		return segundoapellido;
	}
	
	public void setSegundoapellido(String segundoapellido) {
		this.segundoapellido = segundoapellido;
	}
	
	public String getClave() {
		return clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNitempresa() {
		return nitempresa;
	}
	
	public void setNitempresa(String nitempresa) {
		this.nitempresa = nitempresa;
	}
	
	public int getRol() {
		return rol;
	}
	
	public void setRol(int rol) {
		this.rol = rol;
	}
	
	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
