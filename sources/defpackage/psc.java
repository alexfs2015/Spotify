package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.profile.model.LoadingState;

/* renamed from: psc reason: default package */
final class psc extends psb {
    public static final Creator<psc> CREATOR = new Creator<psc>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            psc psc = new psc(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readString(), parcel.readInt() == 1, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 1, parcel.readInt() == 1, (LoadingState) Enum.valueOf(LoadingState.class, parcel.readString()), (prg) parcel2.readParcelable(psg.class.getClassLoader()), (prg) parcel2.readParcelable(psg.class.getClassLoader()));
            return psc;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new psc[i];
        }
    };

    psc(String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, int i, int i2, int i3, boolean z4, boolean z5, LoadingState loadingState, prg prg, prg prg2) {
        super(str, str2, str3, z, z2, str4, z3, i, i2, i3, z4, z5, loadingState, prg, prg2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        if (this.c == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.c);
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeString(this.m.name());
        parcel.writeParcelable(this.n, i);
        parcel.writeParcelable(this.o, i);
    }
}
