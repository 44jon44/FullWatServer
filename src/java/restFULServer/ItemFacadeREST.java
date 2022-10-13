/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restFULServer;

import entities.Item;
import java.util.List;
import java.util.logging.Level;
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
@Path("producto")
public class ItemFacadeREST extends AbstractFacade<Item> {

    private static final Logger LOGGER = Logger.getLogger(ItemFacadeREST.class.getName());

    @PersistenceContext(unitName = "FullWatPU")
    private EntityManager em;

    public ItemFacadeREST() {
        super(Item.class);
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML})
    public List<Item> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML})
    public List<Item> findAll() {
        return super.findAll();
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @GET
    @Path("items")
    @Produces({"application/xml"})
    public List<Item> findAllItems() {
        List<Item> items = null;
       
            LOGGER.log(Level.INFO, "UserRESTful service: find departments for users.");
            items = em.createNamedQuery("findAllItems")
                    .getResultList();
        
        return items;
    }
}
