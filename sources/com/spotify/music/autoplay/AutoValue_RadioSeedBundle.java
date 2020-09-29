package com.spotify.music.autoplay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;

final class AutoValue_RadioSeedBundle extends C$AutoValue_RadioSeedBundle {
    public static final Creator<AutoValue_RadioSeedBundle> CREATOR = new Creator<AutoValue_RadioSeedBundle>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_RadioSeedBundle[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_RadioSeedBundle(parcel.readString(), parcel.readString(), (PlayOrigin) parcel.readParcelable(RadioSeedBundle.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_RadioSeedBundle(String str, String str2, PlayOrigin playOrigin) {
        super(str, str2, playOrigin);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getRadioSeed());
        parcel.writeString(getPlaybackId());
        parcel.writeParcelable(getPlayOrigin(), i);
    }
}
