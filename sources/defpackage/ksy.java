package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;
import java.net.HttpCookie;
import java.util.Arrays;

/* renamed from: ksy reason: default package */
public final class ksy implements Parcelable {
    public static final Creator<ksy> CREATOR = new Creator<ksy>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ksy[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ksy(parcel);
        }
    };
    public final String a;
    public final ResponseType b;
    public final String c;
    public final ClientIdentity d;
    public final String[] e;
    public final HttpCookie f;

    public final int describeContents() {
        return 0;
    }

    public ksy(String str, ResponseType responseType, String str2, ClientIdentity clientIdentity, HttpCookie httpCookie, String[] strArr) {
        this.a = str;
        this.b = responseType;
        this.c = str2;
        this.d = clientIdentity;
        this.f = httpCookie;
        this.e = strArr;
    }

    protected ksy(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (ResponseType) jse.a(parcel, ResponseType.class);
        this.c = parcel.readString();
        this.d = (ClientIdentity) jse.b(parcel, ClientIdentity.CREATOR);
        this.e = parcel.createStringArray();
        this.f = new HttpCookie(parcel.readString(), parcel.readString());
        this.f.setDomain(parcel.readString());
        this.f.setMaxAge(parcel.readLong());
        this.f.setSecure(jse.a(parcel));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        jse.a(parcel, this.b);
        parcel.writeString(this.c);
        jse.a(parcel, (Parcelable) this.d, i);
        parcel.writeStringArray(this.e);
        parcel.writeString(this.f.getName());
        parcel.writeString(this.f.getValue());
        parcel.writeString(this.f.getDomain());
        parcel.writeLong(this.f.getMaxAge());
        jse.a(parcel, this.f.getSecure());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksy)) {
            return false;
        }
        ksy ksy = (ksy) obj;
        return faw.a(this.a, ksy.a) && faw.a(this.b, ksy.b) && faw.a(this.c, ksy.c) && faw.a(this.d, ksy.d) && Arrays.equals(this.e, ksy.e) && faw.a(this.f, ksy.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(Arrays.hashCode(this.e)), this.f});
    }
}
