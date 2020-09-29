package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: mwp reason: default package */
public final class mwp {
    private final RxResolver a;
    private final wlc<rfe> b;
    private final boolean c;
    private final mys d;
    private final JacksonResponseParser<HubsJsonViewModel> e;

    public mwp(RxResolver rxResolver, wlc<rfe> wlc, boolean z, mys mys, JacksonResponseParser<HubsJsonViewModel> jacksonResponseParser) {
        this.a = (RxResolver) fay.a(rxResolver);
        this.b = (wlc) fay.a(wlc);
        this.c = z;
        this.d = mys;
        this.e = jacksonResponseParser;
    }

    public final wud<gzz> a(String str) {
        if (this.c) {
            return vun.a((wrf<T>) ((rfe) this.b.get()).a());
        }
        return this.d.a((String) fay.a(str)).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$mwp$x_GkbAyvBcd4rBij97NL_6Lrlyk<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud b(String str) {
        return vun.a((ObservableSource<T>) this.a.resolve(RequestBuilder.get(str).build()).a((ObservableTransformer<? super T, ? extends R>) this.e), BackpressureStrategy.BUFFER).a(gzz.class);
    }
}
