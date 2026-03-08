package backjoon;
import java.util.*;

public class Solution {
    static class TreeNode {
        int id;
        List<TreeNode> children = new ArrayList<>();
        TreeNode(int id) { this.id = id; }
    }


    private TreeNode buildTree(int rootId, int[] parent, int[] child) {
        Map<Integer, TreeNode> map = new HashMap<>();
        map.put(rootId, new TreeNode(rootId));
        for (int i = 0; i < parent.length; i++) {
            map.putIfAbsent(parent[i], new TreeNode(parent[i]));
            map.putIfAbsent(child[i], new TreeNode(child[i]));
            map.get(parent[i]).children.add(map.get(child[i]));
        }
        return map.get(rootId);
    }


    private Map<Integer, String> BFS(TreeNode root) {
        Map<Integer, String> pathMap = new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, String.valueOf(root.id)));
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            pathMap.put(p.node.id, p.path);
            for (TreeNode child : p.node.children) {
                queue.add(new Pair(child, p.path + "-" + child.id));
            }
        }
        return pathMap;
    }

    static class Pair {
        TreeNode node;
        String path;
        Pair(TreeNode node, String path) {
            this.node = node;
            this.path = path;
        }
    }

    public List<Integer> solution(TreeNode root1, TreeNode root2) {
        Map<Integer, String> pathMap1 = BFS(root1);
        Map<Integer, String> pathMap2 = BFS(root2);

        List<Integer> diff = new ArrayList<>();
        for (int id : pathMap1.keySet()) {
            if (!pathMap1.get(id).equals(pathMap2.get(id))) {
                diff.add(id);
            }
        }
        Collections.sort(diff);
        return diff;
    }

    public static void main(String[] args) {
        // 원본 트리
        int[] parent1 = {1,1,3,3,3};
        int[] child1  = {2,3,4,5,6};

        // 비교 트리
        int[] parent2 = {1,1,2,3,5};
        int[] child2  = {2,5,3,4,6};

        Solution sol = new Solution();
        TreeNode root1 = sol.buildTree(1, parent1, child1);
        TreeNode root2 = sol.buildTree(1, parent2, child2);

        List<Integer> result = sol.solution(root1, root2);
        System.out.println(result);
    }
}