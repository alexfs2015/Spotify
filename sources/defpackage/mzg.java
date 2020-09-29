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

/* renamed from: mzg reason: default package */
public final class mzg {
    private final RxResolver a;
    private final wlc<rfe> b;
    private final mzx c;
    private final boolean d;
    private final JacksonResponseParser<HubsJsonViewModel> e;
    private final rdo f;
    private final skh g;
    private final txz h;
    private final tjb i;

    public mzg(RxResolver rxResolver, wlc<rfe> wlc, mzx mzx, boolean z, JacksonResponseParser<HubsJsonViewModel> jacksonResponseParser, rdo rdo, skh skh, tjb tjb, txz txz) {
        this.a = (RxResolver) fay.a(rxResolver);
        this.b = (wlc) fay.a(wlc);
        this.c = (mzx) fay.a(mzx);
        this.d = z;
        this.e = jacksonResponseParser;
        this.f = rdo;
        this.g = skh;
        this.i = tjb;
        this.h = txz;
    }

    public final wud<gzz> a(String str) {
        if (this.d) {
            return vun.a((wrf<T>) ((rfe) this.b.get()).a());
        }
        mzx mzx = this.c;
        jst a2 = jst.a(str);
        fay.a(a2.b == LinkType.TRACK, (Object) "SpotifyLink needs to be of link type Track");
        return vun.a((wrf<T>) mzx.a.a(Uri.parse(String.format("hm://track-entity-view/v2/track/%s", new Object[]{a2.f()})))).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$mzg$xp94rc0PO0nmeW1MOWUyJECLo<Object,Object>(this)).a((c<? super T, ? extends R>) this.h).a((c<? super T, ? extends R>) this.g).a((c<? super T, ? extends R>) this.i).a((c<? super T, ? extends R>) this.f);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Uri uri) {
        return vun.a((ObservableSource<T>) this.a.resolve(RequestBuilder.get(uri.toString()).build()).a((ObservableTransformer<? super T, ? extends R>) this.e), BackpressureStrategy.BUFFER).a(gzz.class);
    }
}
