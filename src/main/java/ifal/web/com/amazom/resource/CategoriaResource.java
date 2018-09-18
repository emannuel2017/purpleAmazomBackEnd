package ifal.web.com.amazom.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifal.web.com.amazom.model.Categoria;
import ifal.web.com.amazom.repository.CategoriaRepository;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaResource {

	@Autowired 
	CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> get(){
		return categoriaRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Categoria get(@PathVariable("id") Integer id) {
		return categoriaRepository.getOne(id);
	}
	
	@PostMapping
	public void save(@RequestBody Categoria categoria) {
		categoriaRepository.save(categoria);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		categoriaRepository.deleteById(id);
	}

}
