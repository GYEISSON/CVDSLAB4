/***************************************************************
* file: OriginalScore.java
* author:   yeisson gualdron
*           carlos murillo
* interface: dependencies  
*
* assignment: laboratorio 4
* date last modified: 29/08/2019
*
* purpose: this interface want to implements dependency inyection
*
****************************************************************/ 



package hangman.model;

import com.google.inject.Inject;

public class OriginalScore implements GameScore{
	private int score;
        @Inject
	public OriginalScore(){
		score = 100;	
	}

	/**
	*@param correctCount  , incorrectCount  
	*
	*@pre recibir dos enteros correctCount  , incorrectCount 
	*@pos devuelve un entero con el valor de la puntuacion generada
	*@return score  	
	*@throws 
	*/
	public int calculateScore(int correctCount, int  incorrectCount){
		score -= incorrectCount*10;
        if(score < 0) score = 0;
		return score;
	}
}
