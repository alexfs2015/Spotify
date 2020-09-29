package defpackage;

import java.util.concurrent.Executor;

/* renamed from: few reason: default package */
final /* synthetic */ class few implements Executor {
    static final Executor a = new few();

    private few() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
