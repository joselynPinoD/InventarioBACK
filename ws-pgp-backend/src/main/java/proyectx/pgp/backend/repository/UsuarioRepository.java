package proyectx.pgp.backend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import proyectx.pgp.backend.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario,Integer>  {
	 
	@Query(value="SELECT * FROM usuario a WHERE a.nombre = :nombre", nativeQuery=true)
	public Usuario getFindOneUserbyName(@Param("nombre")String str_nombre);
}