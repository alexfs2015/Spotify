package defpackage;

import com.google.common.base.Optional;
import java.util.concurrent.Callable;

/* renamed from: utv reason: default package */
public final class utv {
    public static xii<Optional<String>> a(utp utp) {
        return xii.a((Callable<? extends T>) new $$Lambda$utv$sUVTuSCQGX1tkB8zmu0bbxK5e4<Object>(utp));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Optional b(utp utp) {
        String[] a = utf.a(utp.a, 0, utp.b, utp.c);
        return (a == null || a.length <= 0) ? Optional.e() : Optional.b(a[0]);
    }
}
