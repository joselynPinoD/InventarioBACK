package proyectx.pgp.backend.DAO;
import org.springframework.data.repository.CrudRepository;

import proyectx.pgp.backend.ModeloEntity.Productos;

public interface IProductoDAO extends CrudRepository<Productos, Integer>{

}
