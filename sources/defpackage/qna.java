package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: qna reason: default package */
public final class qna implements vua<qmz> {
    private final wlc<jjn> a;
    private final wlc<qlz> b;
    private final wlc<Scheduler> c;
    private final wlc<qnb> d;
    private final wlc<Boolean> e;
    private final wlc<Observable<Boolean>> f;
    private final wlc<qho> g;
    private final wlc<qhr> h;
    private final wlc<Boolean> i;
    private final wlc<SpSharedPreferences<Object>> j;

    private qna(wlc<jjn> wlc, wlc<qlz> wlc2, wlc<Scheduler> wlc3, wlc<qnb> wlc4, wlc<Boolean> wlc5, wlc<Observable<Boolean>> wlc6, wlc<qho> wlc7, wlc<qhr> wlc8, wlc<Boolean> wlc9, wlc<SpSharedPreferences<Object>> wlc10) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
    }

    public static qna a(wlc<jjn> wlc, wlc<qlz> wlc2, wlc<Scheduler> wlc3, wlc<qnb> wlc4, wlc<Boolean> wlc5, wlc<Observable<Boolean>> wlc6, wlc<qho> wlc7, wlc<qhr> wlc8, wlc<Boolean> wlc9, wlc<SpSharedPreferences<Object>> wlc10) {
        qna qna = new qna(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10);
        return qna;
    }

    public final /* synthetic */ Object get() {
        qmz qmz = new qmz((jjn) this.a.get(), (qlz) this.b.get(), (Scheduler) this.c.get(), (qnb) this.d.get(), ((Boolean) this.e.get()).booleanValue(), (Observable) this.f.get(), (qho) this.g.get(), (qhr) this.h.get(), ((Boolean) this.i.get()).booleanValue(), (SpSharedPreferences) this.j.get());
        return qmz;
    }
}
