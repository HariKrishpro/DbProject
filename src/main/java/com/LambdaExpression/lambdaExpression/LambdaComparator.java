package com.LambdaExpression.lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaComparator {
    public static void main(String[] args) {
        List<Model> list = new ArrayList(Arrays.asList(
                new Model("Hari","Krish",20),
                new Model("Aakash","V",20),
                new Model("Gokul","C",20)
        ));

        Collections.sort(list,(o1,o2)->(o1.fName.compareTo(o2.fName)));

//        list.stream().sorted((a,b)->(a.fName).compareTo(b.fName));


        for(Model i:list)
        System.out.println(i);
    }
}
