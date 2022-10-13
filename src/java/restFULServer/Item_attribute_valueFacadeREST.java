/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restFULServer;

import entities.Item_attribute_value;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author jonma
 */
@Stateless
@Path("item_attribute_value")
public class Item_attribute_valueFacadeREST extends AbstractFacade<Item_attribute_value> {

    private static final Logger LOGGER = Logger.getLogger(Item_attributeFacadeREST.class.getName());

    @PersistenceContext(unitName = "FullWatPU")
    private EntityManager em;

    public Item_attribute_valueFacadeREST() {
        super(Item_attribute_value.class);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML})
    public List<Item_attribute_value> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML})
    public List<Item_attribute_value> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
