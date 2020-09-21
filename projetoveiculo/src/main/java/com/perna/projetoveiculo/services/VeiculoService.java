package com.perna.projetoveiculo.services;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perna.projetoveiculo.domain.Veiculo;
import com.perna.projetoveiculo.dto.VeiculoDTO;
import com.perna.projetoveiculo.dto.VeiculoNewDTO;
import com.perna.projetoveiculo.repositories.VeiculoRepository;
import com.perna.projetoveiculo.services.exceptions.ObjectNotFoundException;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository repo;

	public Veiculo find(Integer id) {
		Optional<Veiculo> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				 "Objeto não encontrado! Id: " + id + ", Tipo: " + Veiculo.class.getName()));
	}
	
	public Veiculo insert(Veiculo obj){
		obj.setId(null);
		obj.setCreated(new Date());
		return repo.save(obj);
	}
	
	public Veiculo update(Veiculo obj){
		Veiculo newObj = find(obj.getId());
		obj.setUpdated(new Date());
		obj.setCreated(newObj.getCreated());
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		}
		catch(Exception e) {
			new Exception("Não foi possível excluir o veículo.");
		}
	}
	
	public List<Veiculo> findAll(){
		return repo.findAll();
	}
	
	public long countVendidos(){
		return repo.countVendidos();
	}
	
	public List<Object[]> countDecada(){
		return repo.countDecada();
	}
	
	public List<Veiculo> findUltimosVeiculos(){
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		cal.add(Calendar.WEEK_OF_YEAR, -1);
		return repo.findUltimosVeiculos(cal.getTime());
	}
	
	public Veiculo fromDTO(VeiculoDTO objDto) {
		return new Veiculo(objDto.getId(), objDto.getVeiculo(), objDto.getMarca(), objDto.getAno(), objDto.getDescricao(), objDto.getVendido(), null, objDto.getUpdated());
	}
	
	public Veiculo fromDTO(VeiculoNewDTO objDto) {
		return new Veiculo(objDto.getId(), objDto.getVeiculo(), objDto.getMarca(), objDto.getAno(), objDto.getDescricao(), objDto.getVendido(), objDto.getCreated(), null);
	}
}
