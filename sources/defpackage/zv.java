package defpackage;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke.LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke.LineJoinType;
import java.util.List;

/* renamed from: zv reason: default package */
public final class zv implements zs {
    public final String a;
    public final GradientType b;
    public final zf c;
    public final zg d;
    public final zi e;
    public final zi f;
    public final ze g;
    public final LineCapType h;
    public final LineJoinType i;
    public final float j;
    public final List<ze> k;
    public final ze l;

    public zv(String str, GradientType gradientType, zf zfVar, zg zgVar, zi ziVar, zi ziVar2, ze zeVar, LineCapType lineCapType, LineJoinType lineJoinType, float f2, List<ze> list, ze zeVar2) {
        this.a = str;
        this.b = gradientType;
        this.c = zfVar;
        this.d = zgVar;
        this.e = ziVar;
        this.f = ziVar2;
        this.g = zeVar;
        this.h = lineCapType;
        this.i = lineJoinType;
        this.j = f2;
        this.k = list;
        this.l = zeVar2;
    }

    public final xm a(xc xcVar, aac aac) {
        return new xs(xcVar, aac, this);
    }
}
