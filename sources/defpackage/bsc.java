package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import defpackage.bsc.d;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: bsc reason: default package */
public final class bsc<O extends d> {
    public final a<?, O> a;
    public final String b;
    private final i<?, O> c = null;
    private final g<?> d;
    private final j<?> e;

    /* renamed from: bsc$a */
    public static abstract class a<T extends f, O> extends e<T, O> {
        public abstract T a(Context context, Looper looper, bwh bwh, O o, defpackage.bsh.b bVar, defpackage.bsh.c cVar);
    }

    /* renamed from: bsc$b */
    public interface b {
    }

    /* renamed from: bsc$c */
    public static class c<C extends b> {
    }

    /* renamed from: bsc$d */
    public interface d {

        /* renamed from: bsc$d$a */
        public interface a extends c, bsd {
            Account a();
        }

        /* renamed from: bsc$d$b */
        public interface b extends c {
            GoogleSignInAccount a();
        }

        /* renamed from: bsc$d$c */
        public interface c extends d {
        }
    }

    /* renamed from: bsc$e */
    public static abstract class e<T extends b, O> {
        public List<Scope> a(O o) {
            return Collections.emptyList();
        }
    }

    /* renamed from: bsc$f */
    public interface f extends b {
        void a(defpackage.bwg.c cVar);

        void a(defpackage.bwg.e eVar);

        void a(bwq bwq, Set<Scope> set);

        void a(String str, PrintWriter printWriter);

        boolean c();

        Intent d();

        int e();

        void f();

        boolean g();

        boolean h();

        boolean i();

        String j();

        brw[] k();
    }

    /* renamed from: bsc$g */
    public static final class g<C extends f> extends c<C> {
    }

    /* renamed from: bsc$h */
    public interface h<T extends IInterface> extends b {
        String a();

        String b();

        T c();
    }

    /* renamed from: bsc$i */
    public static abstract class i<T extends h, O> extends e<T, O> {
    }

    /* renamed from: bsc$j */
    public static final class j<C extends h> extends c<C> {
    }

    public <C extends f> bsc(String str, a<C, O> aVar, g<C> gVar) {
        bwx.a(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        bwx.a(gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.b = str;
        this.a = aVar;
        this.d = gVar;
        this.e = null;
    }

    public final a<?, O> a() {
        bwx.a(this.a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.a;
    }

    public final c<?> b() {
        g<?> gVar = this.d;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
