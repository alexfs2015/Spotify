package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vkl reason: default package */
final class vkl extends vkf {
    public static final Creator<vkl> CREATOR = new Creator<vkl>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vkl[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Object obj;
            vkm vkm;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            vkl.g;
            String str = (String) fay.a(parcel.readString());
            String str2 = (String) fay.a(parcel.readString());
            if (str.equals(b.class.getCanonicalName())) {
                obj = new b();
            } else if (str.equals(d.class.getCanonicalName())) {
                obj = new d();
            } else if (str.equals(a.class.getCanonicalName())) {
                if (str2.equals(a.class.getCanonicalName())) {
                    vkm = new a();
                } else if (str2.equals(b.class.getCanonicalName())) {
                    vkm = new b();
                } else {
                    vkm = new c();
                }
                obj = vkk.a(vkm);
            } else {
                obj = str.equals(c.class.getCanonicalName()) ? new c() : null;
            }
            vkl vkl = new vkl(readInt, readInt2, readInt3, (vkk) fay.a(obj), parcel.readInt() == 1);
            return vkl;
        }
    };
    /* access modifiers changed from: private */
    public static final vmx g = new vmx();

    public final int describeContents() {
        return 0;
    }

    vkl(int i, int i2, int i3, vkk vkk, boolean z) {
        super(i, i2, i3, vkk, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        vmx.a(this.d, parcel);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
