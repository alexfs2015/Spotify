package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: cwc reason: default package */
public final class cwc {
    private static final CopyOnWriteArrayList<cwb> a = new CopyOnWriteArrayList<>();

    public static cwb a(String str) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            cwb cwb = (cwb) it.next();
            if (cwb.a()) {
                return cwb;
            }
        }
        String str2 = "No KMS client does support: ";
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
