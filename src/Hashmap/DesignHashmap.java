package Hashmap;

import java.util.ArrayList;

public class DesignHashmap {
    static class Pair{
        int key;
        int value;
        Pair(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    ArrayList<Pair> list = new ArrayList<>();
    public void put(int key, int value) {
        for(Pair p:list){
            if(p.key==key){
                p.value=value;
            }
        }
        list.add(new Pair(key,value));
        
    }

    public int get(int key) {
        for(Pair p:list){
            if(p.key==key){
                return p.value;
            }
        }return -1;
    }

    public void remove(int key) {
        list.removeIf(p->p.key==key);
    }

    public static void main(String[] args) {
        DesignHashmap obj = new DesignHashmap();
        obj.put(1,2);
        obj.put(2,2);
        System.out.println(obj.get(1));
        System.out.println(obj.get(3));
        obj.put(2,1);
        obj.get(2);
        obj.remove(2);
        System.out.println(obj.get(2));
    }
}
