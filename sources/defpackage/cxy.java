package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: cxy reason: default package */
public final class cxy {
    public static final dan a = ((dan) dan.a().a("TINK_MAC_1_0_0").a(cwl.a("TinkMac", "Mac", "HmacKey")).e());

    static {
        ((a) dan.a().a(a)).a("TINK_MAC_1_1_0").e();
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        cwy.a("TinkMac", (cwk<P>) new cxx<P>());
    }
}
