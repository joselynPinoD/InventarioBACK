package proyectx.pgp.backend.Services;

import java.util.List;

import proyectx.pgp.backend.ModeloEntity.Productos;

public interface IProductosService {
	
	public List<Productos> findAll();
	
	public Productos findbyId (int id);
	
    public Productos save(Productos producto);
	
	public void delete(int id);

}
