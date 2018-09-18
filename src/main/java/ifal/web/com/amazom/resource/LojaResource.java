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

import ifal.web.com.amazom.model.Loja;
import ifal.web.com.amazom.repository.LojaRepository;

@RestController
@RequestMapping("/api/loja")
public class LojaResource {

	@Autowired 
	LojaRepository lojaRepository;
	
	@GetMapping
	public List<Loja> get(){
		return lojaRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Loja get(@PathVariable("id") Integer id) {
		return lojaRepository.getOne(id);
	}
	
	@PostMapping
	public void save(@RequestBody Loja loja) {
		lojaRepository.save(loja);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		lojaRepository.deleteById(id);
	}
	
}
