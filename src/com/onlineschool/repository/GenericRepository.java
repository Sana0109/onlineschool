package com.onlineschool.repository;

import java.util.Arrays;

public class MyGeneric<E> {
    Class dataType;
     E[] objArray;
    public int length ;

    public MyGeneric(int length) {
        this.objArray = objArray;
        this.length = this.length;
    }

    public Class getDataType() {
        return dataType;
    }

    public void setDataType(Class dataType) {
        this.dataType = dataType;
    }

    public E[] getObjArray() {
        return objArray;
    }

    public int getLength() {
        return length;
    }



    @Override
    public String toString() {
        return Arrays.toString(objArray);
    }
}



