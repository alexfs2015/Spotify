package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fhd reason: default package */
final /* synthetic */ class fhd implements Executor {
    static final Executor a = new fhd();

    private fhd() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
