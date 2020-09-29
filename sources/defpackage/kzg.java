package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kzg reason: default package */
final class kzg extends kzf {
    public static final Creator<kzg> CREATOR = new Creator<kzg>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            kzg kzg = new kzg(parcel.readInt(), (ulz) parcel2.readParcelable(kzl.class.getClassLoader()), (ulz) parcel2.readParcelable(kzl.class.getClassLoader()), (ulz) parcel2.readParcelable(kzl.class.getClassLoader()), (ulz) parcel2.readParcelable(kzl.class.getClassLoader()), (ulw) parcel2.readParcelable(kzl.class.getClassLoader()), parcel.readInt() == 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() == 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() == 0 ? Long.valueOf(parcel.readLong()) : null, (ulz) parcel2.readParcelable(kzl.class.getClassLoader()), (ulz) parcel2.readParcelable(kzl.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Intent) parcel2.readParcelable(kzl.class.getClassLoader()), (hct) parcel2.readParcelable(kzl.class.getClassLoader()));
            return kzg;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kzg[i];
        }
    };

    kzg(int i, ulz ulz, ulz ulz2, ulz ulz3, ulz ulz4, ulw ulw, Long l, Long l2, Long l3, ulz ulz5, ulz ulz6, int i2, int i3, int i4, Intent intent, hct hct) {
        super(i, ulz, ulz2, ulz3, ulz4, ulw, l, l2, l3, ulz5, ulz6, i2, i3, i4, intent, hct);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        if (this.g == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeLong(this.g.longValue());
        }
        if (this.h == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeLong(this.h.longValue());
        }
        if (this.i == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeLong(this.i.longValue());
        }
        parcel.writeParcelable(this.j, i);
        parcel.writeParcelable(this.k, i);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeParcelable(this.o, i);
        parcel.writeParcelable(this.p, i);
    }
}
