package defpackage;

import android.net.Uri;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: mxv reason: default package */
public final class mxv {
    private final RxResolver a;
    private final nao b;
    private final JacksonResponseParser<HubsJsonViewModel> c;

    public mxv(RxResolver rxResolver, nao nao, JacksonResponseParser<HubsJsonViewModel> jacksonResponseParser) {
        this.a = (RxResolver) fbp.a(rxResolver);
        this.c = (JacksonResponseParser) fbp.a(jacksonResponseParser);
        this.b = (nao) fbp.a(nao);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Uri uri) {
        return wit.a((ObservableSource<T>) this.a.resolve(RequestBuilder.get(uri.toString()).build()).a((ObservableTransformer<? super T, ? extends R>) this.c), BackpressureStrategy.BUFFER).a(hcs.class);
    }

    public final xii<hcs> a(String str) {
        nao nao = this.b;
        jva a2 = jva.a(str);
        fbp.a(a2.b == LinkType.ALBUM, (Object) "SpotifyLink needs to be of link type Album");
        return wit.a((xfk<T>) nao.a.a(Uri.parse(String.format("hm://album-entity-view/v2/album/%s", new Object[]{a2.f()})))).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$mxv$mF0r8fePT82GzatDLYzTRb19f_I<Object,Object>(this));
    }
}
