package mx.uv.fiee.iinf.poo.demos.generictupla;
//Roberto Lagunes Alvarez


import sun.net.www.content.text.Generic;

public class Utilities {
    public static <First, Second> boolean compare(First firstTuple, Second secondTuple){
        if (firstTuple instanceof GenericTupla && secondTuple instanceof GenericTupla){
            GenericTupla myTuple = (GenericTupla) firstTuple;
            GenericTupla anotherTuple = (GenericTupla) secondTuple;
            return myTuple.getKey().equals(anotherTuple.getKey()) && myTuple.getValue().equals(anotherTuple.getKey());
        }
        return false;
    }

}
