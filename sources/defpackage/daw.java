package defpackage;

import java.security.Provider;
import java.security.Signature;

/* renamed from: daw reason: default package */
public final class daw implements dao<Signature> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
