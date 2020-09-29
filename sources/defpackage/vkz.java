package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vkz reason: default package */
final class vkz extends vkx {
    public static final Creator<vkz> CREATOR = new Creator<vkz>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vkz[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            vkz.e;
            String str = (String) fay.a(parcel.readString());
            vla vla = (vla) fay.a(vla.g().createFromParcel(parcel));
            vlb vlb = str.equals(a.class.getCanonicalName()) ? vlb.a(vla) : str.equals(b.class.getCanonicalName()) ? vlb.b(vla) : null;
            vlb vlb2 = (vlb) fay.a(vlb);
            vlm vlm = (vlm) parcel.readParcelable(vlf.class.getClassLoader());
            vms vms = (vms) parcel.readParcelable(vlf.class.getClassLoader());
            vkj vkj = (vkj) parcel.readParcelable(vlf.class.getClassLoader());
            vma vma = (vma) parcel.readParcelable(vlf.class.getClassLoader());
            vmi vmi = (vmi) parcel.readParcelable(vlf.class.getClassLoader());
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            vkz vkz = new vkz(vlb2, vlm, vms, vkj, vma, vmi, z, parcel.readInt());
            return vkz;
        }
    };
    /* access modifiers changed from: private */
    public static final vnc e = new vnc();

    public final int describeContents() {
        return 0;
    }

    vkz(vlb vlb, vlm vlm, vms vms, vkj vkj, vma vma, vmi vmi, boolean z, int i) {
        super(vlb, vlm, vms, vkj, vma, vmi, z, i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        vnc.a(this.a, parcel);
        parcel.writeParcelable(b(), i);
        parcel.writeParcelable(c(), i);
        parcel.writeParcelable(d(), i);
        parcel.writeParcelable(e(), i);
        parcel.writeParcelable(f(), i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
    }
}
