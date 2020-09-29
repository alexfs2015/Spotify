package defpackage;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: qoh reason: default package */
public interface qoh {

    /* renamed from: qoh$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Completable a(hec hec, qok qok, qnx qnx, qnt qnt) {
            Flowable a = hec.a();
            $$Lambda$qoh$gBhUzO2lr7ZNu8btYD_CO4EiQts r0 = new $$Lambda$qoh$gBhUzO2lr7ZNu8btYD_CO4EiQts(qok, qnx, qnt);
            ObjectHelper.a(r0, "mapper is null");
            return RxJavaPlugins.a((Completable) new FlowableSwitchMapCompletable(a, r0, false)).a((CompletableTransformer) new vil(30, 3, 60000));
        }

        public static /* synthetic */ CompletableSource a(qok qok, qnx qnx, qnt qnt, fpt fpt) {
            if (qok.a(fpt)) {
                return qnx.a(fpt).b();
            }
            qnt.a(null);
            return Completable.a();
        }
    }
}
