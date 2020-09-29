package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pyg reason: default package */
final class pyg extends pyf {
    public static final Creator<pyg> CREATOR = new Creator<pyg>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            NoteMessage noteMessage = (NoteMessage) parcel.readParcelable(pyk.class.getClassLoader());
            ArrayList readArrayList = parcel.readArrayList(pyk.class.getClassLoader());
            int readInt = parcel.readInt();
            qag qag = (qag) parcel.readParcelable(pyk.class.getClassLoader());
            long readLong = parcel.readLong();
            boolean z = true;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() != 1) {
                z = false;
            }
            pyg pyg = new pyg(noteMessage, readArrayList, readInt, qag, readLong, z2, z);
            return pyg;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new pyg[i];
        }
    };

    pyg(NoteMessage noteMessage, List<qbg> list, int i, qag qag, long j, boolean z, boolean z2) {
        super(noteMessage, list, i, qag, j, z, z2);
    }

    public final int describeContents() {
        return 0;
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
