package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.MediaSessionCompat.a;
import android.support.v4.media.session.PlaybackStateCompat;
import com.spotify.base.java.logging.Logger;

/* renamed from: sdy reason: default package */
public final class sdy implements sec {
    final sea a;
    private final MediaSessionCompat b;
    private final ni c;
    private sdx d;
    private final a e = new a() {
        public final void b() {
            Logger.b("onPlay", new Object[0]);
            sdy.this.a.c();
        }

        public final void b(long j) {
            Logger.b("onSeekTo %d", Long.valueOf(j));
            sdy.this.a.a(j);
        }

        public final void c() {
            Logger.b("onPause", new Object[0]);
            sdy.this.a.d();
        }

        public final void d() {
            Logger.b("onSkipToNext", new Object[0]);
            sdy.this.a.a();
        }

        public final void e() {
            Logger.b("onSkipToPrevious", new Object[0]);
            sdy.this.a.b();
        }

        public final void f() {
            Logger.b("onStop, mapping to pause", new Object[0]);
            sdy.this.a.d();
        }
    };

    public sdy(Context context, MediaSessionCompat mediaSessionCompat, PendingIntent pendingIntent, sea sea) {
        this.b = mediaSessionCompat;
        if (VERSION.SDK_INT >= 21) {
            this.b.a.b(pendingIntent);
        }
        this.a = sea;
        a(true);
        h();
        this.c = ni.a(context);
    }

    private void a(boolean z) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putBoolean("android.media.session.extra.NEED_CONNECT", true);
        }
        bundle.putBoolean("android.support.wearable.media.extra.BACKGROUND_COLOR_FROM_THEME", true);
        this.b.a(bundle);
    }

    private void h() {
        sdx sdx = this.d;
        if (sdx == null || !sdx.c()) {
            Logger.b("Setting a callback handler", new Object[0]);
            this.b.a(this.e, (Handler) null);
        }
    }

    public final void a() {
        if (!this.b.a()) {
            this.b.a(true);
        }
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        sdx sdx = this.d;
        if (sdx == null || !sdx.b()) {
            if (!this.b.a()) {
                this.b.a(true);
            }
            this.b.a(mediaMetadataCompat);
        }
    }

    public final void a(PlaybackStateCompat playbackStateCompat) {
        sdx sdx = this.d;
        if (sdx == null || !sdx.a()) {
            Logger.b("PlaybackState %s", playbackStateCompat.toString());
            this.b.a(playbackStateCompat);
        }
    }

    public final void a(sdx sdx) {
        this.d = sdx;
        boolean z = true;
        Logger.b("New override policy %s", this.d);
        if (sdx != null) {
            z = false;
        }
        a(z);
        h();
    }

    public final void b() {
        this.b.a(false);
    }

    public final boolean c() {
        MediaSessionCompat mediaSessionCompat = this.b;
        return false;
    }

    public final void d() {
        ni.a((MediaSessionCompat) null);
    }

    public final void e() {
        ni.a(this.b);
    }

    public final Token f() {
        return this.b.c();
    }

    public final MediaSessionCompat g() {
        return this.b;
    }
}
