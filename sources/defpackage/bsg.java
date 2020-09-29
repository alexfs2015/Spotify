package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import defpackage.bsc.d;

/* renamed from: bsg reason: default package */
public class bsg<O extends d> {
    public final Context a;
    public final bsc<O> b;
    public final O c;
    public final bvj<O> d;
    public final Looper e;
    public final int f;
    public final bsh g;
    protected final bss h;
    private final bta i;

    /* renamed from: bsg$a */
    public static class a {
        public static final a a = new C0018a().a();
        public final bta b;
        public final Looper c;

        /* renamed from: bsg$a$a reason: collision with other inner class name */
        public static class C0018a {
            Looper a;
            private bta b;

            public final C0018a a(bta bta) {
                bwx.a(bta, (Object) "StatusExceptionMapper must not be null.");
                this.b = bta;
                return this;
            }

            public final a a() {
                if (this.b == null) {
                    this.b = new bsp();
                }
                if (this.a == null) {
                    this.a = Looper.getMainLooper();
                }
                return new a(this.b, this.a, 0);
            }
        }

        private a(bta bta, Looper looper) {
            this.b = bta;
            this.c = looper;
        }

        /* synthetic */ a(bta bta, Looper looper, byte b2) {
            this(bta, looper);
        }
    }

    private bsg(Activity activity, bsc<O> bsc, O o, a aVar) {
        bwx.a(activity, (Object) "Null activity is not permitted.");
        bwx.a(bsc, (Object) "Api must not be null.");
        bwx.a(aVar, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = activity.getApplicationContext();
        this.b = bsc;
        this.c = o;
        this.e = aVar.c;
        this.d = bvj.a(this.b, this.c);
        this.g = new buq(this);
        this.h = bss.a(this.a);
        this.f = this.h.c.getAndIncrement();
        this.i = aVar.b;
        if (!(activity instanceof GoogleApiActivity)) {
            bte.a(activity, this.h, this.d);
        }
        this.h.a(this);
    }

    public bsg(Context context, bsc<O> bsc, O o, a aVar) {
        bwx.a(context, (Object) "Null context is not permitted.");
        bwx.a(bsc, (Object) "Api must not be null.");
        bwx.a(aVar, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        this.b = bsc;
        this.c = o;
        this.e = aVar.c;
        this.d = bvj.a(this.b, this.c);
        this.g = new buq(this);
        this.h = bss.a(this.a);
        this.f = this.h.c.getAndIncrement();
        this.i = aVar.b;
        this.h.a(this);
    }

    @Deprecated
    public bsg(Activity activity, bsc<O> bsc, O o, bta bta) {
        C0018a a2 = new C0018a().a(bta);
        Looper mainLooper = activity.getMainLooper();
        bwx.a(mainLooper, (Object) "Looper must not be null.");
        a2.a = mainLooper;
        this(activity, bsc, o, a2.a());
    }

    @Deprecated
    public bsg(Context context, bsc<O> bsc, O o, bta bta) {
        this(context, bsc, o, new C0018a().a(bta).a());
    }

    private final <A extends b, T extends defpackage.bsr.a<? extends bsl, A>> T a(int i2, T t) {
        t.g();
        bss bss = this.h;
        bss.g.sendMessage(bss.g.obtainMessage(4, new buv(new bvh(i2, t), bss.d.get(), this)));
        return t;
    }

    public final <A extends b, T extends defpackage.bsr.a<? extends bsl, A>> T a(T t) {
        return a(0, t);
    }

    public final <A extends b, T extends defpackage.bsr.a<? extends bsl, A>> T b(T t) {
        return a(1, t);
    }

    public f a(Looper looper, defpackage.bss.a<O> aVar) {
        return this.b.a().a(this.a, looper, a().a(), this.c, aVar, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.bwh.a a() {
        /*
            r3 = this;
            bwh$a r0 = new bwh$a
            r0.<init>()
            O r1 = r3.c
            boolean r2 = r1 instanceof defpackage.bsc.d.b
            if (r2 == 0) goto L_0x0018
            bsc$d$b r1 = (defpackage.bsc.d.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.a()
            if (r1 == 0) goto L_0x0018
            android.accounts.Account r1 = r1.a()
            goto L_0x0026
        L_0x0018:
            O r1 = r3.c
            boolean r2 = r1 instanceof defpackage.bsc.d.a
            if (r2 == 0) goto L_0x0025
            bsc$d$a r1 = (defpackage.bsc.d.a) r1
            android.accounts.Account r1 = r1.a()
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            r0.a = r1
            O r1 = r3.c
            boolean r2 = r1 instanceof defpackage.bsc.d.b
            if (r2 == 0) goto L_0x003b
            bsc$d$b r1 = (defpackage.bsc.d.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.a()
            if (r1 == 0) goto L_0x003b
            java.util.Set r1 = r1.b()
            goto L_0x003f
        L_0x003b:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x003f:
            bwh$a r0 = r0.a(r1)
            android.content.Context r1 = r3.a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.c = r1
            android.content.Context r1 = r3.a
            java.lang.String r1 = r1.getPackageName()
            r0.b = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsg.a():bwh$a");
    }

    public buy a(Context context, Handler handler) {
        return new buy(context, handler, a().a());
    }
}
