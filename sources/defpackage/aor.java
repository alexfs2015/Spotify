package defpackage;

import android.os.Parcel;

/* renamed from: aor reason: default package */
public abstract class aor implements aou {
    public final String a;

    /* renamed from: aor$a */
    public static abstract class a<M extends aor, B extends a> {
        public String a;
    }

    public int describeContents() {
        return 0;
    }

    protected aor(a aVar) {
        this.a = aVar.a;
    }

    protected aor(Parcel parcel) {
        this.a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
