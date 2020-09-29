package defpackage;

import com.spotify.cosmos.android.Cosmos;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: rvr reason: default package */
public final class rvr implements c {
    private Disposable a = Disposables.b();
    private final Flowable<fqn> b;
    private final rvq c;

    public rvr(Flowable<fqn> flowable, rvq rvq) {
        this.b = flowable;
        this.c = rvq;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(fqn fqn) {
        return (Boolean) fqn.a(jrl.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        rvq rvq = this.c;
        rvq.a.a.a = true;
        Cosmos.setInterceptor(rvq.a);
    }

    public final void ai_() {
        this.a = this.b.c((Function<? super T, ? extends R>) $$Lambda$rvr$9Mx9YCPhclBdXQjSk3iWNZshBk.INSTANCE).a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).a(Functions.a()).c((Consumer<? super T>) new $$Lambda$rvr$jIFBuSmM3HuoQXZx_OodnqojjvY<Object>(this));
    }

    public final void aj_() {
        Cosmos.clearInterceptor();
        this.a.bd_();
    }

    public final String c() {
        return "HermesRerouter";
    }
}
