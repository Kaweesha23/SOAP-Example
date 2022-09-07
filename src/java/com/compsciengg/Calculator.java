/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compsciengg;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kawee
 */
@WebService()
public class Calculator {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "i") int i, @WebParam(name ="j")int j)
    {
        return i+j;
    }
    @WebMethod(operationName = "sub")
    public int sub(@WebParam(name = "i") int i, @WebParam(name ="j")int j)
    {
        return i-j;
    }
    @WebMethod(operationName = "mul")
    public int mul(@WebParam(name = "i") int i, @WebParam(name ="j")int j)
    {
        return i*j;
    }
    @WebMethod(operationName = "div")
    public int div(@WebParam(name = "i") int i, @WebParam(name ="j")int j)
    {
        return i/j;
    }
}
