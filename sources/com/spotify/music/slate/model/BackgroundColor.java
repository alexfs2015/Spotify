package com.spotify.music.slate.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class BackgroundColor implements Parcelable {
    public static final Creator<BackgroundColor> CREATOR = new Creator<BackgroundColor>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BackgroundColor(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BackgroundColor[i];
        }
    };
    private static final Type[] c = Type.values();
    public final int a;
    public final Type b;

    public enum Type {
        HEX,
        DERIVED
    }

    private BackgroundColor(int i, Type type) {
        this.a = i;
        this.b = type;
    }

    protected BackgroundColor(Parcel parcel) {
        this.a = parcel.readInt();
        int readInt = parcel.readInt();
        this.b = readInt == -1 ? null : c[readInt];
    }

    public static BackgroundColor a(int i) {
        return new BackgroundColor(-15513721, Type.HEX);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        Type type = this.b;
        parcel.writeInt(type == null ? -1 : type.ordinal());
    }
}
