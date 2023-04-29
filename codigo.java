import java.util.Scanner;

//

class CalculoIF {
	public static void main(String args[]){
		
    		int x, y, z;
    
    		Scanner lerTeclado = new Scanner(System.in);
			
			System.out.print("Digite o lado um do seu triangulo \n");
			x = lerTeclado.nextInt();
			
			System.out.print("Digite o lado dois do seu triangulo \n");
			y = lerTeclado.nextInt();
			
			System.out.print("Digite o lado tres do seu triangulo \n");
			z = lerTeclado.nextInt();
			
			if (x == y && y == z && z == x) {
				
				System.out.print("O triangulo e equilatero");
				
			}
				
			if (x != y && y == z || x == y && y != z || z == x && x!= y) {
				
				System.out.print("O triangulo e isosceles");
				
			}
			
			if (x != y && y != z && z != x) {
				
				System.out.print("O triangulo e escaleno");
				
			}

		
	}

}
