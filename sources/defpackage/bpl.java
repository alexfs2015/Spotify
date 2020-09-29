package defpackage;

import android.util.LruCache;

/* renamed from: bpl reason: default package */
final class bpl extends LruCache<Integer, bno> {
    private final /* synthetic */ bok a;

    bpl(bok bok, int i) {
        this.a = bok;
        super(i);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z) {
            this.a.g.add(num);
        }
    }
}
