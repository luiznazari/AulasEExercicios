package br.edu.unoesc.terceiroPeriodo.generic;

import java.util.List;

public interface GenericService<ModelClass extends GenericModel> {
	
	void salvar(ModelClass modelClass);
	
	void remove(ModelClass modelClass);
	
	ModelClass getPorId(Long id);
	
	List<ModelClass> getTodos();
	
}
