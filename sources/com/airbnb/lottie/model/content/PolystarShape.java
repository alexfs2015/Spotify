package com.airbnb.lottie.model.content;

import android.graphics.PointF;

public final class PolystarShape implements zs {
    public final String a;
    public final Type b;
    public final ze c;
    public final zp<PointF, PointF> d;
    public final ze e;
    public final ze f;
    public final ze g;
    public final ze h;
    public final ze i;

    public enum Type {
        Star(1),
        Polygon(2);
        
        private final int value;

        private Type(int i) {
            this.value = i;
        }

        public static Type a(int i) {
            Type[] values;
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, ze zeVar, zp<PointF, PointF> zpVar, ze zeVar2, ze zeVar3, ze zeVar4, ze zeVar5, ze zeVar6) {
        this.a = str;
        this.b = type;
        this.c = zeVar;
        this.d = zpVar;
        this.e = zeVar2;
        this.f = zeVar3;
        this.g = zeVar4;
        this.h = zeVar5;
        this.i = zeVar6;
    }

    public final xm a(xc xcVar, aac aac) {
        return new xx(xcVar, aac, this);
    }
}
