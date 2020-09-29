package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.R;
import com.spotify.music.features.widget.SpotifyWidget;
import com.spotify.music.libs.viewuri.ViewUris;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.util.Map;

/* renamed from: qzk reason: default package */
public final class qzk implements Callback {
    public Intent a;
    private final Service b;
    private Player c;
    /* access modifiers changed from: private */
    public Uri d;
    /* access modifiers changed from: private */
    public Bitmap e;
    /* access modifiers changed from: private */
    public final Handler f;
    private final Handler g = new Handler(Looper.getMainLooper());
    private final a h;
    /* access modifiers changed from: private */
    public final Object i = new Object();
    private final qzg j;
    private final PlayerFactory k;
    /* access modifiers changed from: private */
    public boolean l;
    private final PlayerStateObserver m = new PlayerStateObserver() {
        public final void onPlayerStateReceived(PlayerState playerState) {
            synchronized (qzk.this) {
                if (qzk.this.l) {
                    qzk.this.f.removeMessages(1001);
                    qzk.this.f.sendEmptyMessage(1001);
                }
            }
        }
    };

    /* renamed from: qzk$a */
    class a implements wgx {
        Uri a;

        private a() {
        }

        /* synthetic */ a(qzk qzk, byte b2) {
            this();
        }

        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fbp.a(!bitmap.isRecycled());
            synchronized (qzk.this.i) {
                if (this.a == null || !this.a.equals(qzk.this.d)) {
                    qzk.this.e = null;
                    if (qzk.this.l) {
                        qzk.this.f.sendEmptyMessage(1001);
                    }
                } else {
                    qzk.this.e = bitmap;
                }
                qzk.this.f();
            }
            fbp.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            synchronized (qzk.this.i) {
                qzk.this.f();
            }
        }

        public final void b(Drawable drawable) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public qzk(Service service, Looper looper, qzg qzg, PlayerFactory playerFactory) {
        this.j = qzg;
        this.k = playerFactory;
        this.f = new Handler(looper, this);
        this.h = new a(this, 0);
        this.b = service;
        a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri) {
        ((vhj) gih.a(vhj.class)).a().a(uri).a((int) R.dimen.widget_cover_size, (int) R.dimen.widget_cover_size).d().a((wgx) this.h);
    }

    private void a(PlayerTrack playerTrack, PlayerRestrictions playerRestrictions, boolean z) {
        a();
        this.a.putExtra("logged_out", false);
        this.a.putExtra(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY, playerTrack.uri());
        this.a.putExtra("track_name", (String) playerTrack.metadata().get("title"));
        String str = "artist_name";
        this.a.putExtra(str, (String) playerTrack.metadata().get(str));
        this.a.putExtra("album_name", (String) playerTrack.metadata().get("album_title"));
        this.a.putExtra("paused", z);
        Bitmap bitmap = this.e;
        if (bitmap != null) {
            this.a.putExtra("cover", bitmap);
        }
        this.a.putExtra("is_prev_enabled", playerRestrictions.disallowSkippingPrevReasons().isEmpty());
        this.a.putExtra("is_next_enabled", playerRestrictions.disallowSkippingNextReasons().isEmpty());
        this.a.putExtra("is_ad_playing", a(playerTrack));
        this.a.putExtra("is_ad_skippable", b(playerTrack));
        this.a.putExtra("is_suggested_track", c(playerTrack));
    }

    private static boolean a(PlayerTrack playerTrack) {
        String str = "is_advertisement";
        return playerTrack.metadata().containsKey(str) && Boolean.valueOf((String) playerTrack.metadata().get(str)).booleanValue();
    }

    private boolean b(PlayerTrack playerTrack) {
        if (a(playerTrack)) {
            String str = "ad.is_skippable";
            if (playerTrack.metadata().containsKey(str) && Boolean.valueOf((String) playerTrack.metadata().get(str)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(PlayerTrack playerTrack) {
        Map metadata = playerTrack.metadata();
        String str = Metadata.MFT_INJECTION_SOURCE;
        if (metadata.containsKey(str)) {
            if ("fallback".equalsIgnoreCase((String) playerTrack.metadata().get(str))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void f() {
        PlayerState lastPlayerState = this.c.getLastPlayerState();
        PlayerTrack track = lastPlayerState != null ? lastPlayerState.track() : null;
        if (track != null) {
            a(track, lastPlayerState.restrictions(), lastPlayerState.isPaused());
        }
        this.j.a((Context) this.b, this.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.j.a((Context) this.b, this.a);
    }

    public void a() {
        this.a = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
        this.a.setComponent(new ComponentName(this.b, SpotifyWidget.class));
    }

    public final synchronized void b() {
        if (!this.l) {
            this.c = this.k.create(ViewUris.Z.toString(), uqo.bj, rta.C);
            this.c.registerPlayerStateObserver(this.m);
            this.l = true;
        }
    }

    public final synchronized void c() {
        this.a.putExtra("paused", true);
        d();
    }

    public synchronized void d() {
        if (this.l) {
            this.c.unregisterPlayerStateObserver(this.m);
            this.f.post(new $$Lambda$qzk$sGnXlQWHfiAADdupiRTWfhXmZtM(this));
            this.l = false;
        }
    }

    public final synchronized void e() {
        if (this.l) {
            this.f.removeMessages(1001);
            this.f.sendEmptyMessage(1001);
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1001) {
            PlayerState lastPlayerState = this.c.getLastPlayerState();
            if (lastPlayerState != null) {
                PlayerTrack track = lastPlayerState.track();
                if (track != null) {
                    synchronized (this.i) {
                        String str = (String) track.metadata().get("image_url");
                        Uri parse = !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY;
                        if (!parse.equals(this.d)) {
                            this.d = parse;
                            this.e = null;
                            this.h.a = parse;
                            this.g.post(new $$Lambda$qzk$Cgt5cKCkdB5DivuSBLv8lfjbIDU(this, parse));
                        } else {
                            f();
                        }
                    }
                }
            }
        }
        return true;
    }
}
