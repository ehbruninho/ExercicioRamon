
public class Lista {
	Elemento primeiro;
	Elemento ultimo;
	int qtd;

	
	public Lista(){ // construtor obriga a criar uma lista 
					// com os parametros que eu quero
					// utilizado no NEW
		this.primeiro =null;
		this.ultimo = null;
		this.qtd =0;
		
	}
	
	public boolean addInicio(Elemento e){
		if(this.primeiro ==null){
			this.primeiro =e;
			this.ultimo=e;
			this.qtd++;
			e.proximo = null; // por padrao java ja faz isso
			return true;
		}else{
			e.proximo = this.primeiro;
			this.primeiro = e;
			this.qtd++;
			return true;
		}
		
	}
	public void listar(){
		Elemento aux;
		aux= this.primeiro;
		if(aux == null){
			System.out.println("Lista Vazia");
		}else{
			System.out.println("A lista possui :"+ this.qtd);
		while(aux!=null){
			aux.mostrar();
			aux= aux.proximo;
		}
	}
		
	}
	public boolean removerFim(){
		if(this.primeiro==null){
			System.out.println("Lista vazia");
			return false;
		}
		
		if(this.ultimo == this.primeiro){
			this.primeiro.mostrar();
			this.primeiro =null;
			this.ultimo=null;
			this.qtd--;
			return true;
		}
		Elemento aux = this.primeiro; // para percorrer a lista
		Elemento pena = aux;//guarda o penultimo elemento
		
		while(aux.proximo==null){
			pena = aux;
			aux = aux.proximo;
		}
		pena.proximo = null;
		this.ultimo = pena;
		this.qtd--;
		return true;
		/*
		for(int i =1; i<= (this.qtd-1); i++){
			aux=aux.proximo;
		}
			
		*/
	}
	
	
	public boolean addFim(Elemento e){
		if(this.primeiro==null){
			return this.addInicio(e);
		}else{
			this.ultimo.proximo =e;
			this.ultimo = e;
			this.qtd++;
			return true;
			
		}
	
	}
	public boolean addEmX(Elemento e, int pos){
		if(this.primeiro==null){
			return this.addInicio(e);
		}	
		
			
			if (pos==this.qtd-1){
				return this.addFim(e);
			} else
				if(pos==0){
					return this.addInicio(e);
				}else{
					Elemento aux = this.primeiro;
					for(int i =0; i<pos-1; i++){
						aux = aux.proximo;
					}
					 e.proximo = aux.proximo;
					 aux.proximo = e;
					 qtd++;	
					}	
		return true;
	}
	
	
	public boolean removeInicio(){
	
		if(this.primeiro == null){
			System.out.println("Lista Vazia");
			return false;
		}else {
			this.primeiro= this.primeiro.proximo;
			this.qtd--;
		}

		return true;
	}
}

