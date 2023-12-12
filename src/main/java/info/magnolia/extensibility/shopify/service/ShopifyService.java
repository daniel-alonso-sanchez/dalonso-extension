
package info.magnolia.extensibility.shopify.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ShopifyService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    public String getItems() {
        return "ola ke ase";
    }

}
