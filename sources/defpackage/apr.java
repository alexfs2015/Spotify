package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: apr reason: default package */
public final class apr extends apb<apr, Object> implements api {
    public static final Creator<apr> CREATOR = new Creator<apr>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apr(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apr[i];
        }
    };
    public final String a;
    public final String b;
    public final apn c;
    public final apq d;

    apr(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = parcel.readString();
        a a2 = new a().a(parcel);
        if (a2.c == null && a2.b == null) {
            this.c = null;
        } else {
            this.c = a2.a();
        }
        this.d = new apq(new a().a(parcel), 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
    }
}
