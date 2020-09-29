package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: izc reason: default package */
public final class izc implements Parcelable {
    public static final Creator<izc> CREATOR = new Creator<izc>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new izc(juo.a(parcel), juo.c(parcel), juo.c(parcel));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new izc[i];
        }
    };
    final boolean a;
    final String b;
    final String c;

    public izc(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        juo.a(parcel, this.a);
        juo.a(parcel, this.b);
        juo.a(parcel, this.c);
    }
}
