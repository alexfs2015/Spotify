package defpackage;

import com.spotify.mobile.android.util.Assertion.RecoverableAssertionError;
import io.reactivex.functions.Consumer;

/* renamed from: pxr reason: default package */
public final class pxr {
    public static Consumer<b> a(pxd pxd, pwj pwj, pxy pxy) {
        return new $$Lambda$pxr$FkcOClSx7erMgawQ9kEWv7KxbY(pxd, pwj, pxy);
    }

    public static Consumer<a> a(qbc qbc) {
        return new $$Lambda$pxr$c9FtjKZnYhvivHzI6TcaGtmj_9c(qbc);
    }

    public static Consumer<c> a(rtj rtj) {
        return new $$Lambda$pxr$PWllkXLnc8pmkjZYt6G5nQd3jCQ(rtj);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qbc qbc, a aVar, a aVar2) {
        qbc qbc2 = qbc;
        qbc2.a(aVar.c, aVar.a.getTriggerString(), aVar.a.getType(), "banners", ((a) aVar.b).a.getId());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qbc qbc, a aVar, b bVar) {
        qbc qbc2 = qbc;
        qbc2.a(aVar.c, aVar.a.getTriggerString(), aVar.a.getType(), "cards", ((b) aVar.b).a.getId());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qbc qbc, a aVar, c cVar) {
        qbc qbc2 = qbc;
        qbc2.a(aVar.c, aVar.a.getTriggerString(), aVar.a.getType(), "notes", ((c) aVar.b).a.getId());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(rtj rtj, c cVar) {
        String str = cVar.a;
        boolean z = cVar.b instanceof a;
        if ("cards".equals(str)) {
            rtj.a = z;
            rtj.d.onNext(Boolean.valueOf(z));
        } else if ("banners".equals(str)) {
            rtj.b = z;
            rtj.e.onNext(Boolean.valueOf(z));
        } else if ("notes".equals(str)) {
            rtj.c = z;
            rtj.f.onNext(Boolean.valueOf(z));
        } else {
            throw new RecoverableAssertionError(String.format("Unrecognized Format: %s", new Object[]{str}));
        }
    }
}
