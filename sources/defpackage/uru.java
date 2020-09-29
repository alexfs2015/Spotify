package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import java.util.List;

/* renamed from: uru reason: default package */
final class uru extends urt {
    public static final Creator<uru> CREATOR = new Creator<uru>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new uru(uru.b.a(parcel));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new uru[i];
        }
    };
    /* access modifiers changed from: private */
    public static final a b = new a();

    uru(List<RadioStationModel> list) {
        super(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
    }
}
