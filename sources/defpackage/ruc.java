package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: ruc reason: default package */
public final class ruc {
    public boolean a;
    private final rue b;
    private final jtz c;
    private rmc d;
    private a e;
    private Disposable f;
    private long g;

    ruc(rue rue, jtz jtz) {
        this.b = rue;
        this.c = jtz;
    }

    private void a(String str, long j, String str2, String str3, String str4) {
        this.b.a(str, j, str2, str3, str4);
    }

    private void a(a aVar, long j) {
        fbp.a(aVar);
        a("enter", this.g, PageIdentifiers.UNKNOWN_NOTLOADED.mPageIdentifier, aVar.a(), null);
        a("exit", j, PageIdentifiers.UNKNOWN_NOTLOADED.mPageIdentifier, aVar.a(), null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rmb rmb) {
        long a2 = this.c.a();
        rmc rmc = this.d;
        if (rmc != null) {
            a(rmc, a2);
        }
        if (rmb instanceof rmc) {
            rmc rmc2 = (rmc) rmb;
            a aVar = this.e;
            if (aVar != null && aVar.a().equals(rmc2.b())) {
                a2 = this.g;
            }
            long j = a2;
            this.d = rmc2;
            this.e = null;
            fbp.a(rmc2);
            a("enter", j, rmc2.a(), rmc2.b(), rmc2.c());
            if (rmc2.a().equals(PageIdentifiers.UNKNOWN_UNCOVERED.mPageIdentifier)) {
                this.b.a.a(new am(rmc2.a(), rmc2.d(), false));
            }
            return;
        }
        if (rmb instanceof a) {
            a aVar2 = this.e;
            if (aVar2 != null) {
                a(aVar2, a2);
            }
            this.d = null;
            this.e = (a) rmb;
            this.g = a2;
        }
    }

    private void a(rmc rmc, long j) {
        fbp.a(rmc);
        a("exit", j, rmc.a(), rmc.b(), rmc.c());
    }

    public void a(Observable<rmb> observable, boolean z) {
        this.f = observable.b(z ? 1 : 0).a((Consumer<? super T>) new $$Lambda$ruc$BVB0UyT_k5KM_K_58xrRCzADg<Object>(this), (Consumer<? super Throwable>) $$Lambda$ruc$mFrUjmK_ICIHEbS8NtbAoYjgicg.INSTANCE);
    }

    public final void a(boolean z) {
        this.a = z;
        if (!z) {
            long a2 = this.c.a();
            rmc rmc = this.d;
            if (rmc != null) {
                a(rmc, a2);
                this.d = null;
            } else {
                a aVar = this.e;
                if (aVar != null) {
                    a(aVar, a2);
                    this.e = null;
                }
            }
        }
        Disposable disposable = this.f;
        if (disposable != null) {
            disposable.bd_();
            this.f = null;
        }
    }
}
