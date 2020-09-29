package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: rbp reason: default package */
final class rbp extends rbn {
    public static final Creator<rbp> CREATOR = new Creator<rbp>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new rbp[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            rbp rbp = new rbp(parcel.readString(), parcel.readString(), parcel.readString(), (SpotifyIconV2) Enum.valueOf(SpotifyIconV2.class, parcel.readString()), (SpotifyIconV2) Enum.valueOf(SpotifyIconV2.class, parcel.readString()), parcel.readInt() == 1);
            return rbp;
        }
    };

    public final int describeContents() {
        return 0;
    }

    rbp(String str, String str2, String str3, SpotifyIconV2 spotifyIconV2, SpotifyIconV2 spotifyIconV22, boolean z) {
        super(str, str2, str3, spotifyIconV2, spotifyIconV22, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(a());
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d.name());
        parcel.writeInt(this.e ? 1 : 0);
    }
}
