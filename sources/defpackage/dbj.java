package defpackage;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: dbj reason: default package */
public final class dbj implements dbf<KeyFactory> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
