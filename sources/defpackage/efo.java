package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: efo reason: default package */
public final class efo extends bxf {
    public static final Creator<efo> CREATOR = new efp();
    private final Credential a;

    public efo(Credential credential) {
        this.a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 1, (Parcelable) this.a, i, false);
        bxg.b(parcel, a2);
    }
}
