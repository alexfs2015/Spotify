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
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;
import java.util.List;

/* renamed from: nsc reason: default package */
public final class nsc implements jor<ovg>, tvw {
    private final CompositeDisposable a = new CompositeDisposable();
    private oxw b;
    private final defpackage.oxw.a c;
    private final ouo d;
    private final HomeMixFormatListAttributesHelper e;
    private final hxx f;
    private final ItemListConfiguration g;
    private final nth h;
    private final HomeMixInteractionLogger i;
    private final CompletableSubject j = CompletableSubject.f();
    private final BehaviorSubject<a> k = BehaviorSubject.a();
    private final SerialDisposable l = new SerialDisposable();
    private nsf m;
    private HomeMix n;

    /* renamed from: nsc$a */
    static abstract class a {

        /* renamed from: nsc$a$a reason: collision with other inner class name */
        static abstract class C0064a {
            C0064a() {
            }

            /* access modifiers changed from: 0000 */
            public abstract C0064a a(HomeMix homeMix);

            /* access modifiers changed from: 0000 */
            public abstract C0064a a(List<vle> list);

            /* access modifiers changed from: 0000 */
            public abstract C0064a a(ntj ntj);

            /* access modifiers changed from: 0000 */
            public abstract C0064a a(vlc vlc);

            /* access modifiers changed from: 0000 */
            public abstract a a();
        }

        a() {
        }

        /* access modifiers changed from: 0000 */
        public abstract vlc a();

        /* access modifiers changed from: 0000 */
        public abstract ntj b();

        /* access modifiers changed from: 0000 */
        public abstract List<vle> c();

        /* access modifiers changed from: 0000 */
        public abstract HomeMix d();
    }

    public nsc(defpackage.oxw.a aVar, defpackage.ouo.a aVar2, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, nth nth, hxx hxx, HomeMixInteractionLogger homeMixInteractionLogger, ItemListConfiguration itemListConfiguration) {
        this.c = aVar;
        this.e = homeMixFormatListAttributesHelper;
        this.f = hxx;
        this.g = itemListConfiguration;
        this.d = aVar2.a(itemListConfiguration);
        this.h = nth;
        this.i = homeMixInteractionLogger;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C0064a a(oqg oqg, SessionState sessionState, C0064a aVar) {
        this.n = this.e.a(oqg.a());
        return aVar.a(oqg.a()).a(this.h.apply(oqg, sessionState)).a(this.n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        nsf nsf = this.m;
        nsf.c.a(nsf.a, num.intValue());
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        this.m.a(aVar);
        this.b.a(aVar.c(), this.g.j(), this.g.h(), this.g.i(), this.g.k(), this.g.l(), 0, new $$Lambda$nsc$nCuQGx_dIyFYcfiM9G1CAbYMaqk(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(a aVar) {
        this.k.onNext(aVar);
        this.j.onComplete();
    }

    public final Completable a() {
        return Completable.b((Iterable<? extends CompletableSource>) ImmutableList.a(this.j, this.d.a()));
    }

    public final void a(int i2, vle vle) {
        this.d.a(i2, vle);
        int i3 = i2;
        this.i.a(Section.ITEM_LIST, i3, vle.getUri(), "item-clicked", this.n);
    }

    public final void a(int i2, vle vle, boolean z) {
        this.d.a(i2, vle, z);
    }

    public final void a(nsf nsf) {
        this.m = nsf;
        this.d.a((ova) nsf);
        if (nsf != null) {
            this.l.a(this.k.d((Consumer<? super T>) new $$Lambda$nsc$vH0buSpI_0tXQzOYSUD9pKVsJg<Object>(this)));
        } else {
            this.l.a(Disposables.a());
        }
    }

    public final void a(defpackage.omg.a aVar) {
        this.b = this.c.a(aVar.a());
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) Observable.a((ObservableSource<? extends T1>) aVar.b().c(), (ObservableSource<? extends T2>) this.f.a.j(), (ObservableSource<? extends T3>) Observable.b(new a()), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new $$Lambda$nsc$o_trUip70fJ469C9SIJd6kslu7o<Object,Object,Object,Object>(this)), (ObservableSource<? extends T2>) aVar.b().b().c((Function<? super T, ? extends R>) $$Lambda$OGi9zAkMGILgCesvXX34lym30w.INSTANCE), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$tBufxpWFbLsbavmxLs_TMLbg7aU.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$6eO0BQZTquszzD88xrfNe4j5t5Y.INSTANCE).a(AndroidSchedulers.a());
        $$Lambda$nsc$PjfW6FkvlU0BhoCdwgi2yJztYI r2 = new $$Lambda$nsc$PjfW6FkvlU0BhoCdwgi2yJztYI(this);
        CompletableSubject completableSubject = this.j;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r2, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
        this.d.a(aVar);
    }

    public final void b() {
        this.a.c();
        this.b.a();
        this.d.b();
    }

    public final void b(int i2, vle vle) {
        vlf b2 = vle.b();
        if (b2 != null) {
            this.d.a(i2, vle, b2.inCollection(), true);
        }
    }

    public final void c(int i2, vle vle) {
        vlf b2 = vle.b();
        if (b2 != null) {
            this.d.b(i2, vle, b2.isBanned(), true);
        }
    }

    public final void d(int i2, vle vle) {
        this.d.b(i2, vle);
    }

    public final void e(int i2, vle vle) {
    }

    public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
        ovg ovg = (ovg) obj;
        HomeMixInteractionLogger homeMixInteractionLogger = this.i;
        String a2 = ovg.a();
        homeMixInteractionLogger.a(Section.ITEM_LIST, ovg.c(), a2, "item-context-menu-clicked", this.n);
        return this.d.a(ovg);
    }
}
