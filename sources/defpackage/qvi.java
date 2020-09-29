package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: qvi reason: default package */
public final class qvi implements wig<qvh> {
    private final wzi<jlz> a;
    private final wzi<quh> b;
    private final wzi<Scheduler> c;
    private final wzi<Observable<Boolean>> d;
    private final wzi<qqf> e;
    private final wzi<SpSharedPreferences<Object>> f;

    private qvi(wzi<jlz> wzi, wzi<quh> wzi2, wzi<Scheduler> wzi3, wzi<Observable<Boolean>> wzi4, wzi<qqf> wzi5, wzi<SpSharedPreferences<Object>> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static qvi a(wzi<jlz> wzi, wzi<quh> wzi2, wzi<Scheduler> wzi3, wzi<Observable<Boolean>> wzi4, wzi<qqf> wzi5, wzi<SpSharedPreferences<Object>> wzi6) {
        qvi qvi = new qvi(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return qvi;
    }

    public final /* synthetic */ Object get() {
        qvh qvh = new qvh((jlz) this.a.get(), (quh) this.b.get(), (Scheduler) this.c.get(), (Observable) this.d.get(), (qqf) this.e.get(), (SpSharedPreferences) this.f.get());
        return qvh;
    }
}
