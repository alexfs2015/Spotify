package defpackage;

import androidx.fragment.app.Fragment;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/* renamed from: ihg reason: default package */
public final class ihg {
    public final Fragment a;
    public final jvr b;
    public final ihe c;
    public Disposable d;
    private final fpt e;

    public ihg(Fragment fragment, fpt fpt, jvr jvr, ihe ihe) {
        this.a = fragment;
        this.e = fpt;
        this.b = jvr;
        this.c = ihe;
    }

    public final void a(boolean z) {
        this.c.a(z);
        Disposable disposable = this.d;
        if (disposable != null && disposable.b()) {
            this.d.bf_();
        }
        Observable a2 = this.c.a(this.a.n(), this.e);
        ifp ifp = new ifp();
        a2.subscribe(ifp);
        this.d = ifp;
    }
}
