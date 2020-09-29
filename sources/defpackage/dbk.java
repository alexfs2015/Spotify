package defpackage;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* renamed from: dbk reason: default package */
public final class dbk implements dbf<KeyPairGenerator> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
