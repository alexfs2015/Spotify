package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@cey
/* renamed from: dyz reason: default package */
final class dyz {
    private final Object[] a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof dyz)) {
            return false;
        }
        return Arrays.equals(this.a, ((dyz) obj).a);
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

    dyz(doy doy, String str, int i) {
        String str2 = (String) dpn.f().a(dsp.aT);
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
            arrayList.add(Long.valueOf(doy.b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(bkb.a(doy.c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(doy.d));
        }
        if (hashSet.contains("keywords")) {
            if (doy.e != null) {
                arrayList.add(doy.e.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(doy.f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(doy.g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(doy.h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(doy.i);
        }
        if (hashSet.contains("location")) {
            if (doy.k != null) {
                arrayList.add(doy.k.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(doy.l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(bkb.a(doy.m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(bkb.a(doy.n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (doy.o != null) {
                arrayList.add(doy.o.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(doy.p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(doy.q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(doy.r));
        }
        this.a = arrayList.toArray();
    }
}
