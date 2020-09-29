package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: cxb reason: default package */
public final class cxb {
    public static final dan a;

    static {
        String str = "Aead";
        String str2 = "TinkAead";
        a = (dan) ((a) dan.a().a(cxy.a)).a(cwl.a(str2, str, "AesCtrHmacAeadKey")).a(cwl.a(str2, str, "AesEaxKey")).a(cwl.a(str2, str, "AesGcmKey")).a(cwl.a(str2, str, "ChaCha20Poly1305Key")).a(cwl.a(str2, str, "KmsAeadKey")).a(cwl.a(str2, str, "KmsEnvelopeAeadKey")).a("TINK_AEAD_1_0_0").e();
        ((a) dan.a().a(a)).a("TINK_AEAD_1_1_0").e();
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        cwy.a("TinkAead", (cwk<P>) new cxa<P>());
        cxy.a();
    }
}
