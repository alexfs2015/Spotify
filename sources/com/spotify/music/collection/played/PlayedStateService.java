package com.spotify.music.collection.played;

import android.content.Intent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;
import java.util.HashMap;

public class PlayedStateService extends whu {
    public rwl a;
    public FireAndForgetResolver b;
    private ObjectMapper c;

    public PlayedStateService() {
        super("PlayedStateService");
    }

    private Request a(Intent intent) {
        try {
            return new Request(intent.getBooleanExtra("played", false) ? Request.DELETE : Request.POST, "sp://core-collection/unstable/unplayed", new HashMap(), this.c.writeValueAsString(new UpdateModel(intent.getStringArrayExtra("uris"))).getBytes(fbi.c));
        } catch (JsonProcessingException unused) {
            throw new AssertionError("Failed to serialize update model request.");
        }
    }

    public void onCreate() {
        super.onCreate();
        this.c = this.a.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("PlayedStateService.action.PLAYED".equals(action)) {
            this.b.resolve(a(intent));
            return;
        }
        StringBuilder sb = new StringBuilder("Unsupported action ");
        sb.append(action);
        sb.append(" in PlayedStateService.");
        throw new IllegalArgumentException(sb.toString());
    }
}
