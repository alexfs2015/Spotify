package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

@cfp
/* renamed from: cpp reason: default package */
public final class cpp extends bxw {
    public static final Creator<cpp> CREATOR = new cpq();
    public String a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public cpp(int i, int i2, boolean z) {
        this(i, i2, z, false);
    }

    private cpp(int i, int i2, boolean z, boolean z2) {
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

    public cpp(int i, boolean z) {
        this(bsq.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, z);
    }

    cpp(String str, int i, int i2, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public static cpp a() {
        return new cpp(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.b(parcel, 3, this.b);
        bxx.b(parcel, 4, this.c);
        bxx.a(parcel, 5, this.d);
        bxx.a(parcel, 6, this.e);
        bxx.b(parcel, a2);
    }
}
