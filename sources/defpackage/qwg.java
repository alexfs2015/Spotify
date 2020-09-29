package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.features.trendingsearch.util.TrendingSearchesBehaviorFlag;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;

/* renamed from: qwg reason: default package */
public final class qwg {
    private final RxResolver a;
    private final wzi<rog> b;
    private final qwk c;
    private final qwt d;
    private final qwm e;
    private final qwo f;
    private final qwi g;
    private final qwc h;
    private final ObjectMapper i;
    private final Scheduler j;

    public qwg(RxResolver rxResolver, wzi<rog> wzi, qwk qwk, qwt qwt, qwm qwm, qwo qwo, qwi qwi, qwc qwc, ObjectMapper objectMapper, Scheduler scheduler) {
        this.a = rxResolver;
        this.b = wzi;
        this.c = qwk;
        this.d = qwt;
        this.e = qwm;
        this.f = qwo;
        this.g = qwi;
        this.h = qwc;
        this.i = objectMapper;
        this.j = scheduler;
    }

    public final Single<hcs> a(fqn fqn) {
        DebugFlag debugFlag = DebugFlag.TRENDING_SEARCH_LOCAL_HUBS;
        boolean b2 = qwt.b(fqn);
        RxResolver rxResolver = this.a;
        qwk qwk = this.c;
        Builder buildUpon = Uri.parse("hm://vanilla/v1/views/hub2/mo-trending-searches").buildUpon();
        buildUpon.appendQueryParameter("locale", qwk.a);
        if (b2) {
            buildUpon.appendQueryParameter("signal", "includepodcasts:true");
        }
        Observable a2 = rxResolver.resolve(RequestBuilder.get(buildUpon.build().toString()).build()).a((ObservableTransformer<? super T, ? extends R>) JacksonResponseParser.forClass(HubsJsonViewModel.class, this.i, this.j)).a(hcs.class).a(qwt.b(fqn) ? this.g : qwi.a).a(fqn.a(qws.a) == TrendingSearchesBehaviorFlag.ENABLED_SEARCH ? this.f : this.e);
        qwc qwc = this.h;
        qwc.getClass();
        return a2.b((Consumer<? super T>) new $$Lambda$HF0iAnhF7C02VE9rH7clECBhYqE<Object>(qwc)).h();
    }
}
