package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@cfp
/* renamed from: dzq reason: default package */
final class dzq {
    private final Object[] a;

    dzq(dpp dpp, String str, int i) {
        String str2 = (String) dqe.f().a(dtg.aT);
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("formatString")) {
            arrayList.add(null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(dpp.b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(bks.a(dpp.c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(dpp.d));
        }
        if (hashSet.contains("keywords")) {
            if (dpp.e != null) {
                arrayList.add(dpp.e.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(dpp.f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(dpp.g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(dpp.h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(dpp.i);
        }
        if (hashSet.contains("location")) {
            if (dpp.k != null) {
                arrayList.add(dpp.k.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(dpp.l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(bks.a(dpp.m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(bks.a(dpp.n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (dpp.o != null) {
                arrayList.add(dpp.o.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(dpp.p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(dpp.q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(dpp.r));
        }
        this.a = arrayList.toArray();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dzq)) {
            return false;
        }
        return Arrays.equals(this.a, ((dzq) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 24);
        sb.append("[InterstitialAdPoolKey ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
