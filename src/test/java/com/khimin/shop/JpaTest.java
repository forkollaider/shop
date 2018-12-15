package com.khimin.shop;

import com.khimin.shop.models.Product;
import com.khimin.shop.models.Role;
import com.khimin.shop.models.User;
import com.khimin.shop.repositories.ProductRepository;
import com.khimin.shop.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by tikhon on 11/7/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    UserRepository userRepository;

    @Test
    public void readsFirstPageCorrectly() {
        Page<Product> persons = productRepository.findAll(new PageRequest(0, 10));
        assertThat(persons.isFirst(), is(true));
    }

    @Test
    public void testUserOpertation() {
        User tikhon = new User("us","us@gmail.com","123456", Role.ADMIN,true);
        userRepository.save(tikhon);
        User user =userRepository.findByUsername("us");
        assertEquals(tikhon, user);

    }
    @Test
    public void testProductOperation(){
        Product product = new Product(1,"v","bto",50,"boot.png");
        productRepository.save(product);
        assertEquals(product, productRepository.findOne(product.getId()));

    }
}


