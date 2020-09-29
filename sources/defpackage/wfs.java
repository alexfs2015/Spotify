package defpackage;

import io.netty.handler.ssl.PemX509Certificate;
import io.netty.handler.ssl.ReferenceCountedOpenSslEngine;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.X509KeyManager;
import org.apache.tomcat.jni.SSL;

/* renamed from: wfs reason: default package */
public class wfs {
    private static final Map<String, String> a;
    private final X509KeyManager b;
    private final String c;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        String str = "RSA";
        hashMap.put(str, str);
        a.put("DHE_RSA", str);
        a.put("ECDHE_RSA", str);
        a.put("ECDHE_ECDSA", "EC");
        a.put("ECDH_RSA", "EC_RSA");
        a.put("ECDH_ECDSA", "EC_EC");
        String str2 = "DH_RSA";
        a.put(str2, str2);
    }

    wfs(X509KeyManager x509KeyManager, String str) {
        this.b = x509KeyManager;
        this.c = str;
    }

    public final void a(ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine) {
        int i;
        HashSet hashSet;
        long j;
        long j2;
        long j3;
        long a2 = referenceCountedOpenSslEngine.a();
        String[] authenticationMethods = SSL.authenticationMethods(a2);
        HashSet hashSet2 = new HashSet(authenticationMethods.length);
        int length = authenticationMethods.length;
        int i2 = 0;
        while (i2 < length) {
            String str = (String) a.get(authenticationMethods[i2]);
            ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine2 = referenceCountedOpenSslEngine;
            if (str != null) {
                String a3 = a(referenceCountedOpenSslEngine2, str);
                if (a3 != null && hashSet2.add(a3)) {
                    long j4 = 0;
                    try {
                        X509Certificate[] certificateChain = this.b.getCertificateChain(a3);
                        if (certificateChain != null) {
                            if (certificateChain.length != 0) {
                                PrivateKey privateKey = this.b.getPrivateKey(a3);
                                wfx a4 = PemX509Certificate.a(vyw.a, true, certificateChain);
                                try {
                                    j2 = wgb.a(vyw.a, a4.c());
                                    try {
                                        long a5 = wgb.a(vyw.a, a4.c());
                                        if (privateKey != null) {
                                            try {
                                                j = wgb.a(privateKey);
                                            } catch (Throwable th) {
                                                th = th;
                                                j = 0;
                                                j4 = a5;
                                                try {
                                                    a4.B();
                                                    throw th;
                                                } catch (SSLException e) {
                                                    e = e;
                                                    throw e;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    throw new SSLException(e);
                                                }
                                            }
                                        } else {
                                            j = 0;
                                        }
                                        try {
                                            hashSet = hashSet2;
                                            i = length;
                                            j3 = a5;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j3 = a5;
                                            j4 = j3;
                                            a4.B();
                                            throw th;
                                        }
                                        try {
                                            SSL.setCertificateBio(a2, j2, j, this.c);
                                            SSL.setCertificateChainBio(a2, j3, true);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            j4 = j3;
                                            a4.B();
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        j = 0;
                                        a4.B();
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    j2 = 0;
                                    j = 0;
                                    a4.B();
                                    throw th;
                                }
                                try {
                                    a4.B();
                                    wgb.a(j);
                                    wgb.a(j2);
                                    wgb.a(j3);
                                    i2++;
                                    hashSet2 = hashSet;
                                    length = i;
                                } catch (SSLException e3) {
                                    e = e3;
                                    long j5 = j3;
                                    throw e;
                                } catch (Exception e4) {
                                    e = e4;
                                    j4 = j3;
                                    throw new SSLException(e);
                                } catch (Throwable th6) {
                                    th = th6;
                                    j4 = j;
                                    wgb.a(j4);
                                    wgb.a(j2);
                                    wgb.a(j3);
                                    throw th;
                                }
                            }
                        }
                        hashSet = hashSet2;
                        i = length;
                        wgb.a(0);
                        wgb.a(0);
                        wgb.a(0);
                        i2++;
                        hashSet2 = hashSet;
                        length = i;
                    } catch (SSLException e5) {
                        e = e5;
                        throw e;
                    } catch (Exception e6) {
                        e = e6;
                        j2 = 0;
                        j = 0;
                        throw new SSLException(e);
                    } catch (Throwable th7) {
                        th = th7;
                        j3 = j4;
                        j4 = j;
                        wgb.a(j4);
                        wgb.a(j2);
                        wgb.a(j3);
                        throw th;
                    }
                }
            }
            hashSet = hashSet2;
            i = length;
            i2++;
            hashSet2 = hashSet;
            length = i;
        }
    }

    /* access modifiers changed from: protected */
    public String a(ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine, String str) {
        return this.b.chooseServerAlias(str, null, null);
    }
}
