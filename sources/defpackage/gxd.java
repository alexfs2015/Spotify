package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: gxd reason: default package */
public final class gxd {
    final gxc a;
    private final SparseArray<a> b;
    private final gwm c;
    private final b d;

    /* renamed from: gxd$a */
    static final class a {
        final ArrayList<gxh<?>> a;
        private int b;

        private a() {
            this.a = new ArrayList<>(5);
            this.b = 5;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final boolean a(gxh<?> gxh) {
            fbp.a(gxh);
            return this.a.size() < this.b && this.a.add(gxh);
        }
    }

    public gxd(gwm gwm) {
        this(gwm, new gxc(gwm));
    }

    private gxd(gwm gwm, gxc gxc) {
        this(gwm, gxc, new gwv(gxc));
    }

    gxd(gwm gwm, gxc gxc, b bVar) {
        this.b = new SparseArray<>();
        this.c = (gwm) fbp.a(gwm);
        this.a = (gxc) fbp.a(gxc);
        this.d = (b) fbp.a(bVar);
    }

    private gxh<?> a(hcm hcm, ViewGroup viewGroup) {
        int i = this.a.a(hcm).b;
        a aVar = (a) this.b.get(i);
        if (aVar == null) {
            aVar = new a(0);
            this.b.put(i, aVar);
        }
        gxh<?> gxh = aVar.a.isEmpty() ? null : (gxh) aVar.a.remove(aVar.a.size() - 1);
        return gxh != null ? gxh : gxh.a(i, viewGroup, this.c);
    }

    private void a(gxh<?> gxh, hcm hcm, int i) {
        gxh.a(i, this.a.a(hcm).a, this.d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.gxh<?> a(defpackage.gxh<?> r3, defpackage.hcm r4, android.view.ViewGroup r5, int r6) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0012
            gxc r0 = r2.a
            gxg r0 = r0.a(r4)
            int r0 = r0.b
            int r1 = r3.a
            if (r0 != r1) goto L_0x000f
            goto L_0x0013
        L_0x000f:
            r2.a(r3)
        L_0x0012:
            r3 = 0
        L_0x0013:
            if (r3 != 0) goto L_0x0019
            gxh r3 = r2.a(r4, r5)
        L_0x0019:
            r2.a(r3, r4, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxd.a(gxh, hcm, android.view.ViewGroup, int):gxh");
    }

    public final void a(gxh<?> gxh) {
        ((a) this.b.get(gxh.a)).a(gxh);
    }
}
