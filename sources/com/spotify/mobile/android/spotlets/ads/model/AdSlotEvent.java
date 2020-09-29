package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AdSlotEvent implements Parcelable, JacksonModel {

    public enum Event implements JacksonModel {
        AVAILABLE("available"),
        DISCARD("discard"),
        PLAY("play"),
        DISPLAY("display"),
        UNKNOWN("unknown");
        
        private static final Map<String, Event> sNameMap = null;
        private final String mName;

        static {
            sNameMap = new HashMap();
            Iterator it = EnumSet.allOf(Event.class).iterator();
            while (it.hasNext()) {
                Event event = (Event) it.next();
                sNameMap.put(event.getName(), event);
            }
        }

        private Event(String str) {
            this.mName = str;
        }

        public static Event getByName(String str) {
            return (Event) sNameMap.get(str);
        }

        public final String getName() {
            return this.mName;
        }
    }

    @JsonCreator
    public static AdSlotEvent create(@JsonProperty("event") String str, @JsonProperty("format") String str2, @JsonProperty("ad") Ad ad) {
        return new AutoValue_AdSlotEvent(str, str2, ad);
    }

    @JsonProperty("ad")
    public abstract Ad getAd();

    public Event getEvent() {
        return Event.getByName(getEventString());
    }

    @JsonProperty("event")
    public abstract String getEventString();

    public Format getFormat() {
        return Format.getByName(getFormatString());
    }

    @JsonProperty("format")
    public abstract String getFormatString();
}
