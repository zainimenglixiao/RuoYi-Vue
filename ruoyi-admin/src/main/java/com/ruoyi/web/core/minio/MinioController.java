package com.ruoyi.web.core.minio;

/**
 * @ClassName MinioController
 * @Description TODO
 * @Author 98518
 * @Date 2023/6/5 11:23
 * Version 1.0
 **/
import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.web.core.minio.MinioUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Anonymous
@RestController
@Slf4j
public class MinioController {
    @Autowired
    private MinioUtils minioUtils;
    @Value("${minio.endpoint}")
    private String address;
    @Value("${minio.bucketName}")
    private String bucketName;

    @PostMapping("/upload")
    public Object upload(MultipartFile file) {

        List<String> upload = minioUtils.upload(new MultipartFile[]{file});

        return address + "/" + bucketName + "/" + upload.get(0);
    }

}


