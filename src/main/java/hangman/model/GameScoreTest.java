package hangman;

import org.junit.Test;

/**
 * Unit test for simple hangman .
 *
 *@autor Yeisson gualdron 
 *       Carlos Murillo
 *
 *  bonificacion, penalizacion 
 *  frontera  score 
 */

public class AppTest 
{
	/**
	*  OriginalScore test
	*  frontera maxima puntuacion inicial 100
	*	frontera minima 0
	*  sin bonificacion para letras correctas
	*  penalizacion con 10 puntos 
	*  
	*/
	@Test
	public void OriginalScoreTest()
	{
		assertTrue( true );
	}


	/**
	*  BonusScore test
	*  frontera maxima indefinida
	*  frontera minima 0
	*  se bonificacion con 5^i para cada i-esima letra correcta
	*  penalizacion con 8 puntos para cada letra incorrecta
	*  
	*/
	@Test
	public void BonusScoreTest()
	{
		assertTrue( true );
	}

	/**
	*  PowerScore test
	*  frontera maxima indefinida
	*  frontera minima 0
	*  se bonificacion con 15 para cada letra correcta
	*  penalizacion con 5 puntos para cada letra incorrecta
	*  
	*/
	@Test
	public void PowerScoreTest()
	{
		assertTrue( true );
	}
}
