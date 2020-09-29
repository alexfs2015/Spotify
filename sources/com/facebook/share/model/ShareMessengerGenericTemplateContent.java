package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerGenericTemplateContent extends apb<ShareMessengerGenericTemplateContent, Object> {
    public static final Creator<ShareMessengerGenericTemplateContent> CREATOR = new Creator<ShareMessengerGenericTemplateContent>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareMessengerGenericTemplateContent[i];
        }
    };
    public final boolean a;
    public final ImageAspectRatio b;
    public final apg c;

    public enum ImageAspectRatio {
        HORIZONTAL,
        SQUARE
    }

    ShareMessengerGenericTemplateContent(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() != 0;
        this.b = (ImageAspectRatio) parcel.readSerializable();
        this.c = (apg) parcel.readParcelable(apg.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : 0);
        parcel.writeSerializable(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
