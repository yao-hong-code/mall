package com.edu.mall.third;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * TODO
 *
 * @author yaoh
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MallThirdPartyApplicationTest {

    @Autowired
    OSSClient ossClient;

    @Test
    public void upload() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(new File("/Users/yaoh/demo.txt"));
        PutObjectResult putObjectResult = ossClient.putObject("yao-hong", "demo.txt", fileInputStream);
    }
}
