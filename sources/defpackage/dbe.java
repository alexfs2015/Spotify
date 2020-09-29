package defpackage;

import defpackage.dbf;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: dbe reason: default package */
public final class dbe<T_WRAPPER extends dbf<T_ENGINE>, T_ENGINE> {
    public static final dbe<dbh, Cipher> a = new dbe<>(new dbh());
    public static final dbe<dbl, Mac> b = new dbe<>(new dbl());
    public static final dbe<dbi, KeyAgreement> c = new dbe<>(new dbi());
    public static final dbe<dbk, KeyPairGenerator> d = new dbe<>(new dbk());
    public static final dbe<dbj, KeyFactory> e = new dbe<>(new dbj());
    private static final Logger f = Logger.getLogger(dbe.class.getName());
    private static final List<Provider> g;
    private T_WRAPPER h;
    private List<Provider> i = g;
    private boolean j = true;

    static {
        if (dbw.a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            g = arrayList;
        } else {
            g = new ArrayList();
        }
        new dbe(new dbn());
        new dbe(new dbm());
    }

    private dbe(T_WRAPPER t_wrapper) {
        this.h = t_wrapper;
    }

    private final boolean a(String str, Provider provider) {
        try {
            this.h.a(str, provider);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final T_ENGINE a(String str) {
        T_WRAPPER t_wrapper;
        Provider provider;
        Iterator it = this.i.iterator();
        while (true) {
            if (it.hasNext()) {
                provider = (Provider) it.next();
                if (a(str, provider)) {
                    t_wrapper = this.h;
                    break;
                }
            } else if (this.j) {
                t_wrapper = this.h;
                provider = null;
            } else {
                throw new GeneralSecurityException("No good Provider found.");
            }
        }
        return t_wrapper.a(str, provider);
    }
}
