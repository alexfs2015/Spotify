package defpackage;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke.LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke.LineJoinType;
import java.util.List;

/* renamed from: aaj reason: default package */
public final class aaj implements aag {
    public final String a;
    public final GradientType b;
    public final zt c;
    public final zu d;
    public final zw e;
    public final zw f;
    public final zs g;
    public final LineCapType h;
    public final LineJoinType i;
    public final float j;
    public final List<zs> k;
    public final zs l;

    public aaj(String str, GradientType gradientType, zt ztVar, zu zuVar, zw zwVar, zw zwVar2, zs zsVar, LineCapType lineCapType, LineJoinType lineJoinType, float f2, List<zs> list, zs zsVar2) {
        this.a = str;
        this.b = gradientType;
        this.c = ztVar;
        this.d = zuVar;
        this.e = zwVar;
        this.f = zwVar2;
        this.g = zsVar;
        this.h = lineCapType;
        this.i = lineJoinType;
        this.j = f2;
        this.k = list;
        this.l = zsVar2;
    }

    public final ya a(xq xqVar, aaq aaq) {
        return new yg(xqVar, aaq, this);
    }
}
