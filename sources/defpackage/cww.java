package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: cww reason: default package */
public final class cww {
    public static final czw a;

    static {
        String str = "TinkHybridDecrypt";
        String str2 = "TinkHybridEncrypt";
        a = (czw) ((a) czw.a().a(cwk.a)).a(cvu.a(str, "HybridDecrypt", "EciesAeadHkdfPrivateKey")).a(cvu.a(str2, "HybridEncrypt", "EciesAeadHkdfPublicKey")).a("TINK_HYBRID_1_0_0").e();
        ((a) czw.a().a(a)).a("TINK_HYBRID_1_1_0").e();
        try {
            cwh.a(str2, (cvt<P>) new cwy<P>());
            cwh.a(str, (cvt<P>) new cwx<P>());
            cwk.a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
