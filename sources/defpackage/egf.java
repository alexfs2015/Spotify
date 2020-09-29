package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: egf reason: default package */
public final class egf extends bxw {
    public static final Creator<egf> CREATOR = new egg();
    private final Credential a;

    public egf(Credential credential) {
        this.a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 1, (Parcelable) this.a, i, false);
        bxx.b(parcel, a2);
    }
}
