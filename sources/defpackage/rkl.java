package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: rkl reason: default package */
final class rkl extends rkj {
    public static final Creator<rkl> CREATOR = new Creator<rkl>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            rkl rkl = new rkl(parcel.readString(), parcel.readString(), parcel.readString(), (SpotifyIconV2) Enum.valueOf(SpotifyIconV2.class, parcel.readString()), (SpotifyIconV2) Enum.valueOf(SpotifyIconV2.class, parcel.readString()), parcel.readInt() == 1);
            return rkl;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new rkl[i];
        }
    };

    rkl(String str, String str2, String str3, SpotifyIconV2 spotifyIconV2, SpotifyIconV2 spotifyIconV22, boolean z) {
        super(str, str2, str3, spotifyIconV2, spotifyIconV22, z);
    }

    public final int describeContents() {
        return 0;
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
