package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;

/* renamed from: ndg reason: default package */
public final class ndg {
    public final xok a = new xok();
    private final ndc b;
    private final gwp c;
    private final c<hcs, hcs> d;
    private final String e;
    private final String f;
    private final hhc g;
    private hcs h = hdb.EMPTY;

    public ndg(ndc ndc, gwp gwp, c<hcs, hcs> cVar, String str, String str2, hhc hhc) {
        this.b = ndc;
        this.c = gwp;
        this.d = cVar;
        this.e = str;
        this.f = str2;
        this.g = hhc;
    }

    /* access modifiers changed from: private */
    public void a(hcs hcs) {
        this.c.a(hcs, false);
        this.h = hcs;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        a(hbb.a(SpotifyIconV2.WARNING, this.e, this.f));
        Logger.e(th.getMessage(), new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean b(hcs hcs) {
        hcs hcs2 = this.h;
        return Boolean.valueOf(hdb.EMPTY.equals(hcs2) || hbb.a(hcs2) || (!hdb.EMPTY.equals(hcs) && !hbb.a(hcs)));
    }

    public final void a(String str) {
        this.a.a(this.b.a(str).a(wit.a(this.g.c())).a(this.d).c((xiy<? super T, Boolean>) new $$Lambda$ndg$41Blv_xPwLU4y3wnkFeOcOrUKc<Object,Boolean>(this)).a((xis<? super T>) new $$Lambda$ndg$C5YP_D7YZnAAtHZ0PzSuyMlKSo<Object>(this), (xis<Throwable>) new $$Lambda$ndg$9ZYr2nlU6a9t_gf8zJLqtyN8IM<Throwable>(this)));
    }
}
