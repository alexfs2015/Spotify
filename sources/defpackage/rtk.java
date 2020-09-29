package defpackage;

import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.base.java.logging.Logger;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: rtk reason: default package */
public final class rtk implements defpackage.rtn.a {
    public final rtn a;
    public final Set<rti> b;
    private final rtp c;
    private final rtt d;
    private final rur e;

    /* renamed from: rtk$a */
    public interface a {
        void a();

        void a(rtm rtm);
    }

    public rtk(rur rur, rtn rtn, rtp rtp, rtt rtt, Set<rti> set) {
        this.e = rur;
        this.c = rtp;
        this.a = rtn;
        this.d = rtt;
        this.b = set;
    }

    public final void a(hne hne) {
        rtn rtn = this.a;
        rtn.e = new WeakReference<>(fay.a(hne));
        rtn.f = (defpackage.rtn.a) fay.a(this);
        rtn.a(rtn.d);
    }

    public final void a() {
        rtn rtn = this.a;
        if (rtn.e != null) {
            rtn.e.clear();
            rtn.e = null;
        }
        rtn.a.clear();
        rtn.b.clear();
        for (Entry entry : rtn.c.entrySet()) {
            if (entry.getValue() != null) {
                ((rtm) entry.getValue()).b();
            }
        }
        rtn.c.clear();
        if (rtn.f != null) {
            rtn.f.b();
        }
        rtn.f = null;
        this.c.c.c();
    }

    public final void a(String str, a aVar) {
        this.a.a(str, aVar);
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

    public final void b() {
        c();
        d();
    }

    private void c() {
        Iterator it = this.a.a().iterator();
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            rtm rtm = (rtm) it.next();
            boolean a2 = rtm.g().a();
            if (a2) {
                if (!this.d.a.a()) {
                    this.d.a(rtm.d());
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
            this.e.a((run) null);
            this.c.d = false;
            return;
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (Entry entry : this.a.c.entrySet()) {
            if (entry.getValue() != null) {
                run g = ((rtm) entry.getValue()).g();
                z |= g.a();
                z3 |= g.b();
                z2 |= g.c();
            }
        }
        Logger.b("SpotifyMediaBrowserService override policy: playbackState and metadata %b, callbacks %b", Boolean.valueOf(z), Boolean.valueOf(z2));
        this.e.a((run) new rud(z, z3, z2));
    }
}
