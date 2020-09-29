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

/* renamed from: anu reason: default package */
public final class anu extends anz {
    public static final Creator<anu> CREATOR = new Creator() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new anu(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new anu[i];
        }
    };
    private ant c;

    anu(Parcel parcel) {
        super(parcel);
    }

    public anu(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return "get_token";
    }

    /* access modifiers changed from: 0000 */
    public final void a(final c cVar, final Bundle bundle) {
        ant ant = this.c;
        if (ant != null) {
            ant.b = null;
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
                anl.a((Object) hashSet, "permissions");
                cVar.b = hashSet;
            } else {
                String string = bundle.getString("com.facebook.platform.extra.USER_ID");
                if (string == null || string.isEmpty()) {
                    this.b.d();
                    ank.a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), (a) new a() {
                        public final void a(FacebookException facebookException) {
                            anu.this.b.b(Result.a(anu.this.b.e, "Caught exception", facebookException.getMessage()));
                        }

                        public final void a(JSONObject jSONObject) {
                            try {
                                bundle.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                                anu.this.b(cVar, bundle);
                            } catch (JSONException e) {
                                anu.this.b.b(Result.a(anu.this.b.e, "Caught exception", e.getMessage()));
                            }
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
    public final boolean a(final c cVar) {
        this.c = new ant(this.b.b.p(), cVar.d);
        if (!this.c.a()) {
            return false;
        }
        this.b.d();
        this.c.b = new a() {
            public final void a(Bundle bundle) {
                anu.this.a(cVar, bundle);
            }
        };
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        ant ant = this.c;
        if (ant != null) {
            ant.c = false;
            ant.b = null;
            this.c = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(c cVar, Bundle bundle) {
        this.b.a(Result.a(this.b.e, a(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, cVar.d)));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
