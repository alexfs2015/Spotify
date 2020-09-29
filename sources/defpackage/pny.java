package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.quicksilver.messages.models.BannerMessage;

/* renamed from: pny reason: default package */
final class pny extends pnw {
    public static final Creator<pny> CREATOR = new Creator<pny>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new pny[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            BannerMessage bannerMessage = (BannerMessage) parcel.readParcelable(pod.class.getClassLoader());
            prk prk = (prk) parcel.readParcelable(pod.class.getClassLoader());
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            pny pny = new pny(bannerMessage, prk, z, parcel.readLong());
            return pny;
        }
    };

    public final int describeContents() {
        return 0;
    }

    pny(BannerMessage bannerMessage, prk prk, boolean z, long j) {
        super(bannerMessage, prk, z, j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.d);
    }
}
