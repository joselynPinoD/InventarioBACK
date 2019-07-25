package proyectx.pgp.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import proyectx.pgp.backend.model.Usuario;
import proyectx.pgp.backend.repository.UsuarioRepository;

@RestController
@RequestMapping() 
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuariorepository;

	@PostMapping("usuario")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return usuariorepository.save(usuario);
	}
	
	@GetMapping("usuario/all")
	public List<Usuario> obtenerUsuarios(){
		return (List<Usuario>) usuariorepository.findAll();
	}
	
	
	@GetMapping("usuario/{nombre}")
	public Usuario obtenerUsuario(@PathVariable("nombre")String nombreusuario) {
		return usuariorepository.getFindOneUserbyName(nombreusuario);
	} 
	
}
