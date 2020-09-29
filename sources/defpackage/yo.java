package defpackage;

import android.graphics.Path;
import android.graphics.Path.FillType;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import java.util.List;

/* renamed from: yo reason: default package */
public final class yo implements yk, a {
    private final Path a = new Path();
    private final String b;
    private final xq c;
    private final yr<?, Path> d;
    private boolean e;
    private yq f;

    public yo(xq xqVar, aaq aaq, aap aap) {
        this.b = aap.a;
        this.c = xqVar;
        this.d = aap.b.a();
        aaq.a(this.d);
        this.d.a((a) this);
    }

    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    public final void a(List<ya> list, List<ya> list2) {
        for (int i = 0; i < list.size(); i++) {
            ya yaVar = (ya) list.get(i);
            if (yaVar instanceof yq) {
                yq yqVar = (yq) yaVar;
                if (yqVar.a == Type.Simultaneously) {
                    this.f = yqVar;
                    this.f.a(this);
                }
            }
        }
    }

    public final String b() {
        return this.b;
    }

    public final Path e() {
        if (this.e) {
            return this.a;
        }
        this.a.reset();
        this.a.set((Path) this.d.d());
        this.a.setFillType(FillType.EVEN_ODD);
        ack.a(this.a, this.f);
        this.e = true;
        return this.a;
    }
}
