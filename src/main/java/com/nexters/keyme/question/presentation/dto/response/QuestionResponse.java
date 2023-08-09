package com.nexters.keyme.question.presentation.dto.response;

import com.nexters.keyme.question.domain.model.Question;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@ApiModel(value = "Question 정보 응답객체")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class QuestionResponse {
    private Long questionId;
    @ApiModelProperty(value = "질문 내용", example = "불의를 보면 참지 않는다")
    private String description;

    @ApiModelProperty(value = "질문 내용을 한 단어로 축약 표현", example = "참군인")
    private String keyword;

    @ApiModelProperty(value = "질문의 가테고리", example = "영웅적 면모")
    private QuestionCategoryResponse category;

    public QuestionResponse(Question question) {
        this.questionId = question.getQuestionId();
        this.description = question.getDescription();
        this.keyword = question.getKeyword();
        this.category = new QuestionCategoryResponse(question.getCategoryName());
    }
}
