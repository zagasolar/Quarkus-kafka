package com.hari;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.hibernate.orm.panache.Panache;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class OrderController {

    @Inject
    public OrderRepo orderRepo;

    @Inject
    public OrderService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @POST
    @Path("/getOrderAndProduce")
    @Transactional
    public Order orderPlaced(Order order) throws InterruptedException {
        Order newOrder = Panache.getEntityManager().merge(order);
        orderRepo.persist(newOrder);
        if (newOrder.isPersistent()) {
            service.sendOrder(newOrder);
        }
        return order;
    }
}