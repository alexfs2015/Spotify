package defpackage;

import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.features.homemix.models.HomeMixTuning;
import com.spotify.music.features.homemix.models.HomeMixUser;
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

/* renamed from: noa reason: default package */
public final class noa {
    final HomeMixFormatListAttributesHelper a;
    final CompositeDisposable b = new CompositeDisposable();
    final noj c;
    final HomeMixInteractionLogger d;
    HomeMix e;
    final Set<String> f = new HashSet();
    private final uxh g;
    private final nke h;
    private final nnl<wsj<Void>> i;
    private final String j;

    public noa(final oix oix, uxh uxh, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, nke nke, String str, kxz kxz, final a aVar, noj noj, HomeMixInteractionLogger homeMixInteractionLogger) {
        this.g = uxh;
        this.a = homeMixFormatListAttributesHelper;
        this.h = nke;
        this.j = str;
        this.i = new nnl<>(kxz, $$Lambda$noa$XwcIajJMb8_1R1A1njn3xwyBT9E.INSTANCE);
        this.c = (noj) fay.a(noj);
        this.d = (HomeMixInteractionLogger) fay.a(homeMixInteractionLogger);
        aVar.a(new c() {
            public final void c() {
                super.c();
                noa.this.b.a(oix.c().a(AndroidSchedulers.a()).d((Consumer<? super T>) new $$Lambda$noa$1$wjxzNc11sFhnODEkRrz_mMZtV6Y<Object>(this)));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(ojc ojc) {
                noa noa = noa.this;
                noa.e = noa.a.a(ojc.a());
                if (noa.e != null) {
                    ArrayList a2 = Lists.a();
                    for (HomeMixUser homeMixUser : noa.e.users()) {
                        if (homeMixUser.isEnabled()) {
                            a2.add(homeMixUser);
                        }
                        if (!homeMixUser.isPresent()) {
                            noa.f.add(homeMixUser.getUsername());
                        }
                    }
                    noa.c.a(a2);
                }
            }

            public final void a() {
                super.a();
                noa.this.b.c();
            }

            public final void aP_() {
                super.aP_();
                aVar.b(this);
            }
        });
    }

    public final void a() {
        CompositeDisposable compositeDisposable = this.b;
        Observable d2 = Single.b(HomeMixTuning.create(this.e.style(), new ArrayList(this.f))).d((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$noa$2pP1fcz3pxQpcJ5a7t91ctI4M<Object,Object>(this));
        noj noj = this.c;
        noj.getClass();
        compositeDisposable.a(d2.b((Action) new $$Lambda$Zf7fYIlYz5EWEDRFa0XFE9INDk(noj)).a((Consumer<? super T>) $$Lambda$noa$aDIpoR652AqpxqCH5QnF2fT_KE.INSTANCE, (Consumer<? super Throwable>) $$Lambda$noa$8NsqSRDE3ka23rnNVcS0lEdpXBs.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(nnk nnk) {
        if (nnk.c() || nnk.d()) {
            Logger.e(nnk.toString(), new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public Observable<nnk<HomeMixTuning>> a(HomeMixTuning homeMixTuning) {
        return this.h.a(this.j, homeMixTuning).a((SingleTransformer<? super T, ? extends R>) this.i).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$noa$Kz8udOnIfxlC85SBpREAes4hRk<Object,Object>(this, homeMixTuning)).d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(HomeMixTuning homeMixTuning, nnk nnk) {
        if (nnk.e()) {
            return this.g.a(this.j).a((SingleSource<T>) Single.b(nnk.a(homeMixTuning)));
        }
        return Single.b(nnk.a(nnk.a));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(wsj wsj) {
        return wsj != null && (wsj.a.c == 200 || wsj.a.c == 202);
    }
}
