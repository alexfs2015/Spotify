package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: yz reason: default package */
public final class yz {
    public za a;
    private final List<String> b;

    public yz(String... strArr) {
        this.b = Arrays.asList(strArr);
    }

    private yz(yz yzVar) {
        this.b = new ArrayList(yzVar.b);
        this.a = yzVar.a;
    }

    public final yz a(String str) {
        yz yzVar = new yz(this);
        yzVar.b.add(str);
        return yzVar;
    }

    public final yz a(za zaVar) {
        yz yzVar = new yz(this);
        yzVar.a = zaVar;
        return yzVar;
    }

    public final boolean c(String str, int i) {
        if (i >= this.b.size()) {
            return false;
        }
        boolean z = i == this.b.size() - 1;
        String str2 = (String) this.b.get(i);
        if (!str2.equals("**")) {
            boolean z2 = str2.equals(str) || str2.equals("*");
            if ((z || (i == this.b.size() - 2 && a())) && z2) {
                return true;
            }
            return false;
        }
        if (!z && ((String) this.b.get(i + 1)).equals(str)) {
            if (i == this.b.size() - 2 || (i == this.b.size() - 3 && a())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.b.size() - 1) {
                return false;
            }
            return ((String) this.b.get(i2)).equals(str);
        }
    }

    public final boolean d(String str, int i) {
        if (!str.equals("__container") && i >= this.b.size() - 1 && !((String) this.b.get(i)).equals("**")) {
            return false;
        }
        return true;
    }

    private boolean a() {
        List<String> list = this.b;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.b);
        sb.append(",resolved=");
        sb.append(this.a != null);
        sb.append('}');
        return sb.toString();
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
        if (i != this.b.size() - 1 && ((String) this.b.get(i + 1)).equals(str)) {
            return 2;
        }
        return 0;
    }
}
