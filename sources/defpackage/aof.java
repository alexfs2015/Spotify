package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient.c;

/* renamed from: aof reason: default package */
public final class aof extends aoe {
    public static final Creator<aof> CREATOR = new Creator<aof>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aof(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aof[i];
        }
    };
    private anm c;
    private String d;

    /* renamed from: aof$a */
    static class a extends defpackage.anm.a {
        String e;
        String f;
        String g = "fbconnect://success";

        public a(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        public final anm a() {
            Bundle bundle = this.d;
            bundle.putString("redirect_uri", this.g);
            bundle.putString("client_id", this.b);
            bundle.putString("e2e", this.e);
            bundle.putString("response_type", "token,signed_request");
            bundle.putString("return_scopes", "true");
            bundle.putString("auth_type", this.f);
            return anm.a(this.a, "oauth", bundle, 0, this.c);
        }
    }

    aof(Parcel parcel) {
        super(parcel);
        this.d = parcel.readString();
    }

    public aof(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return "web_view";
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(final c cVar) {
        Bundle b = b(cVar);
        AnonymousClass1 r1 = new c() {
            public final void a(Bundle bundle, FacebookException facebookException) {
                aof.this.b(cVar, bundle, facebookException);
            }
        };
        this.d = LoginClient.e();
        a("e2e", this.d);
        kf p = this.b.b.p();
        boolean f = ank.f((Context) p);
        a aVar = new a(p, cVar.d, b);
        aVar.e = this.d;
        aVar.g = f ? "fbconnect://chrome_os_success" : "fbconnect://success";
        aVar.f = cVar.h;
        aVar.c = r1;
        this.c = aVar.a();
        amp amp = new amp();
        amp.c_(true);
        amp.T = this.c;
        amp.a(p.i(), "FacebookDialogFragment");
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        anm anm = this.c;
        if (anm != null) {
            anm.cancel();
            this.c = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(c cVar, Bundle bundle, FacebookException facebookException) {
        super.a(cVar, bundle, facebookException);
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final AccessTokenSource h_() {
        return AccessTokenSource.WEB_VIEW;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.d);
    }
}
