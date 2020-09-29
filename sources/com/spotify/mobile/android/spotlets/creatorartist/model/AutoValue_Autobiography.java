package com.spotify.mobile.android.spotlets.creatorartist.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_Autobiography extends C$AutoValue_Autobiography {
    public static final Creator<AutoValue_Autobiography> CREATOR = new Creator<AutoValue_Autobiography>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Autobiography[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            AutoValue_Autobiography.STRING_LIST_TYPE_ADAPTER;
            return new AutoValue_Autobiography(readString, uqa.a(parcel), (LinksModel) parcel.readParcelable(Autobiography.class.getClassLoader()));
        }
    };
    /* access modifiers changed from: private */
    public static final uqa STRING_LIST_TYPE_ADAPTER = new uqa();

    public final int describeContents() {
        return 0;
    }

    AutoValue_Autobiography(String str, List<String> list, LinksModel linksModel) {
        super(str, list, linksModel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (body() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(body());
        }
        parcel.writeStringList(urls());
        parcel.writeParcelable(links(), i);
    }
}
