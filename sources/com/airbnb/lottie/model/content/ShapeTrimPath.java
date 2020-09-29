package com.airbnb.lottie.model.content;

public final class ShapeTrimPath implements aag {
    public final String a;
    public final Type b;
    public final zs c;
    public final zs d;
    public final zs e;

    public enum Type {
        Simultaneously,
        Individually;

        public static Type a(int i) {
            if (i == 1) {
                return Simultaneously;
            }
            if (i == 2) {
                return Individually;
            }
            StringBuilder sb = new StringBuilder("Unknown trim path type ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public ShapeTrimPath(String str, Type type, zs zsVar, zs zsVar2, zs zsVar3) {
        this.a = str;
        this.b = type;
        this.c = zsVar;
        this.d = zsVar2;
        this.e = zsVar3;
    }

    public final ya a(xq xqVar, aaq aaq) {
        return new yq(aaq, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Trim Path: {start: ");
        sb.append(this.c);
        sb.append(", end: ");
        sb.append(this.d);
        sb.append(", offset: ");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
