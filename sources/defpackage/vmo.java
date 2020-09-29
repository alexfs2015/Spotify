package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vmo reason: default package */
final class vmo extends vmn {
    public static final Creator<vmo> CREATOR = new Creator<vmo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vmo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            vmo.d;
            String str = (String) fay.a(parcel.readString());
            String str2 = (String) fay.a(parcel.readString());
            Object obj = str.equals(b.class.getCanonicalName()) ? new b() : str.equals(d.class.getCanonicalName()) ? vmt.a(str2) : str.equals(f.class.getCanonicalName()) ? vmt.b(str2) : str.equals(e.class.getCanonicalName()) ? vmt.c(str2) : str.equals(g.class.getCanonicalName()) ? vmt.d(str2) : str.equals(i.class.getCanonicalName()) ? vmt.e(str2) : str.equals(h.class.getCanonicalName()) ? vmt.f(str2) : str.equals(a.class.getCanonicalName()) ? vmt.g(str2) : str.equals(c.class.getCanonicalName()) ? vmt.a(str2, parcel.readString()) : null;
            vmt vmt = (vmt) fay.a(obj);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new vmo(vmt, z);
        }
    };
    /* access modifiers changed from: private */
    public static final vnb d = new vnb();

    public final int describeContents() {
        return 0;
    }

    vmo(vmt vmt, boolean z) {
        super(vmt, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        vnb.a(this.a, parcel);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
