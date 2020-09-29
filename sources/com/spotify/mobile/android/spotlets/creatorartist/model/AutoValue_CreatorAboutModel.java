package com.spotify.mobile.android.spotlets.creatorartist.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

final class AutoValue_CreatorAboutModel extends C$AutoValue_CreatorAboutModel {
    public static final Creator<AutoValue_CreatorAboutModel> CREATOR = new Creator<AutoValue_CreatorAboutModel>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String str;
            String str2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                String readString2 = parcel.readString();
                String str3 = readString2;
                str = readString2;
            } else {
                str = null;
            }
            if (parcel.readInt() == 0) {
                String readString3 = parcel.readString();
                String str4 = readString3;
                str2 = readString3;
            } else {
                str2 = null;
            }
            Parcelable readParcelable = parcel.readParcelable(CreatorAboutModel.class.getClassLoader());
            Parcelable parcelable = readParcelable;
            Autobiography autobiography = (Autobiography) readParcelable;
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AutoValue_CreatorAboutModel.IMAGES_ADAPTER);
            String str5 = readString;
            String str6 = readString;
            String str7 = str;
            String str8 = str2;
            String str9 = str2;
            Autobiography autobiography2 = autobiography;
            Autobiography autobiography3 = autobiography;
            ArrayList arrayList = createTypedArrayList;
            AutoValue_CreatorAboutModel autoValue_CreatorAboutModel = new AutoValue_CreatorAboutModel(readInt, readInt2, str6, str7, str9, autobiography3, createTypedArrayList);
            return autoValue_CreatorAboutModel;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_CreatorAboutModel[i];
        }
    };
    /* access modifiers changed from: private */
    public static final a IMAGES_ADAPTER = new a();

    AutoValue_CreatorAboutModel(int i, int i2, String str, String str2, String str3, Autobiography autobiography, List<ImageModel> list) {
        super(i, i2, str, str2, str3, autobiography, list);
    }

    public final int describeContents() {
        return 0;
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
