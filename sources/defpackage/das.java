package defpackage;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: das reason: default package */
public final class das implements dao<KeyFactory> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
