package defpackage;

import java.io.File;
import java.util.List;

/* renamed from: ahh reason: default package */
final class ahh implements wlb {
    private final ahx a;
    private final ahu b;

    ahh(ahx ahx, ahu ahu) {
        this.a = ahx;
        this.b = ahu;
    }

    public final boolean a(List<File> list) {
        long nanoTime = System.nanoTime();
        ahu ahu = this.b;
        wkv wkv = ahu.b;
        if (nanoTime - ahu.a >= wkv.b.a(wkv.a) * 1000000) {
            if (this.a.a(list)) {
                ahu ahu2 = this.b;
                ahu2.a = 0;
                wkv wkv2 = ahu2.b;
                ahu2.b = new wkv(wkv2.b, wkv2.c);
                return true;
            }
            ahu ahu3 = this.b;
            ahu3.a = nanoTime;
            wkv wkv3 = ahu3.b;
            ahu3.b = new wkv(wkv3.a + 1, wkv3.b, wkv3.c);
        }
        return false;
    }
}
