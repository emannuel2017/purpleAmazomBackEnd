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

import ifal.web.com.amazom.model.CarrinhoDeProduto;
import ifal.web.com.amazom.repository.CarrinhoDeProdutoRepository;

@RestController
@RequestMapping("/api/carrinhodeproduto")

public class CarrinhoDeProdutoResource {


	@Autowired 
	CarrinhoDeProdutoRepository carrinhoDeProdutoRepository;
	
	@GetMapping
	public List<CarrinhoDeProduto> get(){
		return carrinhoDeProdutoRepository.findAll();
	}
	
	@GetMapping("{id}")
		public CarrinhoDeProduto get(@PathVariable("id") Integer id) {
		return carrinhoDeProdutoRepository.getOne(id);
	}
	
	@PostMapping
	public void save(@RequestBody CarrinhoDeProduto CarrinhoDeProduto) {
		carrinhoDeProdutoRepository.save(CarrinhoDeProduto);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		carrinhoDeProdutoRepository.deleteById(id);
	}

	
}
