package defpackage;

import io.reactivex.functions.Function;

/* renamed from: lzd reason: default package */
final class lzd implements Function<lyh<gzz>, gzz> {
    private final lzk a;

    public final /* synthetic */ Object apply(Object obj) {
        lyh lyh = (lyh) obj;
        if (lyh.a != null) {
            return (gzz) lyh.a;
        }
        return this.a.a();
    }

    lzd(lzk lzk) {
        this.a = (lzk) fay.a(lzk);
    }
}
