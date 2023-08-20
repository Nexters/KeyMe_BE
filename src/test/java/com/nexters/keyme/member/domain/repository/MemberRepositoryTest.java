package com.nexters.keyme.member.domain.repository;

import com.nexters.keyme.domain.member.domain.repository.MemberRepository;
import com.nexters.keyme.global.exceptions.ResourceNotFoundException;
import com.nexters.keyme.domain.member.domain.model.MemberEntity;
import com.nexters.keyme.test.annotation.RepositoryTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@RepositoryTest
class MemberRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;

//    @BeforeEach
//    void beforeEach() {
//        MemberEntity member = MemberEntity.builder()
//                .id(1L)
//                .nickname("nick")
//                .friendCode("AZ03A20")
//                .build();
//
//        memberRepository.save(member);
//    }

    @Test
    @DisplayName("닉네임으로 멤버 엔티티 찾기 테스트")
    void findByNickname() {
        assertThatThrownBy(() -> {
            memberRepository.findByNickname("tom").orElseThrow(ResourceNotFoundException::new);
        }).isInstanceOf(ResourceNotFoundException.class);

        MemberEntity member = memberRepository.findByNickname("nick")
                .orElseThrow(ResourceNotFoundException::new);

        assertThat(member.getNickname()).isEqualTo("nick");
    }

    @Test
    @DisplayName("초대코드로 멤버 엔티티 찾기 테스트")
    void findByInviteCode() {
        assertThatThrownBy(() -> {
            memberRepository.findByFriendCode("ZXCVBNV").orElseThrow(ResourceNotFoundException::new);
        }).isInstanceOf(ResourceNotFoundException.class);

        MemberEntity member = memberRepository.findByFriendCode("1234567")
                .orElseThrow(ResourceNotFoundException::new);

        assertThat(member.getFriendCode()).isEqualTo("1234567");
    }
}