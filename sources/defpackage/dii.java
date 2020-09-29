package defpackage;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: dii reason: default package */
public class dii {
    protected static volatile doc a = null;
    /* access modifiers changed from: private */
    public static final ConditionVariable d = new ConditionVariable();
    private static volatile Random e = null;
    protected volatile Boolean b;
    /* access modifiers changed from: private */
    public djc c;

    public dii(djc djc) {
        this.c = djc;
        djc.b.execute(new dij(this));
    }

    public static int a() {
        try {
            return VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : c().nextInt();
        } catch (RuntimeException unused) {
            return c().nextInt();
        }
    }

    private static Random c() {
        if (e == null) {
            synchronized (dii.class) {
                if (e == null) {
                    e = new Random();
                }
            }
        }
        return e;
    }

    public final void a(int i, int i2, long j) {
        try {
            d.block();
            if (this.b.booleanValue() && a != null) {
                cyl cyl = new cyl();
                cyl.a = this.c.a.getPackageName();
                cyl.b = Long.valueOf(j);
                dod a2 = a.a(dgw.a((dgw) cyl));
                a2.a = i2;
                a2.b = i;
                a2.a();
            }
        } catch (Exception unused) {
        }
    }
}
