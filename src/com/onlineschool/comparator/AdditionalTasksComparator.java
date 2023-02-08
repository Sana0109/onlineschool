package com.onlineschool.comparator;

import com.onlineschool.models.AdditionalTasks;

import java.util.Comparator;

public abstract class AdditionalTasksComparator implements Comparator<AdditionalTasks> {

    @Override
    public int compare(AdditionalTasks o1, AdditionalTasks o2) {
        return o1.getNameAdditionalTasks().compareTo(o2.getNameAdditionalTasks());
    }

    public static Comparator<AdditionalTasks> StuGetID = new Comparator<>() {
        @Override
        public int compare(AdditionalTasks s1, AdditionalTasks s2) {
            return s1.getID().compareTo(s2.getID());


        }
    };
}
