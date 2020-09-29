package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: sfi reason: default package */
public final class sfi implements Parcelable {
    public static final Creator<sfi> CREATOR = new Creator<sfi>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new sfi(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new sfi[i];
        }
    };
    private final String a;
    private final String b;
    private final long c;

    sfi(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readLong();
    }

    public sfi(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }
}
