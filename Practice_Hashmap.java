import java.util.HashMap;

public class Practice_Hashmap {
  public static void main(String[] args) {
    HashMap<String, Double> student = new HashMap<>();
    student.put("Student A", 1.25);
    student.put("Student B", 1.23);
    student.put("Student C", 1.06);
    student.put("Student D", 1.53);
    student.put("Student E", 1.90);


    System.out.println("Grade of the Student A: " + (student.get("Student A")));

    //Key that doesn't exist
    System.out.println("Grade of the student who doesn't exist: " +  (student.get("Student Z")));


    //GetorDefault
    System.out.println(student.getOrDefault("Student A", 0.00));


    //Word Count without the duplicates
    String word = "Java is Fun Java is Cool";

    String[] list_of_words = word.split(" ");

    HashMap<String, Integer> wordcount = new HashMap<>();

    for(String salita : list_of_words) {
      wordcount.put(salita, wordcount.getOrDefault(salita, 0) + 1);
    }


    for (String key : wordcount.keySet()){
      System.out.println(key + " = " + wordcount.get(key));
    }

  }
  
}
