package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient.c;

/* renamed from: anh reason: default package */
public final class anh extends ann {
    public static final Creator<anh> CREATOR = new Creator<anh>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new anh[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new anh(parcel);
        }
    };

    /* access modifiers changed from: 0000 */
    public final String a() {
        return "katana_proxy_auth";
    }

    public final int describeContents() {
        return 0;
    }

    public anh(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(c cVar) {
        String e = LoginClient.e();
        Intent b = amr.b(this.b.b.p(), cVar.d, cVar.b, e, cVar.f, cVar.a(), cVar.c, a(cVar.e), cVar.h);
        a("e2e", e);
        return a(b, LoginClient.a());
    }

    anh(Parcel parcel) {
        super(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
