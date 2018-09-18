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

import ifal.web.com.amazom.model.Endereco;
import ifal.web.com.amazom.repository.EnderecoRepository;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoResource {

	@Autowired 
	EnderecoRepository enderecoRepository;
	
	@GetMapping
	public List<Endereco> get(){
		return enderecoRepository.findAll();
	}
	
	@GetMapping("{id}")
		public Endereco get(@PathVariable("id") Integer id) {
		return enderecoRepository.getOne(id);
	}
	
	@PostMapping
	public void save(@RequestBody Endereco endereco) {
		enderecoRepository.save(endereco);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		enderecoRepository.deleteById(id);
	}
	
}
