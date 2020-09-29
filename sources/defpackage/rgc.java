package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.d;
import java.util.List;

/* renamed from: rgc reason: default package */
final class rgc extends rfy {
    public static final Creator<rgc> CREATOR = new Creator<rgc>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new rgc(parcel.readArrayList(d.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new rgc[i];
        }
    };

    rgc(List<rfs> list) {
        super(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }
}
