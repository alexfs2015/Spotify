package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import java.util.Map;

/* renamed from: koa reason: default package */
public final class koa {
    public static ObservableTransformer<e, knt> a(koe koe) {
        return new $$Lambda$koa$XcQ1OvuLe0b7zh4AbG6NQqeE8FM(koe);
    }

    public static ObservableTransformer<d, knt> b(koe koe) {
        return new $$Lambda$koa$ey1NbKo5TArcJy0FOQdV3tS4SrI(koe);
    }

    /* access modifiers changed from: private */
    public static Observable<knt> a(koe koe, String str, String str2, long j, Map<String, String> map) {
        return koe.a.a(str, str2, j, map).a(knt.a(str)).g(new $$Lambda$koa$dr5rEN5qfKxMpu85BNMYick6AU(str)).d();
    }
}
