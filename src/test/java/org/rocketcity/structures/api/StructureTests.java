package org.rocketcity.structures.api;

import org.rocketcity.structures.JTree;
import org.rocketcity.structures.RCList;
import org.testng.annotations.Test;

import java.util.List;

public class StructureTests {


    @Test
    public void jTreeTest() {
        JTree jTree = new JTree();
        jTree.put(5);
        jTree.put(2);
        jTree.put(7);
        jTree.put(3);
        jTree.put(1);
        jTree.traverse();
    }


    @Test
    public void rcListTest() {
        List<Integer> rcList = new RCList();
        rcList.add(1);
        rcList.add(2);
        rcList.add(3);
        System.out.println(rcList);
    }
}
