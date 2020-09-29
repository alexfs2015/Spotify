package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: cwk reason: default package */
public final class cwk {
    public static final czw a;

    static {
        String str = "Aead";
        String str2 = "TinkAead";
        a = (czw) ((a) czw.a().a(cxh.a)).a(cvu.a(str2, str, "AesCtrHmacAeadKey")).a(cvu.a(str2, str, "AesEaxKey")).a(cvu.a(str2, str, "AesGcmKey")).a(cvu.a(str2, str, "ChaCha20Poly1305Key")).a(cvu.a(str2, str, "KmsAeadKey")).a(cvu.a(str2, str, "KmsEnvelopeAeadKey")).a("TINK_AEAD_1_0_0").e();
        ((a) czw.a().a(a)).a("TINK_AEAD_1_1_0").e();
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        cwh.a("TinkAead", (cvt<P>) new cwj<P>());
        cxh.a();
    }
}
