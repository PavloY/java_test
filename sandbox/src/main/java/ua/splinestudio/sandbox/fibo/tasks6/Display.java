package ua.splinestudio.sandbox.fibo.tasks6;

import java.util.Map;

class Display{
    public static void showProgramInfo(){
        System.out.println("This program counts happy six-digit tickets.\n" +
                "\"Simple way\" - sum of first three digits equal sum of last three digits.\n" +
                "\"Difficult way\" - sum of odd elements equal sum of even elements.");
    }

    public static void showResult(Map<String, Integer> result){
        if(result.get("simple way") > result.get("difficult way")){
            System.out.println("======== Win \"Simple Way\" method! ========");
        }else if(result.get("simple way") < result.get("difficult way")){
            System.out.println("======== Win \"Difficult way\" method! ========");
        }else{
            System.out.println("======== It's a draw! ========");
        }
        System.out.println("Quantity happy tickets with simple way: " + result.get("simple way"));
        System.out.println("Quantity happy tickets with difficult way: " + result.get("difficult way"));
    }
}
