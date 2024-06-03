package Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(count(3, 3));
        // path("", 3, 3);
        // System.out.println(pathDir("", 3, 3));
        // System.out.println(pathDiagonal("", 3, 3));

        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        allPaths("", board, 0, 0);
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r - 1, c);
        }

        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathDir(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathDir(p + 'D', r - 1, c));
        }

        if (c > 1) {
            list.addAll(pathDir(p + 'R', r, c - 1));
        }

        return list;
    }

    static ArrayList<String> pathDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1) {
            list.addAll(pathDiagonal(p + 'D', r - 1, c - 1));
        }

        if (r > 1) {
            list.addAll(pathDiagonal(p + 'V', r - 1, c));
        }

        if (c > 1) {
            list.addAll(pathDiagonal(p + 'H', r, c - 1));
        }

        return list;
    }

    static void pathObstacles(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            pathObstacles(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            pathObstacles(p + 'R', maze, r, c + 1);
        }
    }

    // BACKTRACKING----->>>>>
    static void allPaths(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPaths(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            allPaths(p + 'R', maze, r, c + 1);
        }

        if (r > 0) {
            allPaths(p + 'U', maze, r - 1, c);
        }

        if (c > 0) {
            allPaths(p + 'L', maze, r, c - 1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made
        // by that function

        maze[r][c] = true;
    }

}
