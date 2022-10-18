package entities;

import java.io.Serializable;
import java.util.List;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jonma
 */
@Entity
@XmlRootElement
@Table(name = "item", schema = "fullwat_app_db")
@NamedQueries({
    
})

public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String no;

    @ManyToOne
    private Item_category item_category;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "item")
    private List<Item_attribute_value> valores;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Item_category getItem_category() {
        return item_category;
    }

    public void setItem_category(Item_category item_category) {
        this.item_category = item_category;
    }
    @XmlTransient
    public List<Item_attribute_value> getValores() {
        return valores;
    }

    public void setValores(List<Item_attribute_value> valores) {
        this.valores = valores;
    }

    public Item() {
    }

}
