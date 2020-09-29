package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.quicksilver.messages.models.BannerMessage;

/* renamed from: pwu reason: default package */
final class pwu extends pws {
    public static final Creator<pwu> CREATOR = new Creator<pwu>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            BannerMessage bannerMessage = (BannerMessage) parcel.readParcelable(pwz.class.getClassLoader());
            qag qag = (qag) parcel.readParcelable(pwz.class.getClassLoader());
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            pwu pwu = new pwu(bannerMessage, qag, z, parcel.readLong());
            return pwu;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new pwu[i];
        }
    };

    pwu(BannerMessage bannerMessage, qag qag, boolean z, long j) {
        super(bannerMessage, qag, z, j);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.d);
    }
}
