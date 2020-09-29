package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wih reason: default package */
public final class wih implements Executor {
    public static final wih a = new wih();

    private wih() {
    }

    public final void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
            return;
        }
        throw new NullPointerException("command");
    }
}
