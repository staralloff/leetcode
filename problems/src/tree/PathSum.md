## Path Sum

### Description

Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:

Given the below binary tree and `sum = 22`,

```
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
```

return true, as there exist a root-to-leaf path `5->4->11->2` which sum is 22.

**Tags:** Tree, Depth-first Search

## 解题思路

题目是说查找二叉树中的一条跟节点到叶子节点的链路的和为sum。其实生活中充满了类似这样的递归问题，我们只需要解决最重要的最关键的问题，而剩下的问题都是调用方法本身，这让我想到了俄罗斯套娃:electric light bulb:
这一题也是如此，最关键也是递归调用到最后的问题是跟节点为空时，返回false;跟节点是叶子节点时，如果root.val==sum返回true否则返回false，剩下的就是递归调用。

## Link

[Link](https://leetcode.com/problems/path-sum)

## Code

[code](https://github.com/staralloff/leetcode/blob/master/problems/src/tree/PathSum.java)
