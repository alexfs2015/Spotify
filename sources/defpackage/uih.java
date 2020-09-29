package defpackage;

import com.google.common.base.Optional;
import java.util.concurrent.Callable;

/* renamed from: uih reason: default package */
public final class uih {
    public static wud<Optional<String>> a(uib uib) {
        return wud.a((Callable<? extends T>) new $$Lambda$uih$Y5qpJoS1U_rVmWuIoayhsQhbhdo<Object>(uib));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Optional b(uib uib) {
        String[] a = uhr.a(uib.a, 0, uib.b, uib.c);
        if (a == null || a.length <= 0) {
            return Optional.e();
        }
        return Optional.b(a[0]);
    }
}
