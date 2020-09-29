package defpackage;

import java.util.Random;

/* renamed from: idc reason: default package */
public final class idc implements wig<idb> {
    private final wzi<icd> a;
    private final wzi<ica> b;
    private final wzi<Random> c;

    public static idb a(icd icd, ica ica) {
        return new idb(icd, ica);
    }

    public final /* synthetic */ Object get() {
        idb idb = new idb((icd) this.a.get(), (ica) this.b.get());
        idb.a = (Random) this.c.get();
        return idb;
    }
}
