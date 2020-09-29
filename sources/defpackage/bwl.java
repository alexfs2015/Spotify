package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

/* renamed from: bwl reason: default package */
public abstract class bwl<T extends IInterface> extends bwg<T> implements f, a {
    private final Set<Scope> a;
    protected final bwh i;
    private final Account j;

    protected bwl(Context context, Looper looper, int i2, bwh bwh, b bVar, c cVar) {
        this(context, looper, bwn.a(context), brx.a(), i2, bwh, (b) bwx.a(bVar), (c) bwx.a(cVar));
    }

    public final Account m() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public final Set<Scope> r() {
        return this.a;
    }

    public int e() {
        return super.e();
    }

    private bwl(Context context, Looper looper, bwn bwn, brx brx, int i2, bwh bwh, b bVar, c cVar) {
        b bVar2;
        bwh bwh2 = bwh;
        b bVar3 = bVar;
        c cVar2 = cVar;
        a bxy = bVar3 == null ? null : new bxy(bVar3);
        if (cVar2 == null) {
            bVar2 = null;
        } else {
            bVar2 = new bxz(cVar2);
        }
        super(context, looper, bwn, brx, i2, bxy, bVar2, bwh2.f);
        this.i = bwh2;
        this.j = bwh2.a;
        Set<Scope> set = bwh2.c;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.a = set;
    }
}
