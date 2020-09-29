package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ugu reason: default package */
public final class ugu {
    public List<ugt> a;
    public vkv[] b;
    private List<ugt> c;

    public ugu() {
    }

    public ugu(List<ugt> list, vkv[] vkvArr, List<ugt> list2) {
        this.a = list;
        this.b = vkvArr;
        this.c = list2;
    }

    public final List<ugt> a() {
        List<ugt> list = this.a;
        return list != null ? list : new ArrayList();
    }

    public final void a(ugt ugt) {
        a().add(ugt);
    }

    public final void b(ugt ugt) {
        c().add(ugt);
    }

    public final vkv[] b() {
        vkv[] vkvArr = this.b;
        return vkvArr != null ? vkvArr : new vkv[0];
    }

    public final List<ugt> c() {
        List<ugt> list = this.c;
        return list != null ? list : new ArrayList();
    }

    public final int d() {
        return a().size() + b().length + c().size();
    }
}
