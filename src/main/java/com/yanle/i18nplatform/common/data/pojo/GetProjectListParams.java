package com.yanle.i18nplatform.common.data.pojo;

import lombok.Data;

@Data
public class GetProjectListParams {
    private String query;
    private Integer page;
    private Integer pageSize;
}
