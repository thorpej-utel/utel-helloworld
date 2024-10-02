/*
 * Copyright (c) 2024 Jason Thorpe
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package uk.co.utel.test;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author jthor
 */
public class UtelHelloworld {

    /**
     * This is a test of Mircosoft openJDK 21
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("This is a test of microsoft openJDK 21");

        System.out.println("Make some output data");
        ResultData rd = new ResultData(1, "Hello");
        System.out.println("rd=" + rd);
        
        
        LoginResult lr= new LoginResult();
        lr.setId(123L);
        lr.setFirstName("Jason");
        lr.setLastName("Thorpe");
        
        System.out.println("uk.co.utel.test.UtelHelloworld.main(): " + lr.toString());

       String  jsonLR= ToStringBuilder.reflectionToString(lr, ToStringStyle.JSON_STYLE);
       System.out.println("uk.co.utel.test.UtelHelloworld.main(): " + jsonLR);
        
    }
}
