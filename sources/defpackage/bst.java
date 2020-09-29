package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import defpackage.bst.d;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: bst reason: default package */
public final class bst<O extends d> {
    public final a<?, O> a;
    public final String b;
    private final i<?, O> c = null;
    private final g<?> d;
    private final j<?> e;

    /* renamed from: bst$a */
    public static abstract class a<T extends f, O> extends e<T, O> {
        public abstract T a(Context context, Looper looper, bwy bwy, O o, defpackage.bsy.b bVar, defpackage.bsy.c cVar);
    }

    /* renamed from: bst$b */
    public interface b {
    }

    /* renamed from: bst$c */
    public static class c<C extends b> {
    }

    /* renamed from: bst$d */
    public interface d {

        /* renamed from: bst$d$a */
        public interface a extends c, bsu {
            Account a();
        }

        /* renamed from: bst$d$b */
        public interface b extends c {
            GoogleSignInAccount a();
        }

        /* renamed from: bst$d$c */
        public interface c extends d {
        }
    }

    /* renamed from: bst$e */
    public static abstract class e<T extends b, O> {
        public List<Scope> a(O o) {
            return Collections.emptyList();
        }
    }

    /* renamed from: bst$f */
    public interface f extends b {
        void a(defpackage.bwx.c cVar);

        void a(defpackage.bwx.e eVar);

        void a(bxh bxh, Set<Scope> set);

        void a(String str, PrintWriter printWriter);

        boolean c();

        Intent d();

        int e();

        void f();

        boolean g();

        boolean h();

        boolean i();

        String j();

        bsn[] k();
    }

    /* renamed from: bst$g */
    public static final class g<C extends f> extends c<C> {
    }

    /* renamed from: bst$h */
    public interface h<T extends IInterface> extends b {
        String a();

        String b();

        T c();
    }

    /* renamed from: bst$i */
    public static abstract class i<T extends h, O> extends e<T, O> {
    }

    /* renamed from: bst$j */
    public static final class j<C extends h> extends c<C> {
    }

    public <C extends f> bst(String str, a<C, O> aVar, g<C> gVar) {
        bxo.a(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        bxo.a(gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.b = str;
        this.a = aVar;
        this.d = gVar;
        this.e = null;
    }

    public final a<?, O> a() {
        bxo.a(this.a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
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
