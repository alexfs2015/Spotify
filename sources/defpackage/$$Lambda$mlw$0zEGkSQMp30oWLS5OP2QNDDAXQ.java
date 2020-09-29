package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: -$$Lambda$mlw$0zEGkSQMp-30oWLS5OP2QNDDAXQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mlw$0zEGkSQMp30oWLS5OP2QNDDAXQ implements Function {
    private final /* synthetic */ ConnectManager f$0;

    public /* synthetic */ $$Lambda$mlw$0zEGkSQMp30oWLS5OP2QNDDAXQ(ConnectManager connectManager) {
        this.f$0 = connectManager;
    }

    public final Object apply(Object obj) {
        return Observable.a((Iterable<? extends T>) (List) obj).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$mlw$GRrvg9SMWRxiu3v6rY2OjWJkPck<Object,Object>(this.f$0), false).b(16).d();
    }
}
