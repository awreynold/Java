package elements;

import java.util.ArrayList;
import java.util.List;

/**
 * created 3/6/19
 * Object class that creates the Node of the Tree structure.
 */
public class TreeNode {
    
    private TreeNode parent;
    private List<TreeNode> children;
    
    public TreeNode(){
        this.parent = null;
        this.children = new ArrayList<>();
    }
    
    public TreeNode getParent(){
        return this.parent;
    }
    
    public List<TreeNode> getChildren(){
        return this.children;
    }
    
    public void addChild(TreeNode val){
        this.children.add(val);
    }
    
}
