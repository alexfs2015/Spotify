package defpackage;

import java.util.concurrent.Callable;

/* renamed from: cax reason: default package */
final /* synthetic */ class cax implements Callable {
    private final boolean a;
    private final String b;
    private final cay c;

    cax(boolean z, String str, cay cay) {
        this.a = z;
        this.b = str;
        this.c = cay;
    }

    public final Object call() {
        return caw.a(this.a, this.b, this.c);
    }
}
