package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: iwr reason: default package */
public final class iwr implements Parcelable {
    public static final Creator<iwr> CREATOR = new Creator<iwr>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new iwr[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new iwr(jse.a(parcel), jse.c(parcel), jse.c(parcel));
        }
    };
    final boolean a;
    final String b;
    final String c;

    public final int describeContents() {
        return 0;
    }

    public iwr(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        jse.a(parcel, this.a);
        jse.a(parcel, this.b);
        jse.a(parcel, this.c);
    }
}
