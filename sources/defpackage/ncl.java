package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/* renamed from: ncl reason: default package */
public interface ncl {

    /* renamed from: ncl$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static ioo a(RxResolver rxResolver) {
            return new ioo(rxResolver, "@");
        }

        public static ioi b(RxResolver rxResolver) {
            return new ioi(rxResolver, "@");
        }

        public static wud<Boolean> a(jug jug) {
            return vun.a((ObservableSource<T>) jug.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE), BackpressureStrategy.BUFFER);
        }
    }
}
