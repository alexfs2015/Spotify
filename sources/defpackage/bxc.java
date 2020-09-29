package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

/* renamed from: bxc reason: default package */
public abstract class bxc<T extends IInterface> extends bwx<T> implements f, a {
    private final Set<Scope> a;
    protected final bwy i;
    private final Account j;

    protected bxc(Context context, Looper looper, int i2, bwy bwy, b bVar, c cVar) {
        this(context, looper, bxe.a(context), bso.a(), i2, bwy, (b) bxo.a(bVar), (c) bxo.a(cVar));
    }

    private bxc(Context context, Looper looper, bxe bxe, bso bso, int i2, bwy bwy, b bVar, c cVar) {
        bwy bwy2 = bwy;
        b bVar2 = bVar;
        c cVar2 = cVar;
        a byp = bVar2 == null ? null : new byp(bVar2);
        b byq = cVar2 == null ? null : new byq(cVar2);
        super(context, looper, bxe, bso, i2, byp, byq, bwy2.f);
        this.i = bwy2;
        this.j = bwy2.a;
        Set<Scope> set = bwy2.c;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.a = set;
    }

    public int e() {
        return super.e();
    }

    public final Account m() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public final Set<Scope> r() {
        return this.a;
    }
}
