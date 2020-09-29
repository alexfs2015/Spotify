package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: apd reason: default package */
public final class apd extends aon<apd, Object> implements aou {
    public static final Creator<apd> CREATOR = new Creator<apd>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apd[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apd(parcel);
        }
    };
    public final String a;
    public final String b;
    public final aoz c;
    public final apc d;

    public final int describeContents() {
        return 0;
    }

    apd(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = parcel.readString();
        a a2 = new a().a(parcel);
        if (a2.c == null && a2.b == null) {
            this.c = null;
        } else {
            this.c = a2.a();
        }
        this.d = new apc(new a().a(parcel), 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
    }
}
