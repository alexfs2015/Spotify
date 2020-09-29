package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vli reason: default package */
final class vli extends vlh {
    public static final Creator<vli> CREATOR = new Creator<vli>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vli[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            vli.e;
            String str = (String) fay.a(parcel.readString());
            String str2 = (String) fay.a(parcel.readString());
            Object obj = str.equals(a.class.getCanonicalName()) ? new a() : str.equals(b.class.getCanonicalName()) ? vln.a(str2, parcel.readInt()) : str.equals(c.class.getCanonicalName()) ? vln.a(str2) : str.equals(e.class.getCanonicalName()) ? vln.b(str2) : str.equals(d.class.getCanonicalName()) ? vln.c(str2) : null;
            vln vln = (vln) fay.a(obj);
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            return new vli(vln, z2, z);
        }
    };
    /* access modifiers changed from: private */
    public static final vmy e = new vmy();

    public final int describeContents() {
        return 0;
    }

    vli(vln vln, boolean z, boolean z2) {
        super(vln, z, z2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        vmy.a(this.a, parcel);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
