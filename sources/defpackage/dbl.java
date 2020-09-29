package defpackage;

import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: dbl reason: default package */
public final class dbl implements dbf<Mac> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
