package com.nexters.keyme.test.presentation.dto.response;

import com.nexters.keyme.member.domain.model.MemberEntity;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "Test 객체 내 프로필 정보")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestSimpleMemberResponse {
    private Long id;
    private String nickname;
    private String profileThumbnail;

    public TestSimpleMemberResponse(MemberEntity member) {
        this.id = member.getId();
        this.nickname = member.getNickname();
        this.profileThumbnail = member.getProfileImage().getThumbnailUrl();
    }
}