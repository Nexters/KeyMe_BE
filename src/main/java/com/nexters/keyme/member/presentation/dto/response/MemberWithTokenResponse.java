package com.nexters.keyme.member.presentation.dto.response;

import com.nexters.keyme.auth.presentation.dto.response.TokenResponse;
import com.nexters.keyme.member.domain.model.MemberEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Builder
public class MemberWithTokenResponse {
    @NotNull
    @ApiModelProperty(value="유저 고유 ID", example = "22")
    private Long id;
    @NotNull
    @ApiModelProperty(value="닉네임")
    private String nickname;
    @NotNull
    @ApiModelProperty(value="친구코드", example = "A1C1FFC")
    private String friendCode;
    @ApiModelProperty(value="프로필 원본 이미지 URL", example = "original URL")
    private String profileImage;
    @ApiModelProperty(value="프로필 섬네일 이미지 URL", example = "thumbnail URL")
    private String profileTumbnail;
    @ApiModelProperty(value="JWT 토큰")
    private TokenResponse token;

    public MemberWithTokenResponse(MemberEntity member) {
        this.id = member.getId();
    }
}
