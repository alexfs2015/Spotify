package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: apa reason: default package */
public class apa extends apb<apa, Object> {
    public static final Creator<apa> CREATOR = new Creator<apa>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apa(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apa[i];
        }
    };
    public String a;
    public aoy b;
    public aoz c;

    apa(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        a aVar = new a();
        aoy aoy = (aoy) parcel.readParcelable(aoy.class.getClassLoader());
        if (aoy != null) {
            aVar.a.putAll(aoy.a);
        }
        this.b = new aoy(aVar, 0);
        a aVar2 = new a();
        aoz aoz = (aoz) parcel.readParcelable(aoz.class.getClassLoader());
        if (aoz != null) {
            aVar2.a.putAll(aoz.a);
        }
        this.c = new aoz(aVar2, 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
    }
}
