package defpackage;

import androidx.recyclerview.widget.RecyclerView.c;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

/* renamed from: gux reason: default package */
final class gux extends AbstractList<gvg> {
    final gum a;
    List<? extends gzt> b = Collections.emptyList();
    gve c = gve.a;
    final gvc d;
    final List<gzt> e = new AbstractList<gzt>() {
        public final int size() {
            return gux.this.size();
        }

        public final /* synthetic */ Object get(int i) {
            return gux.this.b(i);
        }
    };
    final c f = new c() {
        public final void a(int i, int i2, int i3) {
        }

        public final void b(int i, int i2) {
        }

        public final void a() {
            gux.this.d.a();
        }

        public final void a(int i, int i2) {
            int i3 = i2 + i;
            while (i < i3) {
                gux.a(gux.this, i);
                i++;
            }
        }

        public final void a(int i, int i2, Object obj) {
            a(i, i2);
        }

        public final void c(int i, int i2) {
            gux.this.d.a();
        }
    };

    gux(gum gum) {
        this.a = gum;
        this.d = new gvc(gum);
    }

    /* renamed from: a */
    public final gvg get(int i) {
        return this.d.a(b(i));
    }

    /* access modifiers changed from: 0000 */
    public gzt b(int i) {
        return (gzt) fay.a(this.b.get(i));
    }

    public final int size() {
        return this.b.size();
    }

    static /* synthetic */ void a(gux gux, int i) {
        gvc gvc = gux.d;
        gzt b2 = gux.b(i);
        gvg gvg = (gvg) gvc.a.remove(b2);
        if (gvg != null) {
            gvc.b.remove(gvg.a);
            return;
        }
        gzt gzt = (gzt) gvc.b.remove(b2);
        if (gzt != null) {
            gvc.a.remove(gzt);
        }
    }
}
