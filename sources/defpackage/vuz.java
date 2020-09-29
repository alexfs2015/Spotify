package defpackage;

import android.content.Context;
import io.fabric.sdk.android.services.common.IdManager;
import java.io.File;

/* renamed from: vuz reason: default package */
public abstract class vuz<Result> implements Comparable<vuz> {
    public vuu f;
    protected vuy<Result> g = new vuy<>(this);
    public Context h;
    vux<Result> i;
    protected IdManager j;
    final vwd k = ((vwd) getClass().getAnnotation(vwd.class));

    public abstract String a();

    public abstract String b();

    /* access modifiers changed from: protected */
    public abstract Result e();

    /* access modifiers changed from: protected */
    public boolean g_() {
        return true;
    }

    public /* synthetic */ int compareTo(Object obj) {
        vuz vuz = (vuz) obj;
        if (a(vuz)) {
            return 1;
        }
        if (vuz.a(this)) {
            return -1;
        }
        if (d() && !vuz.d()) {
            return 1;
        }
        if (d() || !vuz.d()) {
            return 0;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Context context, vuu vuu, vux<Result> vux, IdManager idManager) {
        this.f = vuu;
        this.h = new vuv(context, b(), j());
        this.i = vux;
        this.j = idManager;
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

    private boolean a(vuz vuz) {
        if (d()) {
            for (Class isAssignableFrom : this.k.a()) {
                if (isAssignableFrom.isAssignableFrom(vuz.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean d() {
        return this.k != null;
    }
}
