package com.jun.gmall.gmallproduct;

import com.jun.gmall.product.dao.BrandDao;
import com.jun.gmall.product.entity.BrandEntity;
import com.jun.gmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallProductApplicationTests {
    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity entity = new BrandEntity();
        entity.setName("华为");
        entity.setDescript("华为");
        brandService.save(entity);
        System.out.println("保存成功.......");
    }

}
