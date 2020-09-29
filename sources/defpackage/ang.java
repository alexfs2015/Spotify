package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient.Result;
import com.facebook.login.LoginClient.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ang reason: default package */
public final class ang extends anl {
    public static final Creator<ang> CREATOR = new Creator() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ang[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ang(parcel);
        }
    };
    private anf c;

    /* access modifiers changed from: 0000 */
    public final String a() {
        return "get_token";
    }

    public final int describeContents() {
        return 0;
    }

    public ang(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        anf anf = this.c;
        if (anf != null) {
            anf.c = false;
            anf.b = null;
            this.c = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(final c cVar) {
        this.c = new anf(this.b.b.p(), cVar.d);
        if (!this.c.a()) {
            return false;
        }
        this.b.d();
        this.c.b = new a() {
            public final void a(Bundle bundle) {
                ang.this.a(cVar, bundle);
            }
        };
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void a(final c cVar, final Bundle bundle) {
        anf anf = this.c;
        if (anf != null) {
            anf.b = null;
        }
        this.c = null;
        LoginClient loginClient = this.b;
        if (loginClient.d != null) {
            loginClient.d.b();
        }
        if (bundle != null) {
            ArrayList stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> set = cVar.b;
            if (stringArrayList == null || (set != null && !stringArrayList.containsAll(set))) {
                HashSet hashSet = new HashSet();
                for (String str : set) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    a("new_permissions", TextUtils.join(",", hashSet));
                }
                amx.a((Object) hashSet, "permissions");
                cVar.b = hashSet;
            } else {
                String string = bundle.getString("com.facebook.platform.extra.USER_ID");
                if (string == null || string.isEmpty()) {
                    this.b.d();
                    amw.a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), (a) new a() {
                        public final void a(JSONObject jSONObject) {
                            try {
                                bundle.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                                ang.this.b(cVar, bundle);
                            } catch (JSONException e) {
                                ang.this.b.b(Result.a(ang.this.b.e, "Caught exception", e.getMessage()));
                            }
                        }

                        public final void a(FacebookException facebookException) {
                            ang.this.b.b(Result.a(ang.this.b.e, "Caught exception", facebookException.getMessage()));
                        }
                    });
                    return;
                }
                b(cVar, bundle);
                return;
            }
        }
        this.b.c();
    }

    /* access modifiers changed from: 0000 */
    public final void b(c cVar, Bundle bundle) {
        this.b.a(Result.a(this.b.e, a(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, cVar.d)));
    }

    ang(Parcel parcel) {
        super(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
