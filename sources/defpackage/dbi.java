package defpackage;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: dbi reason: default package */
public final class dbi implements dbf<KeyAgreement> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
