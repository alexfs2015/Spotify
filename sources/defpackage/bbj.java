package defpackage;

import android.text.Layout.Alignment;
import java.util.Collections;
import java.util.List;

/* renamed from: bbj reason: default package */
public final class bbj {
    String a;
    String b;
    List<String> c = Collections.emptyList();
    String d;
    String e;
    int f;
    boolean g;
    int h;
    boolean i;
    int j;
    int k;
    int l;
    int m;
    int n;
    private Alignment o;

    public bbj() {
        String str = "";
        this.a = str;
        this.b = str;
        this.d = str;
        this.e = null;
        this.g = false;
        this.i = false;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = null;
    }

    static int a(int i2, String str, String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }

    public final int a() {
        if (this.l == -1 && this.m == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = this.l == 1 ? 1 : 0;
        if (this.m == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }
}
