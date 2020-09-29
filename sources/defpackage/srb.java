package defpackage;

import com.google.common.base.Function;

/* renamed from: srb reason: default package */
public final class srb {
    private static final Function<hcm, String> a = $$Lambda$srb$59ZKlIRuPvOA_jKqJyLQTuTyv38.INSTANCE;
    private static final fbq<String> b = $$Lambda$srb$urt_7VwaGQNpd6m5I8CElBWkdO8.INSTANCE;

    public static Iterable<String> a(Iterable<? extends hcm> iterable) {
        return fcp.a(iterable).a(a).a(b);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(hcm hcm) {
        String str = null;
        if (hcm == null) {
            return null;
        }
        hcm hcm2 = (hcm) fbp.a(hcm);
        hcr target = hcm2.target();
        if (target != null) {
            str = ((hcr) fbp.a(target)).uri();
        }
        if (str == null) {
            str = ((hcm) fbp.a(hcm2)).custom().string("trackUri");
        }
        return str;
    }
}
