package defpackage;

import java.util.ArrayList;

@cfp
/* renamed from: dmj reason: default package */
public final class dmj {
    final Object a = new Object();
    int b = 0;
    int c = 0;
    int d = 0;
    int e;
    String f;
    String g;
    String h;
    private final int i;
    private final int j;
    private final int k;
    private final dmw l;
    private final dng m;
    private ArrayList<String> n = new ArrayList<>();
    private ArrayList<String> o = new ArrayList<>();
    private ArrayList<dmu> p = new ArrayList<>();

    public dmj(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String str = "";
        this.f = str;
        this.g = str;
        this.h = str;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = new dmw(i5);
        this.m = new dng(i6, i7, i8);
    }

    private static String a(ArrayList<String> arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            sb.append((String) obj);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    private final void c(String str, boolean z, float f2, float f3, float f4, float f5) {
        if (str != null && str.length() >= this.k) {
            synchronized (this.a) {
                this.n.add(str);
                this.b += str.length();
                if (z) {
                    this.o.add(str);
                    ArrayList<dmu> arrayList = this.p;
                    dmu dmu = new dmu(f2, f3, f4, f5, this.o.size() - 1);
                    arrayList.add(dmu);
                }
            }
        }
    }

    public final void a(String str, boolean z, float f2, float f3, float f4, float f5) {
        c(str, z, f2, f3, f4, f5);
        synchronized (this.a) {
            if (this.d < 0) {
                cpn.a(3);
            }
            c();
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.d == 0;
        }
        return z;
    }

    public final void b() {
        synchronized (this.a) {
            this.d++;
        }
    }

    public final void b(String str, boolean z, float f2, float f3, float f4, float f5) {
        c(str, z, f2, f3, f4, f5);
    }

    public final void c() {
        synchronized (this.a) {
            int i2 = (this.b * this.i) + (this.c * this.j);
            if (i2 > this.e) {
                this.e = i2;
                if (((Boolean) dqe.f().a(dtg.W)).booleanValue() && !bkc.i().g().d()) {
                    this.f = this.l.a(this.n);
                    this.g = this.l.a(this.o);
                }
                if (((Boolean) dqe.f().a(dtg.Y)).booleanValue() && !bkc.i().g().f()) {
                    this.h = this.m.a(this.o, this.p);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dmj)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((dmj) obj).f;
        return str != null && str.equals(this.f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        int i2 = this.c;
        int i3 = this.e;
        int i4 = this.b;
        String a2 = a(this.n);
        String a3 = a(this.o);
        String str = this.f;
        String str2 = this.g;
        String str3 = this.h;
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 165 + String.valueOf(a3).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i2);
        sb.append(" score:");
        sb.append(i3);
        sb.append(" total_length:");
        sb.append(i4);
        sb.append("\n text: ");
        sb.append(a2);
        sb.append("\n viewableText");
        sb.append(a3);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
