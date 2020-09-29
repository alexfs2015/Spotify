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

/* renamed from: qnx reason: default package */
public final class qnx {
    private final RxResolver a;
    private final wlc<rfe> b;
    private final qob c;
    private final qok d;
    private final qod e;
    private final qof f;
    private final qnz g;
    private final qnt h;
    private final ObjectMapper i;
    private final Scheduler j;

    public qnx(RxResolver rxResolver, wlc<rfe> wlc, qob qob, qok qok, qod qod, qof qof, qnz qnz, qnt qnt, ObjectMapper objectMapper, Scheduler scheduler) {
        this.a = rxResolver;
        this.b = wlc;
        this.c = qob;
        this.d = qok;
        this.e = qod;
        this.f = qof;
        this.g = qnz;
        this.h = qnt;
        this.i = objectMapper;
        this.j = scheduler;
    }

    public final Single<gzz> a(fpt fpt) {
        DebugFlag debugFlag = DebugFlag.TRENDING_SEARCH_LOCAL_HUBS;
        boolean b2 = qok.b(fpt);
        RxResolver rxResolver = this.a;
        qob qob = this.c;
        Builder buildUpon = Uri.parse("hm://vanilla/v1/views/hub2/mo-trending-searches").buildUpon();
        buildUpon.appendQueryParameter("locale", qob.a);
        if (b2) {
            buildUpon.appendQueryParameter("signal", "includepodcasts:true");
        }
        Observable a2 = rxResolver.resolve(RequestBuilder.get(buildUpon.build().toString()).build()).a((ObservableTransformer<? super T, ? extends R>) JacksonResponseParser.forClass(HubsJsonViewModel.class, this.i, this.j)).a(gzz.class).a(qok.b(fpt) ? this.g : qnz.a).a(fpt.a(qoj.a) == TrendingSearchesBehaviorFlag.ENABLED_SEARCH ? this.f : this.e);
        qnt qnt = this.h;
        qnt.getClass();
        return a2.b((Consumer<? super T>) new $$Lambda$vzbmEIv6UQglonbe6yU3sRddo9s<Object>(qnt)).h();
    }
}
