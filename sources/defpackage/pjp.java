package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.profile.domain.ProfileModel.LoadingState;

/* renamed from: pjp reason: default package */
final class pjp extends pjo {
    public static final Creator<pjp> CREATOR = new Creator<pjp>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new pjp[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            pjp pjp = new pjp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 1, (LoadingState) Enum.valueOf(LoadingState.class, parcel.readString()));
            return pjp;
        }
    };

    public final int describeContents() {
        return 0;
    }

    pjp(String str, String str2, String str3, String str4, boolean z, boolean z2, int i, int i2, int i3, boolean z3, LoadingState loadingState) {
        super(str, str2, str3, str4, z, z2, i, i2, i3, z3, loadingState);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        if (this.d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.d);
        }
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeString(this.k.name());
    }
}
