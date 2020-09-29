package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: cwt reason: default package */
public final class cwt {
    private static final CopyOnWriteArrayList<cws> a = new CopyOnWriteArrayList<>();

    public static cws a(String str) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            cws cws = (cws) it.next();
            if (cws.a()) {
                return cws;
            }
        }
        String str2 = "No KMS client does support: ";
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
