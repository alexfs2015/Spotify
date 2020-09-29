package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.voice.api.model.VoiceViewResponse.Custom;
import com.spotify.voice.api.model.VoiceViewResponse.Custom.Restriction;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceViewResponse_Custom reason: invalid class name */
abstract class C$AutoValue_VoiceViewResponse_Custom extends Custom {
    private final String error;
    private final String friendlyError;
    private final PlayerContext playerContext;
    private final String query;
    private final String rawIntent;
    private final Restriction restriction;

    C$AutoValue_VoiceViewResponse_Custom(String str, String str2, PlayerContext playerContext2, Restriction restriction2, String str3, String str4) {
        this.rawIntent = str;
        this.query = str2;
        this.playerContext = playerContext2;
        this.restriction = restriction2;
        this.friendlyError = str3;
        this.error = str4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Custom) {
            Custom custom = (Custom) obj;
            String str = this.rawIntent;
            if (str != null ? str.equals(custom.rawIntent()) : custom.rawIntent() == null) {
                String str2 = this.query;
                if (str2 != null ? str2.equals(custom.query()) : custom.query() == null) {
                    PlayerContext playerContext2 = this.playerContext;
                    if (playerContext2 != null ? playerContext2.equals(custom.playerContext()) : custom.playerContext() == null) {
                        Restriction restriction2 = this.restriction;
                        if (restriction2 != null ? restriction2.equals(custom.restriction()) : custom.restriction() == null) {
                            String str3 = this.friendlyError;
                            if (str3 != null ? str3.equals(custom.friendlyError()) : custom.friendlyError() == null) {
                                String str4 = this.error;
                                return str4 != null ? str4.equals(custom.error()) : custom.error() == null;
                            }
                        }
                    }
                }
            }
        }
    }

    @JsonProperty("error")
    public String error() {
        return this.error;
    }

    @JsonProperty("friendlyError")
    public String friendlyError() {
        return this.friendlyError;
    }

    public int hashCode() {
        String str = this.rawIntent;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.query;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        PlayerContext playerContext2 = this.playerContext;
        int hashCode3 = (hashCode2 ^ (playerContext2 == null ? 0 : playerContext2.hashCode())) * 1000003;
        Restriction restriction2 = this.restriction;
        int hashCode4 = (hashCode3 ^ (restriction2 == null ? 0 : restriction2.hashCode())) * 1000003;
        String str3 = this.friendlyError;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.error;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 ^ i;
    }

    @JsonProperty("context")
    public PlayerContext playerContext() {
        return this.playerContext;
    }

    @JsonProperty("query")
    public String query() {
        return this.query;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("intent")
    public String rawIntent() {
        return this.rawIntent;
    }

    @JsonProperty("restriction")
    public Restriction restriction() {
        return this.restriction;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Custom{rawIntent=");
        sb.append(this.rawIntent);
        sb.append(", query=");
        sb.append(this.query);
        sb.append(", playerContext=");
        sb.append(this.playerContext);
        sb.append(", restriction=");
        sb.append(this.restriction);
        sb.append(", friendlyError=");
        sb.append(this.friendlyError);
        sb.append(", error=");
        sb.append(this.error);
        sb.append("}");
        return sb.toString();
    }
}
