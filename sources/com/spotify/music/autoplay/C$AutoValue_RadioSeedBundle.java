package com.spotify.music.autoplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;

/* renamed from: com.spotify.music.autoplay.$AutoValue_RadioSeedBundle reason: invalid class name */
abstract class C$AutoValue_RadioSeedBundle extends RadioSeedBundle {
    private final PlayOrigin playOrigin;
    private final String playbackId;
    private final String radioSeed;

    C$AutoValue_RadioSeedBundle(String str, String str2, PlayOrigin playOrigin2) {
        if (str != null) {
            this.radioSeed = str;
            if (str2 != null) {
                this.playbackId = str2;
                if (playOrigin2 != null) {
                    this.playOrigin = playOrigin2;
                    return;
                }
                throw new NullPointerException("Null playOrigin");
            }
            throw new NullPointerException("Null playbackId");
        }
        throw new NullPointerException("Null radioSeed");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RadioSeedBundle) {
            RadioSeedBundle radioSeedBundle = (RadioSeedBundle) obj;
            return this.radioSeed.equals(radioSeedBundle.getRadioSeed()) && this.playbackId.equals(radioSeedBundle.getPlaybackId()) && this.playOrigin.equals(radioSeedBundle.getPlayOrigin());
        }
    }

    @JsonProperty("play_origin")
    public PlayOrigin getPlayOrigin() {
        return this.playOrigin;
    }

    @JsonProperty("playback_id")
    public String getPlaybackId() {
        return this.playbackId;
    }

    @JsonProperty("radio_seed")
    public String getRadioSeed() {
        return this.radioSeed;
    }

    public int hashCode() {
        return ((((this.radioSeed.hashCode() ^ 1000003) * 1000003) ^ this.playbackId.hashCode()) * 1000003) ^ this.playOrigin.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RadioSeedBundle{radioSeed=");
        sb.append(this.radioSeed);
        sb.append(", playbackId=");
        sb.append(this.playbackId);
        sb.append(", playOrigin=");
        sb.append(this.playOrigin);
        sb.append("}");
        return sb.toString();
    }
}
