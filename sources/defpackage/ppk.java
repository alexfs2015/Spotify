package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ppk reason: default package */
final class ppk extends ppj {
    public static final Creator<ppk> CREATOR = new Creator<ppk>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ppk[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            NoteMessage noteMessage = (NoteMessage) parcel.readParcelable(ppo.class.getClassLoader());
            ArrayList readArrayList = parcel.readArrayList(ppo.class.getClassLoader());
            int readInt = parcel.readInt();
            prk prk = (prk) parcel.readParcelable(ppo.class.getClassLoader());
            long readLong = parcel.readLong();
            boolean z = true;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() != 1) {
                z = false;
            }
            ppk ppk = new ppk(noteMessage, readArrayList, readInt, prk, readLong, z2, z);
            return ppk;
        }
    };

    public final int describeContents() {
        return 0;
    }

    ppk(NoteMessage noteMessage, List<psk> list, int i, prk prk, long j, boolean z, boolean z2) {
        super(noteMessage, list, i, prk, j, z, z2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeList(this.b);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
