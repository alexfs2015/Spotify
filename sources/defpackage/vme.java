package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vme reason: default package */
final class vme extends vmd {
    public static final Creator<vme> CREATOR = new Creator<vme>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vme[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            vme.e;
            String str = (String) fay.a(parcel.readString());
            Object obj = str.equals(b.class.getCanonicalName()) ? vmj.a((String) fay.a(parcel.readString())) : str.equals(a.class.getCanonicalName()) ? new a() : null;
            vmj vmj = (vmj) fay.a(obj);
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            return new vme(vmj, z2, z);
        }
    };
    /* access modifiers changed from: private */
    public static final vna e = new vna();

    public final int describeContents() {
        return 0;
    }

    vme(vmj vmj, boolean z, boolean z2) {
        super(vmj, z, z2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        vna.a(this.a, parcel);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
