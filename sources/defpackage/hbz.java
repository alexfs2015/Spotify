package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: hbz reason: default package */
class hbz extends a {
    public static final Creator<hbz> CREATOR = new Creator<hbz>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            a aVar = (a) a.CREATOR.createFromParcel(parcel);
            return new hbz(aVar.a, aVar.b, parcel.readParcelable(hbz.class.getClassLoader()), juo.a(parcel));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hbz[i];
        }
    };
    public final Parcelable c;
    public final boolean d;

    public hbz(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, boolean z) {
        super(parcelable, parcelable2);
        this.c = parcelable3;
        this.d = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        juo.a(parcel, this.d);
    }
}
