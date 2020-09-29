package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aol reason: default package */
public class aol implements aou {
    public static final Creator<aol> CREATOR = new Creator<aol>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aol[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aol(parcel);
        }
    };
    public final Bundle a;

    /* renamed from: aol$a */
    public static class a {
        Bundle a = new Bundle();
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ aol(a aVar, byte b) {
        this(aVar);
    }

    private aol(a aVar) {
        this.a = aVar.a;
    }

    aol(Parcel parcel) {
        this.a = parcel.readBundle(getClass().getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
