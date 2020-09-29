package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: lyn reason: default package */
public final class lyn extends rws<gzz> {
    public final /* synthetic */ boolean a(Object obj) {
        gzz gzz = (gzz) obj;
        return !hai.EMPTY.equals(gzz) && !gyi.a(gzz);
    }

    lyn(a aVar, rwr rwr, sih sih, rdh rdh) {
        super(aVar, rwr, sih, rdh);
    }

    /* renamed from: a */
    public final wud<gzz> call(wud<gzz> wud) {
        return super.call(wud).b((wun<? super T>) new $$Lambda$lyn$6jZhsVtDjRrT5bPyfyAkEApKMyU<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gzz gzz) {
        if (lzk.a(gzz, "browse-error-empty-view")) {
            b();
        }
    }
}
