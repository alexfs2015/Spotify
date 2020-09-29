package defpackage;

import android.graphics.Path.FillType;

/* renamed from: aan reason: default package */
public final class aan implements aag {
    public final FillType a;
    public final String b;
    public final zr c;
    public final zu d;
    private final boolean e;

    public aan(String str, boolean z, FillType fillType, zr zrVar, zu zuVar) {
        this.b = str;
        this.e = z;
        this.a = fillType;
        this.c = zrVar;
        this.d = zuVar;
    }

    public final ya a(xq xqVar, aaq aaq) {
        return new ye(xqVar, aaq, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeFill{color=, fillEnabled=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
