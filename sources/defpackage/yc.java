package defpackage;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yc reason: default package */
public final class yc implements xm, a {
    final Type a;
    public final yd<?, Float> b;
    public final yd<?, Float> c;
    public final yd<?, Float> d;
    private final String e;
    private final List<a> f = new ArrayList();

    public final void a(List<xm> list, List<xm> list2) {
    }

    public yc(aac aac, ShapeTrimPath shapeTrimPath) {
        this.e = shapeTrimPath.a;
        this.a = shapeTrimPath.b;
        this.b = shapeTrimPath.c.a();
        this.c = shapeTrimPath.d.a();
        this.d = shapeTrimPath.e.a();
        aac.a(this.b);
        aac.a(this.c);
        aac.a(this.d);
        this.b.a((a) this);
        this.c.a((a) this);
        this.d.a((a) this);
    }

    public final void a() {
        for (int i = 0; i < this.f.size(); i++) {
            ((a) this.f.get(i)).a();
        }
    }

    public final String b() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public final void a(a aVar) {
        this.f.add(aVar);
    }
}
