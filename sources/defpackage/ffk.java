package defpackage;

import java.util.Map.Entry;

/* renamed from: ffk reason: default package */
final /* synthetic */ class ffk implements Runnable {
    private final Entry a;
    private final ffo b;

    private ffk(Entry entry, ffo ffo) {
        this.a = entry;
        this.b = ffo;
    }

    public static Runnable a(Entry entry, ffo ffo) {
        return new ffk(entry, ffo);
    }

    public final void run() {
        ((ffp) this.a.getKey()).a(this.b);
    }
}
