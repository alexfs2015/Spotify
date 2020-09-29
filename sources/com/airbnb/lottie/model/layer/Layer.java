package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.model.content.Mask;
import java.util.List;
import java.util.Locale;

public final class Layer {
    public final List<zs> a;
    public final xa b;
    public final String c;
    public final long d;
    public final LayerType e;
    public final long f;
    public final String g;
    public final List<Mask> h;
    public final zo i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final int o;
    public final int p;
    public final zm q;
    public final zn r;
    public final ze s;
    public final List<abx<Float>> t;
    public final MatteType u;

    public enum LayerType {
        PreComp,
        Solid,
        Image,
        Null,
        Shape,
        Text,
        Unknown
    }

    public enum MatteType {
        None,
        Add,
        Invert,
        Unknown
    }

    public Layer(List<zs> list, xa xaVar, String str, long j2, LayerType layerType, long j3, String str2, List<Mask> list2, zo zoVar, int i2, int i3, int i4, float f2, float f3, int i5, int i6, zm zmVar, zn znVar, List<abx<Float>> list3, MatteType matteType, ze zeVar) {
        this.a = list;
        this.b = xaVar;
        this.c = str;
        this.d = j2;
        this.e = layerType;
        this.f = j3;
        this.g = str2;
        this.h = list2;
        this.i = zoVar;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f2;
        this.n = f3;
        this.o = i5;
        this.p = i6;
        this.q = zmVar;
        this.r = znVar;
        this.t = list3;
        this.u = matteType;
        this.s = zeVar;
    }

    public final String toString() {
        return a("");
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.c);
        String str2 = "\n";
        sb.append(str2);
        Layer a2 = this.b.a(this.f);
        if (a2 != null) {
            sb.append("\t\tParents: ");
            sb.append(a2.c);
            Layer a3 = this.b.a(a2.f);
            while (a3 != null) {
                sb.append("->");
                sb.append(a3.c);
                a3 = this.b.a(a3.f);
            }
            sb.append(str);
            sb.append(str2);
        }
        if (!this.h.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.h.size());
            sb.append(str2);
        }
        if (!(this.j == 0 || this.k == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l)}));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object next : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(next);
                sb.append(str2);
            }
        }
        return sb.toString();
    }
}
