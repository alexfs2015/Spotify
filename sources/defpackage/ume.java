package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.slate.model.BackgroundColor;

/* renamed from: ume reason: default package */
final class ume extends umb {
    public static final Creator<ume> CREATOR = new Creator<ume>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            ume ume = new ume((ulz) parcel.readParcelable(umj.class.getClassLoader()), (ulz) parcel.readParcelable(umj.class.getClassLoader()), (ulw) parcel.readParcelable(umj.class.getClassLoader()), (ulz) parcel.readParcelable(umj.class.getClassLoader()), (BackgroundColor) parcel.readParcelable(umj.class.getClassLoader()), (b) parcel.readParcelable(umj.class.getClassLoader()));
            return ume;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ume[i];
        }
    };

    ume(ulz ulz, ulz ulz2, ulw ulw, ulz ulz3, BackgroundColor backgroundColor, b bVar) {
        super(ulz, ulz2, ulw, ulz3, backgroundColor, bVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
    }
}
