package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerURLActionButton extends aor {
    public static final Creator<ShareMessengerURLActionButton> CREATOR = new Creator<ShareMessengerURLActionButton>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }
    };
    public final Uri b;
    public final Uri c;
    public final boolean d;
    public final boolean e;
    public final WebviewHeightRatio f;

    public enum WebviewHeightRatio {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    public static final class a extends defpackage.aor.a<ShareMessengerURLActionButton, a> {
        public Uri b;
        public boolean c;
    }

    public /* synthetic */ ShareMessengerURLActionButton(a aVar, byte b2) {
        this(aVar);
    }

    private ShareMessengerURLActionButton(a aVar) {
        super((defpackage.aor.a) aVar);
        this.b = aVar.b;
        this.d = aVar.c;
        this.c = null;
        this.f = null;
        this.e = false;
    }

    ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        this.b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        boolean z = true;
        this.d = parcel.readByte() != 0;
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f = (WebviewHeightRatio) parcel.readSerializable();
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.e = z;
    }
}
