package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/* renamed from: nia reason: default package */
public interface nia {

    /* renamed from: nia$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static irb a(RxResolver rxResolver) {
            return new irb(rxResolver, "@");
        }

        public static xii<Boolean> a(jwo jwo) {
            return wit.a((ObservableSource<T>) jwo.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE), BackpressureStrategy.BUFFER);
        }

        public static iqv b(RxResolver rxResolver) {
            return new iqv(rxResolver, "@");
        }
    }
}
