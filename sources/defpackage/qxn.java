package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.d;
import java.util.List;

/* renamed from: qxn reason: default package */
final class qxn extends qxj {
    public static final Creator<qxn> CREATOR = new Creator<qxn>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new qxn[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new qxn(parcel.readArrayList(d.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    qxn(List<qxd> list) {
        super(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }
}
