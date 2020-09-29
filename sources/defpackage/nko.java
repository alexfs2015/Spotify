package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: nko reason: default package */
public class nko extends a {
    public static final Creator<nko> CREATOR = new Creator<nko>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            a aVar = (a) a.CREATOR.createFromParcel(parcel);
            return new nko(aVar.a, aVar.b, parcel.readParcelable(nko.class.getClassLoader()), juo.a(parcel));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new nko[i];
        }
    };
    public final Parcelable c;
    public final boolean d;

    public nko(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, boolean z) {
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
