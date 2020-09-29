package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.ArrayList;
import java.util.List;

/* renamed from: iwk reason: default package */
final class iwk extends iwj {
    public static final Creator<iwk> CREATOR = new Creator<iwk>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            PlayerTrack playerTrack = (PlayerTrack) parcel2.readParcelable(iws.class.getClassLoader());
            ArrayList readArrayList = parcel2.readArrayList(iws.class.getClassLoader());
            ArrayList readArrayList2 = parcel2.readArrayList(iws.class.getClassLoader());
            PlayerRestrictions playerRestrictions = (PlayerRestrictions) parcel2.readParcelable(iws.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            iwk iwk = new iwk(playerTrack, readArrayList, readArrayList2, playerRestrictions, readString, readString2, z2, z, parcel.readLong(), parcel.readLong(), parcel.readFloat());
            return iwk;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new iwk[i];
        }
    };

    iwk(PlayerTrack playerTrack, List<PlayerTrack> list, List<PlayerTrack> list2, PlayerRestrictions playerRestrictions, String str, String str2, boolean z, boolean z2, long j, long j2, float f) {
        super(playerTrack, list, list2, playerRestrictions, str, str2, z, z2, j, j2, f);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeList(this.b);
        parcel.writeList(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeLong(this.i);
        parcel.writeLong(this.j);
        parcel.writeFloat(this.k);
    }
}
