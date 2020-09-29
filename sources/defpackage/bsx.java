package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import defpackage.bst.d;

/* renamed from: bsx reason: default package */
public class bsx<O extends d> {
    public final Context a;
    public final bst<O> b;
    public final O c;
    public final bwa<O> d;
    public final Looper e;
    public final int f;
    public final bsy g;
    protected final btj h;
    private final btr i;

    /* renamed from: bsx$a */
    public static class a {
        public static final a a = new C0018a().a();
        public final btr b;
        public final Looper c;

        /* renamed from: bsx$a$a reason: collision with other inner class name */
        public static class C0018a {
            Looper a;
            private btr b;

            public final C0018a a(btr btr) {
                bxo.a(btr, (Object) "StatusExceptionMapper must not be null.");
                this.b = btr;
                return this;
            }

            public final a a() {
                if (this.b == null) {
                    this.b = new btg();
                }
                if (this.a == null) {
                    this.a = Looper.getMainLooper();
                }
                return new a(this.b, this.a, 0);
            }
        }

        private a(btr btr, Looper looper) {
            this.b = btr;
            this.c = looper;
        }

        /* synthetic */ a(btr btr, Looper looper, byte b2) {
            this(btr, looper);
        }
    }

    private bsx(Activity activity, bst<O> bst, O o, a aVar) {
        bxo.a(activity, (Object) "Null activity is not permitted.");
        bxo.a(bst, (Object) "Api must not be null.");
        bxo.a(aVar, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = activity.getApplicationContext();
        this.b = bst;
        this.c = o;
        this.e = aVar.c;
        this.d = bwa.a(this.b, this.c);
        this.g = new bvh(this);
        this.h = btj.a(this.a);
        this.f = this.h.c.getAndIncrement();
        this.i = aVar.b;
        if (!(activity instanceof GoogleApiActivity)) {
            btv.a(activity, this.h, this.d);
        }
        this.h.a(this);
    }

    @Deprecated
    public bsx(Activity activity, bst<O> bst, O o, btr btr) {
        C0018a a2 = new C0018a().a(btr);
        Looper mainLooper = activity.getMainLooper();
        bxo.a(mainLooper, (Object) "Looper must not be null.");
        a2.a = mainLooper;
        this(activity, bst, o, a2.a());
    }

    public bsx(Context context, bst<O> bst, O o, a aVar) {
        bxo.a(context, (Object) "Null context is not permitted.");
        bxo.a(bst, (Object) "Api must not be null.");
        bxo.a(aVar, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        this.b = bst;
        this.c = o;
        this.e = aVar.c;
        this.d = bwa.a(this.b, this.c);
        this.g = new bvh(this);
        this.h = btj.a(this.a);
        this.f = this.h.c.getAndIncrement();
        this.i = aVar.b;
        this.h.a(this);
    }

    @Deprecated
    public bsx(Context context, bst<O> bst, O o, btr btr) {
        this(context, bst, o, new C0018a().a(btr).a());
    }

    private final <A extends b, T extends defpackage.bti.a<? extends btc, A>> T a(int i2, T t) {
        t.g();
        btj btj = this.h;
        btj.g.sendMessage(btj.g.obtainMessage(4, new bvm(new bvy(i2, t), btj.d.get(), this)));
        return t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.bwy.a a() {
        /*
            r3 = this;
            bwy$a r0 = new bwy$a
            r0.<init>()
            O r1 = r3.c
            boolean r2 = r1 instanceof defpackage.bst.d.b
            if (r2 == 0) goto L_0x0018
            bst$d$b r1 = (defpackage.bst.d.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.a()
            if (r1 == 0) goto L_0x0018
            android.accounts.Account r1 = r1.a()
            goto L_0x0026
        L_0x0018:
            O r1 = r3.c
            boolean r2 = r1 instanceof defpackage.bst.d.a
            if (r2 == 0) goto L_0x0025
            bst$d$a r1 = (defpackage.bst.d.a) r1
            android.accounts.Account r1 = r1.a()
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            r0.a = r1
            O r1 = r3.c
            boolean r2 = r1 instanceof defpackage.bst.d.b
            if (r2 == 0) goto L_0x003b
            bst$d$b r1 = (defpackage.bst.d.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.a()
            if (r1 == 0) goto L_0x003b
            java.util.Set r1 = r1.b()
            goto L_0x003f
        L_0x003b:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x003f:
            bwy$a r0 = r0.a(r1)
            android.content.Context r1 = r3.a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.c = r1
            android.content.Context r1 = r3.a
            java.lang.String r1 = r1.getPackageName()
            r0.b = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsx.a():bwy$a");
    }

    public f a(Looper looper, defpackage.btj.a<O> aVar) {
        return this.b.a().a(this.a, looper, a().a(), this.c, aVar, aVar);
    }

    public final <A extends b, T extends defpackage.bti.a<? extends btc, A>> T a(T t) {
        return a(0, t);
    }

    public bvp a(Context context, Handler handler) {
        return new bvp(context, handler, a().a());
    }

    public final <A extends b, T extends defpackage.bti.a<? extends btc, A>> T b(T t) {
        return a(1, t);
    }
}
