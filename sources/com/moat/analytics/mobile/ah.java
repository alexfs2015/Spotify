package com.moat.analytics.mobile;

import android.media.MediaPlayer;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

class ah extends m<MediaPlayer> implements NativeVideoTracker {
    public ah(String str, a aVar, ap apVar) {
        super(str, aVar, apVar);
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> a() {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f.get();
        HashMap hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(mediaPlayer.getVideoWidth()));
        hashMap.put("height", Integer.valueOf(mediaPlayer.getVideoHeight()));
        hashMap.put("duration", Integer.valueOf(mediaPlayer.getDuration()));
        return hashMap;
    }

    public void changeTargetView(View view) {
        super.changeTargetView(view);
    }

    /* access modifiers changed from: protected */
    public Integer g() {
        return Integer.valueOf(((MediaPlayer) this.f.get()).getCurrentPosition());
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return ((MediaPlayer) this.f.get()).isPlaying();
    }

    /* access modifiers changed from: protected */
    public Integer i() {
        return Integer.valueOf(((MediaPlayer) this.f.get()).getDuration());
    }

    /* renamed from: trackVideoAd */
    public boolean a(Map<String, String> map, MediaPlayer mediaPlayer, View view) {
        if (mediaPlayer == null) {
            a("Null player instance. Not tracking.");
        }
        try {
            mediaPlayer.getCurrentPosition();
            return super.a(map, mediaPlayer, view);
        } catch (IllegalStateException unused) {
            a("Playback has already completed. Not tracking.");
            return false;
        }
    }
}
