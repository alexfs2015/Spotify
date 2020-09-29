package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: rvy reason: default package */
public final class rvy implements Parcelable {
    public static final Creator<rvy> CREATOR = new Creator<rvy>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new rvy[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new rvy(parcel);
        }
    };
    private final String a;
    private final String b;
    private final long c;

    public final int describeContents() {
        return 0;
    }

    public rvy(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }

    rvy(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readLong();
    }
}
