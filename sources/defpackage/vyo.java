package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vyo reason: default package */
final class vyo extends vyn {
    public static final Creator<vyo> CREATOR = new Creator<vyo>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            vyo.e;
            String str = (String) fbp.a(parcel.readString());
            String str2 = (String) fbp.a(parcel.readString());
            Object obj = str.equals(a.class.getCanonicalName()) ? new a() : str.equals(b.class.getCanonicalName()) ? vyt.a(str2, parcel.readInt()) : str.equals(c.class.getCanonicalName()) ? vyt.a(str2) : str.equals(e.class.getCanonicalName()) ? vyt.b(str2) : str.equals(d.class.getCanonicalName()) ? vyt.c(str2) : null;
            vyt vyt = (vyt) fbp.a(obj);
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            return new vyo(vyt, z2, z);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vyo[i];
        }
    };
    /* access modifiers changed from: private */
    public static final wae e = new wae();

    vyo(vyt vyt, boolean z, boolean z2) {
        super(vyt, z, z2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        wae.a(this.a, parcel);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
