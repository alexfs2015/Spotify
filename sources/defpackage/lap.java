package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;

/* renamed from: lap reason: default package */
public final class lap {
    private static final fqu[] a = {ipq.e, ipq.f, ipq.g, ipq.h, ipq.i};

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, Serializable serializable) {
        return serializable != null && serializable.equals(str);
    }

    private static <T extends Serializable> boolean a(fqm<T>[] fqmArr, String str, fqn fqn) {
        if (fqn != null) {
            fcp a2 = fcp.a((E[]) fqmArr);
            fqn.getClass();
            if (!ImmutableList.a(a2.a((Function<? super E, T>) new $$Lambda$MJue5oiF_VBCQ1bvmk6guH_iZ7g<Object,T>(fqn)).a((fbq<? super E>) new $$Lambda$lap$XYSpC3XrITUzemiMu68MWlR_k2A<Object>(str)).a()).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(fqn fqn) {
        if (fqn != null) {
            if (!"premium".equals(fqn.a(gwf.b)) || a(a, "Enabled", fqn)) {
                return true;
            }
        }
        return false;
    }
}
