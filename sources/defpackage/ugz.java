package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ugz reason: default package */
public final class ugz extends a {
    private final vkw a;
    private List<Object> b = new ArrayList(0);
    private List<Object> c = new ArrayList(0);

    public ugz(vkw vkw) {
        this.a = vkw;
    }

    public final int a() {
        return this.c.size();
    }

    public final void a(List<Object> list, List<Object> list2) {
        if (list != null) {
            this.c = list;
        }
        this.b = list2;
    }

    public final boolean a(int i, int i2) {
        Object obj = this.c.get(i);
        Object obj2 = this.b.get(i2);
        if (!(obj instanceof vkv) || !(obj2 instanceof vkv)) {
            return obj == obj2;
        }
        vkv vkv = (vkv) obj;
        vkv vkv2 = (vkv) obj2;
        if (vkv.isHeader() && vkv.getHeader() != null) {
            return vkv.getHeader().equals(vkv2.getHeader());
        }
        if (vkv2.isHeader()) {
            return false;
        }
        return vkv.getUri().equals(vkv2.getUri());
    }

    public final int b() {
        return this.b.size();
    }

    public final boolean b(int i, int i2) {
        Object obj = this.c.get(i);
        Object obj2 = this.b.get(i2);
        if (!(obj instanceof vkv) || !(obj2 instanceof vkv)) {
            return false;
        }
        vkv vkv = (vkv) obj;
        vkv vkv2 = (vkv) obj2;
        if (vkv.isHeader() && vkv.getHeader() != null) {
            return vkv.getHeader().equals(vkv2.getHeader());
        }
        if (vkv2.isHeader()) {
            return false;
        }
        return this.a.a(vkv, vkv2);
    }
}
