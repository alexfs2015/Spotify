package defpackage;

import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: orp reason: default package */
final class orp {
    final CompositeDisposable a = new CompositeDisposable();
    final orl b;
    final hec c;
    final szp d;
    final String e;
    final CompletableSubject f = CompletableSubject.f();
    private final ooe g;
    private final opw h;
    private final Scheduler i;
    private final BehaviorSubject<oqg> j = BehaviorSubject.a();
    private final SerialDisposable k = new SerialDisposable();
    private ort l;

    public orp(opw opw, orl orl, hec hec, szp szp, String str, Scheduler scheduler, ooe ooe) {
        this.h = opw;
        this.i = scheduler;
        this.b = orl;
        this.c = hec;
        this.g = ooe;
        this.d = szp;
        this.e = str;
    }

    /* access modifiers changed from: private */
    public void a(oqg oqg) {
        boolean z = oqg.n() && oqg.b().a().b();
        boolean z2 = !z && oqg.n();
        vlc a2 = oqg.a();
        String a3 = a2.a();
        String str = "";
        if (z) {
            this.l.a(true);
            this.l.a((String) oqg.b().a().a(str));
            a(false, oqg.m());
        } else if (z2) {
            this.l.a(false);
            a(true, oqg.m());
            vlg d2 = a2.d();
            if (d2 != null) {
                String c2 = d2.c();
                str = c2 != null ? c2 : d2.b();
            }
            if (!oqg.m() || !this.g.a()) {
                this.l.a(a3, str);
                this.l.d(oqg.m());
                this.l.b(a2.getImageUri(Size.LARGE));
            }
        } else {
            this.l.a(false);
            a(false, oqg.m());
        }
    }

    private void a(boolean z, boolean z2) {
        if (!z2 || !this.g.a()) {
            this.l.b(z);
        } else {
            this.l.c(z);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(oqg oqg) {
        this.j.onNext(oqg);
        this.f.onComplete();
    }

    public final void a(a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        opw opw = this.h;
        opw.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$NOnjttzPKmBGTL4ar_lrEjmVub8<Object,Object>(opw)).a(this.i);
        $$Lambda$orp$UNUD0WUzA7I_8PJ5fyQRSYy_qdI r1 = new $$Lambda$orp$UNUD0WUzA7I_8PJ5fyQRSYy_qdI(this);
        CompletableSubject completableSubject = this.f;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    public final void a(ort ort) {
        this.l = ort;
        if (ort != null) {
            this.k.a(this.j.d((Consumer<? super T>) new $$Lambda$orp$2KyI_hf1Jy7tcaCCT3UMdfpUU<Object>(this)));
        } else {
            this.k.a(Disposables.a());
        }
    }
}
