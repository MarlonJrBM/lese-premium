/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lesepremium.presenters.interfaces;

import br.game.reuse.lesepremium.board.PlayerBoard;
import br.game.reuse.lesepremium.house.House;
import br.game.reuse.lesepremium.model.Phase;
import br.game.reuse.lesepremium.model.Question;
import br.game.reuse.lesepremium.question.QuestionBoard;
import java.util.List;

/**
 *
 * @author marlon
 */
public interface QuestionPresenter {
    
    /**
     * Displays the question to the player.
     *
     * @param question
     * @param p
     */
    void showQuestion(QuestionBoard question, PlayerBoard p);
    
    /**
     * Displays question choices to the player.
     * @param question
     * @return 
     */
    List<String> showChoices(QuestionBoard question);
    
    /**
     * Obtains answer from the player
     * @param choices
     * @return player answer
     */
    String getPlayerAnswer(List<String> choices);
    
    /**
     * Obtains new question
     * @return 
     */
    Question getNewQuestion();
    
    /**
     * Gives feedback to the user based on their answer.
     * @param house
     * @param p
     */
    void showFeedback(House house, PlayerBoard p);
    
    /**
     * Gives message to the user based on their answer.
     * @param feedback 
     */
    void showMessage(String feedback);
    
    /**
     * Return confirmation's register question 
     * @return  
     */
    boolean confirmResgisterQuestion();
    
    Question getQuestionForEdit(List<Question> questions);
    
    Question editQuestion(Question question);

}
