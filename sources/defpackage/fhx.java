package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fhx reason: default package */
final /* synthetic */ class fhx implements Executor {
    static final Executor a = new fhx();

    private fhx() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
