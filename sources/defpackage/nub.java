package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.features.homemix.models.HomeMixTuning;
import com.spotify.music.features.homemix.models.HomeMixUser;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: nub reason: default package */
public final class nub {
    /* access modifiers changed from: private */
    public static final a k = a.t().a(Optional.b(Policy.builder().a(DecorationPolicy.builder().a(ListPolicy.builder().e(ImmutableMap.f()).b(ImmutableMap.f()).c(ImmutableMap.f()).d(ImmutableMap.f()).a(ImmutableMap.f()).a()).a(HeaderPolicy.builder().a(ImmutableMap.b("formatListAttributes", Boolean.TRUE)).c(ImmutableMap.f()).b(ImmutableMap.f()).a()).a()).a())).i(vkg.a(0, 0)).a();
    final nuk a;
    final HomeMixInteractionLogger b;
    HomeMix c;
    final Set<String> d = new HashSet();
    private final vjj e;
    private final npy f;
    private final HomeMixFormatListAttributesHelper g;
    /* access modifiers changed from: private */
    public final CompositeDisposable h = new CompositeDisposable();
    private final ntm<xgo<Void>> i;
    private final String j;

    public nub(final vje vje, vjj vjj, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, npy npy, final String str, lbi lbi, final a aVar, nuk nuk, HomeMixInteractionLogger homeMixInteractionLogger) {
        this.e = vjj;
        this.g = homeMixFormatListAttributesHelper;
        this.f = npy;
        this.j = str;
        this.i = new ntm<>(lbi, $$Lambda$nub$IrE49wvIjluvRp8usy2hXwo9F3E.INSTANCE);
        this.a = (nuk) fbp.a(nuk);
        this.b = (HomeMixInteractionLogger) fbp.a(homeMixInteractionLogger);
        aVar.a(new c() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(vld vld) {
                nub.a(nub.this, vld.a());
            }

            public final void a() {
                super.a();
                nub.this.h.c();
            }

            public final void aN_() {
                super.aN_();
                aVar.b(this);
            }

            public final void c() {
                super.c();
                nub.this.h.a(vje.b(str, nub.k).a(AndroidSchedulers.a()).d((Consumer<? super T>) new $$Lambda$nub$1$pJ8E4p9aoqzaEQ4rfMTmowTksUU<Object>(this)));
            }
        });
    }

    /* access modifiers changed from: private */
    public Observable<ntl<HomeMixTuning>> a(HomeMixTuning homeMixTuning) {
        return this.f.a(this.j, homeMixTuning).a((SingleTransformer<? super T, ? extends R>) this.i).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$nub$wIeTJLF_wdgxwc1GjMd8myx8_3g<Object,Object>(this, homeMixTuning)).d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(HomeMixTuning homeMixTuning, ntl ntl) {
        return ntl.e() ? this.e.a(this.j).a((SingleSource<T>) Single.b(ntl.a(homeMixTuning))) : Single.b(ntl.a(ntl.a));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ntl ntl) {
        if (ntl.c() || ntl.d()) {
            Logger.e(ntl.toString(), new Object[0]);
        }
    }

    static /* synthetic */ void a(nub nub, vlc vlc) {
        nub.c = nub.g.a(vlc);
        if (nub.c != null) {
            ArrayList a2 = Lists.a();
            for (HomeMixUser homeMixUser : nub.c.users()) {
                if (homeMixUser.isEnabled()) {
                    a2.add(homeMixUser);
                }
                if (!homeMixUser.isPresent()) {
                    nub.d.add(homeMixUser.getUsername());
                }
            }
            nub.a.a(a2);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(xgo xgo) {
        return xgo != null && (xgo.a.c == 200 || xgo.a.c == 202);
    }

    public final void a() {
        CompositeDisposable compositeDisposable = this.h;
        Observable d2 = Single.b(HomeMixTuning.create(this.c.style(), new ArrayList(this.d))).d((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$nub$ZbAvhYgHVpdwIonRSWwz93LSOZM<Object,Object>(this));
        nuk nuk = this.a;
        nuk.getClass();
        compositeDisposable.a(d2.b((Action) new $$Lambda$iR2e54aAKu1K_IX00XS_nd4r8kI(nuk)).a((Consumer<? super T>) $$Lambda$nub$EF8B5kI6DgNEpKojcJydMs7VGVc.INSTANCE, (Consumer<? super Throwable>) $$Lambda$nub$7pij3_1BlVgRek71eBQoDZ7Twnk.INSTANCE));
    }
}
