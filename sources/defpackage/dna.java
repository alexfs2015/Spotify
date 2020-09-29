package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

@cey
/* renamed from: dna reason: default package */
public final class dna extends bxf {
    public static final Creator<dna> CREATOR = new dnb();
    public final String a;
    private final long b;
    private final String c;
    private final String d;
    private final String e;
    private final Bundle f;
    private final boolean g;
    private long h;

    dna(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.a = str;
        this.b = j;
        String str5 = "";
        if (str2 == null) {
            str2 = str5;
        }
        this.c = str2;
        if (str3 == null) {
            str3 = str5;
        }
        this.d = str3;
        if (str4 != null) {
            str5 = str4;
        }
        this.e = str5;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f = bundle;
        this.g = z;
        this.h = j2;
    }

    public static dna a(String str) {
        return a(Uri.parse(str));
    }

    public static dna a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                sb.toString();
                cow.a(5);
                return null;
            }
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : bjl.g().a(uri)) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            dna dna = new dna(queryParameter, parseLong, host, str, str2, bundle, equals, 0);
            return dna;
        } catch (NullPointerException | NumberFormatException unused) {
            cow.a(5);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.a(parcel, 3, this.b);
        bxg.a(parcel, 4, this.c, false);
        bxg.a(parcel, 5, this.d, false);
        bxg.a(parcel, 6, this.e, false);
        bxg.a(parcel, 7, this.f, false);
        bxg.a(parcel, 8, this.g);
        bxg.a(parcel, 9, this.h);
        bxg.b(parcel, a2);
    }
}
