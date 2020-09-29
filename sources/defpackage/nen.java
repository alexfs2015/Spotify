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

/* renamed from: nen reason: default package */
public final class nen {
    private final RxResolver a;
    private final wzi<rog> b;
    private final nfe c;
    private final boolean d;
    private final JacksonResponseParser<HubsJsonViewModel> e;
    private final rmm f;
    private final suo g;
    private final uku h;
    private final ttt i;
    private final heg j;
    private final rmq k;

    public nen(RxResolver rxResolver, wzi<rog> wzi, nfe nfe, boolean z, JacksonResponseParser<HubsJsonViewModel> jacksonResponseParser, rmm rmm, suo suo, ttt ttt, uku uku, heg heg, rmq rmq) {
        this.a = (RxResolver) fbp.a(rxResolver);
        this.b = (wzi) fbp.a(wzi);
        this.c = (nfe) fbp.a(nfe);
        this.d = z;
        this.e = jacksonResponseParser;
        this.f = rmm;
        this.g = suo;
        this.i = ttt;
        this.h = uku;
        this.j = heg;
        this.k = rmq;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Uri uri) {
        return wit.a((ObservableSource<T>) this.a.resolve(RequestBuilder.get(uri.toString()).build()).a((ObservableTransformer<? super T, ? extends R>) this.e), BackpressureStrategy.BUFFER).a(hcs.class);
    }

    /* access modifiers changed from: private */
    public xii<hcs> a(xii<hcs> xii) {
        return this.j.a() ? xii.a((c<? super T, ? extends R>) this.k) : xii;
    }

    public final xii<hcs> a(String str) {
        if (this.d) {
            return wit.a((xfk<T>) ((rog) this.b.get()).a());
        }
        nfe nfe = this.c;
        jva a2 = jva.a(str);
        fbp.a(a2.b == LinkType.TRACK, (Object) "SpotifyLink needs to be of link type Track");
        return wit.a((xfk<T>) nfe.a.a(Uri.parse(String.format("hm://track-entity-view/v2/track/%s", new Object[]{a2.f()})))).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$nen$mIaIZh8QcvwtjttX8ff7BPeinU<Object,Object>(this)).a((c<? super T, ? extends R>) this.h).a((c<? super T, ? extends R>) this.g).a((c<? super T, ? extends R>) this.i).a((c<? super T, ? extends R>) new $$Lambda$nen$t3b5C1bU6D3LTwiMKRTI0sYrUs0<Object,Object>(this)).a((c<? super T, ? extends R>) this.f);
    }
}
