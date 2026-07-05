package com.interviewprep.backend.module.questions.blind75.seed;

import com.interviewprep.backend.module.questions.blind75.enums.Difficulty;
import com.interviewprep.backend.module.questions.blind75.enums.Pattern;
import com.interviewprep.backend.module.questions.blind75.enums.Topic;

import java.util.List;

import static com.interviewprep.backend.module.questions.blind75.enums.Difficulty.EASY;
import static com.interviewprep.backend.module.questions.blind75.enums.Difficulty.HARD;
import static com.interviewprep.backend.module.questions.blind75.enums.Difficulty.MEDIUM;

public final class Blind75QuestionSeedData {

    private Blind75QuestionSeedData() {
        throw new IllegalStateException("Utility class");
    }

    private static final String BASE_URL = "https://leetcode.com/problems/";

    public static final List<Blind75SeedQuestion> QUESTIONS = List.of(
            // Array
            q("Two Sum", EASY, Topic.ARRAYS, Pattern.HASHMAP, "two-sum"),
            q("Best Time to Buy and Sell Stock", EASY, Topic.ARRAYS, Pattern.GREEDY, "best-time-to-buy-and-sell-stock"),
            q("Contains Duplicate", EASY, Topic.ARRAYS, Pattern.HASHSET, "contains-duplicate"),
            q("Product of Array Except Self", MEDIUM, Topic.ARRAYS, Pattern.TWO_POINTERS, "product-of-array-except-self"),
            q("Maximum Subarray", MEDIUM, Topic.ARRAYS, Pattern.DYNAMIC_PROGRAMMING, "maximum-subarray"),
            q("Maximum Product Subarray", MEDIUM, Topic.ARRAYS, Pattern.DYNAMIC_PROGRAMMING, "maximum-product-subarray"),
            q("Find Minimum in Rotated Sorted Array", MEDIUM, Topic.BINARY_SEARCH, Pattern.BINARY_SEARCH, "find-minimum-in-rotated-sorted-array"),
            q("Search in Rotated Sorted Array", MEDIUM, Topic.BINARY_SEARCH, Pattern.BINARY_SEARCH, "search-in-rotated-sorted-array"),
            q("3Sum", MEDIUM, Topic.ARRAYS, Pattern.TWO_POINTERS, "3sum"),
            q("Container With Most Water", MEDIUM, Topic.ARRAYS, Pattern.TWO_POINTERS, "container-with-most-water"),

            // Binary / Bit Manipulation
            q("Sum of Two Integers", MEDIUM, Topic.BIT_MANIPULATION, Pattern.GREEDY, "sum-of-two-integers"),
            q("Number of 1 Bits", EASY, Topic.BIT_MANIPULATION, Pattern.GREEDY, "number-of-1-bits"),
            q("Counting Bits", EASY, Topic.BIT_MANIPULATION, Pattern.DYNAMIC_PROGRAMMING, "counting-bits"),
            q("Missing Number", EASY, Topic.BIT_MANIPULATION, Pattern.GREEDY, "missing-number"),
            q("Reverse Bits", EASY, Topic.BIT_MANIPULATION, Pattern.GREEDY, "reverse-bits"),

            // Dynamic Programming
            q("Climbing Stairs", EASY, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "climbing-stairs"),
            q("Coin Change", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "coin-change"),
            q("Longest Increasing Subsequence", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "longest-increasing-subsequence"),
            q("Combination Sum IV", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "combination-sum-iv"),
            q("Word Break", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "word-break"),
            q("Combination Sum", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.BACKTRACKING, "combination-sum"),
            q("House Robber", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "house-robber"),
            q("House Robber II", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "house-robber-ii"),
            q("Decode Ways", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "decode-ways"),
            q("Unique Paths", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "unique-paths"),
            q("Jump Game", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.GREEDY, "jump-game"),

            // Graph
            q("Clone Graph", MEDIUM, Topic.GRAPHS, Pattern.DFS, "clone-graph"),
            q("Course Schedule", MEDIUM, Topic.GRAPHS, Pattern.DFS, "course-schedule"),
            q("Pacific Atlantic Water Flow", MEDIUM, Topic.GRAPHS, Pattern.DFS, "pacific-atlantic-water-flow"),
            q("Number of Islands", MEDIUM, Topic.GRAPHS, Pattern.DFS, "number-of-islands"),
            q("Longest Consecutive Sequence", MEDIUM, Topic.GRAPHS, Pattern.HASHSET, "longest-consecutive-sequence"),
            q("Alien Dictionary", HARD, Topic.GRAPHS, Pattern.BFS, "alien-dictionary"),
            q("Graph Valid Tree", MEDIUM, Topic.GRAPHS, Pattern.DFS, "graph-valid-tree"),
            q("Number of Connected Components in an Undirected Graph", MEDIUM, Topic.GRAPHS, Pattern.DFS, "number-of-connected-components-in-an-undirected-graph"),

            // Interval
            q("Insert Interval", MEDIUM, Topic.INTERVAL, Pattern.GREEDY, "insert-interval"),
            q("Merge Intervals", MEDIUM, Topic.INTERVAL, Pattern.GREEDY, "merge-intervals"),
            q("Non-overlapping Intervals", MEDIUM, Topic.INTERVAL, Pattern.GREEDY, "non-overlapping-intervals"),
            q("Meeting Rooms", EASY, Topic.INTERVAL, Pattern.GREEDY, "meeting-rooms"),
            q("Meeting Rooms II", MEDIUM, Topic.INTERVAL, Pattern.HEAP, "meeting-rooms-ii"),

            // Linked List
            q("Reverse Linked List", EASY, Topic.LINKED_LIST, Pattern.TWO_POINTERS, "reverse-linked-list"),
            q("Linked List Cycle", EASY, Topic.LINKED_LIST, Pattern.FAST_SLOW_POINTERS, "linked-list-cycle"),
            q("Merge Two Sorted Lists", EASY, Topic.LINKED_LIST, Pattern.TWO_POINTERS, "merge-two-sorted-lists"),
            q("Merge k Sorted Lists", HARD, Topic.LINKED_LIST, Pattern.HEAP, "merge-k-sorted-lists"),
            q("Remove Nth Node From End of List", MEDIUM, Topic.LINKED_LIST, Pattern.FAST_SLOW_POINTERS, "remove-nth-node-from-end-of-list"),
            q("Reorder List", MEDIUM, Topic.LINKED_LIST, Pattern.FAST_SLOW_POINTERS, "reorder-list"),

            // Matrix
            q("Set Matrix Zeroes", MEDIUM, Topic.MATRIX, Pattern.GREEDY, "set-matrix-zeroes"),
            q("Spiral Matrix", MEDIUM, Topic.MATRIX, Pattern.GREEDY, "spiral-matrix"),
            q("Rotate Image", MEDIUM, Topic.MATRIX, Pattern.GREEDY, "rotate-image"),
            q("Word Search", MEDIUM, Topic.MATRIX, Pattern.BACKTRACKING, "word-search"),

            // String
            q("Longest Substring Without Repeating Characters", MEDIUM, Topic.SLIDING_WINDOW, Pattern.SLIDING_WINDOW, "longest-substring-without-repeating-characters"),
            q("Longest Repeating Character Replacement", MEDIUM, Topic.SLIDING_WINDOW, Pattern.SLIDING_WINDOW, "longest-repeating-character-replacement"),
            q("Minimum Window Substring", HARD, Topic.SLIDING_WINDOW, Pattern.SLIDING_WINDOW, "minimum-window-substring"),
            q("Valid Anagram", EASY, Topic.STRINGS, Pattern.HASHMAP, "valid-anagram"),
            q("Group Anagrams", MEDIUM, Topic.STRINGS, Pattern.HASHMAP, "group-anagrams"),
            q("Valid Parentheses", EASY, Topic.STACK, Pattern.STACK, "valid-parentheses"),
            q("Valid Palindrome", EASY, Topic.STRINGS, Pattern.TWO_POINTERS, "valid-palindrome"),
            q("Longest Palindromic Substring", MEDIUM, Topic.STRINGS, Pattern.TWO_POINTERS, "longest-palindromic-substring"),
            q("Palindromic Substrings", MEDIUM, Topic.STRINGS, Pattern.TWO_POINTERS, "palindromic-substrings"),
            q("Encode and Decode Strings", MEDIUM, Topic.STRINGS, Pattern.GREEDY, "encode-and-decode-strings"),

            // Tree
            q("Maximum Depth of Binary Tree", EASY, Topic.TREES, Pattern.DFS, "maximum-depth-of-binary-tree"),
            q("Same Tree", EASY, Topic.TREES, Pattern.DFS, "same-tree"),
            q("Invert Binary Tree", EASY, Topic.TREES, Pattern.DFS, "invert-binary-tree"),
            q("Binary Tree Maximum Path Sum", HARD, Topic.TREES, Pattern.DFS, "binary-tree-maximum-path-sum"),
            q("Binary Tree Level Order Traversal", MEDIUM, Topic.TREES, Pattern.BFS, "binary-tree-level-order-traversal"),
            q("Serialize and Deserialize Binary Tree", HARD, Topic.TREES, Pattern.DFS, "serialize-and-deserialize-binary-tree"),
            q("Subtree of Another Tree", EASY, Topic.TREES, Pattern.DFS, "subtree-of-another-tree"),
            q("Construct Binary Tree from Preorder and Inorder Traversal", MEDIUM, Topic.TREES, Pattern.DFS, "construct-binary-tree-from-preorder-and-inorder-traversal"),
            q("Validate Binary Search Tree", MEDIUM, Topic.TREES, Pattern.DFS, "validate-binary-search-tree"),
            q("Kth Smallest Element in a BST", MEDIUM, Topic.TREES, Pattern.DFS, "kth-smallest-element-in-a-bst"),
            q("Lowest Common Ancestor of a Binary Search Tree", EASY, Topic.TREES, Pattern.DFS, "lowest-common-ancestor-of-a-binary-search-tree"),

            // Trie
            q("Implement Trie (Prefix Tree)", MEDIUM, Topic.TRIE, Pattern.TRIE, "implement-trie-prefix-tree"),
            q("Design Add and Search Words Data Structure", MEDIUM, Topic.TRIE, Pattern.TRIE, "design-add-and-search-words-data-structure"),
            q("Word Search II", HARD, Topic.TRIE, Pattern.BACKTRACKING, "word-search-ii"),

            // Heap
            q("Top K Frequent Elements", MEDIUM, Topic.HEAP, Pattern.HEAP, "top-k-frequent-elements"),
            q("Find Median from Data Stream", HARD, Topic.HEAP, Pattern.HEAP, "find-median-from-data-stream")
    );

    private static Blind75SeedQuestion q(String title, Difficulty difficulty, Topic topic, Pattern pattern, String slug) {
        return new Blind75SeedQuestion(slug, title, difficulty, topic, pattern, BASE_URL + slug + "/");
    }
}