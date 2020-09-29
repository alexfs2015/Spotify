package defpackage;

import androidx.recyclerview.widget.RecyclerView.c;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

/* renamed from: gwx reason: default package */
final class gwx extends AbstractList<gxg> {
    final gwm a;
    List<? extends hcm> b = Collections.emptyList();
    gxe c = gxe.a;
    final gxc d;
    final List<hcm> e = new AbstractList<hcm>() {
        public final /* synthetic */ Object get(int i) {
            return gwx.this.b(i);
        }

        public final int size() {
            return gwx.this.size();
        }
    };
    final c f = new c() {
        public final void a() {
            gwx.this.d.a();
        }

        public final void a(int i, int i2) {
            int i3 = i2 + i;
            while (i < i3) {
                gwx.a(gwx.this, i);
                i++;
            }
        }

        public final void a(int i, int i2, int i3) {
        }

        public final void a(int i, int i2, Object obj) {
            a(i, i2);
        }

        public final void b(int i, int i2) {
        }

        public final void c(int i, int i2) {
            gwx.this.d.a();
        }
    };

    gwx(gwm gwm) {
        this.a = gwm;
        this.d = new gxc(gwm);
    }

    static /* synthetic */ void a(gwx gwx, int i) {
        gxc gxc = gwx.d;
        hcm b2 = gwx.b(i);
        gxg gxg = (gxg) gxc.a.remove(b2);
        if (gxg != null) {
            gxc.b.remove(gxg.a);
            return;
        }
        hcm hcm = (hcm) gxc.b.remove(b2);
        if (hcm != null) {
            gxc.a.remove(hcm);
        }
    }

    /* renamed from: a */
    public final gxg get(int i) {
        return this.d.a(b(i));
    }

    /* access modifiers changed from: 0000 */
    public hcm b(int i) {
        return (hcm) fbp.a(this.b.get(i));
    }

    public final int size() {
        return this.b.size();
    }
}
