package com.comscore.android.vce;

import java.util.ArrayList;
import java.util.Iterator;

class b {
    final Object a = new Object();
    final Object b = new Object();
    final Object c = new Object();
    String d = "-1";
    String[] e;
    final ArrayList<String> f = new ArrayList<>();
    final ArrayList<String> g = new ArrayList<>();
    boolean h = false;
    boolean i = false;
    boolean j = false;
    boolean k = true;
    int l = 0;
    boolean m;
    boolean n = false;
    boolean o = false;
    boolean p = true;

    b() {
    }

    private boolean d(String str) {
        String b2 = b();
        if (e()) {
            return false;
        }
        String str2 = "2_";
        if (!str.equals(str2) || !b2.equals("1")) {
            return !str.equals(str2) || !b2.startsWith(str2);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public int a() {
        return this.l;
    }

    /* access modifiers changed from: 0000 */
    public String a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder(arrayList.size() << 4);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        this.l = i2;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.d = str;
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.h = z;
    }

    /* access modifiers changed from: 0000 */
    public void a(String[] strArr) {
        if (strArr != null && strArr.length > 1) {
            this.e = (String[]) strArr.clone();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String[] strArr, boolean z) {
        synchronized (this.a) {
            d(z);
            if (d("2_")) {
                a(true);
                c(true);
                StringBuilder sb = new StringBuilder("2_");
                sb.append(ad.a(strArr, "_"));
                a(sb.toString());
                a(strArr);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public String b() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public void b(String str) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() != 0) {
                try {
                    synchronized (this.c) {
                        if (!this.g.contains(trim)) {
                            this.g.add(trim);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z) {
        this.i = z;
    }

    /* access modifiers changed from: 0000 */
    public void c(String str) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() != 0) {
                try {
                    synchronized (this.b) {
                        if (!this.f.contains(trim)) {
                            this.f.add(trim);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(boolean z) {
        this.j = z;
    }

    /* access modifiers changed from: 0000 */
    public String[] c() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public void d(boolean z) {
        this.k = z;
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public void e(boolean z) {
        this.m = z;
    }

    /* access modifiers changed from: 0000 */
    public boolean e() {
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public void f(boolean z) {
        this.n = z;
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public void g(boolean z) {
        this.o = z;
    }

    /* access modifiers changed from: 0000 */
    public boolean g() {
        return this.k;
    }

    /* access modifiers changed from: 0000 */
    public void h(boolean z) {
        this.p = z;
    }

    /* access modifiers changed from: 0000 */
    public boolean h() {
        return this.m;
    }

    /* access modifiers changed from: 0000 */
    public void i(boolean z) {
        synchronized (this.a) {
            d(z);
            if (d("1")) {
                a(true);
                c(true);
                a("1");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return this.n;
    }

    /* access modifiers changed from: 0000 */
    public boolean j() {
        return this.o;
    }

    /* access modifiers changed from: 0000 */
    public boolean k() {
        return this.p;
    }

    /* access modifiers changed from: 0000 */
    public String l() {
        synchronized (this.c) {
            if (this.g.size() <= 0) {
                String str = "-1";
                return str;
            }
            String a2 = a(this.g);
            return a2;
        }
    }

    /* access modifiers changed from: 0000 */
    public String m() {
        synchronized (this.b) {
            if (this.f.size() <= 0) {
                String str = "-1";
                return str;
            }
            String a2 = a(this.f);
            return a2;
        }
    }

    /* access modifiers changed from: 0000 */
    public void n() {
        synchronized (this.a) {
            if (!f()) {
                a("5");
                c(true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void o() {
        synchronized (this.a) {
            if (!d()) {
                a("3_4m");
                b(true);
                c(true);
            }
        }
    }
}
