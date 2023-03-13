package com.hari;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

// @ApplicationScoped
public class VendorRepo implements PanacheRepository<VendorConfirmation> {

}
