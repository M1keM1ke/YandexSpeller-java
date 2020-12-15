package ru.mike.wrapper.dto;

import lombok.Data;

import java.util.List;

@Data
public class CheckTextResult {
    /**
     * error code
     */
    private int code;
    /**
     * position of the misspelled word (counting from 0)
     */
    private int pos;
    /**
     * line number (counting from 0)
     */
    private int row;
    /**
     * column number (counting from 0)
     */
    private int col;
    /**
     * length of the misspelled word
     */
    private int len;
    /**
     * source word
     */
    private String word;
    /**
     * hint (may be several or may be missing)
     */
    private List<String> s;


}



