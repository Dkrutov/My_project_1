package com.company.collection;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class ReadFile {
    public static void main(String[] args) throws IOException {
        String result =new String(Files.readAllBytes(Paths.get("C:\\Users\\dmkru\\IdeaProjects\\My_project_1\\src\\com\\company\\collection\\Read.txt")));
        List<String> content= new ArrayList<String>(Arrays.asList(result.split(" ")));
        System.out.println("INFO: 1. content: " + content);
        System.out.println("INFO: 2. Упорядоченные по алфавиту " + getAlphavit(content));
        getPrint(getCount(content));
        System.out.println("INFO: Макимальное количество повторений имеет слово '" + getMax(getCount(content))[0] +  "'. Количество повторений: " + getMax(getCount(content))[1]);
    }

    static List<String> getAlphavit(List<String> array){
        Collections.sort(array);
        return array;
    }

    static String[][] getCount(List<String> array2){
        List<String> ListWord = new ArrayList<>();
        List<Integer> ListCount = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        String a;
        String maxWord = null;
        int max = 0;
        //Первый цикл перебирает элементы
        for (int i = 0; i < array2.size(); i++) {
            int count = 0;
            a = array2.get(i);
            //Второй цикл проверяет наличие слова на совпадения
            for (int j = 0; j<array2.size(); j++) {

                if (ListWord.contains(a)) {
                    break;
                } else {
                    ListWord.add(a);
                    //Третий цикл считает совпадения
                    for (int k = 0; k < array2.size();k++) {

                        if (a.equals(array2.get(k))) {
                            count++;
                        }
                    } //Конец Третьего цикла
                    ListCount.add(count);
                }
            } //Конец второго цикла
        } // Конец Третьего цикла
        String[][] WordCountArray = new String[2][ListWord.size()];

                for (int j = 0; j < ListWord.size(); j++){
                    WordCountArray[0][j] = ListWord.get(j);
                }
                for (int j = 0; j < ListCount.size(); j++){
                    WordCountArray[1][j] = Integer.toString(ListCount.get(j));
                }
        return WordCountArray;
    }

    static void getPrint(String[][] Array){
        System.out.println(" СТАТИСТИКА ");
        for (int j = 0; j < Array[0].length; j++){
                System.out.println("INFO: Слово '" + Array[0][j] +  "'. Повторений: " + Array[1][j]);
            }
            System.out.println(" ");
        }

        static String[] getMax(String[][] Array){
        int max = 0;
        String Word = null;
            for (int j = 0; j < Array[0].length; j++) {
                if (Integer.parseInt(Array[1][j]) > max) {
                    max = Integer.parseInt(Array[1][j]);
                    Word = Array[0][j];
                }


            }
            String[] wordMaxCount = {Word,Integer.toString(max)};
            return wordMaxCount;
        }

    }


