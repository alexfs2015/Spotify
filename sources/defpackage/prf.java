package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.profile.model.ProfileListItem.Type;

/* renamed from: prf reason: default package */
public final class prf extends prd {
    public static final Creator<prf> CREATOR = new Creator<prf>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            prf prf = new prf((Type) Enum.valueOf(Type.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null);
            return prf;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new prf[i];
        }
    };

    prf(Type type, String str, String str2, String str3, String str4) {
        super(type, str, str2, str3, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        if (this.e == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(this.e);
    }
}
