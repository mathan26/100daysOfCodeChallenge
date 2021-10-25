package com.github.mathan26.ds.algorithms;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        // Already it is correct
        if(image[sr][sc] == newColor)
            return image;
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;

    }

    public void fill(int[][] image, int sr, int sc, int color, int newColor){
        // boundary case,
        // note:  sr >= image.length

        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length)
            return;

        // Adjacent postion is not the source value
        if(image[sr][sc] != color)
            return;
        image[sr][sc] = newColor;
        fill(image, sr-1, sc, color, newColor); // TOP
        fill(image, sr+1, sc, color, newColor); // BOTTOM
        fill(image, sr, sc+1, color, newColor); // LEFT
        fill(image, sr, sc-1, color, newColor); // RIGHT

    }
}
