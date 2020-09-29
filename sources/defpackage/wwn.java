package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wwn reason: default package */
public final class wwn implements Executor {
    public static final wwn a = new wwn();

    private wwn() {
    }

    public final void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
            return;
        }
        throw new NullPointerException("command");
    }
}
