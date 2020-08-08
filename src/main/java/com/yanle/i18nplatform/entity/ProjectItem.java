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
 * @since 2020-08-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ProjectItem implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 模块名称
     */
    private String moduleName;

    /**
     * 模块key
     */
    private String itemKey;

    /**
     * 描述
     */
    private String description;

    /**
     * 修改人id
     */
    private Long updateId;

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
