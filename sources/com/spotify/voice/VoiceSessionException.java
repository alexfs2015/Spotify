package com.spotify.voice;

import com.spotify.voice.model.ErrorDomain;

public class VoiceSessionException extends RuntimeException {
    private static final long serialVersionUID = 4088378030146328887L;
    public final ErrorDomain mDomain;
    public final String mErrorType;

    public VoiceSessionException(ErrorDomain errorDomain, vrd vrd, Throwable th) {
        super(th);
        this.mDomain = errorDomain;
        this.mErrorType = vrd.a();
    }

    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder("Domain: ");
        sb.append(this.mDomain);
        sb.append(", Type: ");
        sb.append(this.mErrorType);
        sb.append(", Cause: ");
        sb.append(message);
        return sb.toString();
    }
}
