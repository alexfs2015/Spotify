package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class EventsHubModel implements Parcelable, JacksonModel {
    public static final EventsHubModel EMPTY = create(new ArrayList(), null, null);

    static final class a extends vba<EventResult> {
        protected a() {
            super(EventsHubModel.getEventResultCreator());
        }
    }

    @JsonCreator
    public static EventsHubModel create(@JsonProperty("events") List<EventResult> list, @JsonProperty("headerImageUri") String str, @JsonProperty("userLocation") String str2) {
        return new AutoValue_EventsHubModel(gcn.a(list), str, str2);
    }

    /* access modifiers changed from: private */
    public static Creator<? extends EventResult> getEventResultCreator() {
        return AutoValue_EventResult.CREATOR;
    }

    @JsonProperty("events")
    public abstract List<EventResult> getEvents();

    @JsonProperty("headerImageUri")
    public abstract String getHeaderImageUri();

    @JsonIgnore
    public int getNumberOfConcerts() {
        List<EventResult> events = getEvents();
        int i = 0;
        if (events.isEmpty()) {
            return 0;
        }
        for (EventResult concertResults : events) {
            for (ConcertResult concertResult : concertResults.getConcertResults()) {
                if (concertResult != null) {
                    i++;
                }
            }
        }
        return i;
    }

    @JsonProperty("userLocation")
    public abstract String getUserLocation();
}
