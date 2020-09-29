package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient.c;

/* renamed from: ans reason: default package */
public final class ans extends aob {
    public static final Creator<ans> CREATOR = new Creator<ans>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ans(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ans[i];
        }
    };

    ans(Parcel parcel) {
        super(parcel);
    }

    public ans(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return "fb_lite_login";
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(c cVar) {
        String e = LoginClient.e();
        Intent a = anf.a(this.b.b.p(), cVar.d, cVar.b, e, cVar.f, cVar.a(), cVar.c, a(cVar.e), cVar.h);
        a("e2e", e);
        return a(a, LoginClient.a());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
