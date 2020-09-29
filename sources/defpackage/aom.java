package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aom reason: default package */
public class aom extends aon<aom, Object> {
    public static final Creator<aom> CREATOR = new Creator<aom>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aom[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aom(parcel);
        }
    };
    public String a;
    public aok b;
    public aol c;

    aom(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        a aVar = new a();
        aok aok = (aok) parcel.readParcelable(aok.class.getClassLoader());
        if (aok != null) {
            aVar.a.putAll(aok.a);
        }
        this.b = new aok(aVar, 0);
        a aVar2 = new a();
        aol aol = (aol) parcel.readParcelable(aol.class.getClassLoader());
        if (aol != null) {
            aVar2.a.putAll(aol.a);
        }
        this.c = new aol(aVar2, 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
    }
}
