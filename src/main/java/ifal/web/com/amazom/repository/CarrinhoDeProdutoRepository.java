package ifal.web.com.amazom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import ifal.web.com.amazom.model.CarrinhoDeProduto;

@RestController
public interface CarrinhoDeProdutoRepository extends JpaRepository<CarrinhoDeProduto, Integer> {

}
