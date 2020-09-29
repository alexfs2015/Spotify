package defpackage;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: dar reason: default package */
public final class dar implements dao<KeyAgreement> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
