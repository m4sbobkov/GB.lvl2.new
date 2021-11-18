package lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        doTask1();
        doTask2();
    }




    static void doTask1(){
        List<String> words = new ArrayList<>();

        words.add("кисель");
        words.add("лес");
        words.add("карниз");
        words.add("кисель");
        words.add("карандаш");
        words.add("рука");
        words.add("лес");
        words.add("кисель");
        words.add("рыба");
        words.add("сыр");

        Set<String> uniqWords = new HashSet<>();

        uniqWords.addAll(words);
        System.out.println(uniqWords);


        doIterationList(uniqWords, words);

    }
    static void doIterationList(Set<String> words, List<String> wordsList) {


        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            countOfDoubles(iterator.next(), wordsList);

        }
    }

    static void countOfDoubles(String word, List<String> wordsList){
        int count = 0;
        for (String value : wordsList) {

            if (value == word)
                count += 1;

        }System.out.println("The collection has " + count + " words '" + word + "'.");

    }

    static void doTask2(){

        PhoneNote note = new PhoneNote();
        note.addNote("Ivanov", "9998007654");
        note.addNote("Petrov", "9948037624");
        note.addNote("Sidorov", "9128447634");
        note.addNote("Potter", "9178047345");
        note.addNote("Ivanov", "9947537212");
        note.addNote("Sidorov", "1238457633");

        note.getNumber("Ivanov");
        note.getNumber("Potter");

    }



}