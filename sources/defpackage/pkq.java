package defpackage;

import com.google.common.base.Optional;

/* renamed from: pkq reason: default package */
final class pkq {
    public static Optional<String> a(hcm hcm) {
        hci hci = (hci) hcm.events().get("click");
        return hci != null ? Optional.c(hci.data().string("uri")) : Optional.e();
    }
}
