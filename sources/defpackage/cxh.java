package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: cxh reason: default package */
public final class cxh {
    public static final czw a = ((czw) czw.a().a("TINK_MAC_1_0_0").a(cvu.a("TinkMac", "Mac", "HmacKey")).e());

    static {
        ((a) czw.a().a(a)).a("TINK_MAC_1_1_0").e();
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        cwh.a("TinkMac", (cvt<P>) new cxg<P>());
    }
}
