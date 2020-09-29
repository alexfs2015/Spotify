package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vzu reason: default package */
final class vzu extends vzt {
    public static final Creator<vzu> CREATOR = new Creator<vzu>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            vzu.d;
            String str = (String) fbp.a(parcel.readString());
            String str2 = (String) fbp.a(parcel.readString());
            Object obj = str.equals(b.class.getCanonicalName()) ? new b() : str.equals(d.class.getCanonicalName()) ? vzz.a(str2) : str.equals(f.class.getCanonicalName()) ? vzz.b(str2) : str.equals(e.class.getCanonicalName()) ? vzz.c(str2) : str.equals(g.class.getCanonicalName()) ? vzz.d(str2) : str.equals(i.class.getCanonicalName()) ? vzz.e(str2) : str.equals(h.class.getCanonicalName()) ? vzz.f(str2) : str.equals(a.class.getCanonicalName()) ? vzz.g(str2) : str.equals(c.class.getCanonicalName()) ? vzz.a(str2, parcel.readString()) : null;
            vzz vzz = (vzz) fbp.a(obj);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new vzu(vzz, z);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vzu[i];
        }
    };
    /* access modifiers changed from: private */
    public static final wah d = new wah();

    vzu(vzz vzz, boolean z) {
        super(vzz, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        wah.a(this.a, parcel);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
