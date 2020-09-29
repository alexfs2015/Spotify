package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableCollectSingle;
import io.reactivex.internal.operators.flowable.FlowableLimit;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Map;

/* renamed from: tco reason: default package */
public final class tco {
    private final Flowable<PlayerState> a;
    private final tcu b;
    private final Flowable<lbg> c;
    private final Map<Type, tca> d;
    private final Map<Type, NowPlayingWidget> e;

    public tco(Flowable<PlayerState> flowable, tcu tcu, Flowable<lbg> flowable2, Map<Type, tca> map, Map<Type, NowPlayingWidget> map2) {
        this.a = flowable;
        this.b = tcu;
        this.c = flowable2;
        this.d = map;
        this.e = map2;
    }

    /* access modifiers changed from: private */
    public Flowable<ImmutableList<NowPlayingWidget>> a(PlayerState playerState) {
        return this.c.b((Predicate<? super T>) $$Lambda$qazvCN5xeb_MwCiGrEoCJ1S4oY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$a_SACf1ZhcnjGJO9pdXOVduWmO4.INSTANCE).f(new $$Lambda$tco$sSyP7NK47K2SHCFQ9zxPujgTbmg(this, playerState));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(PlayerState playerState, Boolean bool) {
        if (!bool.booleanValue()) {
            return Single.b(ImmutableList.d());
        }
        Flowable a2 = RxJavaPlugins.a((Flowable<T>) new FlowableLimit<T>(Flowable.a((Iterable<? extends T>) this.b.a()).a((Predicate<? super T>) new $$Lambda$tco$rERITDltCd_EVdYLtkcRkF5GKNE<Object>(this)).a((Predicate<? super T>) new $$Lambda$tco$xjGCSFRBRuI9H5hCyR6xn2KHuI<Object>(this, playerState)), 3));
        Map<Type, NowPlayingWidget> map = this.e;
        map.getClass();
        Flowable c2 = a2.c((Function<? super T, ? extends R>) new $$Lambda$bIj_BFcoQmhHRZQ4_Txv2ZXLw8c<Object,Object>(map));
        $$Lambda$1_UVSFdCcKO4iulzeb7ChUmM1Lc r4 = $$Lambda$1_UVSFdCcKO4iulzeb7ChUmM1Lc.INSTANCE;
        $$Lambda$unJlOjmY0plVe8K6h8kMHM_AhA r0 = $$Lambda$unJlOjmY0plVe8K6h8kMHM_AhA.INSTANCE;
        ObjectHelper.a(r4, "initialItemSupplier is null");
        ObjectHelper.a(r0, "collector is null");
        return RxJavaPlugins.a((Single<T>) new FlowableCollectSingle<T>(c2, r4, r0)).f($$Lambda$1Qd9_jnwEs6slQmj6sxP_Ovbv_Y.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(PlayerState playerState, Type type) {
        return ((tca) this.d.get(type)).a(playerState);
    }

    /* access modifiers changed from: private */
    public boolean a(Type type) {
        return this.d.containsKey(type) && this.e.containsKey(type);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(PlayerState playerState) {
        return playerState.track() != null;
    }

    public final Flowable<ImmutableList<NowPlayingWidget>> a() {
        return this.a.a((Predicate<? super T>) $$Lambda$tco$dGscoRL_p6ZEYBnsXlnEvy8GfEM.INSTANCE).a((Function<? super T, K>) $$Lambda$tco$vplVyD38qU6g6cxjnhEb3EoZCkE.INSTANCE).e(new $$Lambda$tco$UIC0fYpCMerQhOownwiAjqXeaM(this));
    }
}
