package com.spotify.instrumentation;

public enum InteractionType {
    LONG_PRESS("long-press"),
    TAP("tap"),
    UNKNOWN("unknown");
    
    public final String mInteractionType;

    private InteractionType(String str) {
        this.mInteractionType = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{interactionType='");
        sb.append(this.mInteractionType);
        sb.append("'}");
        return sb.toString();
    }
}
