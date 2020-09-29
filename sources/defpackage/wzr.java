package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.ByteString;

/* renamed from: wzr reason: default package */
public final class wzr {
    public static final wzr a = new wzr(new LinkedHashSet(new a().a), null);
    final Set<b> b;
    final xcl c;

    /* renamed from: wzr$a */
    public static final class a {
        final List<b> a = new ArrayList();
    }

    /* renamed from: wzr$b */
    static final class b {
        final String a;
        final String b;
        final String c;
        final ByteString d;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.a.equals(bVar.a) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 527) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            sb.append(this.d.b());
            return sb.toString();
        }
    }

    wzr(Set<b> set, xcl xcl) {
        this.b = set;
        this.c = xcl;
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder("sha256/");
            sb.append(a((X509Certificate) certificate).b());
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    private static ByteString a(X509Certificate x509Certificate) {
        return ByteString.a(x509Certificate.getPublicKey().getEncoded()).e();
    }

    public final void a(String str, List<Certificate> list) {
        int i;
        String str2;
        String str3 = str;
        List emptyList = Collections.emptyList();
        Iterator it = this.b.iterator();
        List list2 = emptyList;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            b bVar = (b) it.next();
            if (bVar.a.startsWith("*.")) {
                int indexOf = str3.indexOf(46);
                if ((str.length() - indexOf) - 1 == bVar.b.length()) {
                    if (str.regionMatches(false, indexOf + 1, bVar.b, 0, bVar.b.length())) {
                        i = 1;
                    }
                }
            } else {
                i = str3.equals(bVar.b);
            }
            if (i != 0) {
                if (list2.isEmpty()) {
                    list2 = new ArrayList();
                }
                list2.add(bVar);
            }
        }
        if (!list2.isEmpty()) {
            xcl xcl = this.c;
            List<Certificate> list3 = list;
            List<Certificate> a2 = xcl != null ? xcl.a(list3, str3) : list3;
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                X509Certificate x509Certificate = (X509Certificate) a2.get(i2);
                int size2 = list2.size();
                ByteString byteString = null;
                ByteString byteString2 = null;
                for (int i3 = 0; i3 < size2; i3++) {
                    b bVar2 = (b) list2.get(i3);
                    if (bVar2.c.equals("sha256/")) {
                        if (byteString == null) {
                            byteString = a(x509Certificate);
                        }
                        if (bVar2.d.equals(byteString)) {
                            return;
                        }
                    } else if (bVar2.c.equals("sha1/")) {
                        if (byteString2 == null) {
                            byteString2 = ByteString.a(x509Certificate.getPublicKey().getEncoded()).d();
                        }
                        if (bVar2.d.equals(byteString2)) {
                            return;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("unsupported hashAlgorithm: ");
                        sb.append(bVar2.c);
                        throw new AssertionError(sb.toString());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            int size3 = a2.size();
            int i4 = 0;
            while (true) {
                str2 = "\n    ";
                if (i4 >= size3) {
                    break;
                }
                X509Certificate x509Certificate2 = (X509Certificate) a2.get(i4);
                sb2.append(str2);
                sb2.append(a((Certificate) x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
                i4++;
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str3);
            sb2.append(":");
            int size4 = list2.size();
            while (i < size4) {
                b bVar3 = (b) list2.get(i);
                sb2.append(str2);
                sb2.append(bVar3);
                i++;
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wzr) {
            wzr wzr = (wzr) obj;
            if (xaq.a((Object) this.c, (Object) wzr.c) && this.b.equals(wzr.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        xcl xcl = this.c;
        return ((xcl != null ? xcl.hashCode() : 0) * 31) + this.b.hashCode();
    }
}
