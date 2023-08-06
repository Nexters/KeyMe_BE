package com.nexters.keyme.test.presentation.dto.response;

import com.nexters.keyme.question.presentation.dto.response.QuestionSolvedResponse;
import com.nexters.keyme.question.presentation.dto.response.QuestionWithCoordinateResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@ApiModel(value = "Test 결과 응답객체")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestResultResponse {
    private Long testResultId;
    private Long testId;

    @ApiModelProperty(value = "테스트 출제자와의 일치율(MMVP에서는 없음)", example = "87.7")
    private float matchRate;

    @ApiModelProperty(value = "테스트를 푼 친구들의 수(본인제외)", example = "14")
    private int solvedCount;
    private List<QuestionSolvedResponse> results;
}
