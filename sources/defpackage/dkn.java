package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: dkn reason: default package */
public abstract class dkn implements Callable {
    protected final djc a;
    protected final dci b;
    protected Method c;
    private final String d = getClass().getSimpleName();
    private final String e;
    private final String f;
    private final int g;
    private final int h;

    public dkn(djc djc, String str, String str2, dci dci, int i, int i2) {
        this.a = djc;
        this.e = str;
        this.f = str2;
        this.b = dci;
        this.g = i;
        this.h = i2;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* renamed from: b */
    public Void call() {
        try {
            long nanoTime = System.nanoTime();
            this.c = this.a.a(this.e, this.f);
            if (this.c == null) {
                return null;
            }
            a();
            dii dii = this.a.h;
            if (!(dii == null || this.g == Integer.MIN_VALUE)) {
                dii.a(this.h, this.g, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
