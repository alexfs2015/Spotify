package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vxr reason: default package */
final class vxr extends vxl {
    public static final Creator<vxr> CREATOR = new Creator<vxr>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Object obj;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            vxr.g;
            String str = (String) fbp.a(parcel.readString());
            String str2 = (String) fbp.a(parcel.readString());
            if (str.equals(b.class.getCanonicalName())) {
                obj = new b();
            } else if (str.equals(d.class.getCanonicalName())) {
                obj = new d();
            } else if (str.equals(a.class.getCanonicalName())) {
                vxs vxs = str2.equals(a.class.getCanonicalName()) ? new a() : str2.equals(b.class.getCanonicalName()) ? new b() : new c();
                obj = vxq.a(vxs);
            } else {
                obj = str.equals(c.class.getCanonicalName()) ? new c() : null;
            }
            vxr vxr = new vxr(readInt, readInt2, readInt3, (vxq) fbp.a(obj), parcel.readInt() == 1);
            return vxr;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vxr[i];
        }
    };
    /* access modifiers changed from: private */
    public static final wad g = new wad();

    vxr(int i, int i2, int i3, vxq vxq, boolean z) {
        super(i, i2, i3, vxq, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        wad.a(this.d, parcel);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
