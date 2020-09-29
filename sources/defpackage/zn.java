package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: zn reason: default package */
public final class zn {
    public zo a;
    private final List<String> b;

    private zn(zn znVar) {
        this.b = new ArrayList(znVar.b);
        this.a = znVar.a;
    }

    public zn(String... strArr) {
        this.b = Arrays.asList(strArr);
    }

    private boolean a() {
        List<String> list = this.b;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    public final zn a(String str) {
        zn znVar = new zn(this);
        znVar.b.add(str);
        return znVar;
    }

    public final zn a(zo zoVar) {
        zn znVar = new zn(this);
        znVar.a = zoVar;
        return znVar;
    }

    public final boolean a(String str, int i) {
        if (str.equals("__container")) {
            return true;
        }
        if (i >= this.b.size()) {
            return false;
        }
        return ((String) this.b.get(i)).equals(str) || ((String) this.b.get(i)).equals("**") || ((String) this.b.get(i)).equals("*");
    }

    public final int b(String str, int i) {
        if (str.equals("__container")) {
            return 0;
        }
        if (!((String) this.b.get(i)).equals("**")) {
            return 1;
        }
        return (i != this.b.size() - 1 && ((String) this.b.get(i + 1)).equals(str)) ? 2 : 0;
    }

    public final boolean c(String str, int i) {
        if (i >= this.b.size()) {
            return false;
        }
        boolean z = i == this.b.size() - 1;
        String str2 = (String) this.b.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.b.size() + -2 && a())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && ((String) this.b.get(i + 1)).equals(str)) {
            return i == this.b.size() + -2 || (i == this.b.size() + -3 && a());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.b.size() - 1) {
            return false;
        }
        return ((String) this.b.get(i2)).equals(str);
    }

    public final boolean d(String str, int i) {
        return str.equals("__container") || i < this.b.size() - 1 || ((String) this.b.get(i)).equals("**");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.b);
        sb.append(",resolved=");
        sb.append(this.a != null);
        sb.append('}');
        return sb.toString();
    }
}
