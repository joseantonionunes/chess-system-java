/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogoxadrez.boardgame;

/**
 *
 * @author josea
 */
public class Position {
    
    private int row;
    private int columm;
    
        public Position(int row, int columm) {
        this.row = row;
        this.columm = columm;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumm() {
        return columm;
    }

    public void setColumm(int columm) {
        this.columm = columm;
    }
    
    public void setValues(int row, int column) {
        this.row = row;
        this.columm = column;
    }

    @Override
    public String toString() {
        return row + ", " + columm;
    }
    
}
