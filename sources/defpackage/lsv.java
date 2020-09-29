package defpackage;

import android.content.Context;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import java.util.List;
import java.util.Set;

/* renamed from: lsv reason: default package */
final class lsv extends scm {
    private final sct b;
    private final xok c = new xok();

    public lsv(String str, String str2, Context context, hpt hpt, hqr hqr, scq scq, sdx sdx, Set<Long> set, sct sct) {
        super(str, str2, context, hpt, hqr, scq, sdx, set, "automotive", sct);
        this.b = sct;
    }

    public final void a() {
        super.a();
        this.c.a();
    }

    public final void a(String str, xis<List<MediaItem>> xis) {
        this.c.a(this.b.a(str, 0).a(xis, (xis<Throwable>) new $$Lambda$lsv$4fHS8kcJUYNGCy40WV4AkVS_8kM<Throwable>(xis)));
    }
}
