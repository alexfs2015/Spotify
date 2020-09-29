package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kvx reason: default package */
final class kvx extends kvw {
    public static final Creator<kvx> CREATOR = new Creator<kvx>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kvx[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            kvx kvx = new kvx(parcel.readInt(), (tze) parcel2.readParcelable(kwc.class.getClassLoader()), (tze) parcel2.readParcelable(kwc.class.getClassLoader()), (tze) parcel2.readParcelable(kwc.class.getClassLoader()), (tze) parcel2.readParcelable(kwc.class.getClassLoader()), (tzb) parcel2.readParcelable(kwc.class.getClassLoader()), parcel.readInt() == 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() == 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() == 0 ? Long.valueOf(parcel.readLong()) : null, (tze) parcel2.readParcelable(kwc.class.getClassLoader()), (tze) parcel2.readParcelable(kwc.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Intent) parcel2.readParcelable(kwc.class.getClassLoader()), (haa) parcel2.readParcelable(kwc.class.getClassLoader()));
            return kvx;
        }
    };

    public final int describeContents() {
        return 0;
    }

    kvx(int i, tze tze, tze tze2, tze tze3, tze tze4, tzb tzb, Long l, Long l2, Long l3, tze tze5, tze tze6, int i2, int i3, int i4, Intent intent, haa haa) {
        super(i, tze, tze2, tze3, tze4, tzb, l, l2, l3, tze5, tze6, i2, i3, i4, intent, haa);
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
