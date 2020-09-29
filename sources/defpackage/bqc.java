package defpackage;

import android.util.LruCache;

/* renamed from: bqc reason: default package */
final class bqc extends LruCache<Integer, bof> {
    private final /* synthetic */ bpb a;

    bqc(bpb bpb, int i) {
        this.a = bpb;
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
