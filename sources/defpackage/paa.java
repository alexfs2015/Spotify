package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Completable;
import io.reactivex.Scheduler;

/* renamed from: paa reason: default package */
public final class paa implements wig<ozz> {
    private final wzi<a> a;
    private final wzi<ozw> b;
    private final wzi<Scheduler> c;
    private final wzi<oml> d;
    private final wzi<Completable> e;

    private paa(wzi<a> wzi, wzi<ozw> wzi2, wzi<Scheduler> wzi3, wzi<oml> wzi4, wzi<Completable> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static paa a(wzi<a> wzi, wzi<ozw> wzi2, wzi<Scheduler> wzi3, wzi<oml> wzi4, wzi<Completable> wzi5) {
        paa paa = new paa(wzi, wzi2, wzi3, wzi4, wzi5);
        return paa;
    }

    public final /* synthetic */ Object get() {
        ozz ozz = new ozz(this.a, this.b, this.c, this.d, this.e);
        return ozz;
    }
}
