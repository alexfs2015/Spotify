package defpackage;

import android.os.Parcelable;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: gwv reason: default package */
public class gwv implements b {
    private final Map<hcm, Parcelable> a = new WeakHashMap();
    private final gxc b;

    public gwv(gxc gxc) {
        this.b = gxc;
    }

    public final Parcelable a(hcm hcm) {
        Map<hcm, Parcelable> map = this.a;
        hcm b2 = this.b.b(hcm);
        if (b2 != null) {
            return (Parcelable) map.get(b2);
        }
        String id = hcm.id() != null ? hcm.id() : hcm.toString();
        StringBuilder sb = new StringBuilder("Model ");
        sb.append(id);
        sb.append(" not resolved");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public Parcelable a(Map<hcm, Parcelable> map) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.a.clear();
    }

    public final void a(Parcelable parcelable) {
        a(parcelable, this.a);
    }

    /* access modifiers changed from: protected */
    public void a(Parcelable parcelable, Map<hcm, Parcelable> map) {
    }

    public final boolean a(hcm hcm, Parcelable parcelable) {
        hcm b2 = this.b.b(hcm);
        if (b2 == null) {
            return false;
        }
        this.a.put(b2, parcelable);
        return true;
    }

    public final Parcelable b() {
        return a(this.a);
    }
}
