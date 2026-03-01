package anime;

class Anime {
	
	public String nombre;
	public String genero;
	private int nroEpisodios ;
	private String[] episodios ;
	
	
	//constructor
	public Anime(String nombre,String genero,int nroEpisodios){
		this.nombre = nombre;
		this.genero = genero;
		this.nroEpisodios = nroEpisodios;
		this.episodios = new String[nroEpisodios];
	}

}
