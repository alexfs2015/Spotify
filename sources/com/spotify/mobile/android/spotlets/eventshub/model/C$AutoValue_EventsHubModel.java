package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_EventsHubModel reason: invalid class name */
abstract class C$AutoValue_EventsHubModel extends EventsHubModel {
    private final List<EventResult> events;
    private final String headerImageUri;
    private final String userLocation;

    C$AutoValue_EventsHubModel(List<EventResult> list, String str, String str2) {
        if (list != null) {
            this.events = list;
            this.headerImageUri = str;
            this.userLocation = str2;
            return;
        }
        throw new NullPointerException("Null events");
    }

    @JsonProperty("events")
    public List<EventResult> getEvents() {
        return this.events;
    }

    @JsonProperty("headerImageUri")
    public String getHeaderImageUri() {
        return this.headerImageUri;
    }

    @JsonProperty("userLocation")
    public String getUserLocation() {
        return this.userLocation;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EventsHubModel{events=");
        sb.append(this.events);
        sb.append(", headerImageUri=");
        sb.append(this.headerImageUri);
        sb.append(", userLocation=");
        sb.append(this.userLocation);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventsHubModel) {
            EventsHubModel eventsHubModel = (EventsHubModel) obj;
            if (this.events.equals(eventsHubModel.getEvents())) {
                String str = this.headerImageUri;
                if (str != null ? str.equals(eventsHubModel.getHeaderImageUri()) : eventsHubModel.getHeaderImageUri() == null) {
                    String str2 = this.userLocation;
                    return str2 != null ? str2.equals(eventsHubModel.getUserLocation()) : eventsHubModel.getUserLocation() == null;
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (this.events.hashCode() ^ 1000003) * 1000003;
        String str = this.headerImageUri;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.userLocation;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }
}
