package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient.c;

/* renamed from: anv reason: default package */
public final class anv extends aob {
    public static final Creator<anv> CREATOR = new Creator<anv>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new anv(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new anv[i];
        }
    };

    anv(Parcel parcel) {
        super(parcel);
    }

    public anv(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return "katana_proxy_auth";
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(c cVar) {
        String e = LoginClient.e();
        Intent b = anf.b(this.b.b.p(), cVar.d, cVar.b, e, cVar.f, cVar.a(), cVar.c, a(cVar.e), cVar.h);
        a("e2e", e);
        return a(b, LoginClient.a());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
