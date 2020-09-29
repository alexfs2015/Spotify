package defpackage;

import java.io.File;
import java.util.List;

/* renamed from: agt reason: default package */
final class agt implements vwv {
    private final ahj a;
    private final ahg b;

    agt(ahj ahj, ahg ahg) {
        this.a = ahj;
        this.b = ahg;
    }

    public final boolean a(List<File> list) {
        long nanoTime = System.nanoTime();
        ahg ahg = this.b;
        vwp vwp = ahg.b;
        if (nanoTime - ahg.a >= vwp.b.a(vwp.a) * 1000000) {
            if (this.a.a(list)) {
                ahg ahg2 = this.b;
                ahg2.a = 0;
                vwp vwp2 = ahg2.b;
                ahg2.b = new vwp(vwp2.b, vwp2.c);
                return true;
            }
            ahg ahg3 = this.b;
            ahg3.a = nanoTime;
            vwp vwp3 = ahg3.b;
            ahg3.b = new vwp(vwp3.a + 1, vwp3.b, vwp3.c);
        }
        return false;
    }
}
