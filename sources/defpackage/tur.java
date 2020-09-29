package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: tur reason: default package */
public final class tur {
    public List<tuq> a;
    public uys[] b;
    private List<tuq> c;

    public tur() {
    }

    public tur(List<tuq> list, uys[] uysArr, List<tuq> list2) {
        this.a = list;
        this.b = uysArr;
        this.c = list2;
    }

    public final List<tuq> a() {
        List<tuq> list = this.a;
        return list != null ? list : new ArrayList();
    }

    public final void a(tuq tuq) {
        a().add(tuq);
    }

    public final void b(tuq tuq) {
        c().add(tuq);
    }

    public final uys[] b() {
        uys[] uysArr = this.b;
        return uysArr != null ? uysArr : new uys[0];
    }

    public final List<tuq> c() {
        List<tuq> list = this.c;
        return list != null ? list : new ArrayList();
    }

    public final int d() {
        return a().size() + b().length + c().size();
    }
}
