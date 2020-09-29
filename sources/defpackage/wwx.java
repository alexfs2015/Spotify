package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: wwx reason: default package */
public final class wwx {
    private static final www a = new www() {
        public final void a() {
            throw new RejectedExecutionException();
        }
    };

    public static www a() {
        return a;
    }
}
