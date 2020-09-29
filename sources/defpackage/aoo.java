package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aoo reason: default package */
public class aoo implements aou {
    public static final Creator<aoo> CREATOR = new Creator<aoo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aoo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aoo(parcel);
        }
    };
    public final String a;

    /* renamed from: aoo$a */
    public static class a {
        String a;
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ aoo(a aVar, byte b) {
        this(aVar);
    }

    private aoo(a aVar) {
        this.a = aVar.a;
    }

    aoo(Parcel parcel) {
        this.a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
