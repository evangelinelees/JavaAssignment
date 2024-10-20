/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;
import java.io.Serializable;

public interface DataProvider extends Serializable { //Interface to unify all getID methods and serializable so that any child classes can be passed to one textDelete method in TextEditor while being used with object input/output streams
    
    public String getId();
}
