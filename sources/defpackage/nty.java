package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.features.homemix.models.HomeMixPlanType;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: nty reason: default package */
public final class nty {
    public final CompositeDisposable a = new CompositeDisposable();
    public ntz b;
    public nsu c;
    public HomeMixPlanType d = HomeMixPlanType.OTHER;
    public boolean e;
    private final npx f;
    private final String g;
    private final HomeMixFormatListAttributesHelper h;
    private final vjj i;
    private final ntm<xgo<Void>> j;

    public nty(npx npx, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, lbi lbi, vjj vjj, String str) {
        this.f = npx;
        this.h = homeMixFormatListAttributesHelper;
        this.i = vjj;
        this.g = str;
        this.j = new ntm<>(lbi, $$Lambda$nty$LHKCk44UpWTKJAdn4tDhytF_rw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(ntl ntl) {
        return ntl.e() ? this.i.a(this.g).a((SingleSource<T>) Single.b(ntl)) : Single.b(ntl);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th.getMessage(), new Object[0]);
        ntz ntz = this.b;
        if (ntz != null) {
            ntz.at();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vlc vlc) {
        HomeMix a2 = this.h.a(vlc);
        HomeMix a3 = this.h.a(vlc);
        this.c = a3 != null ? new nsq(a3.isUserEnabled(), a3.includeExplicit(), a3.isFamilyMember()) : null;
        this.e = a2 != null && a2.needsTasteOnboarding();
        this.d = a2 == null ? HomeMixPlanType.OTHER : a2.planType();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, ntl ntl) {
        Logger.b(ntl.toString(), new Object[0]);
        if (!ntl.b() && this.b != null) {
            if (ntl.c()) {
                this.b.at();
            } else if (ntl.d()) {
                this.b.ay();
            } else if (z) {
                this.b.aw();
            } else {
                this.b.ax();
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(xgo xgo) {
        return xgo != null && (xgo.a.c == 200 || xgo.a.c == 202);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource b(ntl ntl) {
        return ntl.e() ? this.i.a(this.g).a((SingleSource<T>) Single.b(ntl)) : Single.b(ntl);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e(th.getMessage(), new Object[0]);
        ntz ntz = this.b;
        if (ntz != null) {
            ntz.at();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(boolean z, ntl ntl) {
        Logger.b(ntl.toString(), new Object[0]);
        if (!ntl.b() && this.b != null) {
            if (ntl.c()) {
                this.b.at();
            } else if (ntl.d()) {
                this.b.ay();
            } else if (z) {
                this.b.av();
            } else {
                this.b.au();
            }
        }
    }

    public final void a() {
        fbp.a(this.c);
        boolean z = !this.c.b();
        this.a.a(this.f.a(ImmutableMap.b("publish_explicit", Boolean.valueOf(z))).a((SingleTransformer<? super T, ? extends R>) this.j).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$nty$yAfmUIRQXWncX_lcwMMSJbbDtI<Object,Object>(this)).d().e(ntl.a()).c(10, TimeUnit.SECONDS).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$nty$apRg9Y9FN8ORIeH2VwlxCtSLJ4<Object>(this, z), (Consumer<? super Throwable>) new $$Lambda$nty$Hy8oN6DKNt5LUdfPHJOOZh8Vk0s<Object>(this)));
    }

    public final void a(a aVar) {
        this.a.c();
        this.a.a(aVar.b().c().c((Function<? super T, ? extends R>) $$Lambda$HYgVOKXzvBPMUz8gp5LwXVmeGk.INSTANCE).a(AndroidSchedulers.a()).d((Consumer<? super T>) new $$Lambda$nty$djxMaWdjkb_0c13e_2q6HHp30<Object>(this)));
    }

    public final void b() {
        fbp.a(this.c);
        boolean z = !this.c.a();
        this.a.a(this.f.a(ImmutableMap.b("enabled", Boolean.valueOf(z))).a((SingleTransformer<? super T, ? extends R>) this.j).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$nty$p_c86Ye1RBC1DDUd9HlX6UVrD9w<Object,Object>(this)).d().e(ntl.a()).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$nty$AmOWFawhk3rW0XykitZ2TmE3pUE<Object>(this, z), (Consumer<? super Throwable>) new $$Lambda$nty$DY5eVp41fv4CtK_aDR9vujhGj_8<Object>(this)));
    }

    public final boolean c() {
        nsu nsu = this.c;
        return nsu != null && nsu.a();
    }
}
