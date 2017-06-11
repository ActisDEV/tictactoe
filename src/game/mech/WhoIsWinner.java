/*
 * The MIT License
 *
 * Copyright 2017 Denis Karev.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package game.mech;

import game.ui.PlayField;

/**
 *
 * @author Денис
 */
public class WhoIsWinner {
    
    static int soWhoIsWinner;
    
    public static int WinnerChecker() {
           if ( //условия победы КРЕСТИКОВ
               ((PlayField.playField[0][0] == PlayField.playField[0][1]) && (PlayField.playField[0][0] == PlayField.playField[0][2]) && (PlayField.playField[0][0] == 1))//горизонтали
                   ||
               ((PlayField.playField[1][0] == PlayField.playField[1][1]) && (PlayField.playField[1][0] == PlayField.playField[1][2]) && (PlayField.playField[1][0] == 1))
                   ||
               ((PlayField.playField[2][0] == PlayField.playField[2][1]) && (PlayField.playField[2][0] == PlayField.playField[2][2]) && (PlayField.playField[2][0] == 1))
                   ||
               ((PlayField.playField[0][0] == PlayField.playField[1][0]) && (PlayField.playField[0][0] == PlayField.playField[2][0]) && (PlayField.playField[0][0] == 1))//вертикали   
                   ||
               ((PlayField.playField[0][1] == PlayField.playField[1][1]) && (PlayField.playField[0][1] == PlayField.playField[2][1]) && (PlayField.playField[0][1] == 1))    
                   ||
               ((PlayField.playField[0][2] == PlayField.playField[1][2]) && (PlayField.playField[0][2] == PlayField.playField[2][2]) && (PlayField.playField[0][2] == 1))
                   ||
               ((PlayField.playField[0][0] == PlayField.playField[1][1]) && (PlayField.playField[0][0] == PlayField.playField[1][2]) && (PlayField.playField[0][0] == 1))//диагонали    
                   ||
               ((PlayField.playField[0][2] == PlayField.playField[1][1]) && (PlayField.playField[0][2] == PlayField.playField[2][0]) && (PlayField.playField[0][2] == 1))    
               ) {
                    soWhoIsWinner = 1;
           } else if 
               ( //условия победы НОЛИКОВ
               ((PlayField.playField[0][0] == PlayField.playField[0][1]) && (PlayField.playField[0][0] == PlayField.playField[0][2]) && (PlayField.playField[0][0] == 2))//горизонтали
                   ||
               ((PlayField.playField[1][0] == PlayField.playField[1][1]) && (PlayField.playField[1][0] == PlayField.playField[1][2]) && (PlayField.playField[1][0] == 2))
                   ||
               ((PlayField.playField[2][0] == PlayField.playField[2][1]) && (PlayField.playField[2][0] == PlayField.playField[2][2]) && (PlayField.playField[2][0] == 2))
                   ||
               ((PlayField.playField[0][0] == PlayField.playField[1][0]) && (PlayField.playField[0][0] == PlayField.playField[2][0]) && (PlayField.playField[0][0] == 2))//вертикали   
                   ||
               ((PlayField.playField[0][1] == PlayField.playField[1][1]) && (PlayField.playField[0][1] == PlayField.playField[2][1]) && (PlayField.playField[0][1] == 2))    
                   ||
               ((PlayField.playField[0][2] == PlayField.playField[1][2]) && (PlayField.playField[0][2] == PlayField.playField[2][2]) && (PlayField.playField[0][2] == 2))
                   ||
               ((PlayField.playField[0][0] == PlayField.playField[1][1]) && (PlayField.playField[0][0] == PlayField.playField[1][2]) && (PlayField.playField[0][0] == 2))//диагонали    
                   ||
               ((PlayField.playField[0][2] == PlayField.playField[1][1]) && (PlayField.playField[0][2] == PlayField.playField[2][0]) && (PlayField.playField[0][2] == 2))  
               ) {
                   soWhoIsWinner = 2;
           } else if  //
               ((PlayField.playField[0][0] != 0) && (PlayField.playField[0][1] != 0) && (PlayField.playField[0][2] != 0) && (PlayField.playField[1][0] != 0) && (PlayField.playField[1][1] != 0) && 
                   (PlayField.playField[1][2] != 0) && (PlayField.playField[2][0] != 0) && (PlayField.playField[2][1] != 0) && (PlayField.playField[2][2] != 0)) {
                   soWhoIsWinner = 3;
           }
        return soWhoIsWinner;
    }
}
