package br.edu.unoesc.terceiroPeriodo.generic;

import java.util.List;

public class GenericServiceImpl<ModelClass extends GenericModel>
				implements GenericService<ModelClass> {
	
	@Override
	public void salvar(GenericModel modelClass) {
		System.out.println("Salvo com sucesso: "+ modelClass.getId());
	}

	@Override
	public void remove(GenericModel modelClass) {
		System.out.println("Removido com sucesso!"+ modelClass.getId());
	}

	@Override
	public ModelClass getPorId(Long id) {
		System.out.println("Buscando por "+ id);
		return null;
	}

	@Override
	public List getTodos() {
		System.out.println("Todos");
		return null;
	}
	
}
