package cWH;

//Access modifiers

import ManagingPackages.prg2;

class User extends prg2 {
    void meth3(){//A subclass can access public, protected attributes and methods
        System.out.println(a);
        System.out.println(b);
        //System.out.println(c); Will give an error
    }
}

public class testing {//An object can access the public attributes and methods
    public static void main(String[] args) {
        User obj = new User();
        obj.meth3();
        prg2 obj2 = new prg2();
        System.out.println(obj2.a);
    }
}
