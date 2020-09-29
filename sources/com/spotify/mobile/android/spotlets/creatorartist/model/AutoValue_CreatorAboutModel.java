package com.spotify.mobile.android.spotlets.creatorartist.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class AutoValue_CreatorAboutModel extends C$AutoValue_CreatorAboutModel {
    public static final Creator<AutoValue_CreatorAboutModel> CREATOR = new Creator<AutoValue_CreatorAboutModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_CreatorAboutModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AutoValue_CreatorAboutModel autoValue_CreatorAboutModel = new AutoValue_CreatorAboutModel(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Autobiography) parcel.readParcelable(CreatorAboutModel.class.getClassLoader()), parcel.createTypedArrayList(AutoValue_CreatorAboutModel.IMAGES_ADAPTER));
            return autoValue_CreatorAboutModel;
        }
    };
    /* access modifiers changed from: private */
    public static final a IMAGES_ADAPTER = new a();

    public final int describeContents() {
        return 0;
    }

    AutoValue_CreatorAboutModel(int i, int i2, String str, String str2, String str3, Autobiography autobiography, List<ImageModel> list) {
        super(i, i2, str, str2, str3, autobiography, list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(monthlyListeners());
        parcel.writeInt(globalChartPosition());
        if (biography() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(biography());
        }
        if (name() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(name());
        }
        if (mainImageUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mainImageUrl());
        }
        parcel.writeParcelable(autobiography(), i);
        a.a(images(), parcel);
    }
}
