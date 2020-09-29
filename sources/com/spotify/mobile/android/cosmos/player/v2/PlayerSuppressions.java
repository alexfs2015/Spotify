package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerSuppressions implements Parcelable, JacksonModel {
    public static final Creator<PlayerSuppressions> CREATOR = new Creator<PlayerSuppressions>() {
        public final PlayerSuppressions createFromParcel(Parcel parcel) {
            return new PlayerSuppressions(parcel);
        }

        public final PlayerSuppressions[] newArray(int i) {
            return new PlayerSuppressions[i];
        }
    };
    @JsonProperty("providers")
    private final Set<String> mProviders;

    public int describeContents() {
        return 0;
    }

    @JsonCreator
    public PlayerSuppressions(@JsonProperty("providers") Set<String> set) {
        if (set == null || set.isEmpty()) {
            this.mProviders = Collections.unmodifiableSet(Collections.emptySet());
        } else {
            this.mProviders = Collections.unmodifiableSet(set);
        }
    }

    public Set<String> providers() {
        return this.mProviders;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerSuppressions)) {
            return false;
        }
        return this.mProviders.equals(((PlayerSuppressions) obj).mProviders);
    }

    public int hashCode() {
        return this.mProviders.hashCode();
    }

    protected PlayerSuppressions(Parcel parcel) {
        this.mProviders = jse.b(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        jse.a(parcel, this.mProviders);
    }

    public static PlayerSuppressions empty() {
        return new PlayerSuppressions(Collections.emptySet());
    }
}
