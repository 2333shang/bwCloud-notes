package com.bwhs.cloud.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BasicTimeEntity extends IDEntity<Integer> {

    /**
     * 创建时间
     */
    private LocalDateTime createdDate;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 更新时间
     */
    private LocalDateTime modifiedDate;

    /**
     * 更新人
     */
    private String modifiedBy;
}
