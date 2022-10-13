
package restFULServer;

import entities.Item_category;
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
@Path("item_category")
public class Item_categoryFacadeREST extends AbstractFacade<Item_category> {

    private static final Logger LOGGER = Logger.getLogger(Item_attributeFacadeREST.class.getName());

    @PersistenceContext(unitName = "FullWatPU")
    private EntityManager em;

    public Item_categoryFacadeREST() {
        super(Item_category.class);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML})
    public List<Item_category> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML})
    public List<Item_category> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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

    public Item_categoryFacadeREST(EntityManager em, Class<Item_category> entityClass) {
        super(entityClass);
        this.em = em;
    }
    
}

