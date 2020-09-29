package com.spotify.music.behindthelyrics.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;

public class BehindTheLyricsResourcesAndTracksFetcher extends fn {
    public ksk b;

    public static void a(Context context) {
        a(context, BehindTheLyricsResourcesAndTracksFetcher.class, 2314, new Intent());
    }

    public void onCreate() {
        vtj.a((Service) this);
        super.onCreate();
    }

    public final void a(Intent intent) {
        this.b.run();
    }
}
