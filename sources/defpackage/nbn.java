package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: nbn reason: default package */
public final class nbn {
    private final RxResolver a;
    private final wzi<rog> b;
    private final boolean c;
    private final ndp d;
    private final JacksonResponseParser<HubsJsonViewModel> e;

    public nbn(RxResolver rxResolver, wzi<rog> wzi, boolean z, ndp ndp, JacksonResponseParser<HubsJsonViewModel> jacksonResponseParser) {
        this.a = (RxResolver) fbp.a(rxResolver);
        this.b = (wzi) fbp.a(wzi);
        this.c = z;
        this.d = ndp;
        this.e = jacksonResponseParser;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii b(String str) {
        return wit.a((ObservableSource<T>) this.a.resolve(RequestBuilder.get(str).build()).a((ObservableTransformer<? super T, ? extends R>) this.e), BackpressureStrategy.BUFFER).a(hcs.class);
    }

    public final xii<hcs> a(String str) {
        return this.c ? wit.a((xfk<T>) ((rog) this.b.get()).a()) : this.d.a((String) fbp.a(str)).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$nbn$bd890HhWWxWL7CaAooU7Kt_LJY<Object,Object>(this));
    }
}
