package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.Scheduler;
import java.util.Iterator;
import java.util.List;

/* renamed from: rua reason: default package */
public final class rua {
    public final Context a;
    public final MediaSessionCompat b;
    public final ruk c;
    public final rtk d;
    public final rtg e;
    public final hou f;
    final ruc g;
    final rue h;
    final rtv i;
    public boolean j;
    private final hnj k;
    private final a l = new a(this, 0);

    /* renamed from: rua$a */
    final class a implements defpackage.hhe.a<hne> {
        private a() {
        }

        /* synthetic */ a(rua rua, byte b) {
            this();
        }

        public final /* synthetic */ void a(Object obj) {
            hne hne = (hne) obj;
            Logger.a("SpotifyMediaBrowserService.onServiceConnected", new Object[0]);
            rua.this.d.a(hne);
            rua.this.g.a(rua.this.b.c());
            rua.this.b.a(true);
            rua.this.i.a();
            rua rua = rua.this;
            android.support.v4.media.session.PlaybackStateCompat.a aVar = new android.support.v4.media.session.PlaybackStateCompat.a();
            aVar.b = 141312;
            rua.b.a(aVar.a());
            rua.b.a(rua.h.a(rua.a, ViewUris.X.toString()));
        }

        public final void e() {
            Logger.a("SpotifyMediaBrowserService.onServiceDisconnected", new Object[0]);
            rua.this.b();
            rua.this.g.stopSelf();
        }
    }

    public rua(Context context, MediaSessionCompat mediaSessionCompat, ruk ruk, hnj hnj, rtk rtk, rue rue, rtg rtg, hou hou, rtw rtw, ruc ruc) {
        this.a = context;
        this.b = mediaSessionCompat;
        this.c = ruk;
        this.k = hnj;
        this.d = rtk;
        this.h = rue;
        this.e = rtg;
        this.f = hou;
        this.g = ruc;
        this.i = new rtv((kxz) rtw.a(rtw.a.get(), 1), (rtn) rtw.a(rtw.b.get(), 2), (Scheduler) rtw.a(rtw.c.get(), 3), (ruc) rtw.a(ruc, 4));
    }

    public final void a() {
        if (!this.k.d() && !this.k.c) {
            this.k.a((defpackage.hhe.a<hne>) this.l);
            this.k.a();
        }
    }

    public final void b() {
        if (!this.j) {
            this.j = true;
            this.i.b();
            this.d.a();
            if (this.k.d()) {
                this.k.b();
                this.k.b(this.l);
            }
        }
    }

    public final void a(final String str, final i<List<MediaItem>> iVar) {
        iVar.a();
        if (str == null) {
            iVar.b(rtf.a);
        } else {
            this.d.a(str, new defpackage.rtk.a() {
                public final void a(rtm rtm) {
                    rtm.a(str, iVar);
                }

                public final void a() {
                    iVar.b(rtf.a);
                }
            });
        }
    }

    public final void a(String str, Bundle bundle, i<List<MediaItem>> iVar) {
        rtm rtm;
        iVar.a();
        Iterator it = this.d.a.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                rtm = null;
                break;
            }
            rtm = (rtm) it.next();
            if (rtm.a()) {
                break;
            }
        }
        if (rtm != null) {
            iVar.getClass();
            rtm.a(str, (wun<List<MediaItem>>) new $$Lambda$rj3tBj06uHbEaTqPjRpmn3JPJg<List<MediaItem>>(iVar));
            return;
        }
        iVar.b(null);
    }
}
