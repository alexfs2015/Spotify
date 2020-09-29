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

/* renamed from: msu reason: default package */
public final class msu {
    private final RxResolver a;
    private final mvn b;
    private final JacksonResponseParser<HubsJsonViewModel> c;

    public msu(RxResolver rxResolver, mvn mvn, JacksonResponseParser<HubsJsonViewModel> jacksonResponseParser) {
        this.a = (RxResolver) fay.a(rxResolver);
        this.c = (JacksonResponseParser) fay.a(jacksonResponseParser);
        this.b = (mvn) fay.a(mvn);
    }

    public final wud<gzz> a(String str) {
        mvn mvn = this.b;
        jst a2 = jst.a(str);
        fay.a(a2.b == LinkType.ALBUM, (Object) "SpotifyLink needs to be of link type Album");
        return vun.a((wrf<T>) mvn.a.a(Uri.parse(String.format("hm://album-entity-view/v2/album/%s", new Object[]{a2.f()})))).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$msu$BzH0Bu5nZPvuJv5zPKoMxaq5xyc<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Uri uri) {
        return vun.a((ObservableSource<T>) this.a.resolve(RequestBuilder.get(uri.toString()).build()).a((ObservableTransformer<? super T, ? extends R>) this.c), BackpressureStrategy.BUFFER).a(gzz.class);
    }
}
