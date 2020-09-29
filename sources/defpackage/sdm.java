package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.mediabrowserservice.RecentlyUsedComparator;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.Scheduler;
import java.util.Iterator;
import java.util.List;

/* renamed from: sdm reason: default package */
public final class sdm {
    public final Context a;
    public final MediaSessionCompat b;
    public final vex c;
    public final scr d;
    public final scn e;
    public final hqy f;
    final sdo g;
    final sdr h;
    final sdg i;
    public boolean j;
    private final hpy k;
    private final a l = new a(this, 0);

    /* renamed from: sdm$a */
    final class a implements defpackage.hjy.a<hpt> {
        private a() {
        }

        /* synthetic */ a(sdm sdm, byte b) {
            this();
        }

        public final /* synthetic */ void a(Object obj) {
            hpt hpt = (hpt) obj;
            Logger.a("SpotifyMediaBrowserService.onServiceConnected", new Object[0]);
            sdm.this.d.a(hpt);
            sdm.this.g.a(sdm.this.b.c());
            sdm.this.b.a(true);
            sdm.this.i.a();
            sdm sdm = sdm.this;
            android.support.v4.media.session.PlaybackStateCompat.a aVar = new android.support.v4.media.session.PlaybackStateCompat.a();
            aVar.b = 141312;
            sdm.b.a(aVar.a());
            sdm.b.a(sdm.h.a(sdm.a, ViewUris.W.toString()));
        }

        public final void e() {
            Logger.a("SpotifyMediaBrowserService.onServiceDisconnected", new Object[0]);
            sdm.this.b();
            sdm.this.g.stopSelf();
        }
    }

    public sdm(Context context, MediaSessionCompat mediaSessionCompat, vex vex, hpy hpy, scr scr, sdr sdr, scn scn, hqy hqy, sdh sdh, sdo sdo) {
        this.a = context;
        this.b = mediaSessionCompat;
        this.c = vex;
        this.k = hpy;
        this.d = scr;
        this.h = sdr;
        this.e = scn;
        this.f = hqy;
        this.g = sdo;
        this.i = new sdg((lbi) sdh.a(sdh.a.get(), 1), (scx) sdh.a(sdh.b.get(), 2), (Scheduler) sdh.a(sdh.c.get(), 3), (sdo) sdh.a(sdo, 4));
    }

    public final void a() {
        if (!this.k.c() && !this.k.c) {
            this.k.a((defpackage.hjy.a<hpt>) this.l);
            this.k.a();
        }
    }

    public final void a(String str, Bundle bundle, i<List<MediaItem>> iVar) {
        scw scw;
        iVar.a();
        scx scx = this.d.a;
        if (scx.a().isEmpty()) {
            scw = null;
        } else {
            Iterator it = scx.a().iterator();
            scw = null;
            while (it.hasNext()) {
                scw scw2 = (scw) it.next();
                if (scw2.b()) {
                    if (scw != null) {
                        if (!(RecentlyUsedComparator.a(scw, scw2) > 0)) {
                        }
                    }
                    scw = scw2;
                }
            }
        }
        if (scw != null) {
            iVar.getClass();
            scw.a(str, (xis<List<MediaItem>>) new $$Lambda$C6faGARcN9cgZT804C7AYnQG7pQ<List<MediaItem>>(iVar));
            return;
        }
        iVar.b(null);
    }

    public final void a(final String str, final i<List<MediaItem>> iVar) {
        iVar.a();
        if (str == null) {
            iVar.b(scm.a);
        } else {
            this.d.a(str, new defpackage.scr.a() {
                public final void a() {
                    iVar.b(scm.a);
                }

                public final void a(scw scw) {
                    scw.a(str, iVar);
                }
            });
        }
    }

    public final void b() {
        if (!this.j) {
            this.j = true;
            this.i.b();
            this.d.a();
            if (this.k.c()) {
                this.k.b();
                this.k.b(this.l);
            }
        }
    }
}
