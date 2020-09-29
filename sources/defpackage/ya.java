package defpackage;

import android.graphics.Path;
import android.graphics.Path.FillType;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import java.util.List;

/* renamed from: ya reason: default package */
public final class ya implements xw, a {
    private final Path a = new Path();
    private final String b;
    private final xc c;
    private final yd<?, Path> d;
    private boolean e;
    private yc f;

    public ya(xc xcVar, aac aac, aab aab) {
        this.b = aab.a;
        this.c = xcVar;
        this.d = aab.b.a();
        aac.a(this.d);
        this.d.a((a) this);
    }

    public final void a(List<xm> list, List<xm> list2) {
        for (int i = 0; i < list.size(); i++) {
            xm xmVar = (xm) list.get(i);
            if (xmVar instanceof yc) {
                yc ycVar = (yc) xmVar;
                if (ycVar.a == Type.Simultaneously) {
                    this.f = ycVar;
                    this.f.a(this);
                }
            }
        }
    }

    public final Path e() {
        if (this.e) {
            return this.a;
        }
        this.a.reset();
        this.a.set((Path) this.d.d());
        this.a.setFillType(FillType.EVEN_ODD);
        abw.a(this.a, this.f);
        this.e = true;
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }
}
