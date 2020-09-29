package defpackage;

import java.util.Map.Entry;

/* renamed from: fge reason: default package */
final /* synthetic */ class fge implements Runnable {
    private final Entry a;
    private final fgi b;

    private fge(Entry entry, fgi fgi) {
        this.a = entry;
        this.b = fgi;
    }

    public static Runnable a(Entry entry, fgi fgi) {
        return new fge(entry, fgi);
    }

    public final void run() {
        ((fgj) this.a.getKey()).a(this.b);
    }
}
