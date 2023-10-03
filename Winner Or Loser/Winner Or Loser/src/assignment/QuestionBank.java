package assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class QuestionBank {

    ArrayList<Question> questionsBank = new ArrayList<>();
    ArrayList<Question> easy = new ArrayList<>();
    ArrayList<Question> medium = new ArrayList<>();
    ArrayList<Question> hard = new ArrayList<>();

    void loadFile() {
        loadEasy();
        loadMedium();
        loadHard();
        shuffleQuestion();
    }

    void loadEasy() {
        try {
            File file = new File("easy.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String question;
            String[] answers = new String[4];
            while ((question = br.readLine()) != null) {
                for (int i = 0; i < 4; i++) {
                    answers[i] = br.readLine();
                }
                addEasyQuestion(question, answers);
                br.readLine();
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Something wrong with your file");
        }
    }

    void loadMedium() {
        try {
            File file = new File("medium.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String question;
            String[] answers = new String[4];
            while ((question = br.readLine()) != null) {
                for (int i = 0; i < 4; i++) {
                    answers[i] = br.readLine();
                }
                addMediumQuestion(question, answers);
                br.readLine();
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Something wrong with your file");
        }
    }
    
     void loadHard() {
        try {
            File file = new File("hard.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String question;
            String[] answers = new String[4];
            while ((question = br.readLine()) != null) {
                for (int i = 0; i < 4; i++) {
                    answers[i] = br.readLine();
                }
                addHardQuestion(question, answers);
                br.readLine();
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Something wrong with your file");
        }
    }

    void addEasyQuestion(String question, String[] answer) {
        Answer[] answers = new Answer[4];
        for (int i = 0; i < answers.length; i++) {
            Answer a = new Answer(answer[i], (i == 0));
            answers[i] = a;
        }
        easy.add(new Question(question, answers));
        Collections.shuffle(easy);
    }
    
     void addMediumQuestion(String question, String[] answer) {
        Answer[] answers = new Answer[4];
        for (int i = 0; i < answers.length; i++) {
            Answer a = new Answer(answer[i], (i == 0));
            answers[i] = a;
        }
        medium.add(new Question(question, answers));
        Collections.shuffle(medium);
    }
     
     void addHardQuestion(String question, String[] answer) {
        Answer[] answers = new Answer[4];
        for (int i = 0; i < answers.length; i++) {
            Answer a = new Answer(answer[i], (i == 0));
            answers[i] = a;
        }
        hard.add(new Question(question, answers));
        Collections.shuffle(hard);
    }

    void shuffleQuestion() {
        Collections.shuffle(easy);
        Collections.shuffle(medium);
        Collections.shuffle(hard);
        questionsBank.clear();
        for (int i = 0; i < 5; i++) {
            questionsBank.add(easy.get(i));
        }
        for (int i = 0; i < 5; i++) {
            questionsBank.add(medium.get(i));
        } 
        for (int i = 0; i < 5; i++) {
            questionsBank.add(hard.get(i));
        }
    }

}
