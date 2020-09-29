package defpackage;

import java.util.Collection;

/* renamed from: bnz reason: default package */
public final class bnz {
    public static String a(String str) {
        if (str != null) {
            return a("com.google.android.gms.cast.CATEGORY_CAST", str, null);
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    public static String a(String str, String str2, Collection<String> collection) {
        StringBuilder sb = new StringBuilder(str);
        String str3 = "/";
        if (str2 != null) {
            String upperCase = str2.toUpperCase();
            if (!upperCase.matches("[A-F0-9]+")) {
                String str4 = "Invalid application ID: ";
                String valueOf = String.valueOf(str2);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            }
            sb.append(str3);
            sb.append(upperCase);
        }
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (str2 == null) {
                    sb.append(str3);
                }
                sb.append(str3);
                boolean z = true;
                for (String str5 : collection) {
                    eic.a(str5);
                    if (z) {
                        z = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(eic.c(str5));
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (str2 == null && collection == null) {
            sb.append(str3);
        }
        if (collection == null) {
            sb.append(str3);
        }
        sb.append(str3);
        sb.append(str3);
        sb.append("ALLOW_IPV6");
        return sb.toString();
    }
}
