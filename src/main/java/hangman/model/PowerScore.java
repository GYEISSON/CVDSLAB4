/***************************************************************
* file: PowerScore.java
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

public class PowerScore implements GameScore{
	private int score;		
	public PowerScore(){
		score = 0;	
	}

	/**
	*@param correctCount  , incorrectCount  
	*
	*@pre recibir dos enteros correctCount  , incorrectCount 
	*@pos devuelve un entero con el valor de la puntuacion generada
	*@return score  	
	*@throws 
	*/
        @Override
	public int calculateScore(int correctCount, int  incorrectCount){
		for(int i=1 ; i<=correctCount ; i++){
			score +=  Math.pow(5, i);
		}
		score -= incorrectCount*8;
        if(score < 0) score = 0;
        if(score > 500) score = 500;
        return score;
	}
        @Override
        public int getScore(){
            return this.score;
        }
}