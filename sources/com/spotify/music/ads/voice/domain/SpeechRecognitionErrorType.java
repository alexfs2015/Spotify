package com.spotify.music.ads.voice.domain;

public enum SpeechRecognitionErrorType {
    NULL("Null response"),
    NO_RESPONSE("No response"),
    VOICE_SESSION_FAILURE("Voice session failure"),
    UNEXPECTED("Unexpected response");
    
    public final String mMessage;

    private SpeechRecognitionErrorType(String str) {
        this.mMessage = str;
    }
}
