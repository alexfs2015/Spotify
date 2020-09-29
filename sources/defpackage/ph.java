package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: ph reason: default package */
public final class ph implements pv, pw {
    private static TreeMap<Integer, ph> i = new TreeMap<>();
    public volatile String a;
    public final int[] b;
    private long[] c;
    private double[] d;
    private String[] e;
    private byte[][] f;
    private int g;
    private int h;

    private ph(int i2) {
        this.g = i2;
        int i3 = i2 + 1;
        this.b = new int[i3];
        this.c = new long[i3];
        this.d = new double[i3];
        this.e = new String[i3];
        this.f = new byte[i3][];
    }

    public static ph a(String str, int i2) {
        synchronized (i) {
            Entry ceilingEntry = i.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                i.remove(ceilingEntry.getKey());
                ph phVar = (ph) ceilingEntry.getValue();
                phVar.b(str, i2);
                return phVar;
            }
            ph phVar2 = new ph(i2);
            phVar2.b(str, i2);
            return phVar2;
        }
    }

    private void b(String str, int i2) {
        this.a = str;
        this.h = i2;
    }

    public final void a() {
        synchronized (i) {
            i.put(Integer.valueOf(this.g), this);
            if (i.size() > 15) {
                int size = i.size() - 10;
                Iterator it = i.descendingKeySet().iterator();
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }

    public final void a(int i2) {
        this.b[i2] = 1;
    }

    public final void a(int i2, double d2) {
        this.b[i2] = 3;
        this.d[i2] = d2;
    }

    public final void a(int i2, long j) {
        this.b[i2] = 2;
        this.c[i2] = j;
    }

    public final void a(int i2, String str) {
        this.b[i2] = 4;
        this.e[i2] = str;
    }

    public final void a(int i2, byte[] bArr) {
        this.b[i2] = 5;
        this.f[i2] = bArr;
    }

    public final void a(pv pvVar) {
        for (int i2 = 1; i2 <= this.h; i2++) {
            int i3 = this.b[i2];
            if (i3 == 1) {
                pvVar.a(i2);
            } else if (i3 == 2) {
                pvVar.a(i2, this.c[i2]);
            } else if (i3 == 3) {
                pvVar.a(i2, this.d[i2]);
            } else if (i3 == 4) {
                pvVar.a(i2, this.e[i2]);
            } else if (i3 == 5) {
                pvVar.a(i2, this.f[i2]);
            }
        }
    }

    public final String b() {
        return this.a;
    }

    public final void close() {
    }
}
