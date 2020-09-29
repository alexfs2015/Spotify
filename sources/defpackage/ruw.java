package defpackage;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.PlaybackStateCompat;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: ruw reason: default package */
public final class ruw implements rus {
    private final rus a;
    private final Object b = new Object();

    public ruw(rus rus) {
        Assertion.a((Object) rus);
        this.a = rus;
    }

    public final void a() {
        synchronized (this.b) {
            this.a.a();
        }
    }

    public final void b() {
        synchronized (this.b) {
            this.a.b();
        }
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        synchronized (this.b) {
            this.a.a(mediaMetadataCompat);
        }
    }

    public final void a(PlaybackStateCompat playbackStateCompat) {
        synchronized (this.b) {
            this.a.a(playbackStateCompat);
        }
    }

    public final boolean c() {
        boolean c;
        synchronized (this.b) {
            c = this.a.c();
        }
        return c;
    }

    public final MediaSessionCompat g() {
        MediaSessionCompat g;
        synchronized (this.b) {
            g = this.a.g();
        }
        return g;
    }

    public final void d() {
        synchronized (this.b) {
            this.a.d();
        }
    }

    public final void e() {
        synchronized (this.b) {
            this.a.e();
        }
    }

    public final Token f() {
        Token f;
        synchronized (this.b) {
            f = this.a.f();
        }
        return f;
    }

    public final void a(run run) {
        synchronized (this.b) {
            this.a.a(run);
        }
    }
}
