package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: wir reason: default package */
public final class wir {
    private static final wiq a = new wiq() {
        public final void a() {
            throw new RejectedExecutionException();
        }
    };

    public static wiq a() {
        return a;
    }
}
