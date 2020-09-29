package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: scm reason: default package */
public class scm implements scw {
    public static final List<MediaItem> a = Collections.emptyList();
    private final xok b = new xok();
    private final hpt c;
    private final hqr d;
    private final sdx e;
    private final scq f;
    /* access modifiers changed from: private */
    public final String g;
    private final String h;
    private Context i;
    private final Set<Long> j;
    private final String k;
    private final sct l;

    public scm(String str, String str2, Context context, hpt hpt, hqr hqr, scq scq, sdx sdx, Set<Long> set, String str3, sct sct) {
        Logger.b("MediaBrowserServiceSession created for %s", str);
        this.k = str3;
        this.h = str;
        this.g = str2;
        this.c = hpt;
        this.f = scq;
        this.e = sdx;
        this.d = hqr;
        this.d.b();
        this.i = context;
        this.j = set;
        this.l = sct;
    }

    public void a() {
        Logger.b("MediaBrowserServiceSession %s is destroyed", this.g);
        this.b.a();
        this.d.c();
    }

    public final void a(String str, final i<List<MediaItem>> iVar) {
        this.f.g();
        hpu a2 = this.c.a();
        huo a3 = huo.a(scn.c(str), this.h.equals(str)).a(this.k).c(this.g).a();
        new Bundle();
        a2.a(a3, new huq() {
            public final void a(List<MediaBrowserItem> list) {
                if (list.isEmpty()) {
                    iVar.b(scm.a);
                } else {
                    iVar.b(sdl.a(list, scm.this.g));
                }
            }
        }, 0, 30, this.d.d());
    }

    public void a(String str, xis<List<MediaItem>> xis) {
        this.b.a(this.l.a(str, 10).a(xis, (xis<Throwable>) new $$Lambda$scm$SL2BptaBEXk1FJ0RRfsyrKxBh8<Throwable>(xis)));
    }

    public boolean b() {
        return true;
    }

    public final Set<Long> c() {
        return this.j;
    }

    public final hpt d() {
        return this.c;
    }

    public final scq e() {
        return this.f;
    }

    public final String f() {
        return this.h;
    }

    public final sdx g() {
        return this.e;
    }
}
