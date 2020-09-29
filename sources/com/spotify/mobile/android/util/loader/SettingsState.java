package com.spotify.mobile.android.util.loader;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonDeserialize(using = SettingsState_Deserializer.class)
public abstract class SettingsState implements JacksonModel {

    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(String str);

        public abstract a a(boolean z);

        public abstract SettingsState a();

        public abstract a b(int i);

        public abstract a b(String str);

        public abstract a b(boolean z);

        public abstract a c(int i);

        public abstract a c(boolean z);

        public abstract a d(int i);

        public abstract a d(boolean z);

        public abstract a e(int i);

        public abstract a e(boolean z);

        public abstract a f(boolean z);

        public abstract a g(boolean z);

        public abstract a h(boolean z);

        public abstract a i(boolean z);

        public abstract a j(boolean z);
    }

    public abstract String accessPoint();

    public abstract boolean automix();

    public abstract boolean crossfade();

    public abstract int crossfadeTimeSeconds();

    public abstract boolean downloadOver3g();

    public abstract int downloadQuality();

    public abstract boolean facebookConnected();

    public abstract boolean gapless();

    public abstract boolean localDevicesOnly();

    public abstract int loudnessEnvironment();

    public abstract boolean normalize();

    public abstract boolean offlineMode();

    public abstract boolean playExplicitContent();

    public abstract boolean privateSession();

    public abstract int secondsToOfflineExpiry();

    public abstract boolean showUnavailableTracks();

    public abstract int streamQuality();

    public abstract String webgateUrl();

    @JsonCreator
    public static SettingsState create(@JsonProperty("offline_mode") boolean z, @JsonProperty("play_explicit_content") boolean z2, @JsonProperty("private_session") boolean z3, @JsonProperty("download_over_3g") boolean z4, @JsonProperty("download_quality") int i, @JsonProperty("stream_quality") int i2, @JsonProperty("ap") String str, @JsonProperty("facebook_connected") boolean z5, @JsonProperty("seconds_to_offline_expiry") int i3, @JsonProperty("gapless") boolean z6, @JsonProperty("automix") boolean z7, @JsonProperty("normalize") boolean z8, @JsonProperty("loudness_environment") int i4, @JsonProperty("crossfade") boolean z9, @JsonProperty("crossfade_time_seconds") int i5, @JsonProperty("show_unavailable_tracks") boolean z10, @JsonProperty("local_devices_only") boolean z11, @JsonProperty("webgate_url") String str2) {
        a aVar = new a();
        aVar.a = Boolean.valueOf(z);
        boolean z12 = z2;
        boolean z13 = z3;
        boolean z14 = z4;
        int i6 = i;
        int i7 = i2;
        String str3 = str;
        boolean z15 = z5;
        int i8 = i3;
        boolean z16 = z6;
        boolean z17 = z7;
        boolean z18 = z8;
        int i9 = i4;
        boolean z19 = z9;
        return aVar.a(z2).b(z3).c(z4).a(i).b(i2).a(str).d(z5).c(i3).e(z6).f(z7).g(z8).d(i4).h(z9).e(i5).i(z10).j(z11).b(str2).a();
    }
}
