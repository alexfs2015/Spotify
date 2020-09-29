package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bnx reason: default package */
public final class bnx extends bxw {
    public static final Creator<bnx> CREATOR = new bsd();
    public String a;
    private String b;
    private List<String> c;
    private String d;
    private Uri e;
    private String f;

    private bnx() {
        this.c = new ArrayList();
    }

    bnx(String str, String str2, List<String> list, String str3, Uri uri, String str4) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = uri;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bnx)) {
            return false;
        }
        bnx bnx = (bnx) obj;
        return eic.a(this.a, bnx.a) && eic.a(this.b, bnx.b) && eic.a(this.c, bnx.c) && eic.a(this.d, bnx.d) && eic.a(this.e, bnx.e) && eic.a(this.f, bnx.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
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

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.a(parcel, 3, this.b, false);
        bxx.b(parcel, 4, null, false);
        bxx.a(parcel, 5, Collections.unmodifiableList(this.c), false);
        bxx.a(parcel, 6, this.d, false);
        bxx.a(parcel, 7, (Parcelable) this.e, i, false);
        bxx.a(parcel, 8, this.f, false);
        bxx.b(parcel, a2);
    }
}
