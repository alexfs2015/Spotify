package defpackage;

import java.util.concurrent.Callable;

/* renamed from: caq reason: default package */
final class caq extends cap {
    private final Callable<String> c;

    private caq(Callable<String> callable) {
        super(false, null, null);
        this.c = callable;
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        try {
            return (String) this.c.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* synthetic */ caq(Callable callable, byte b) {
        this(callable);
    }
}
