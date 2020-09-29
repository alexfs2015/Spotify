package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aoy reason: default package */
public class aoy implements api {
    public static final Creator<aoy> CREATOR = new Creator<aoy>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aoy(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aoy[i];
        }
    };
    public final Bundle a;

    /* renamed from: aoy$a */
    public static class a {
        Bundle a = new Bundle();
    }

    aoy(Parcel parcel) {
        this.a = parcel.readBundle(getClass().getClassLoader());
    }

    private aoy(a aVar) {
        this.a = aVar.a;
    }

    /* synthetic */ aoy(a aVar, byte b) {
        this(aVar);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
