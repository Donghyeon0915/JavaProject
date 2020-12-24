/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;

import java.util.Stack;

/**
 *
 * @author Donghyeon <20183188>
 */
public class DFS {

    /**
     * @param args the command line arguments
     */
    Graph graph = new Graph(9);            // 0 ~ 9까지의 데이터로 노드가 초기화 됨

    public DFS(Graph graph) {
        this.graph = graph;
    }
    
    
    public void dfs(){
        dfs(0);
    }
    
    public void dfs(int index){             // index는 시작 노드의 인덱스
        Node root = graph.nodes[index];
        Stack<Node> stack = new Stack<>();
        stack.push(root);                   // 루트(시작) 노드 푸쉬
        root.visited = true;                // 방문 표시
        
        while(!stack.isEmpty()){
            Node now = stack.pop();
            
            for (Node n : now.adjacent) {
                if(!n.visited){
                    stack.push(n);
                    n.visited = true;
                }
            }
            
            System.out.print(now.data +  " ");
        }
        
    }    
}
