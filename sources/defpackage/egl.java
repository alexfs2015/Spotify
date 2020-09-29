package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: egl reason: default package */
public final class egl extends bxw {
    public static final Creator<egl> CREATOR = new egm();
    private final Credential a;

    public egl(Credential credential) {
        this.a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 1, (Parcelable) this.a, i, false);
        bxx.b(parcel, a2);
    }
}
