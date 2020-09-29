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

/* renamed from: ruo reason: default package */
public final class ruo implements rus {
    final ruq a;
    private final MediaSessionCompat b;
    private final nd c;
    private run d;
    private final a e = new a() {
        public final void c() {
            Logger.b("onPause", new Object[0]);
            ruo.this.a.d();
        }

        public final void b() {
            Logger.b("onPlay", new Object[0]);
            ruo.this.a.c();
        }

        public final void d() {
            Logger.b("onSkipToNext", new Object[0]);
            ruo.this.a.a();
        }

        public final void e() {
            Logger.b("onSkipToPrevious", new Object[0]);
            ruo.this.a.b();
        }

        public final void f() {
            Logger.b("onStop, mapping to pause", new Object[0]);
            ruo.this.a.d();
        }

        public final void b(long j) {
            Logger.b("onSeekTo %d", Long.valueOf(j));
            ruo.this.a.a(j);
        }
    };

    public ruo(Context context, MediaSessionCompat mediaSessionCompat, PendingIntent pendingIntent, ruq ruq) {
        this.b = mediaSessionCompat;
        if (VERSION.SDK_INT >= 21) {
            this.b.a.b(pendingIntent);
        }
        this.a = ruq;
        a(true);
        h();
        this.c = nd.a(context);
    }

    public final void a() {
        if (!this.b.a()) {
            this.b.a(true);
        }
    }

    public final void b() {
        this.b.a(false);
    }

    public final void a(run run) {
        this.d = run;
        boolean z = true;
        Logger.b("New override policy %s", this.d);
        if (run != null) {
            z = false;
        }
        a(z);
        h();
    }

    private void h() {
        run run = this.d;
        if (run == null || !run.c()) {
            Logger.b("Setting a callback handler", new Object[0]);
            this.b.a(this.e, (Handler) null);
        }
    }

    private void a(boolean z) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putBoolean("android.media.session.extra.NEED_CONNECT", true);
        }
        bundle.putBoolean("android.support.wearable.media.extra.BACKGROUND_COLOR_FROM_THEME", true);
        this.b.a(bundle);
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        run run = this.d;
        if (run == null || !run.b()) {
            if (!this.b.a()) {
                this.b.a(true);
            }
            this.b.a(mediaMetadataCompat);
        }
    }

    public final void a(PlaybackStateCompat playbackStateCompat) {
        run run = this.d;
        if (run == null || !run.a()) {
            Logger.b("PlaybackState %s", playbackStateCompat.toString());
            this.b.a(playbackStateCompat);
        }
    }

    public final boolean c() {
        MediaSessionCompat mediaSessionCompat = this.b;
        return false;
    }

    public final void d() {
        nd.a((MediaSessionCompat) null);
    }

    public final void e() {
        nd.a(this.b);
    }

    public final Token f() {
        return this.b.c();
    }

    public final MediaSessionCompat g() {
        return this.b;
    }
}
