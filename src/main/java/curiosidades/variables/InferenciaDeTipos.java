package curiosidades.variables;

public class InferenciaDeTipos {

	int nod = 12;
//	var jjj = 12; no podemos declara una varibale con var fuera de un metodo
	public static void main(String[] args) {
		
//		apartir de la version 10 de java
//		podemos definir una varible con la
//		palabra clave var, y apartir del 
//		dato que le pasemos se hara la iteracion
//		sin tener que estblcerla como int, float
//		String, etc
		var var1 = 4l;
		System.out.println("soy una varibale declarada con var: '"  + var1 + "'");
		
		var var2 = "var2";
		System.out.println("soy un variable declarada con var: '"  + var2 + "'");
		
		Integer var3 = 14;
		System.out.println(var3);
	}
	
	public void mmm() {
		var var1 = 12;
	}
}
