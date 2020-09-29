package defpackage;

/* renamed from: azy reason: default package */
public final class azy {
    public static final int a = bdw.g("GA94");

    public static void a(long j, bdj bdj, atd[] atdArr) {
        while (true) {
            boolean z = true;
            if (bdj.b() > 1) {
                int a2 = a(bdj);
                int a3 = a(bdj);
                int i = bdj.b + a3;
                if (a3 == -1 || a3 > bdj.b()) {
                    bdd.c("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i = bdj.c;
                } else if (a2 == 4 && a3 >= 8) {
                    int c = bdj.c();
                    int d = bdj.d();
                    int i2 = d == 49 ? bdj.i() : 0;
                    int c2 = bdj.c();
                    if (d == 47) {
                        bdj.d(1);
                    }
                    boolean z2 = c == 181 && (d == 49 || d == 47) && c2 == 3;
                    if (d == 49) {
                        if (i2 != a) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        b(j, bdj, atdArr);
                    }
                }
                bdj.c(i);
            } else {
                return;
            }
        }
    }

    public static void b(long j, bdj bdj, atd[] atdArr) {
        int c = bdj.c();
        if ((c & 64) != 0) {
            int i = c & 31;
            bdj.d(1);
            int i2 = i * 3;
            int i3 = bdj.b;
            for (atd atd : atdArr) {
                bdj.c(i3);
                atd.a(bdj, i2);
                atd.a(j, 1, i2, 0, null);
            }
        }
    }

    private static int a(bdj bdj) {
        int i = 0;
        while (bdj.b() != 0) {
            int c = bdj.c();
            i += c;
            if (c != 255) {
                return i;
            }
        }
        return -1;
    }
}
