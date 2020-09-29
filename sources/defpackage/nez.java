package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: nez reason: default package */
public class nez extends a {
    public static final Creator<nez> CREATOR = new Creator<nez>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new nez[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            a aVar = (a) a.CREATOR.createFromParcel(parcel);
            return new nez(aVar.a, aVar.b, parcel.readParcelable(nez.class.getClassLoader()), jse.a(parcel));
        }
    };
    public final Parcelable c;
    public final boolean d;

    public nez(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, boolean z) {
        super(parcelable, parcelable2);
        this.c = parcelable3;
        this.d = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        jse.a(parcel, this.d);
    }
}
