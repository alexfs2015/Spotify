package defpackage;

import java.security.Provider;
import javax.crypto.Cipher;

/* renamed from: dbh reason: default package */
public final class dbh implements dbf<Cipher> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
