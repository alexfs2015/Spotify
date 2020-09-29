package defpackage;

import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: dau reason: default package */
public final class dau implements dao<Mac> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
