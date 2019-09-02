package hangmanTest;


import org.junit.Assert;
import org.junit.Test;

import hangman.model.*;
/**
 * Unit test for simple hangman .
 *
 *@autor Yeisson gualdron 
 *       Carlos Murillo
 *  
 *  En esta clase harémos las pruebas que nos grantizaran la correcta 
 *  ejecución de cada uno de los metodos que implementaran a la 
 *  interface GameScore, principalmente buscamos garantizar el correcto 
 *  conteo de los puntos del jugador, en cada uno de los tipos de las
 *  puntiaciones posibles. En general se tendran en cuenta que el puntaje de
 *  jugador no supere unas barreras mínimas y minimas establecidas, tambien 
 *  ademas, se tendran en cuenta una bonificación, la cual estará disponible 
 *  en algunos tipos de puntuacion.
 *  
 */

public class GameScoreTest 
{
	/**
	*  OriginalScore test
	*  @pre incialmente el jugador cuenta con 100 puntos 
	*  @pos el jugador debe terminar con una puntuacion 
	*  mayor a 0 y menor a 100
	*  
	*  throws cada puntuacion del jugador debe ser siempre menor o igual
	*  a la puntuación anterior 
	*  throws el jugador no puede tener una puntuacion menor a 0 puntos
	*  throws el jugador debera tener puntuacion multipo de 10
	*  penalizacion con 10 puntos 
	*  
	*/
	@Test
	public void OriginalScoreTest()
	{
            GameScore score =  new OriginalScore();
            int res = score.calculateScore(5,2);
            Assert.assertEquals( 80 ,res );
	}


	/**
	*  BonusScore test
	*  @pre inicialmente el jugador cuenta con 0 puntos 
	*  @pos el jugador debera terminar con una puntuación 
	*  mayor o igual a 0 puntos 
	*  throws el jugador debera tener puntuación multiplo de 5
	*  throws el jugador no puede tener una puntuacion menor a 0 puntos
	*  penalizacion con 5 puntos cada letra incorrecta
	*  bonificación con 10 puntos cada letra correcta
	*/
	@Test
	public void BonusScoreTest()
	{
            GameScore score =  new BonusScore();
            int res = score.calculateScore(5,2);
            Assert.assertEquals( 40 ,res );
	}

	/**
	*  PowerScore test
	*  @pre  inicialmente el jugador cuenta con 0 puntos 
	*  @pos  el jugador deberá terminar el juego con una puntuación 
	*  mayor o igual a 0  y menor a 500 puntos
	*  throws el jugador no puede tener una puntuacion menor a 0 puntos
	*  throws el jugador no puede tener una puntuacion mayor a 500 puntos
	*  Bonificacion de 5^i puntos por la i-esima letra correcta 
	*  penalizacion con 8 puntos para cada letra incorrecta
	*  
	*/
	@Test
	public void PowerScoreTest()
	{
            GameScore score =  new PowerScore();
            int res = score.calculateScore(5,2);
            Assert.assertEquals( 500 ,res );
	}
}


