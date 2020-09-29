package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import java.util.List;

/* renamed from: ugg reason: default package */
final class ugg extends ugf {
    public static final Creator<ugg> CREATOR = new Creator<ugg>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ugg[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ugg(ugg.b.a(parcel));
        }
    };
    /* access modifiers changed from: private */
    public static final a b = new a();

    public final int describeContents() {
        return 0;
    }

    ugg(List<RadioStationModel> list) {
        super(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
    }
}
