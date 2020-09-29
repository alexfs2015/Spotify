package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.feedback.FeedbackValue;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;
import java.util.List;

/* renamed from: tuz reason: default package */
final class tuz implements jor<ovg>, tvw {
    final CompositeDisposable a = new CompositeDisposable();
    oxw b;
    final ouo c;
    final CompletableSubject d = CompletableSubject.f();
    private final ItemListConfiguration e;
    private final a f;
    private final hhc g;
    private final String h;
    private final BehaviorSubject<ho<oqf, oqg>> i = BehaviorSubject.a();
    private final SerialDisposable j = new SerialDisposable();
    private tuv k;
    private final rkc l;

    public tuz(a aVar, hhc hhc, a aVar2, rkc rkc, String str, ItemListConfiguration itemListConfiguration) {
        this.e = itemListConfiguration;
        this.f = aVar;
        this.c = aVar2.a(itemListConfiguration);
        this.g = hhc;
        this.l = rkc;
        this.h = str;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        oqf oqf = (oqf) fbp.a(hoVar.a);
        oqg oqg = (oqg) fbp.a(hoVar.b);
        List a2 = oqf.a();
        this.k.a(oqg.a(), a2);
        this.b.a(a2, this.e.j(), this.e.h(), this.e.i(), this.e.k(), this.e.l(), 0, new $$Lambda$tuz$i513YGS6AgbIWjRG_NaF6LNmcI(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        num.intValue();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ho hoVar) {
        this.i.onNext(hoVar);
        this.d.onComplete();
    }

    public final void a(int i2, vle vle) {
        this.c.a(i2, vle);
    }

    public final void a(int i2, vle vle, boolean z) {
        this.c.a(i2, vle, z);
    }

    public final void a(a aVar) {
        this.b = this.f.a(aVar.a());
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) aVar.b().b(), (ObservableSource<? extends T2>) aVar.b().c(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$XOFTafTE3HUAHpkswss2ae2f3w.INSTANCE).a(AndroidSchedulers.a());
        $$Lambda$tuz$_Vlt9dFm1_pzOpGAMJnUWrt9XI4 r2 = new $$Lambda$tuz$_Vlt9dFm1_pzOpGAMJnUWrt9XI4(this);
        CompletableSubject completableSubject = this.d;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r2, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
        this.c.a(aVar);
    }

    public final void a(tuv tuv) {
        this.k = tuv;
        this.c.a((ova) tuv);
        if (tuv != null) {
            this.j.a(this.i.d((Consumer<? super T>) new $$Lambda$tuz$1RA0zRaHKWtEK1r486wk7QexdTs<Object>(this)));
        } else {
            this.j.a(Disposables.a());
        }
    }

    public final void b(int i2, vle vle) {
        vlf b2 = vle.b();
        if (b2 != null) {
            this.c.a(i2, vle, b2.inCollection(), true);
        }
    }

    public final void c(int i2, vle vle) {
        if (FeedbackValue.ON == FeedbackValue.a((String) vle.c().get(Metadata.DISLIKE_FEEDBACK_SELECTED))) {
            String str = "feedback_uri";
            this.a.a(this.l.a(vle.c().containsKey(str) ? (String) vle.c().get(str) : vle.getUri(), this.h, vle.getUri(), "").a(this.g.c()).a((Action) $$Lambda$tuz$t8mLUumlRTSsRKIAVb21tH4IpBQ.INSTANCE, (Consumer<? super Throwable>) $$Lambda$UuJCr4f1t6RMc8EbyiGeQ5J0UYE.INSTANCE));
            return;
        }
        vlf b2 = vle.b();
        if (b2 != null) {
            this.c.b(i2, vle, b2.isBanned(), true);
        }
    }

    public final void d(int i2, vle vle) {
        this.c.b(i2, vle);
    }

    public final void e(int i2, vle vle) {
    }

    public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
        return this.c.a((ovg) obj);
    }
}
