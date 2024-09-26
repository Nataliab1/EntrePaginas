package co.edu.ue.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentarios")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String contenido;

    @Column(name = "fecha_comentario", nullable = false)
    private Timestamp fechaComentario;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = true)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_recurso", nullable = true)
    private Recurso recurso;
    
    
    public Comentario() {
	}
    

	public Comentario(int id, String contenido, Timestamp fechaComentario, Usuario usuario, Recurso recurso) {
		super();
		this.id = id;
		this.contenido = contenido;
		this.fechaComentario = fechaComentario;
		this.usuario = usuario;
		this.recurso = recurso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Timestamp getFechaComentario() {
		return fechaComentario;
	}

	public void setFechaComentario(Timestamp fechaComentario) {
		this.fechaComentario = fechaComentario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Recurso getRecurso() {
		return recurso;
	}

	public void setRecurso(Recurso recurso) {
		this.recurso = recurso;
	}

    
}
