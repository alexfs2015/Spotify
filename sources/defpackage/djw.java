package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: djw reason: default package */
public abstract class djw implements Callable {
    protected final dil a;
    protected final dbr b;
    protected Method c;
    private final String d = getClass().getSimpleName();
    private final String e;
    private final String f;
    private final int g;
    private final int h;

    public djw(dil dil, String str, String str2, dbr dbr, int i, int i2) {
        this.a = dil;
        this.e = str;
        this.f = str2;
        this.b = dbr;
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
            dhr dhr = this.a.h;
            if (!(dhr == null || this.g == Integer.MIN_VALUE)) {
                dhr.a(this.h, this.g, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
