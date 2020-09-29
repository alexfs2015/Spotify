package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: rkw reason: default package */
public final class rkw {
    public boolean a;
    private final rky b;
    private final jrp c;
    private rde d;
    private a e;
    private Disposable f;
    private long g;

    rkw(rky rky, jrp jrp) {
        this.b = rky;
        this.c = jrp;
    }

    public final void a(boolean z) {
        this.a = z;
        if (!z) {
            long a2 = this.c.a();
            rde rde = this.d;
            if (rde != null) {
                a(rde, a2);
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
            disposable.bf_();
            this.f = null;
        }
    }

    public void a(Observable<rdd> observable, boolean z) {
        this.f = observable.b(z ? 1 : 0).a((Consumer<? super T>) new $$Lambda$rkw$NPqCdSVeRwZeZGh8nuM0XdpfewA<Object>(this), (Consumer<? super Throwable>) $$Lambda$rkw$Y8XQnfBFITZPku6CBjmKNmnBj4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rdd rdd) {
        long a2 = this.c.a();
        rde rde = this.d;
        if (rde != null) {
            a(rde, a2);
        }
        if (rdd instanceof rde) {
            rde rde2 = (rde) rdd;
            a aVar = this.e;
            if (aVar != null && aVar.a().equals(rde2.b())) {
                a2 = this.g;
            }
            long j = a2;
            this.d = rde2;
            this.e = null;
            fay.a(rde2);
            a("enter", j, rde2.a(), rde2.b(), rde2.c());
            if (rde2.a().equals(PageIdentifiers.UNKNOWN_UNCOVERED.mPageIdentifier)) {
                this.b.a.a(new an(rde2.a(), rde2.d(), false));
            }
            return;
        }
        if (rdd instanceof a) {
            a aVar2 = this.e;
            if (aVar2 != null) {
                a(aVar2, a2);
            }
            this.d = null;
            this.e = (a) rdd;
            this.g = a2;
        }
    }

    private void a(a aVar, long j) {
        fay.a(aVar);
        a("enter", this.g, PageIdentifiers.UNKNOWN_NOTLOADED.mPageIdentifier, aVar.a(), null);
        a("exit", j, PageIdentifiers.UNKNOWN_NOTLOADED.mPageIdentifier, aVar.a(), null);
    }

    private void a(rde rde, long j) {
        fay.a(rde);
        a("exit", j, rde.a(), rde.b(), rde.c());
    }

    private void a(String str, long j, String str2, String str3, String str4) {
        this.b.a(str, j, str2, str3, str4);
    }
}
