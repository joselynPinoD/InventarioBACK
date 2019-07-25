package proyectx.pgp.backend.ServicesImp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import proyectx.pgp.backend.DAO.IProductoDAO;
import proyectx.pgp.backend.ModeloEntity.Productos;
import proyectx.pgp.backend.Services.IProductosService;

@Service
public class ProductoServicesImp implements IProductosService {
	
	@Autowired
	private IProductoDAO productoDao;

	@Override
	@Transactional(readOnly=true)
	public List<Productos> findAll() {
		return (List<Productos>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Productos findbyId(int id) {
		return productoDao.findById(id).orElse(null);
		
	}

	@Override
	@Transactional
	public Productos save(Productos producto) {
		return productoDao.save(producto);
	}

	@Override
	@Transactional
	public void delete(int id) {
		productoDao.deleteById(id);		
	}

}
