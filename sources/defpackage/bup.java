package defpackage;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bup reason: default package */
final class bup implements b {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ bts b;
    private final /* synthetic */ bun c;

    bup(bun bun, AtomicReference atomicReference, bts bts) {
        this.c = bun;
        this.a = atomicReference;
        this.b = bts;
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
        this.c.a((bsy) this.a.get(), this.b, true);
    }
}
