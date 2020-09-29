package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;

public abstract class ShareMedia implements api {
    final Bundle a;

    public enum Type {
        PHOTO,
        VIDEO
    }

    public static abstract class a<M extends ShareMedia, B extends a> {
        Bundle a = new Bundle();

        public B a(M m) {
            if (m == null) {
                return this;
            }
            this.a.putAll(new Bundle(m.a));
            return this;
        }
    }

    protected ShareMedia(Parcel parcel) {
        this.a = parcel.readBundle();
    }

    protected ShareMedia(a aVar) {
        this.a = new Bundle(aVar.a);
    }

    public abstract Type a();

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
