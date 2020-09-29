package defpackage;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: qwq reason: default package */
public interface qwq {

    /* renamed from: qwq$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Completable a(hgy hgy, qwt qwt, qwg qwg, qwc qwc) {
            Flowable a = hgy.a();
            $$Lambda$qwq$D0YrXQfOakR9kxI1eaRMrGi4HLM r0 = new $$Lambda$qwq$D0YrXQfOakR9kxI1eaRMrGi4HLM(qwt, qwg, qwc);
            ObjectHelper.a(r0, "mapper is null");
            return RxJavaPlugins.a((Completable) new FlowableSwitchMapCompletable(a, r0, false)).a((CompletableTransformer) new vvq(30, 3, 60000));
        }

        public static /* synthetic */ CompletableSource a(qwt qwt, qwg qwg, qwc qwc, fqn fqn) {
            if (qwt.a(fqn)) {
                return qwg.a(fqn).b();
            }
            qwc.a(null);
            return Completable.a();
        }
    }
}
