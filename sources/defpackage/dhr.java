package defpackage;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: dhr reason: default package */
public class dhr {
    protected static volatile dnl a = null;
    /* access modifiers changed from: private */
    public static final ConditionVariable d = new ConditionVariable();
    private static volatile Random e = null;
    protected volatile Boolean b;
    /* access modifiers changed from: private */
    public dil c;

    public static int a() {
        try {
            return VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : c().nextInt();
        } catch (RuntimeException unused) {
            return c().nextInt();
        }
    }

    private static Random c() {
        if (e == null) {
            synchronized (dhr.class) {
                if (e == null) {
                    e = new Random();
                }
            }
        }
        return e;
    }

    public dhr(dil dil) {
        this.c = dil;
        dil.b.execute(new dhs(this));
    }

    public final void a(int i, int i2, long j) {
        try {
            d.block();
            if (this.b.booleanValue() && a != null) {
                cxu cxu = new cxu();
                cxu.a = this.c.a.getPackageName();
                cxu.b = Long.valueOf(j);
                dnm a2 = a.a(dgf.a((dgf) cxu));
                a2.a = i2;
                a2.b = i;
                a2.a();
            }
        } catch (Exception unused) {
        }
    }
}
