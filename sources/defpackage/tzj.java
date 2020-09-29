package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.slate.model.BackgroundColor;

/* renamed from: tzj reason: default package */
final class tzj extends tzg {
    public static final Creator<tzj> CREATOR = new Creator<tzj>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new tzj[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            tzj tzj = new tzj((tze) parcel.readParcelable(tzo.class.getClassLoader()), (tze) parcel.readParcelable(tzo.class.getClassLoader()), (tzb) parcel.readParcelable(tzo.class.getClassLoader()), (tze) parcel.readParcelable(tzo.class.getClassLoader()), (BackgroundColor) parcel.readParcelable(tzo.class.getClassLoader()), (b) parcel.readParcelable(tzo.class.getClassLoader()));
            return tzj;
        }
    };

    public final int describeContents() {
        return 0;
    }

    tzj(tze tze, tze tze2, tzb tzb, tze tze3, BackgroundColor backgroundColor, b bVar) {
        super(tze, tze2, tzb, tze3, backgroundColor, bVar);
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
