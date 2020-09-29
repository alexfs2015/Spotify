package com.airbnb.lottie.model.content;

public final class ShapeTrimPath implements zs {
    public final String a;
    public final Type b;
    public final ze c;
    public final ze d;
    public final ze e;

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

    public ShapeTrimPath(String str, Type type, ze zeVar, ze zeVar2, ze zeVar3) {
        this.a = str;
        this.b = type;
        this.c = zeVar;
        this.d = zeVar2;
        this.e = zeVar3;
    }

    public final xm a(xc xcVar, aac aac) {
        return new yc(aac, this);
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
