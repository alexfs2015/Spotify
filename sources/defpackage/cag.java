package defpackage;

import java.util.concurrent.Callable;

/* renamed from: cag reason: default package */
final /* synthetic */ class cag implements Callable {
    private final boolean a;
    private final String b;
    private final cah c;

    cag(boolean z, String str, cah cah) {
        this.a = z;
        this.b = str;
        this.c = cah;
    }

    public final Object call() {
        return caf.a(this.a, this.b, this.c);
    }
}
