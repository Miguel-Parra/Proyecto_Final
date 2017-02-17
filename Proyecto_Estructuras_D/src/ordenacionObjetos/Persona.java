package ordenacionObjetos;

public class Persona  {
	
	private int id;
	private String nombre;
	private String apellido;
	private int altura;
	
	
	public Persona() {
		super();
	}


	public Persona(int id, String nombre, String apellido, int altura) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.altura = altura;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", altura=" + altura + "]\n";
	}
	
	
  
}

