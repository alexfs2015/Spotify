package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: apc reason: default package */
public class apc implements api {
    public static final Creator<apc> CREATOR = new Creator<apc>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apc(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apc[i];
        }
    };
    public final String a;

    /* renamed from: apc$a */
    public static class a {
        String a;
    }

    apc(Parcel parcel) {
        this.a = parcel.readString();
    }

    private apc(a aVar) {
        this.a = aVar.a;
    }

    /* synthetic */ apc(a aVar, byte b) {
        this(aVar);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
