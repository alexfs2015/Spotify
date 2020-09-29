package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

/* renamed from: nvt reason: default package */
public final class nvt {
    private final gtk a;
    private final hec b;
    private final nvw c;

    public nvt(gtk gtk, hec hec, nvw nvw) {
        this.a = gtk;
        this.b = hec;
        this.c = nvw;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2) {
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        if (bool.booleanValue()) {
            return this.a.a;
        }
        return Observable.c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(fpt fpt) {
        return Boolean.valueOf(fpt.a(rvd.a) == RolloutFlag.ENABLED);
    }

    public final Observable<Boolean> a() {
        return Observable.a((ObservableSource<? extends T1>) this.b.a().j().c((Function<? super T, ? extends R>) $$Lambda$nvt$kNFA6WL81hzSWp0Zwz22m6gU.INSTANCE), (ObservableSource<? extends T2>) this.c.a(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$nvt$sk7zlH3H6DqDQrcDfkwDrp75Iz0.INSTANCE).h(new $$Lambda$nvt$RlxWr0UrAmxyK_2XAOnGMa86s4g(this));
    }
}
