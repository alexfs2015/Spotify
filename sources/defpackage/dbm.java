package defpackage;

import java.security.MessageDigest;
import java.security.Provider;

/* renamed from: dbm reason: default package */
public final class dbm implements dbf<MessageDigest> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
