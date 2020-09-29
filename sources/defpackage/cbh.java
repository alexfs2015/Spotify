package defpackage;

import java.util.concurrent.Callable;

/* renamed from: cbh reason: default package */
final class cbh extends cbg {
    private final Callable<String> c;

    private cbh(Callable<String> callable) {
        super(false, null, null);
        this.c = callable;
    }

    /* synthetic */ cbh(Callable callable, byte b) {
        this(callable);
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        try {
            return (String) this.c.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
