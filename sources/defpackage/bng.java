package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bng reason: default package */
public final class bng extends bxf {
    public static final Creator<bng> CREATOR = new brm();
    public String a;
    private String b;
    private List<String> c;
    private String d;
    private Uri e;
    private String f;

    bng(String str, String str2, List<String> list, String str3, Uri uri, String str4) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = uri;
        this.f = str4;
    }

    private bng() {
        this.c = new ArrayList();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        List<String> list = this.c;
        int size = list == null ? 0 : list.size();
        String str3 = this.d;
        String valueOf = String.valueOf(this.e);
        String str4 = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 110 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(valueOf).length() + String.valueOf(str4).length());
        sb.append("applicationId: ");
        sb.append(str);
        sb.append(", name: ");
        sb.append(str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        sb.append(", senderAppLaunchUrl: ");
        sb.append(valueOf);
        sb.append(", iconUrl: ");
        sb.append(str4);
        return sb.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bng)) {
            return false;
        }
        bng bng = (bng) obj;
        return ehl.a(this.a, bng.a) && ehl.a(this.b, bng.b) && ehl.a(this.c, bng.c) && ehl.a(this.d, bng.d) && ehl.a(this.e, bng.e) && ehl.a(this.f, bng.f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.a(parcel, 3, this.b, false);
        bxg.b(parcel, 4, null, false);
        bxg.a(parcel, 5, Collections.unmodifiableList(this.c), false);
        bxg.a(parcel, 6, this.d, false);
        bxg.a(parcel, 7, (Parcelable) this.e, i, false);
        bxg.a(parcel, 8, this.f, false);
        bxg.b(parcel, a2);
    }
}
