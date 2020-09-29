package com.spotify.voice.api.model;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;
import com.spotify.voice.api.model.VoiceViewResponse.Custom.Restriction;

final class AutoValue_VoiceViewResponse_Custom extends C$AutoValue_VoiceViewResponse_Custom {
    private volatile transient Intent intent;

    AutoValue_VoiceViewResponse_Custom(String str, String str2, PlayerContext playerContext, Restriction restriction, String str3, String str4) {
        super(str, str2, playerContext, restriction, str3, str4);
    }

    public final Intent intent() {
        if (this.intent == null) {
            synchronized (this) {
                if (this.intent == null) {
                    this.intent = super.intent();
                    if (this.intent == null) {
                        throw new NullPointerException("intent() cannot return null");
                    }
                }
            }
        }
        return this.intent;
    }
}
