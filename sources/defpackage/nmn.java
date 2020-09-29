package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger.Section;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.subjects.CompletableSubject;
import java.util.List;

/* renamed from: nmn reason: default package */
public final class nmn implements jmf<ooa>, tke {
    private final CompositeDisposable a = new CompositeDisposable();
    private final oix b;
    private final oqq c;
    private final oni d;
    private final HomeMixFormatListAttributesHelper e;
    private final hvl f;
    private final ItemListConfiguration g;
    private final nng h;
    private final HomeMixInteractionLogger i;
    private final CompletableSubject j = CompletableSubject.f();
    private nmq k;
    private HomeMix l;

    /* renamed from: nmn$a */
    static abstract class a {

        /* renamed from: nmn$a$a reason: collision with other inner class name */
        static abstract class C0063a {
            /* access modifiers changed from: 0000 */
            public abstract C0063a a(HomeMix homeMix);

            /* access modifiers changed from: 0000 */
            public abstract C0063a a(List<uzb> list);

            /* access modifiers changed from: 0000 */
            public abstract C0063a a(nni nni);

            /* access modifiers changed from: 0000 */
            public abstract C0063a a(uyz uyz);

            /* access modifiers changed from: 0000 */
            public abstract a a();

            C0063a() {
            }
        }

        /* access modifiers changed from: 0000 */
        public abstract uyz a();

        /* access modifiers changed from: 0000 */
        public abstract nni b();

        /* access modifiers changed from: 0000 */
        public abstract List<uzb> c();

        /* access modifiers changed from: 0000 */
        public abstract HomeMix d();

        a() {
        }
    }

    public final void e(int i2, uzb uzb) {
    }

    public final /* synthetic */ jms onCreateContextMenu(Object obj) {
        ooa ooa = (ooa) obj;
        HomeMixInteractionLogger homeMixInteractionLogger = this.i;
        String a2 = ooa.a();
        homeMixInteractionLogger.a(Section.ITEM_LIST, ooa.c(), a2, "item-context-menu-clicked", this.l);
        return this.d.a(ooa);
    }

    public nmn(oix oix, defpackage.oqq.a aVar, orf orf, defpackage.oni.a aVar2, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, nng nng, hvl hvl, HomeMixInteractionLogger homeMixInteractionLogger, ItemListConfiguration itemListConfiguration) {
        this.b = oix;
        this.c = aVar.a(orf);
        this.e = homeMixFormatListAttributesHelper;
        this.f = hvl;
        this.g = itemListConfiguration;
        this.d = aVar2.a(itemListConfiguration);
        this.h = nng;
        this.i = homeMixInteractionLogger;
    }

    public final Completable a() {
        return Completable.b((Iterable<? extends CompletableSource>) ImmutableList.a(this.j, this.d.a()));
    }

    public final void a(defpackage.ofc.a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) Observable.a((ObservableSource<? extends T1>) this.b.c(), (ObservableSource<? extends T2>) this.f.a.j(), (ObservableSource<? extends T3>) Observable.b(new a()), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new $$Lambda$nmn$3aW2JqOUyy_1mhH7ZzRfNpH6Os<Object,Object,Object,Object>(this)), (ObservableSource<? extends T2>) this.b.b().c((Function<? super T, ? extends R>) $$Lambda$i1_25Nif0Ezy_RXPCnMfIGfoVQ.INSTANCE), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$BE0RM7WCKFHbkp16lr7N4uR290.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$Zo9fAw3L1UkqvwCtMpTyb2ihePs.INSTANCE).a(AndroidSchedulers.a());
        $$Lambda$nmn$N08OdRZlTiKQK0ouVsuCJdY9Xj4 r2 = new $$Lambda$nmn$N08OdRZlTiKQK0ouVsuCJdY9Xj4(this);
        CompletableSubject completableSubject = this.j;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r2, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
        this.d.a(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C0063a a(ojc ojc, SessionState sessionState, C0063a aVar) {
        this.l = this.e.a(ojc.a());
        return aVar.a(ojc.a()).a(this.h.apply(ojc, sessionState)).a(this.l);
    }

    public final void b() {
        this.a.c();
        this.c.a();
        this.d.b();
    }

    public final void a(nmq nmq) {
        this.k = nmq;
        this.d.a((onu) nmq);
    }

    public final void a(int i2, uzb uzb) {
        this.d.a(i2, uzb);
        int i3 = i2;
        this.i.a(Section.ITEM_LIST, i3, uzb.getUri(), "item-clicked", this.l);
    }

    public final void b(int i2, uzb uzb) {
        uzc b2 = uzb.b();
        if (b2 != null) {
            this.d.a(i2, uzb, b2.inCollection(), true);
        }
    }

    public final void c(int i2, uzb uzb) {
        uzc b2 = uzb.b();
        if (b2 != null) {
            this.d.b(i2, uzb, b2.isBanned(), true);
        }
    }

    public final void d(int i2, uzb uzb) {
        this.d.b(i2, uzb);
    }

    public final void a(int i2, uzb uzb, boolean z) {
        this.d.a(i2, uzb, z);
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        this.k.a(aVar);
        this.c.a(aVar.c(), this.g.j(), this.g.h(), this.g.i(), this.g.k(), this.g.l(), 0, new $$Lambda$nmn$CKIFqPTzvzQroJzhAh9SM3VSXcQ(this));
        this.j.onComplete();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        nmq nmq = this.k;
        nmq.c.a(nmq.a, num.intValue());
    }
}
