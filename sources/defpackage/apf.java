package defpackage;

import android.os.Parcel;

/* renamed from: apf reason: default package */
public abstract class apf implements api {
    public final String a;

    /* renamed from: apf$a */
    public static abstract class a<M extends apf, B extends a> {
        public String a;
    }

    protected apf(Parcel parcel) {
        this.a = parcel.readString();
    }

    protected apf(a aVar) {
        this.a = aVar.a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
