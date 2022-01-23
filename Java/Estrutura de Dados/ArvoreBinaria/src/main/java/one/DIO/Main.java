package one.DIO;

import one.DIO.model.Obj;

public class Main {
    public static void main(String[] args) {
        BinTree<Obj> binTree = new BinTree<>();

        binTree.insert(new Obj(13));
        binTree.insert(new Obj(10));
        binTree.insert(new Obj(25));
        binTree.insert(new Obj(2));
        binTree.insert(new Obj(12));
        binTree.insert(new Obj(20));
        binTree.insert(new Obj(31));
        binTree.insert(new Obj(29));
        binTree.insert(new Obj(32));

        binTree.showInOrder();
        binTree.showPreOrder();
        binTree.showPostOrder();


    }
}
