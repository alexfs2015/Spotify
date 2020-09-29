package defpackage;

import androidx.fragment.app.Fragment;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/* renamed from: ijt reason: default package */
public final class ijt {
    public final Fragment a;
    public final jxz b;
    public final ijr c;
    public Disposable d;
    private final fqn e;

    public ijt(Fragment fragment, fqn fqn, jxz jxz, ijr ijr) {
        this.a = fragment;
        this.e = fqn;
        this.b = jxz;
        this.c = ijr;
    }

    public final void a(boolean z) {
        this.c.a(z);
        Disposable disposable = this.d;
        if (disposable != null && disposable.b()) {
            this.d.bd_();
        }
        Observable a2 = this.c.a(this.a.n(), this.e);
        iic iic = new iic();
        a2.subscribe(iic);
        this.d = iic;
    }
}
