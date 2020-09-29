package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: cxn reason: default package */
public final class cxn {
    public static final dan a;

    static {
        String str = "TinkHybridDecrypt";
        String str2 = "TinkHybridEncrypt";
        a = (dan) ((a) dan.a().a(cxb.a)).a(cwl.a(str, "HybridDecrypt", "EciesAeadHkdfPrivateKey")).a(cwl.a(str2, "HybridEncrypt", "EciesAeadHkdfPublicKey")).a("TINK_HYBRID_1_0_0").e();
        ((a) dan.a().a(a)).a("TINK_HYBRID_1_1_0").e();
        try {
            cwy.a(str2, (cwk<P>) new cxp<P>());
            cwy.a(str, (cwk<P>) new cxo<P>());
            cxb.a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
