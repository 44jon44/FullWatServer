/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jonma
 */
@Embeddable
@XmlRootElement
public class Item_attribute_valueID implements Serializable {

    private static final long serialVersionUID = 1L;
    private String no;
    private Integer id;

    public Item_attribute_valueID() {
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Item_attribute_valueID(String no, Integer id) {
        this.no = no;
        this.id = id;
    }
    
}
