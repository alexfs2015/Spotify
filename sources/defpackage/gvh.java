package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: gvh reason: default package */
public final class gvh<V extends View> {
    public final int a;
    public final V b;
    private final gui<V> c;
    private final gum d;
    private a e;

    /* renamed from: gvh$a */
    public static class a {
        public final gzt a;
        public final int b;

        /* synthetic */ a(gzt gzt, int i, byte b2) {
            this(gzt, i);
        }

        private a(gzt gzt, int i) {
            this.a = (gzt) fay.a(gzt);
            this.b = i;
        }
    }

    private gvh(int i, V v, gui<V> gui, gum gum) {
        this.a = i;
        this.b = (View) fay.a(v);
        this.c = (gui) fay.a(gui);
        this.d = (gum) fay.a(gum);
        this.d.j.a(this.a, this.b, this.d);
    }

    public final void a(int i, gzt gzt, b bVar) {
        this.e = new a(gzt, i, 0);
        this.c.a(this.b, gzt, this.d, bVar);
        this.d.j.a(this.a, this.b, gzt, this.d);
    }

    public final void a(defpackage.gui.a<View> aVar, int... iArr) {
        this.c.a(this.b, a().a, aVar, iArr);
    }

    private static <V extends View> gvh<V> a(int i, gui<V> gui, ViewGroup viewGroup, gum gum) {
        return new gvh<>(i, gui.a(viewGroup, gum), gui, gum);
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

    public a a() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("View not bound to any component!");
    }

    public static gvh<?> a(int i, ViewGroup viewGroup, gum gum) {
        gui<?> binder = gum.d.getBinder(i);
        if (binder == null) {
            binder = gum.i;
        }
        return a(i, binder, viewGroup, gum);
    }
}
