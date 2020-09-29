package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.XmlResourceParser;
import android.os.Process;
import android.util.Base64;
import com.google.common.collect.Sets;
import com.spotify.base.java.logging.Logger;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: ruk reason: default package */
public final class ruk {
    private final Map<String, ArrayList<a>> a = new HashMap();

    /* renamed from: ruk$a */
    static final class a {
        public final String a;
        public final String b;
        public final Set<String> c;
        private String d;
        private boolean e;

        public a(String str, String str2, boolean z, String str3, Set<String> set) {
            this.d = str;
            this.a = str2;
            this.e = z;
            this.b = str3;
            this.c = set;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallerInfo{name=");
            sb.append(this.d);
            sb.append(", packageName=");
            sb.append(this.a);
            sb.append(", release=");
            sb.append(this.e);
            sb.append(", signingCertificate=");
            sb.append(this.b);
            sb.append(", allowedResources=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    public ruk(Set<rum> set) {
        for (rum a2 : set) {
            this.a.putAll(a(a2.a()));
        }
    }

    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [ruk$a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r4v4, types: [ruk$a] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r10v0, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r5v3, types: [ruk$a] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.util.HashSet] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v2
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], java.util.HashSet, ruk$a]
      uses: [?[OBJECT, ARRAY], ?[int, boolean, OBJECT, ARRAY, byte, short, char], ruk$a, java.lang.Object]
      mth insns count: 58
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, java.util.ArrayList<defpackage.ruk.a>> a(android.content.res.XmlResourceParser r12) {
        /*
            r11 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            int r2 = r12.next()     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
        L_0x000a:
            r3 = 1
            if (r2 == r3) goto L_0x009c
            r4 = 2
            if (r2 != r4) goto L_0x008c
            java.lang.String r2 = r12.getName()     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            java.lang.String r4 = "signing_certificate"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            r4 = 0
            if (r2 == 0) goto L_0x005a
            java.lang.String r2 = "name"
            java.lang.String r6 = r12.getAttributeValue(r4, r2)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            java.lang.String r2 = "package"
            java.lang.String r7 = r12.getAttributeValue(r4, r2)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            java.lang.String r2 = "release"
            boolean r8 = r12.getAttributeBooleanValue(r4, r2, r1)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            java.lang.String r2 = "allowedResources"
            java.lang.String r2 = r12.getAttributeValue(r4, r2)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            boolean r5 = defpackage.fax.a(r2)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            if (r5 != 0) goto L_0x0045
            java.lang.String r4 = ","
            java.lang.String[] r2 = r2.split(r4)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            java.util.HashSet r4 = com.google.common.collect.Sets.a((E[]) r2)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
        L_0x0045:
            r10 = r4
            java.lang.String r2 = r12.nextText()     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            java.lang.String r4 = "\\s|\\n"
            java.lang.String r5 = ""
            java.lang.String r9 = r2.replaceAll(r4, r5)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            ruk$a r2 = new ruk$a     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            r4 = r2
            goto L_0x006a
        L_0x005a:
            java.lang.String r2 = r12.getName()     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            java.lang.String r5 = "signature"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            if (r2 == 0) goto L_0x006a
            ruk$a r4 = b(r12)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
        L_0x006a:
            java.lang.String r2 = "PackageValidator info = %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            r3[r1] = r4     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            com.spotify.base.java.logging.Logger.b(r2, r3)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            if (r4 == 0) goto L_0x008c
            java.lang.String r2 = r4.b     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            if (r2 != 0) goto L_0x0089
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            java.lang.String r3 = r4.b     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
        L_0x0089:
            r2.add(r4)     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
        L_0x008c:
            int r2 = r12.next()     // Catch:{ XmlPullParserException -> 0x0094, IOException -> 0x0092 }
            goto L_0x000a
        L_0x0092:
            r12 = move-exception
            goto L_0x0095
        L_0x0094:
            r12 = move-exception
        L_0x0095:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Could not read allowed callers from XML."
            com.spotify.base.java.logging.Logger.e(r12, r2, r1)
        L_0x009c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ruk.a(android.content.res.XmlResourceParser):java.util.Map");
    }

    private static a b(XmlResourceParser xmlResourceParser) {
        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "package");
        String attributeValue3 = xmlResourceParser.getAttributeValue(null, "allowedResources");
        Set a2 = !fax.a(attributeValue3) ? Sets.a((E[]) attributeValue3.split(",")) : null;
        int next = xmlResourceParser.next();
        String str = "";
        String str2 = str;
        boolean z = false;
        while (next != 3) {
            z = xmlResourceParser.getAttributeBooleanValue(null, "release", false);
            str2 = xmlResourceParser.nextText().replaceAll("\\s|\\n", str).replaceAll(":", str).toLowerCase(Locale.ENGLISH);
            next = xmlResourceParser.next();
        }
        a aVar = new a(attributeValue, attributeValue2, z, str2, a2);
        return aVar;
    }

    public final boolean a(Context context, String str, int i, String str2) {
        if (1000 == i || Process.myUid() == i) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo.signatures.length != 1) {
                Logger.d("Caller has more than one signature certificate!", new Object[0]);
                return false;
            }
            String encodeToString = Base64.encodeToString(packageInfo.signatures[0].toByteArray(), 2);
            String a2 = a(packageInfo.signatures[0].toByteArray());
            ArrayList arrayList = (ArrayList) this.a.get(encodeToString);
            ArrayList arrayList2 = (ArrayList) this.a.get(a2);
            ArrayList arrayList3 = new ArrayList();
            if (arrayList != null) {
                arrayList3.addAll(arrayList);
            }
            if (arrayList2 != null) {
                arrayList3.addAll(arrayList2);
            }
            if (arrayList3.isEmpty()) {
                Logger.a("Signatures for caller %s are not valid: %s\n%s\n", str, encodeToString, a2);
                if (this.a.isEmpty()) {
                    Logger.d("The list of valid certificates is empty. Either your res/xml/allowed_media_browser_callers.xml and res/xml/allowed_media_browser_callers_v2.xml files are empty or there was an error while reading them. Check previous log messages.", new Object[0]);
                }
                if (!a(context, str)) {
                    return false;
                }
                Logger.a("The platform is signed for %s", str);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.a.equals(str) && aVar.c != null && aVar.c.contains(str2)) {
                    return true;
                }
                sb.append(aVar.a);
                sb.append(' ');
            }
            Logger.c("Caller has a valid certificate, but its package doesn't match any expected package for the given certificate. Caller's package is %s. Expected packages as defined in res/xml/allowed_media_browser_callers.xml or res/xml/allowed_media_browser_callers_v2.xml are (%s). This caller's certificate is (old format followed by the new format): %s\n%s\n", str, sb.toString(), encodeToString, a2);
            return false;
        } catch (NameNotFoundException e) {
            Logger.d(e, "Package manager can't find package: %s", str);
            return false;
        }
    }

    private static String a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return String.format("%064x", new Object[]{new BigInteger(1, instance.digest())});
        } catch (NoSuchAlgorithmException e) {
            Logger.e(e.getLocalizedMessage(), new Object[0]);
            return "";
        }
    }

    private static boolean a(Context context, String str) {
        PackageInfo b = b(context, "android");
        if (!(b == null || b.signatures == null || b.signatures.length == 0)) {
            PackageInfo b2 = b(context, str);
            if (b2 == null || b2.signatures == null || b2.signatures.length == 0 || b2.signatures.length != b.signatures.length) {
                return false;
            }
            for (int i = 0; i < b2.signatures.length; i++) {
                if (!b.signatures[i].equals(b2.signatures[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static PackageInfo b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64);
        } catch (NameNotFoundException unused) {
            Logger.e("Package %s is not found", str);
            return null;
        }
    }
}
