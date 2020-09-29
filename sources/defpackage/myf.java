package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;

/* renamed from: myf reason: default package */
public final class myf {
    public final xag a = new xag();
    private final myb b;
    private final gup c;
    private final c<gzz, gzz> d;
    private final String e;
    private final String f;
    private final heg g;
    private gzz h = hai.EMPTY;

    public myf(myb myb, gup gup, c<gzz, gzz> cVar, String str, String str2, heg heg) {
        this.b = myb;
        this.c = gup;
        this.d = cVar;
        this.e = str;
        this.f = str2;
        this.g = heg;
    }

    public final void a(String str) {
        this.a.a(this.b.a(str).a(vun.a(this.g.c())).a(this.d).c((wut<? super T, Boolean>) new $$Lambda$myf$rV49PzjL030eNdDDQxYjstZrH8A<Object,Boolean>(this)).a((wun<? super T>) new $$Lambda$myf$gAW3FuRYBiQOcg6YzGp2RGaZcdc<Object>(this), (wun<Throwable>) new $$Lambda$myf$R8ogMtWhjDPhJ2K7as3goGFvAg<Throwable>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean b(gzz gzz) {
        gzz gzz2 = this.h;
        return Boolean.valueOf(hai.EMPTY.equals(gzz2) || gyi.a(gzz2) || (!hai.EMPTY.equals(gzz) && !gyi.a(gzz)));
    }

    /* access modifiers changed from: private */
    public void a(gzz gzz) {
        this.c.a(gzz, false);
        this.h = gzz;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        a(gyi.a(SpotifyIconV2.WARNING, this.e, this.f));
        Logger.e(th.getMessage(), new Object[0]);
    }
}
