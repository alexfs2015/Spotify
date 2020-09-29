package defpackage;

import com.spotify.cosmos.android.Cosmos;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: rml reason: default package */
public final class rml implements c {
    private Disposable a = Disposables.b();
    private final Flowable<fpt> b;
    private final rmk c;

    public final String c() {
        return "HermesRerouter";
    }

    public rml(Flowable<fpt> flowable, rmk rmk) {
        this.b = flowable;
        this.c = rmk;
    }

    public final void ai_() {
        this.a = this.b.c((Function<? super T, ? extends R>) $$Lambda$rml$0UCsB2lTnO_qnGANuTboFtxXqi8.INSTANCE).a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).a(Functions.a()).c((Consumer<? super T>) new $$Lambda$rml$IYWcLEf2hfrkG1XFLtgByFoIKPo<Object>(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(fpt fpt) {
        return (Boolean) fpt.a(joz.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        rmk rmk = this.c;
        rmk.a.a.a = true;
        Cosmos.setInterceptor(rmk.a);
    }

    public final void aj_() {
        Cosmos.clearInterceptor();
        this.a.bf_();
    }
}
