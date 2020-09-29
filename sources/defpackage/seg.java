package defpackage;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.PlaybackStateCompat;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: seg reason: default package */
public final class seg implements sec {
    private final sec a;
    private final Object b = new Object();

    public seg(sec sec) {
        Assertion.a((Object) sec);
        this.a = sec;
    }

    public final void a() {
        synchronized (this.b) {
            this.a.a();
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

    public final void a(sdx sdx) {
        synchronized (this.b) {
            this.a.a(sdx);
        }
    }

    public final void b() {
        synchronized (this.b) {
            this.a.b();
        }
    }

    public final boolean c() {
        boolean c;
        synchronized (this.b) {
            c = this.a.c();
        }
        return c;
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

    public final MediaSessionCompat g() {
        MediaSessionCompat g;
        synchronized (this.b) {
            g = this.a.g();
        }
        return g;
    }
}
