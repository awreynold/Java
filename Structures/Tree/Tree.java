package elements;

import java.util.ArrayList;
import java.util.List;

/**
 * created 3/6/19
 * Object class for the Tree object in the tree data structure
 */
public class Tree {
    
    private String name;
    private List<TreeNode> nodes; //first node is the root node
    
    public Tree(String name){
        this.name = name;
        nodes = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addNodes(TreeNode val){
        nodes.add(val);
    }
    
    public List<TreeNode> getNodes(){
        return this.nodes;
    }
}
