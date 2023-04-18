import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;


public class Main {

    //Написати функцію, яка:
//
//        приймає як вхідний параметр масив рядків;
//
//        із заданого списку рядків знаходить перші два, в яких кожна літера трапляється парну
//        кількість разів (наприклад "мама", "тато", "їж їжак желе");
    public static void main (String[] args){
        String [] words = new String[]{"mama", "papa", "paparazzi"};
        task(words);

    }
    public static void task(String [] words){

        List<String> helpList = new ArrayList<>();

        for(String word: words){
            char[] chars = word.toCharArray();

            Map<Character, Integer> helpMap = new HashMap<>();

            for(Character character: chars){
                if(helpMap.containsKey(character)){
                    Integer value = helpMap.get(character) +1;
                    helpMap.put(character, value);
                }
                else{
                    helpMap.put(character, 1);
                }
            }
// шукає парну кількість букв
            boolean isRightWorld = true;

            for(Character key: helpMap.keySet()){
                if (helpMap.get(key) %2 != 0){
                    isRightWorld = false;
                }
            }

            if(isRightWorld){
                helpList.add(word);
            }

        }
        
        Set<Character> mySet = new HashSet<>();

        for(String word: helpList){
            for (Character character: word.toCharArray()){
                mySet.add(character);

            }
        }  
        
    }

//        знаходить набір унікальних символів у словах знайдених слів (для наведеного прикладу
//        "мама", "папа" це буде [м а п]);
//
//        повертає набір літер у вигляді масиву або будь-якого типу колекції,
//        порядок літер при цьому значення не має.
//
//        Рядок перетворюється на набір символів методом String.toCharArray().
//
//        Застосувати якнайбільше різних видів циклів (мінімум 2).
//
//        Використовувати ключові слова керування циклами.

}

