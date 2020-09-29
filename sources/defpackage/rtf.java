package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.RootListType;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: rtf reason: default package */
public class rtf implements rtm {
    public static final List<MediaItem> a = Collections.emptyList();
    private final xag b = new xag();
    private final hne c;
    private final hop d;
    private final run e;
    private final rtj f;
    /* access modifiers changed from: private */
    public final String g;
    private final String h;
    private Context i;
    private final Set<Long> j;
    private final RootListType k;

    public void a(String str, wun<List<MediaItem>> wun) {
    }

    public boolean a() {
        return false;
    }

    public rtf(String str, String str2, Context context, hne hne, hop hop, rtj rtj, run run, Set<Long> set, RootListType rootListType) {
        Logger.b("MediaBrowserServiceSession created for %s", str);
        this.k = rootListType;
        this.h = str;
        this.g = str2;
        this.c = hne;
        this.f = rtj;
        this.e = run;
        this.d = hop;
        this.d.b();
        this.i = context;
        this.j = set;
    }

    public final Set<Long> c() {
        return this.j;
    }

    public void b() {
        Logger.b("MediaBrowserServiceSession %s is destroyed", this.g);
        this.b.a();
        this.d.c();
    }

    public final hne d() {
        return this.c;
    }

    public final rtj e() {
        return this.f;
    }

    public final String f() {
        return this.h;
    }

    public final run g() {
        return this.e;
    }

    public final void a(String str, final i<List<MediaItem>> iVar) {
        this.f.g();
        hnf a2 = this.c.a();
        String c2 = rtg.c(str);
        if (this.h.equals(str)) {
            c2 = String.format("%s:type:%s", new Object[]{c2, this.k.name});
        }
        a2.a(new a().a(c2).b(this.g).c("").a(), new Bundle(), new hpe() {
            public final void a(List<MediaBrowserItem> list) {
                if (list.isEmpty()) {
                    iVar.b(rtf.a);
                } else {
                    iVar.b(rtz.a(list, rtf.this.g));
                }
            }

            public final void a(Throwable th) {
                Logger.b(th, "Failed to load children", new Object[0]);
                iVar.b(rtf.a);
            }
        }, 0, 30, this.d.d());
    }
}
