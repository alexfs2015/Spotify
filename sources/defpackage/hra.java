package defpackage;

import io.reactivex.Single;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: hra reason: default package */
public final class hra {
    private static final Long a = Long.valueOf(TimeUnit.DAYS.toSeconds(7));
    private final lbk b;

    public hra(lbk lbk) {
        this.b = lbk;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map a(Boolean bool) {
        HashMap hashMap = new HashMap(1);
        if (!bool.booleanValue()) {
            hashMap.put("Cache-Control", String.format(Locale.getDefault(), "max-stale=%d", new Object[]{a}));
        }
        return hashMap;
    }

    public final Single<Map<String, String>> a() {
        return this.b.a.a(0, Boolean.FALSE).f($$Lambda$hra$w_ImgDHwrpB_wbku5FSwcxnNjQ.INSTANCE);
    }
}
