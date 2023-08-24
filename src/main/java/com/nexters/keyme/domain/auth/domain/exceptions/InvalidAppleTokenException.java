package com.nexters.keyme.domain.auth.domain.exceptions;

import com.nexters.keyme.domain.auth.domain.exceptions.code.AuthErrorCode;
import com.nexters.keyme.global.common.exceptions.KeymeBadRequestException;

public class InvalidAppleTokenException extends KeymeBadRequestException {
    public InvalidAppleTokenException() {
        super(AuthErrorCode.INVALID_APPLE_TOKEN.getMessage(), AuthErrorCode.INVALID_APPLE_TOKEN.getCode());
    }
}
