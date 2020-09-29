package defpackage;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yq reason: default package */
public final class yq implements ya, a {
    final Type a;
    public final yr<?, Float> b;
    public final yr<?, Float> c;
    public final yr<?, Float> d;
    private final String e;
    private final List<a> f = new ArrayList();

    public yq(aaq aaq, ShapeTrimPath shapeTrimPath) {
        this.e = shapeTrimPath.a;
        this.a = shapeTrimPath.b;
        this.b = shapeTrimPath.c.a();
        this.c = shapeTrimPath.d.a();
        this.d = shapeTrimPath.e.a();
        aaq.a(this.b);
        aaq.a(this.c);
        aaq.a(this.d);
        this.b.a((a) this);
        this.c.a((a) this);
        this.d.a((a) this);
    }

    public final void a() {
        for (int i = 0; i < this.f.size(); i++) {
            ((a) this.f.get(i)).a();
        }
    }

    public final void a(List<ya> list, List<ya> list2) {
    }

    /* access modifiers changed from: 0000 */
    public final void a(a aVar) {
        this.f.add(aVar);
    }

    public final String b() {
        return this.e;
    }
}
