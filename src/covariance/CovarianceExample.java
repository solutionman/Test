package covariance;

import java.util.ArrayList;

public class CovarianceExample {
    static class Fruit{
        int weight;
    }
    static class Citrus extends Fruit{
        int weight = 1;
    }
    static class Orange extends Citrus{
        String color = "#FFA500";
    }
    static class BigRoundOrange extends Orange{
        int size = 100;
    }

    private static int totalWeight(ArrayList<? extends Citrus> arrayList){
        int result = 0;
        for(int i = 0; i < arrayList.size(); ++i){
            result += arrayList.get(i).weight;
        }
        return result;
    }

    private static void addOranges(ArrayList<? super Orange> arrayList){
        int result = 0;
        for(int i = 0; i < arrayList.size(); ++i){
            arrayList.add(new Orange());
        }
    }

    public static void main(String[] args){
        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();
        Orange orange = new Orange();
        BigRoundOrange bigRoundOrange = new BigRoundOrange();
        citrus = orange;
        fruit = citrus;

        ArrayList<Citrus> citrusArrayList = new ArrayList<>();
        citrusArrayList.add(citrus);
        fruit = citrusArrayList.get(0);

        ArrayList<Orange> orangeArrayList = new ArrayList<>();
        orangeArrayList.add(orange);

//        citrusArrayList = orangeArrayList;

        int orangeWeight = totalWeight(orangeArrayList);
        int citrusWeight = totalWeight(citrusArrayList);
        System.out.println("orangeWeight " + orangeWeight);
        System.out.println("citrusWeight " + citrusWeight);

        System.out.println(citrusArrayList.size());
        addOranges(citrusArrayList);
        System.out.println(citrusArrayList.size());
    }

}
