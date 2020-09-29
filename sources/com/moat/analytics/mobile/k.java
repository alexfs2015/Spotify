package com.moat.analytics.mobile;

import android.view.View;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.ExoPlayer;
import com.google.android.exoplayer.ExoPlayer.Listener;
import com.moat.analytics.mobile.base.exception.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class k extends m<ExoPlayer> implements Listener, ExoVideoTracker {
    private int o;
    private int p = -1;
    private boolean q = false;

    public k(String str, a aVar, ap apVar) {
        super(str, aVar, apVar);
    }

    private void k() {
        this.q = true;
        super.a(this.e, this.f.get(), (View) this.g.get());
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> a() {
        int i;
        HashMap hashMap = new HashMap();
        View view = (View) this.g.get();
        int i2 = 0;
        if (view != null) {
            i2 = view.getWidth();
            i = view.getHeight();
        } else {
            i = 0;
        }
        hashMap.put("width", Integer.valueOf(i2));
        hashMap.put("height", Integer.valueOf(i));
        hashMap.put("duration", i());
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public void c() {
        ExoPlayer exoPlayer = (ExoPlayer) this.f.get();
        if (exoPlayer != null) {
            exoPlayer.removeListener(this);
        }
        super.c();
    }

    public void changeTargetView(View view) {
        super.changeTargetView(view);
    }

    public /* bridge */ /* synthetic */ void dispatchEvent(MoatAdEvent moatAdEvent) {
        super.dispatchEvent(moatAdEvent);
    }

    public /* bridge */ /* synthetic */ void dispatchEvent(Map map) {
        super.dispatchEvent(map);
    }

    /* access modifiers changed from: protected */
    public boolean f() {
        boolean f = super.f();
        this.p = g().intValue();
        return f;
    }

    /* access modifiers changed from: protected */
    public Integer g() {
        return Integer.valueOf(Long.valueOf(((ExoPlayer) this.f.get()).getCurrentPosition()).intValue());
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return this.o != 3 && (!(j() != o.a) || Math.abs(g().intValue() - this.p) >= 100);
    }

    /* access modifiers changed from: protected */
    public Integer i() {
        return Integer.valueOf(Long.valueOf(((ExoPlayer) this.f.get()).getDuration()).intValue());
    }

    public void onPlayWhenReadyCommitted() {
    }

    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        a("received player error");
        new HashMap();
        dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_STOPPED, Integer.valueOf(this.p)));
    }

    public void onPlayerStateChanged(boolean z, int i) {
        a(String.format("updated state from player: %d", new Object[]{Integer.valueOf(i)}));
        if (i == 3 || i == 4) {
            if (!this.q) {
                a("player ready to play; starting tracking");
                k();
            }
        } else if (i == 5) {
            a("playback completed");
            dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_COMPLETE, Integer.valueOf(this.n)));
        }
        this.o = i;
    }

    public /* bridge */ /* synthetic */ void setDebug(boolean z) {
        super.setDebug(z);
    }

    /* renamed from: trackVideoAd */
    public boolean a(Map<String, String> map, ExoPlayer exoPlayer, View view) {
        this.e = map;
        this.f = new WeakReference(exoPlayer);
        this.g = new WeakReference(view);
        try {
            exoPlayer.addListener(this);
            int playbackState = exoPlayer.getPlaybackState();
            if (!this.q && (playbackState == 3 || playbackState == 4)) {
                a("player might already be playing. start tracking it right away.");
                k();
            }
            return true;
        } catch (Exception e) {
            a.a(e);
            return false;
        }
    }
}
