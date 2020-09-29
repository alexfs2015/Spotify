package defpackage;

import com.google.common.base.Optional;

/* renamed from: pde reason: default package */
final class pde {
    public static Optional<String> a(gzt gzt) {
        gzp gzp = (gzp) gzt.events().get("click");
        if (gzp != null) {
            return Optional.c(gzp.data().string("uri"));
        }
        return Optional.e();
    }
}
