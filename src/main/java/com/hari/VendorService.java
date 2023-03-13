package com.hari;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import io.quarkus.hibernate.orm.panache.Panache;

// @ApplicationScoped
public class VendorService {

   @Inject
   public VendorRepo vendorRepo;

   public String vendorConfirmation(VendorConfirmation vendorData) {
      VendorConfirmation newVendor = Panache.getEntityManager().merge(vendorData);
      vendorRepo.persist(newVendor);
      return "successfully";
   }

}
