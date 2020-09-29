package defpackage;

/* renamed from: bap reason: default package */
public final class bap {
    public static final int a = ben.g("GA94");

    private static int a(bea bea) {
        int i = 0;
        while (bea.b() != 0) {
            int c = bea.c();
            i += c;
            if (c != 255) {
                return i;
            }
        }
        return -1;
    }

    public static void a(long j, bea bea, atu[] atuArr) {
        while (true) {
            boolean z = true;
            if (bea.b() > 1) {
                int a2 = a(bea);
                int a3 = a(bea);
                int i = bea.b + a3;
                if (a3 == -1 || a3 > bea.b()) {
                    bdu.c("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i = bea.c;
                } else if (a2 == 4 && a3 >= 8) {
                    int c = bea.c();
                    int d = bea.d();
                    int i2 = d == 49 ? bea.i() : 0;
                    int c2 = bea.c();
                    if (d == 47) {
                        bea.d(1);
                    }
                    boolean z2 = c == 181 && (d == 49 || d == 47) && c2 == 3;
                    if (d == 49) {
                        if (i2 != a) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        b(j, bea, atuArr);
                    }
                }
                bea.c(i);
            } else {
                return;
            }
        }
    }

    public static void b(long j, bea bea, atu[] atuArr) {
        int c = bea.c();
        if ((c & 64) != 0) {
            int i = c & 31;
            bea.d(1);
            int i2 = i * 3;
            int i3 = bea.b;
            for (atu atu : atuArr) {
                bea.c(i3);
                atu.a(bea, i2);
                atu.a(j, 1, i2, 0, null);
            }
        }
    }
}
