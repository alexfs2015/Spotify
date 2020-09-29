package defpackage;

import java.util.concurrent.Callable;

/* renamed from: clw reason: default package */
final /* synthetic */ class clw implements Callable {
    private final clv a;

    clw(clv clv) {
        this.a = clv;
    }

    public final Object call() {
        return clv.a(this.a.e);
    }
}
