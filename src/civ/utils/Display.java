package civ.utils;

import java.io.*;
import java.util.ArrayList;

public class Display<T> {
   public String dispList(ArrayList<T> arrayList) {
      int size = arrayList.size();
      String listStr = ""; 
      for(int i = 0; i < size; i++) {
         if(i == (size-1)){
            listStr += arrayList.get(i);
         } else {
            listStr += arrayList.get(i) + ", ";
         }
      }
      
      return listStr;
   }
}
