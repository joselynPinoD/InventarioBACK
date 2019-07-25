package proyectx.pgp.backend.ModeloEntity;


import javax.persistence.*;

@Entity
@Table(name="marcas")
public class Marcas {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String marca;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Marca [id=" + id + ", marca=" + marca + "]";
	}
	
	
	
	
}

