package com.edu.mall.product;

import com.edu.mall.product.entity.BrandEntity;
import com.edu.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * test
 *
 * @author yaoh
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTest {

    @Autowired
    private BrandService brandService;

    @Test
    public void addBrand() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("美国华为");
        brandService.save(brandEntity);
    }
}
