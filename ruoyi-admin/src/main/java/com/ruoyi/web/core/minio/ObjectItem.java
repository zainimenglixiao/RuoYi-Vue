package com.ruoyi.web.core.minio;

/**
 * @ClassName ObjectItem
 * @Description TODO
 * @Author 98518
 * @Date 2023/6/5 11:20
 * Version 1.0
 **/
import lombok.Data;

@Data
public class ObjectItem {
    private String objectName;
    private Long size;
}