package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2MiscComponents;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

/* renamed from: njj reason: default package */
public final class njj {
    private final Scheduler a;
    private final ndk b;
    private final ndb c;
    private final ndl d;
    private final niy e;
    private final nel f;
    private final nea g;
    private final gzz h;
    private final gzz i;
    private final wud<RecentlyPlayedItems> j;
    private final Observable<ned> k;

    public njj(boolean z, Scheduler scheduler, ndk ndk, ndb ndb, ndl ndl, nde nde, niy niy, nel nel, Observable<ned> observable, nea nea, wud<RecentlyPlayedItems> wud) {
        this.a = scheduler;
        this.b = ndk;
        this.c = ndb;
        this.d = ndl;
        this.e = niy;
        this.f = nel;
        this.g = nea;
        a builder = hai.builder();
        gzt[] gztArr = new gzt[1];
        String str = "ui:group";
        gztArr[0] = hae.builder().a("home:inlineEmptyState", HubsComponentCategory.CARD.mId).a(haf.builder().a(nde.a).b(z ? nde.f : nde.e).a()).c(HubsImmutableComponentBundle.builder().a(str, "home-offline-download-prompt").a()).a();
        this.h = builder.a(gztArr).a();
        a b2 = gyi.b();
        gzt[] gztArr2 = new gzt[1];
        String str2 = "home-no-network-empty-view";
        gztArr2[0] = hae.builder().a((gzr) HubsGlue2MiscComponents.EMPTY_STATE).a(haf.builder().a(nde.a).b(z ? nde.f : nde.e)).e(HubsImmutableComponentBundle.builder().a("tag", str2).a("style", "noResults").a()).c(HubsImmutableComponentBundle.builder().a(str, str2).a()).a();
        this.i = b2.c(gztArr2).a();
        this.j = wud;
        this.k = observable;
    }

    public final Observable<gzz> a() {
        return Observable.a((ObservableSource<? extends T1>) vun.b(wud.a(this.b.a().f(this.d).f(new $$Lambda$njj$NXXzHhgrqMjzrEOYwWsIg5S5a3U(this)).a(hai.EMPTY), this.j, (wuu<? super T1, ? super T2, ? extends R>) this.e)), (ObservableSource<? extends T2>) this.k.c((Function<? super T, ? extends R>) this.g).e((Function<? super Throwable, ? extends T>) $$Lambda$njj$2vGPcLPW5vOedDZD79YXOt02og.INSTANCE), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$njj$b7dcUQHin_Oo_alyPQ_AxnY92M<Object,Object,Object>(this)).e((Function<? super Throwable, ? extends T>) new $$Lambda$njj$AE9dmZ1FiWle2BJ2_QSyEcPzp18<Object,Object>(this)).c((Function<? super T, ? extends R>) new $$Lambda$njj$BKCli0gjvu5toRK0DNQhubmr3E<Object,Object>(this)).b(this.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz b(gzz gzz) {
        return (gzz) this.f.call(gzz, Integer.valueOf(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(gzz gzz, gzz gzz2) {
        if (gzz2.body().isEmpty() && gzz.body().isEmpty()) {
            return this.i;
        }
        if (gzz2.body().isEmpty()) {
            gzz2 = this.h;
        }
        return gzz2.toBuilder().b(gzz.body()).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(Throwable th) {
        return this.i;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(gzz gzz) {
        return ndb.a(gzz, "offline", Boolean.TRUE);
    }
}
