/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restFULServer;

import entities.Item_attribute;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author jonma
 */
@Stateless
@Path("atributo")
public class Item_attributeFacadeREST extends AbstractFacade<Item_attribute> {

    private static final Logger LOGGER = Logger.getLogger(Item_attributeFacadeREST.class.getName());

    @PersistenceContext(unitName = "FullWatPU")
    private EntityManager em;

    public Item_attributeFacadeREST() {
        super(Item_attribute.class);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML})
    public List<Item_attribute> findAll() {
        return super.findAll();
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

}
