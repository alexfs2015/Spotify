package com.spotify.music.spotlets.tracker.iterable.model;

import java.util.Map;

final class AutoValue_PushTrackingEvent extends PushTrackingEvent {
    private final String environment;
    private final Map<String, ?> eventData;
    private final String eventName;
    private final String platform;

    AutoValue_PushTrackingEvent(String str, String str2, String str3, Map<String, ?> map) {
        if (str != null) {
            this.eventName = str;
            if (str2 != null) {
                this.platform = str2;
                if (str3 != null) {
                    this.environment = str3;
                    if (map != null) {
                        this.eventData = map;
                        return;
                    }
                    throw new NullPointerException("Null eventData");
                }
                throw new NullPointerException("Null environment");
            }
            throw new NullPointerException("Null platform");
        }
        throw new NullPointerException("Null eventName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PushTrackingEvent) {
            PushTrackingEvent pushTrackingEvent = (PushTrackingEvent) obj;
            return this.eventName.equals(pushTrackingEvent.getEventName()) && this.platform.equals(pushTrackingEvent.getPlatform()) && this.environment.equals(pushTrackingEvent.getEnvironment()) && this.eventData.equals(pushTrackingEvent.getEventData());
        }
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final Map<String, ?> getEventData() {
        return this.eventData;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final int hashCode() {
        return ((((((this.eventName.hashCode() ^ 1000003) * 1000003) ^ this.platform.hashCode()) * 1000003) ^ this.environment.hashCode()) * 1000003) ^ this.eventData.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushTrackingEvent{eventName=");
        sb.append(this.eventName);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", environment=");
        sb.append(this.environment);
        sb.append(", eventData=");
        sb.append(this.eventData);
        sb.append("}");
        return sb.toString();
    }
}
