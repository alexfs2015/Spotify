package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

@cey
/* renamed from: coy reason: default package */
public final class coy extends bxf {
    public static final Creator<coy> CREATOR = new coz();
    public String a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public coy(int i, int i2, boolean z) {
        this(i, i2, z, false);
    }

    private coy(int i, int i2, boolean z, boolean z2) {
        String str = z ? Ad.DEFAULT_SKIPPABLE_AD_DELAY : "1";
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append("afma-sdk-a-v");
        sb.append(i);
        String str2 = ".";
        sb.append(str2);
        sb.append(i2);
        sb.append(str2);
        sb.append(str);
        this(sb.toString(), i, i2, z, z2);
    }

    public coy(int i, boolean z) {
        this(brz.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, z);
    }

    coy(String str, int i, int i2, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public static coy a() {
        return new coy(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.b(parcel, 3, this.b);
        bxg.b(parcel, 4, this.c);
        bxg.a(parcel, 5, this.d);
        bxg.a(parcel, 6, this.e);
        bxg.b(parcel, a2);
    }
}
