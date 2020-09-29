package defpackage;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bty reason: default package */
final class bty implements b {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ btb b;
    private final /* synthetic */ btw c;

    bty(btw btw, AtomicReference atomicReference, btb btb) {
        this.c = btw;
        this.a = atomicReference;
        this.b = btb;
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
        this.c.a((bsh) this.a.get(), this.b, true);
    }
}
