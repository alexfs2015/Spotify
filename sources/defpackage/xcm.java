package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: xcm reason: default package */
public final class xcm implements HostnameVerifier {
    public static final xcm a = new xcm();

    private xcm() {
    }

    public static List<String> a(X509Certificate x509Certificate) {
        List a2 = a(x509Certificate, 7);
        List a3 = a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(a2.size() + a3.size());
        arrayList.addAll(a2);
        arrayList.addAll(a3);
        return arrayList;
    }

    private static List<String> a(X509Certificate x509Certificate, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2) {
                    Integer num = (Integer) list.get(0);
                    if (num != null && num.intValue() == i) {
                        String str = (String) list.get(1);
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private static boolean a(String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            String str3 = ".";
            if (!str.startsWith(str3)) {
                String str4 = "..";
                if (!str.endsWith(str4) && str2 != null && str2.length() != 0 && !str2.startsWith(str3) && !str2.endsWith(str4)) {
                    if (!str.endsWith(str3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append('.');
                        str = sb.toString();
                    }
                    if (!str2.endsWith(str3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append('.');
                        str2 = sb2.toString();
                    }
                    String lowerCase = str2.toLowerCase(Locale.US);
                    if (!lowerCase.contains("*")) {
                        return str.equals(lowerCase);
                    }
                    String str5 = "*.";
                    if (!lowerCase.startsWith(str5) || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || str5.equals(lowerCase)) {
                        return false;
                    }
                    String substring = lowerCase.substring(1);
                    if (!str.endsWith(substring)) {
                        return false;
                    }
                    int length = str.length() - substring.length();
                    return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
                }
            }
        }
        return false;
    }

    private static boolean b(String str, X509Certificate x509Certificate) {
        List a2 = a(x509Certificate, 7);
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase((String) a2.get(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean c(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (String a2 : a(x509Certificate, 2)) {
            if (a(lowerCase, a2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(String str, X509Certificate x509Certificate) {
        return xaq.c(str) ? b(str, x509Certificate) : c(str, x509Certificate);
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
