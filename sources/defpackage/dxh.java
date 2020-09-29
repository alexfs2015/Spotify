package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Map;
import java.util.Map.Entry;

@cey
/* renamed from: dxh reason: default package */
public final class dxh extends bxf {
    public static final Creator<dxh> CREATOR = new dxi();
    private final String a;
    private final String[] b;
    private final String[] c;

    dxh(String str, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 1, this.a, false);
        bxg.a(parcel, 2, this.b, false);
        bxg.a(parcel, 3, this.c, false);
        bxg.b(parcel, a2);
    }

    public static dxh a(dwe dwe) {
        Map b2 = dwe.b();
        int size = b2.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Entry entry : b2.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        return new dxh(dwe.b, strArr, strArr2);
    }
}
