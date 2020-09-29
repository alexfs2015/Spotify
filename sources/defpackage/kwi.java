package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: kwi reason: default package */
public final class kwi implements Parcelable {
    public static final Creator<kwi> CREATOR = new Creator<kwi>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kwi(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kwi[i];
        }
    };
    public final boolean a;
    public final String b;
    private String c;

    protected kwi(Parcel parcel) {
        this.a = juo.a(parcel);
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    public kwi(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public static kwi a(boolean z, String str, String str2) {
        return new kwi(z, str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        juo.a(parcel, this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
