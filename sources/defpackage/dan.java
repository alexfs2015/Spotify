package defpackage;

import defpackage.dao;
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

/* renamed from: dan reason: default package */
public final class dan<T_WRAPPER extends dao<T_ENGINE>, T_ENGINE> {
    public static final dan<daq, Cipher> a = new dan<>(new daq());
    public static final dan<dau, Mac> b = new dan<>(new dau());
    public static final dan<dar, KeyAgreement> c = new dan<>(new dar());
    public static final dan<dat, KeyPairGenerator> d = new dan<>(new dat());
    public static final dan<das, KeyFactory> e = new dan<>(new das());
    private static final Logger f = Logger.getLogger(dan.class.getName());
    private static final List<Provider> g;
    private T_WRAPPER h;
    private List<Provider> i = g;
    private boolean j = true;

    static {
        if (dbf.a()) {
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
        new dan(new daw());
        new dan(new dav());
    }

    private dan(T_WRAPPER t_wrapper) {
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
