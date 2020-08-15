package com.yanle.i18nplatform.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author yanle
 * @since 2020-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Project implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目负责人id
     */
    private Long principalId;

    /**
     * 项目描述
     */
    private String description;

    /**
     * 项目状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 逻辑删除标识(0.未删除,1.已删除)
     */
    private Integer deleted;


}
