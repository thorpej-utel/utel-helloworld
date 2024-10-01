/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.co.utel.test;

import java.util.Objects;

/**
 *
 * @author jthor
 */
public class ResultData {

    private long id;
    private String message;

    /**
     *
     * @param id
     * @param message
     */
    public ResultData(final long id, final String message) {
        this.id = id;
        this.message = message;
    }

    /**
     *
     */
    public ResultData() {
    }

    /**
     *
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(final long id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 13 * hash + Objects.hashCode(this.message);
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return getClass() == obj.getClass();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "ResultData{" + "id=" + id + ", message=" + message + '}';
    }

}
