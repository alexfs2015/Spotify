package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: ksz reason: default package */
public final class ksz implements Parcelable {
    public static final Creator<ksz> CREATOR = new Creator<ksz>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ksz[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ksz(parcel);
        }
    };
    public final boolean a;
    public final String b;
    private String c;

    public final int describeContents() {
        return 0;
    }

    protected ksz(Parcel parcel) {
        this.a = jse.a(parcel);
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    public ksz(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public static ksz a(boolean z, String str, String str2) {
        return new ksz(z, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        jse.a(parcel, this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
