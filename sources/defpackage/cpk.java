package defpackage;

import java.util.concurrent.TimeoutException;

/* renamed from: cpk reason: default package */
final /* synthetic */ class cpk implements Runnable {
    private final cqc a;

    cpk(cqc cqc) {
        this.a = cqc;
    }

    public final void run() {
        this.a.a(new TimeoutException());
    }
}
