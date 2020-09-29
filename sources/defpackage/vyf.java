package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vyf reason: default package */
final class vyf extends vyd {
    public static final Creator<vyf> CREATOR = new Creator<vyf>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            vyf.e;
            String str = (String) fbp.a(parcel.readString());
            vyg vyg = (vyg) fbp.a(vyg.g().createFromParcel(parcel));
            vyh vyh = str.equals(a.class.getCanonicalName()) ? vyh.a(vyg) : str.equals(b.class.getCanonicalName()) ? vyh.b(vyg) : null;
            vyh vyh2 = (vyh) fbp.a(vyh);
            vys vys = (vys) parcel.readParcelable(vyl.class.getClassLoader());
            vzy vzy = (vzy) parcel.readParcelable(vyl.class.getClassLoader());
            vxp vxp = (vxp) parcel.readParcelable(vyl.class.getClassLoader());
            vzg vzg = (vzg) parcel.readParcelable(vyl.class.getClassLoader());
            vzo vzo = (vzo) parcel.readParcelable(vyl.class.getClassLoader());
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            vyf vyf = new vyf(vyh2, vys, vzy, vxp, vzg, vzo, z, parcel.readInt());
            return vyf;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vyf[i];
        }
    };
    /* access modifiers changed from: private */
    public static final wai e = new wai();

    vyf(vyh vyh, vys vys, vzy vzy, vxp vxp, vzg vzg, vzo vzo, boolean z, int i) {
        super(vyh, vys, vzy, vxp, vzg, vzo, z, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        wai.a(this.a, parcel);
        parcel.writeParcelable(b(), i);
        parcel.writeParcelable(c(), i);
        parcel.writeParcelable(d(), i);
        parcel.writeParcelable(e(), i);
        parcel.writeParcelable(f(), i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
    }
}
