package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aok reason: default package */
public class aok implements aou {
    public static final Creator<aok> CREATOR = new Creator<aok>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aok[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aok(parcel);
        }
    };
    public final Bundle a;

    /* renamed from: aok$a */
    public static class a {
        Bundle a = new Bundle();
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ aok(a aVar, byte b) {
        this(aVar);
    }

    private aok(a aVar) {
        this.a = aVar.a;
    }

    aok(Parcel parcel) {
        this.a = parcel.readBundle(getClass().getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
