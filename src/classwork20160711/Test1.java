package classwork20160711;


import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> listStr = new ArrayList<String>();
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        listInt.add(10);
        listInt.add(5540);
        listInt.add(540);
        listInt.add(1, 5557777);//добавляет по индексу значение
        listInt.set(2, 5555);//замена по индексу згачения

        listInt.remove(0);//удалить елемент с индексом 0
        //listInt.add(50);

        System.out.println(listInt.get(2));
        System.out.println(listInt.size());
        System.out.println(listInt);
        System.out.println(listInt.contains(5555));//есть ли значение в списке

        System.out.println(listInt.indexOf(5555));//индекс искомого значения

        //java 1.8
      //removeAllOdd(listInt);
        //listInt.removeIf((e) -> e%2 !=0);
        listInt.removeIf((elem)->{
            System.out.println(elem);
            if(elem %2 !=0){
                System.out.println("remove" + elem);
                return true;

            }else return false;


        });
        //спросить!!!!!!!!!!!
       //listInt.forEach((elem)-> elem %2 !=0);
        //listInt.forEach((Intger e)-> System.out.println(e));


        /*public static void removeAllOdd(ArrayList<Integer> listInt){



*//*        for (int i = 0; i < listInt.size(); i++) {
            if (listInt.get(i)/ % 2 != 0){
                listInt.remove(i);
                i--;
            }

        }*//*



    }*/

        /*
        public static int sum(int [] array){
            int result = 0;
        for (int i = 0; i < array.length; i++) {
            result+=array[i];
        }
        return result;
    }*/

    }


}
