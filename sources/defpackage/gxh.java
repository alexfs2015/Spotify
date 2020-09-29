package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: gxh reason: default package */
public final class gxh<V extends View> {
    public final int a;
    public final V b;
    private final gwi<V> c;
    private final gwm d;
    private a e;

    /* renamed from: gxh$a */
    public static class a {
        public final hcm a;
        public final int b;

        private a(hcm hcm, int i) {
            this.a = (hcm) fbp.a(hcm);
            this.b = i;
        }

        /* synthetic */ a(hcm hcm, int i, byte b2) {
            this(hcm, i);
        }
    }

    private gxh(int i, V v, gwi<V> gwi, gwm gwm) {
        this.a = i;
        this.b = (View) fbp.a(v);
        this.c = (gwi) fbp.a(gwi);
        this.d = (gwm) fbp.a(gwm);
        this.d.j.a(this.a, this.b, this.d);
    }

    public static gxh<?> a(int i, ViewGroup viewGroup, gwm gwm) {
        gwi<?> binder = gwm.d.getBinder(i);
        if (binder == null) {
            binder = gwm.i;
        }
        return a(i, binder, viewGroup, gwm);
    }

    private static <V extends View> gxh<V> a(int i, gwi<V> gwi, ViewGroup viewGroup, gwm gwm) {
        return new gxh<>(i, gwi.a(viewGroup, gwm), gwi, gwm);
    }

    public a a() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("View not bound to any component!");
    }

    public final void a(int i, hcm hcm, b bVar) {
        this.e = new a(hcm, i, 0);
        this.c.a(this.b, hcm, this.d, bVar);
        this.d.j.a(this.a, this.b, hcm, this.d);
    }

    public final void a(defpackage.gwi.a<View> aVar, int... iArr) {
        this.c.a(this.b, a().a, aVar, iArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("HubsViewHolder[");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" view: ");
        sb.append(this.b);
        sb.append(", binder: ");
        sb.append(this.c);
        sb.append(", binderId: ");
        sb.append(this.a);
        if (this.e != null) {
            sb.append(", position: ");
            sb.append(a().b);
            sb.append(", model: ");
            sb.append(a().a);
        } else {
            sb.append(", not bound");
        }
        sb.append(']');
        return sb.toString();
    }
}
