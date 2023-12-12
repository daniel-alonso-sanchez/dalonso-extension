/*
 * This file Copyright (c) 2023 Magnolia International
 * Ltd.  (http://www.magnolia-cms.com). All rights reserved.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Magnolia Network Agreement
 * which accompanies this distribution, and is available at
 * http://www.magnolia-cms.com/mna.html
 *
 * Any modifications to this file must keep this entire header
 * intact.
 *
 */

package info.magnolia.extensibility.shopify.endpoints;


import info.magnolia.extensibility.shopify.service.ShopifyService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/hello")
public class DummyEndpoint {

    private ShopifyService shopifyService;

    public DummyEndpoint(ShopifyService shopifyService) {
        this.shopifyService = shopifyService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getItems() {
        return shopifyService.getItems();
    }
}


