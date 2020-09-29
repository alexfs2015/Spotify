package com.moat.analytics.mobile;

import com.moat.analytics.mobile.base.asserts.a;

final class bd {
    static final bd a;
    final String b;
    final String c;

    static {
        String str = "";
        a = new bd(str, str);
    }

    public bd(String str, String str2) {
        a.a(str);
        a.a(str2);
        this.b = str;
        this.c = str2;
    }

    public final boolean a() {
        return this == a || this.c.trim().isEmpty();
    }

    public final String b() {
        if (a()) {
            return "";
        }
        return String.format("%s(%s)", new Object[]{this.c, this.b});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bd bdVar = (bd) obj;
        if (!this.b.equals(bdVar.b)) {
            return false;
        }
        return this.c.equals(bdVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResponseToJS{message='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", function='");
        sb.append(this.c);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
