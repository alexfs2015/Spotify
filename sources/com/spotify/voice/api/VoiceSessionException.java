package com.spotify.voice.api;

import com.spotify.voice.api.model.ErrorDomain;
import java.util.Arrays;

public class VoiceSessionException extends RuntimeException {
    private static final long serialVersionUID = 4088378030146328887L;
    public final ErrorDomain mDomain;
    public final String mErrorType;

    public VoiceSessionException(ErrorDomain errorDomain, wel wel, Throwable th) {
        super(th);
        this.mDomain = errorDomain;
        this.mErrorType = wel.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceSessionException)) {
            return false;
        }
        VoiceSessionException voiceSessionException = (VoiceSessionException) obj;
        return fbn.a(this.mErrorType, voiceSessionException.mErrorType) && this.mDomain == voiceSessionException.mDomain;
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

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mErrorType, this.mDomain});
    }
}
