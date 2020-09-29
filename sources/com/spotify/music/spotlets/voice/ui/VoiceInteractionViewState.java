package com.spotify.music.spotlets.voice.ui;

public enum VoiceInteractionViewState {
    INTERACTION,
    ASSISTANT,
    NO_PERMISSIONS,
    FLAG_DISABLED,
    CONNECTION_ERROR,
    APP_ERROR,
    TOO_MUCH_SILENCE,
    SPEECH_RECOGNITION_FAIL,
    DID_NOT_UNDERSTAND,
    OFFLINE,
    SERVER_PROVIDED_ERROR,
    FINISH
}
