package com.adjust.sdk;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;

public enum ActivityKind {
    UNKNOWN,
    SESSION,
    EVENT,
    CLICK,
    ATTRIBUTION,
    REVENUE,
    REATTRIBUTION,
    INFO,
    GDPR;

    public final String toString() {
        switch (this) {
            case SESSION:
                return "session";
            case EVENT:
                return "event";
            case CLICK:
                return "click";
            case ATTRIBUTION:
                return "attribution";
            case INFO:
                return LogMessage.SEVERITY_INFO;
            case GDPR:
                return "gdpr";
            default:
                return "unknown";
        }
    }
}
