package com.nexters.keyme.member.domain.repository;

import com.nexters.keyme.member.domain.model.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

    Optional<MemberEntity> findByNickname(String nickname);

    Optional<MemberEntity> findByInviteCode(String inviteCode);
}
