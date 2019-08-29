/***************************************************************
* file: GameScore.java
* author:   yeisson gualdron
*           carlos murillo
* interface: dependencies  
*
* assignment: laboratorio 4
* date last modified: 29/08/2016
*
* purpose: this interface want to implements dependency inyection
*
****************************************************************/ 



package hangman.model;

public interface GameScore{

	public int calculateScore(int correctCount, int  incorrectCount);

}
