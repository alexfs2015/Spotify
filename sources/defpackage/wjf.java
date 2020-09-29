package defpackage;

import android.content.Context;
import io.fabric.sdk.android.services.common.IdManager;
import java.io.File;

/* renamed from: wjf reason: default package */
public abstract class wjf<Result> implements Comparable<wjf> {
    public wja f;
    protected wje<Result> g = new wje<>(this);
    public Context h;
    wjd<Result> i;
    protected IdManager j;
    final wkj k = ((wkj) getClass().getAnnotation(wkj.class));

    private boolean a(wjf wjf) {
        if (d()) {
            for (Class isAssignableFrom : this.k.a()) {
                if (isAssignableFrom.isAssignableFrom(wjf.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean d() {
        return this.k != null;
    }

    public abstract String a();

    /* access modifiers changed from: 0000 */
    public final void a(Context context, wja wja, wjd<Result> wjd, IdManager idManager) {
        this.f = wja;
        this.h = new wjb(context, b(), j());
        this.i = wjd;
        this.j = idManager;
    }

    public abstract String b();

    public /* synthetic */ int compareTo(Object obj) {
        wjf wjf = (wjf) obj;
        if (a(wjf)) {
            return 1;
        }
        if (wjf.a(this)) {
            return -1;
        }
        if (!d() || wjf.d()) {
            return (d() || !wjf.d()) ? 0 : -1;
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    public abstract Result e();

    /* access modifiers changed from: protected */
    public boolean g_() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void i() {
        this.g.a(this.f.a, null);
    }

    public final String j() {
        StringBuilder sb = new StringBuilder(".Fabric");
        sb.append(File.separator);
        sb.append(b());
        return sb.toString();
    }
}
