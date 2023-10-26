package ru.antipov.seminar_3;

import java.util.Comparator;

public class AgeComporator implements Comparator <CompareAge>{

    @Override
    public int compare(CompareAge o1, CompareAge o2) {
        if (o1.getAge() > o2.getAge()){
            return -1;
        }
        else if (o1.getAge() == o2.getAge()){
            return 0;
        }
        else {
            return 1;
        }
    }
}
