package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aoz reason: default package */
public class aoz implements api {
    public static final Creator<aoz> CREATOR = new Creator<aoz>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aoz(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aoz[i];
        }
    };
    public final Bundle a;

    /* renamed from: aoz$a */
    public static class a {
        Bundle a = new Bundle();
    }

    aoz(Parcel parcel) {
        this.a = parcel.readBundle(getClass().getClassLoader());
    }

    private aoz(a aVar) {
        this.a = aVar.a;
    }

    /* synthetic */ aoz(a aVar, byte b) {
        this(aVar);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
