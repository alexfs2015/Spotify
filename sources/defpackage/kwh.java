package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;
import java.net.HttpCookie;
import java.util.Arrays;

/* renamed from: kwh reason: default package */
public final class kwh implements Parcelable {
    public static final Creator<kwh> CREATOR = new Creator<kwh>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kwh(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kwh[i];
        }
    };
    public final String a;
    public final ResponseType b;
    public final String c;
    public final ClientIdentity d;
    public final String[] e;
    public final HttpCookie f;

    protected kwh(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (ResponseType) juo.a(parcel, ResponseType.class);
        this.c = parcel.readString();
        this.d = (ClientIdentity) juo.b(parcel, ClientIdentity.CREATOR);
        this.e = parcel.createStringArray();
        this.f = new HttpCookie(parcel.readString(), parcel.readString());
        this.f.setDomain(parcel.readString());
        this.f.setMaxAge(parcel.readLong());
        this.f.setSecure(juo.a(parcel));
    }

    public kwh(String str, ResponseType responseType, String str2, ClientIdentity clientIdentity, HttpCookie httpCookie, String[] strArr) {
        this.a = str;
        this.b = responseType;
        this.c = str2;
        this.d = clientIdentity;
        this.f = httpCookie;
        this.e = strArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwh)) {
            return false;
        }
        kwh kwh = (kwh) obj;
        return fbn.a(this.a, kwh.a) && fbn.a(this.b, kwh.b) && fbn.a(this.c, kwh.c) && fbn.a(this.d, kwh.d) && Arrays.equals(this.e, kwh.e) && fbn.a(this.f, kwh.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(Arrays.hashCode(this.e)), this.f});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        juo.a(parcel, this.b);
        parcel.writeString(this.c);
        juo.a(parcel, (Parcelable) this.d, i);
        parcel.writeStringArray(this.e);
        parcel.writeString(this.f.getName());
        parcel.writeString(this.f.getValue());
        parcel.writeString(this.f.getDomain());
        parcel.writeLong(this.f.getMaxAge());
        juo.a(parcel, this.f.getSecure());
    }
}
