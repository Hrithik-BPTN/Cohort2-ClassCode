package week2.wednesday.access_modifiers.p1;

import week2.wednesday.access_modifiers.protected_modifier1;

public class protected_modifier2 extends protected_modifier1 {

    public static void main(String[] args){
        protected_modifier2 bObj = new protected_modifier2();
        bObj.print(); // protected_modifier2 inherited the print method of ClassA, so this won't throw an error.
    }

}
