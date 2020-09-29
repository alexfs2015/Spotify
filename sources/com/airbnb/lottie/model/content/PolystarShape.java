package com.airbnb.lottie.model.content;

import android.graphics.PointF;

public final class PolystarShape implements aag {
    public final String a;
    public final Type b;
    public final zs c;
    public final aad<PointF, PointF> d;
    public final zs e;
    public final zs f;
    public final zs g;
    public final zs h;
    public final zs i;

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

    public PolystarShape(String str, Type type, zs zsVar, aad<PointF, PointF> aad, zs zsVar2, zs zsVar3, zs zsVar4, zs zsVar5, zs zsVar6) {
        this.a = str;
        this.b = type;
        this.c = zsVar;
        this.d = aad;
        this.e = zsVar2;
        this.f = zsVar3;
        this.g = zsVar4;
        this.h = zsVar5;
        this.i = zsVar6;
    }

    public final ya a(xq xqVar, aaq aaq) {
        return new yl(xqVar, aaq, this);
    }
}
