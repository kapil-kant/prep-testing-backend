package com.interviewprep.backend.module.questions.blind75.seed;

import com.interviewprep.backend.module.questions.blind75.enums.Difficulty;
import com.interviewprep.backend.module.questions.blind75.enums.Pattern;
import com.interviewprep.backend.module.questions.blind75.enums.Topic;
import com.interviewprep.backend.module.questions.blind75.enums.VideoAvailability;

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
            q("Two Sum", EASY, Topic.ARRAYS, Pattern.HASHMAP, "two-sum", null, VideoAvailability.COMING_SOON),
            q("Best Time to Buy and Sell Stock", EASY, Topic.ARRAYS, Pattern.GREEDY, "best-time-to-buy-and-sell-stock", null, VideoAvailability.COMING_SOON),
            q("Contains Duplicate", EASY, Topic.ARRAYS, Pattern.HASHSET, "contains-duplicate", null, VideoAvailability.COMING_SOON),
            q("Product of Array Except Self", MEDIUM, Topic.ARRAYS, Pattern.TWO_POINTERS, "product-of-array-except-self", null, VideoAvailability.COMING_SOON),
            q("Maximum Subarray", MEDIUM, Topic.ARRAYS, Pattern.DYNAMIC_PROGRAMMING, "maximum-subarray", null, VideoAvailability.COMING_SOON),
            q("Maximum Product Subarray", MEDIUM, Topic.ARRAYS, Pattern.DYNAMIC_PROGRAMMING, "maximum-product-subarray", null, VideoAvailability.COMING_SOON),
            q("Find Minimum in Rotated Sorted Array", MEDIUM, Topic.BINARY_SEARCH, Pattern.BINARY_SEARCH, "find-minimum-in-rotated-sorted-array", null, VideoAvailability.COMING_SOON),
            q("Search in Rotated Sorted Array", MEDIUM, Topic.BINARY_SEARCH, Pattern.BINARY_SEARCH, "search-in-rotated-sorted-array", null, VideoAvailability.COMING_SOON),
            q("3Sum", MEDIUM, Topic.ARRAYS, Pattern.TWO_POINTERS, "3sum", null, VideoAvailability.COMING_SOON),
            q("Container With Most Water", MEDIUM, Topic.ARRAYS, Pattern.TWO_POINTERS, "container-with-most-water", null, VideoAvailability.COMING_SOON),

            // Binary / Bit Manipulation
            q("Sum of Two Integers", MEDIUM, Topic.BIT_MANIPULATION, Pattern.GREEDY, "sum-of-two-integers", null, VideoAvailability.COMING_SOON),
            q("Number of 1 Bits", EASY, Topic.BIT_MANIPULATION, Pattern.GREEDY, "number-of-1-bits", null, VideoAvailability.COMING_SOON),
            q("Counting Bits", EASY, Topic.BIT_MANIPULATION, Pattern.DYNAMIC_PROGRAMMING, "counting-bits", null, VideoAvailability.COMING_SOON),
            q("Missing Number", EASY, Topic.BIT_MANIPULATION, Pattern.GREEDY, "missing-number", null, VideoAvailability.COMING_SOON),
            q("Reverse Bits", EASY, Topic.BIT_MANIPULATION, Pattern.GREEDY, "reverse-bits", null, VideoAvailability.COMING_SOON),

            // Dynamic Programming
            q("Climbing Stairs", EASY, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "climbing-stairs", null, VideoAvailability.COMING_SOON),
            q("Coin Change", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "coin-change", null, VideoAvailability.COMING_SOON),
            q("Longest Increasing Subsequence", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "longest-increasing-subsequence", null, VideoAvailability.COMING_SOON),
            q("Combination Sum IV", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "combination-sum-iv", null, VideoAvailability.COMING_SOON),
            q("Word Break", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "word-break", null, VideoAvailability.COMING_SOON),
            q("Combination Sum", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.BACKTRACKING, "combination-sum", null, VideoAvailability.COMING_SOON),
            q("House Robber", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "house-robber", null, VideoAvailability.COMING_SOON),
            q("House Robber II", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "house-robber-ii", null, VideoAvailability.COMING_SOON),
            q("Decode Ways", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "decode-ways", null, VideoAvailability.COMING_SOON),
            q("Unique Paths", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.DYNAMIC_PROGRAMMING, "unique-paths", null, VideoAvailability.COMING_SOON),
            q("Jump Game", MEDIUM, Topic.DYNAMIC_PROGRAMMING, Pattern.GREEDY, "jump-game", null, VideoAvailability.COMING_SOON),

            // Graph
            q("Clone Graph", MEDIUM, Topic.GRAPHS, Pattern.DFS, "clone-graph", null, VideoAvailability.COMING_SOON),
            q("Course Schedule", MEDIUM, Topic.GRAPHS, Pattern.DFS, "course-schedule", null, VideoAvailability.COMING_SOON),
            q("Pacific Atlantic Water Flow", MEDIUM, Topic.GRAPHS, Pattern.DFS, "pacific-atlantic-water-flow", null, VideoAvailability.COMING_SOON),
            q("Number of Islands", MEDIUM, Topic.GRAPHS, Pattern.DFS, "number-of-islands", null, VideoAvailability.COMING_SOON),
            q("Longest Consecutive Sequence", MEDIUM, Topic.GRAPHS, Pattern.HASHSET, "longest-consecutive-sequence", null, VideoAvailability.COMING_SOON),
            q("Alien Dictionary", HARD, Topic.GRAPHS, Pattern.BFS, "alien-dictionary", null, VideoAvailability.COMING_SOON),
            q("Graph Valid Tree", MEDIUM, Topic.GRAPHS, Pattern.DFS, "graph-valid-tree", null, VideoAvailability.COMING_SOON),
            q("Number of Connected Components in an Undirected Graph", MEDIUM, Topic.GRAPHS, Pattern.DFS, "number-of-connected-components-in-an-undirected-graph", null, VideoAvailability.COMING_SOON),

            // Interval
            q("Insert Interval", MEDIUM, Topic.INTERVAL, Pattern.GREEDY, "insert-interval", null, VideoAvailability.COMING_SOON),
            q("Merge Intervals", MEDIUM, Topic.INTERVAL, Pattern.GREEDY, "merge-intervals", null, VideoAvailability.COMING_SOON),
            q("Non-overlapping Intervals", MEDIUM, Topic.INTERVAL, Pattern.GREEDY, "non-overlapping-intervals", null, VideoAvailability.COMING_SOON),
            q("Meeting Rooms", EASY, Topic.INTERVAL, Pattern.GREEDY, "meeting-rooms", null, VideoAvailability.COMING_SOON),
            q("Meeting Rooms II", MEDIUM, Topic.INTERVAL, Pattern.HEAP, "meeting-rooms-ii", null, VideoAvailability.COMING_SOON),

            // Linked List
            q("Reverse Linked List", EASY, Topic.LINKED_LIST, Pattern.TWO_POINTERS, "reverse-linked-list", null, VideoAvailability.COMING_SOON),
            q("Linked List Cycle", EASY, Topic.LINKED_LIST, Pattern.FAST_SLOW_POINTERS, "linked-list-cycle", null, VideoAvailability.COMING_SOON),
            q("Merge Two Sorted Lists", EASY, Topic.LINKED_LIST, Pattern.TWO_POINTERS, "merge-two-sorted-lists", null, VideoAvailability.COMING_SOON),
            q("Merge k Sorted Lists", HARD, Topic.LINKED_LIST, Pattern.HEAP, "merge-k-sorted-lists", null, VideoAvailability.COMING_SOON),
            q("Remove Nth Node From End of List", MEDIUM, Topic.LINKED_LIST, Pattern.FAST_SLOW_POINTERS, "remove-nth-node-from-end-of-list", null, VideoAvailability.COMING_SOON),
            q("Reorder List", MEDIUM, Topic.LINKED_LIST, Pattern.FAST_SLOW_POINTERS, "reorder-list", null, VideoAvailability.COMING_SOON),

            // Matrix
            q("Set Matrix Zeroes", MEDIUM, Topic.MATRIX, Pattern.GREEDY, "set-matrix-zeroes", null, VideoAvailability.COMING_SOON),
            q("Spiral Matrix", MEDIUM, Topic.MATRIX, Pattern.GREEDY, "spiral-matrix", null, VideoAvailability.COMING_SOON),
            q("Rotate Image", MEDIUM, Topic.MATRIX, Pattern.GREEDY, "rotate-image", null, VideoAvailability.COMING_SOON),
            q("Word Search", MEDIUM, Topic.MATRIX, Pattern.BACKTRACKING, "word-search", null, VideoAvailability.COMING_SOON),

            // String
            q("Longest Substring Without Repeating Characters", MEDIUM, Topic.SLIDING_WINDOW, Pattern.SLIDING_WINDOW, "longest-substring-without-repeating-characters", null, VideoAvailability.COMING_SOON),
            q("Longest Repeating Character Replacement", MEDIUM, Topic.SLIDING_WINDOW, Pattern.SLIDING_WINDOW, "longest-repeating-character-replacement", null, VideoAvailability.COMING_SOON),
            q("Minimum Window Substring", HARD, Topic.SLIDING_WINDOW, Pattern.SLIDING_WINDOW, "minimum-window-substring", null, VideoAvailability.COMING_SOON),
            q("Valid Anagram", EASY, Topic.STRINGS, Pattern.HASHMAP, "valid-anagram", null, VideoAvailability.COMING_SOON),
            q("Group Anagrams", MEDIUM, Topic.STRINGS, Pattern.HASHMAP, "group-anagrams", null, VideoAvailability.COMING_SOON),
            q("Valid Parentheses", EASY, Topic.STACK, Pattern.STACK, "valid-parentheses", null, VideoAvailability.COMING_SOON),
            q("Valid Palindrome", EASY, Topic.STRINGS, Pattern.TWO_POINTERS, "valid-palindrome", null, VideoAvailability.COMING_SOON),
            q("Longest Palindromic Substring", MEDIUM, Topic.STRINGS, Pattern.TWO_POINTERS, "longest-palindromic-substring", null, VideoAvailability.COMING_SOON),
            q("Palindromic Substrings", MEDIUM, Topic.STRINGS, Pattern.TWO_POINTERS, "palindromic-substrings", null, VideoAvailability.COMING_SOON),
            q("Encode and Decode Strings", MEDIUM, Topic.STRINGS, Pattern.GREEDY, "encode-and-decode-strings", null, VideoAvailability.COMING_SOON),

            // Tree
            q("Maximum Depth of Binary Tree", EASY, Topic.TREES, Pattern.DFS, "maximum-depth-of-binary-tree", null, VideoAvailability.COMING_SOON),
            q("Same Tree", EASY, Topic.TREES, Pattern.DFS, "same-tree", null, VideoAvailability.COMING_SOON),
            q("Invert Binary Tree", EASY, Topic.TREES, Pattern.DFS, "invert-binary-tree", null, VideoAvailability.COMING_SOON),
            q("Binary Tree Maximum Path Sum", HARD, Topic.TREES, Pattern.DFS, "binary-tree-maximum-path-sum", null, VideoAvailability.COMING_SOON),
            q("Binary Tree Level Order Traversal", MEDIUM, Topic.TREES, Pattern.BFS, "binary-tree-level-order-traversal", null, VideoAvailability.COMING_SOON),
            q("Serialize and Deserialize Binary Tree", HARD, Topic.TREES, Pattern.DFS, "serialize-and-deserialize-binary-tree", null, VideoAvailability.COMING_SOON),
            q("Subtree of Another Tree", EASY, Topic.TREES, Pattern.DFS, "subtree-of-another-tree", null, VideoAvailability.COMING_SOON),
            q("Construct Binary Tree from Preorder and Inorder Traversal", MEDIUM, Topic.TREES, Pattern.DFS, "construct-binary-tree-from-preorder-and-inorder-traversal", null, VideoAvailability.COMING_SOON),
            q("Validate Binary Search Tree", MEDIUM, Topic.TREES, Pattern.DFS, "validate-binary-search-tree", null, VideoAvailability.COMING_SOON),
            q("Kth Smallest Element in a BST", MEDIUM, Topic.TREES, Pattern.DFS, "kth-smallest-element-in-a-bst", null, VideoAvailability.COMING_SOON),
            q("Lowest Common Ancestor of a Binary Search Tree", EASY, Topic.TREES, Pattern.DFS, "lowest-common-ancestor-of-a-binary-search-tree", null, VideoAvailability.COMING_SOON),

            // Trie
            q("Implement Trie (Prefix Tree)", MEDIUM, Topic.TRIE, Pattern.TRIE, "implement-trie-prefix-tree", null, VideoAvailability.COMING_SOON),
            q("Design Add and Search Words Data Structure", MEDIUM, Topic.TRIE, Pattern.TRIE, "design-add-and-search-words-data-structure", null, VideoAvailability.COMING_SOON),
            q("Word Search II", HARD, Topic.TRIE, Pattern.BACKTRACKING, "word-search-ii", null, VideoAvailability.COMING_SOON),

            // Heap
            q("Top K Frequent Elements", MEDIUM, Topic.HEAP, Pattern.HEAP, "top-k-frequent-elements", null, VideoAvailability.COMING_SOON),
            q("Find Median from Data Stream", HARD, Topic.HEAP, Pattern.HEAP, "find-median-from-data-stream", null, VideoAvailability.COMING_SOON)
    );

    private static Blind75SeedQuestion q(String title, Difficulty difficulty, Topic topic, Pattern pattern, String slug,
                                          String videoSolutionLink, VideoAvailability videoAvailability) {
        return new Blind75SeedQuestion(slug, title, difficulty, topic, pattern, BASE_URL + slug + "/", videoSolutionLink, videoAvailability);
    }
}