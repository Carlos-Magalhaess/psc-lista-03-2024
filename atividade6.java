import java.util.Scanner;

import java.util.Random;


public class atividade6
{

  public static void main (String[]args)
  {

	Scanner scanner = new Scanner (System.in);

	Random random = new Random ();


	  System.out.println ("Digite o primeiro nC:mero: ");

	int num1 = scanner.nextInt ();


	  System.out.println ("Digite o segundo nC:mero: ");

	int num2 = scanner.nextInt ();


	if (num1 < num2)
	  {

		int numAle = random.nextInt (num2 - num1 + 1) + num1;

		if (numAle % 2 == 0)
		  {

			System.out.println ("O nC:mero aleatC3rio gerado C): (" +
								numAle + ") e ele C) um nC:mero par.");

		  }
		else
		  {

			System.out.println ("O nC:mero aleatC3rio gerado C): (" +
								numAle + ") e ele C) um nC:mero C-mpar.");

		  }

	  }
	else
	  {
		.int numAle = random.nextInt (num1 - num2 + 1) + num2;

		if (numAle % 2 == 0)
		  {

			System.out.println ("O nC:mero aleatC3rio gerado C): (" +
								numAle + ") e ele C) um nC:mero par.");

		  }
		else
		  {

			System.out.println ("O nC:mero aleatC3rio gerado C): (" +
								numAle + ") e ele C) um nC:mero C-mpar.");

		  }

	  }

	scanner.close ();

  }

}
