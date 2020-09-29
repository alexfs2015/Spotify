package defpackage;

import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.base.java.logging.Logger;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: scr reason: default package */
public final class scr implements defpackage.scx.a {
    public final scx a;
    public final Set<scp> b;
    private final scz c;
    private final sde d;
    private final seb e;

    /* renamed from: scr$a */
    public interface a {
        void a();

        void a(scw scw);
    }

    public scr(seb seb, scx scx, scz scz, sde sde, Set<scp> set) {
        this.e = seb;
        this.c = scz;
        this.a = scx;
        this.d = sde;
        this.b = set;
    }

    private void c() {
        Iterator it = this.a.a().iterator();
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            scw scw = (scw) it.next();
            boolean a2 = scw.g().a();
            if (a2) {
                if (!this.d.a.a()) {
                    this.d.a(scw.d());
                }
                z = a2;
            } else {
                z = a2;
            }
        }
        if (!z && this.d.a.a()) {
            this.d.a();
        }
    }

    private void d() {
        if (this.a.a().isEmpty()) {
            this.e.a((sdx) null);
            this.c.d = false;
            return;
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (Entry entry : this.a.c.entrySet()) {
            if (entry.getValue() != null) {
                sdx g = ((scw) entry.getValue()).g();
                z |= g.a();
                z3 |= g.b();
                z2 |= g.c();
            }
        }
        Logger.b("SpotifyMediaBrowserService override policy: playbackState and metadata %b, callbacks %b", Boolean.valueOf(z), Boolean.valueOf(z2));
        this.e.a((sdx) new sdp(z, z3, z2));
    }

    public final void a() {
        scx scx = this.a;
        if (scx.e != null) {
            scx.e.clear();
            scx.e = null;
        }
        scx.a.clear();
        scx.b.clear();
        for (Entry entry : scx.c.entrySet()) {
            if (entry.getValue() != null) {
                ((scw) entry.getValue()).a();
            }
        }
        scx.c.clear();
        if (scx.f != null) {
            scx.f.b();
        }
        scx.f = null;
        this.c.c.c();
    }

    public final void a(MediaSessionCompat mediaSessionCompat) {
        c();
        if (!this.c.d) {
            Logger.b("Set MediaSession callback handler", new Object[0]);
            mediaSessionCompat.a((android.support.v4.media.session.MediaSessionCompat.a) this.c, (Handler) null);
            this.c.d = true;
        }
        d();
    }

    public final void a(hpt hpt) {
        scx scx = this.a;
        scx.e = new WeakReference<>(fbp.a(hpt));
        scx.f = (defpackage.scx.a) fbp.a(this);
        scx.a(scx.d);
    }

    public final void a(String str, a aVar) {
        this.a.a(str, aVar);
    }

    public final void b() {
        c();
        d();
    }
}
