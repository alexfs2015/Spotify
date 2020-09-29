package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Map;
import java.util.Map.Entry;

@cfp
/* renamed from: dxy reason: default package */
public final class dxy extends bxw {
    public static final Creator<dxy> CREATOR = new dxz();
    private final String a;
    private final String[] b;
    private final String[] c;

    dxy(String str, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
    }

    public static dxy a(dwv dwv) {
        Map b2 = dwv.b();
        int size = b2.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Entry entry : b2.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        return new dxy(dwv.b, strArr, strArr2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 1, this.a, false);
        bxx.a(parcel, 2, this.b, false);
        bxx.a(parcel, 3, this.c, false);
        bxx.b(parcel, a2);
    }
}
