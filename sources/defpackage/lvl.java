package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: lvl reason: default package */
final class lvl extends lvg<lvl> {
    public static final Creator<lvl> CREATOR = new Creator<lvl>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new lvl(parcel, 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new lvl[i];
        }
    };
    final lur c;

    private lvl(Parcel parcel) {
        super(parcel);
        this.c = (lur) fbp.a(juo.b(parcel, lur.c));
    }

    /* synthetic */ lvl(Parcel parcel, byte b) {
        this(parcel);
    }

    lvl(lur lur) {
        super(lur.b());
        this.c = lur;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        juo.a(parcel, (Parcelable) this.c, i);
    }
}
