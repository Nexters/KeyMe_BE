package com.nexters.keyme.domain.member.domain.exceptions;

import com.nexters.keyme.domain.member.domain.exceptions.code.MemberErrorCode;
import com.nexters.keyme.global.exceptions.KeymeSuccessInfoException;

public class NicknameTooLongException extends KeymeSuccessInfoException {
    public NicknameTooLongException() {
        super(MemberErrorCode.NICKNAME_TOO_LONG.getMessage(), MemberErrorCode.NICKNAME_TOO_LONG.getCode());
    }
}
