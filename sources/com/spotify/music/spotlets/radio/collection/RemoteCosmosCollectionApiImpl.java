package com.spotify.music.spotlets.radio.collection;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Collections;

public final class RemoteCosmosCollectionApiImpl implements urk {
    private final FireAndForgetResolver a;
    private final ObjectMapper b;

    static class Items implements JacksonModel {
        public final String contextSource;
        public final String[] items;
        public final String source;

        public Items(String[] strArr, String str, String str2) {
            this.items = strArr;
            this.contextSource = str;
            this.source = str2;
        }
    }

    public RemoteCosmosCollectionApiImpl(FireAndForgetResolver fireAndForgetResolver, ObjectMapper objectMapper) {
        this.a = fireAndForgetResolver;
        this.b = objectMapper;
    }

    private void a(String str, String str2, String str3, boolean z) {
        try {
            this.a.resolve(new Request(z ? Request.POST : Request.DELETE, "sp://core-collection/v1/items", Collections.emptyMap(), this.b.writeValueAsString(new Items(new String[]{str}, str2, str3)).getBytes(fbi.c)));
        } catch (JsonProcessingException e) {
            Logger.e(e, "Failed to serialize json for following/unfollowing artist.", new Object[0]);
        }
    }

    public final void a(PlayerTrack playerTrack, String str, String str2) {
        if (!Boolean.parseBoolean((String) playerTrack.metadata().get("collection.in_collection"))) {
            a(playerTrack.uri(), str, str2, true);
        }
    }

    public final void b(PlayerTrack playerTrack, String str, String str2) {
        if (Boolean.parseBoolean((String) playerTrack.metadata().get("collection.in_collection"))) {
            a(playerTrack.uri(), str, str2, false);
        }
    }
}
