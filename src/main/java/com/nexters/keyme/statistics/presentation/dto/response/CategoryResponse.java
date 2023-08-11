package com.nexters.keyme.statistics.presentation.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CategoryResponse {
    @ApiModelProperty(value="카테고리명", example = "정의로움")
    private final String name;
    @ApiModelProperty(value="색상 코드(그라데이션 시작)", example = "11ACFF")
    private final String startColor;
    @ApiModelProperty(value="색상 코드(그라데이션 끝)", example = "11ACFF")
    private final String endColor;
    @ApiModelProperty(value="아이콘 URL", example = "icon URL")
    private final String iconUrl;
}
