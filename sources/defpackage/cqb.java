package defpackage;

import java.util.concurrent.TimeoutException;

/* renamed from: cqb reason: default package */
final /* synthetic */ class cqb implements Runnable {
    private final cqt a;

    cqb(cqt cqt) {
        this.a = cqt;
    }

    public final void run() {
        this.a.a(new TimeoutException());
    }
}
