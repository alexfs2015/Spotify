package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vzk reason: default package */
final class vzk extends vzj {
    public static final Creator<vzk> CREATOR = new Creator<vzk>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            vzk.e;
            String str = (String) fbp.a(parcel.readString());
            Object obj = str.equals(b.class.getCanonicalName()) ? vzp.a((String) fbp.a(parcel.readString())) : str.equals(a.class.getCanonicalName()) ? new a() : null;
            vzp vzp = (vzp) fbp.a(obj);
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            return new vzk(vzp, z2, z);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vzk[i];
        }
    };
    /* access modifiers changed from: private */
    public static final wag e = new wag();

    vzk(vzp vzp, boolean z, boolean z2) {
        super(vzp, z, z2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        wag.a(this.a, parcel);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
