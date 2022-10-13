/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jonma
 */
@Entity
@XmlRootElement
@Table(name = "item_attribute_value", schema = "fullwat_app_db")

public class Item_attribute_value implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private Item_attribute_valueID idIAV;

    @MapsId("id")
    @ManyToOne
    private Item_attribute item_attribute;

    @MapsId("no")
    @ManyToOne
    private Item item;

    private String value;
    private Integer filter;

    public Item_attribute_value() {
    }

    public Item_attribute_valueID getIdIAV() {
        return idIAV;
    }

    public void setId(Item_attribute_valueID idIAV) {
        this.idIAV = idIAV;
    }

    public Item_attribute getItem_attribute() {
        return item_attribute;
    }

    public void setItem_attribute(Item_attribute item_attribute) {
        this.item_attribute = item_attribute;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getFilter() {
        return filter;
    }

    public void setFilter(Integer filter) {
        this.filter = filter;
    }

}
