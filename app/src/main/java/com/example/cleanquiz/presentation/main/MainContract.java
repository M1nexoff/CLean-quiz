package com.example.cleanquiz.presentation.main;

import com.example.cleanquiz.data.model.QuestionData;

import java.util.List;

public interface MainContract {
    interface Model {
        List<QuestionData> getQuestionByCategory();
    }
    interface View {

        void describeQuestion(QuestionData data);
        void clearOldStates(int position);
        void nextButtonState(boolean bool);
        void showSelectedIndex(int position);
        void showCount(int currentPos);
        void finish(int correctCount);
    }
    interface Presenter {
        void selectAnswer(int position);
        void clickNextButton();
        void finish();
    }
}
