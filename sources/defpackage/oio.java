package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.base.Optional;

/* renamed from: oio reason: default package */
final class oio extends oin {
    public static final Creator<oio> CREATOR = new Creator<oio>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new oio[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            oio.c;
            Optional c = Optional.c(parcel.readString());
            oio.d;
            return new oio(c, vnr.a(parcel));
        }
    };
    /* access modifiers changed from: private */
    public static final upz c = new upz();
    /* access modifiers changed from: private */
    public static final vnr d = new vnr();

    public final int describeContents() {
        return 0;
    }

    oio(Optional<String> optional, Optional<vns> optional2) {
        super(optional, optional2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString((String) this.a.d());
        vnr.a(this.b, parcel);
    }
}
