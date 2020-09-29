package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aju reason: default package */
public final class aju implements Parcelable {
    public static final Creator<aju> CREATOR = new Creator() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aju[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aju(parcel);
        }
    };
    private static final Date k;
    private static final Date l;
    private static final Date m = new Date();
    private static final AccessTokenSource n = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    final Date a;
    public final Set<String> b;
    final Set<String> c;
    final Set<String> d;
    public final String e;
    final AccessTokenSource f;
    final Date g;
    public final String h;
    public final String i;
    final Date j;

    /* renamed from: aju$a */
    public interface a {
    }

    public final int describeContents() {
        return 0;
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        k = date;
        l = date;
    }

    public aju(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        amx.a(str, "accessToken");
        amx.a(str2, "applicationId");
        amx.a(str3, "userId");
        if (date == null) {
            date = l;
        }
        this.a = date;
        if (collection != null) {
            hashSet = new HashSet(collection);
        } else {
            hashSet = new HashSet();
        }
        this.b = Collections.unmodifiableSet(hashSet);
        if (collection2 != null) {
            hashSet2 = new HashSet(collection2);
        } else {
            hashSet2 = new HashSet();
        }
        this.c = Collections.unmodifiableSet(hashSet2);
        if (collection3 != null) {
            hashSet3 = new HashSet(collection3);
        } else {
            hashSet3 = new HashSet();
        }
        this.d = Collections.unmodifiableSet(hashSet3);
        this.e = str;
        if (accessTokenSource == null) {
            accessTokenSource = n;
        }
        this.f = accessTokenSource;
        if (date2 == null) {
            date2 = m;
        }
        this.g = date2;
        this.h = str2;
        this.i = str3;
        if (date3 == null || date3.getTime() == 0) {
            date3 = l;
        }
        this.j = date3;
    }

    public static aju a() {
        return ajw.a().b;
    }

    public static boolean b() {
        aju aju = ajw.a().b;
        return aju != null && !aju.d();
    }

    static void c() {
        aju aju = ajw.a().b;
        if (aju != null) {
            aju aju2 = new aju(aju.e, aju.h, aju.i, aju.b, aju.c, aju.d, aju.f, new Date(), new Date(), aju.j);
            ajw.a().a(aju2, true);
        }
    }

    public static void a(aju aju) {
        ajw.a().a(aju, true);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        String str2 = "null";
        if (this.e == null) {
            str = str2;
        } else if (akc.a(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
            str = this.e;
        } else {
            str = "ACCESS_TOKEN_REMOVED";
        }
        sb.append(str);
        sb.append(" permissions:");
        if (this.b == null) {
            sb.append(str2);
        } else {
            sb.append("[");
            sb.append(TextUtils.join(", ", this.b));
            sb.append("]");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aju)) {
            return false;
        }
        aju aju = (aju) obj;
        if (this.a.equals(aju.a) && this.b.equals(aju.b) && this.c.equals(aju.c) && this.d.equals(aju.d) && this.e.equals(aju.e) && this.f == aju.f && this.g.equals(aju.g)) {
            String str = this.h;
            if (str != null ? str.equals(aju.h) : aju.h == null) {
                return this.i.equals(aju.i) && this.j.equals(aju.j);
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((((((((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        String str = this.h;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    static aju a(Bundle bundle) {
        List a2 = a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List a3 = a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        List a4 = a(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
        String d2 = akh.d(bundle);
        if (amw.a(d2)) {
            d2 = akc.k();
        }
        String str = d2;
        String b2 = akh.b(bundle);
        try {
            aju aju = new aju(b2, str, amw.e(b2).getString("id"), a2, a3, a4, akh.c(bundle), akh.a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), akh.a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), null);
            return aju;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static List<String> a(Bundle bundle, String str) {
        ArrayList stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    public final boolean d() {
        return new Date().after(this.a);
    }

    /* access modifiers changed from: 0000 */
    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.e);
        jSONObject.put("expires_at", this.a.getTime());
        jSONObject.put("permissions", new JSONArray(this.b));
        jSONObject.put("declined_permissions", new JSONArray(this.c));
        jSONObject.put("expired_permissions", new JSONArray(this.d));
        jSONObject.put("last_refresh", this.g.getTime());
        jSONObject.put("source", this.f.name());
        jSONObject.put("application_id", this.h);
        jSONObject.put("user_id", this.i);
        jSONObject.put("data_access_expiration_time", this.j.getTime());
        return jSONObject;
    }

    static aju a(JSONObject jSONObject) {
        Collection collection;
        if (jSONObject.getInt("version") <= 1) {
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            AccessTokenSource valueOf = AccessTokenSource.valueOf(jSONObject.getString("source"));
            String string2 = jSONObject.getString("application_id");
            String string3 = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
            List a2 = amw.a(jSONArray);
            List a3 = amw.a(jSONArray2);
            if (optJSONArray == null) {
                collection = new ArrayList();
            } else {
                collection = amw.a(optJSONArray);
            }
            aju aju = new aju(string, string2, string3, a2, a3, collection, valueOf, date, date2, date3);
            return aju;
        }
        throw new FacebookException("Unknown AccessToken serialization format.");
    }

    aju(Parcel parcel) {
        this.a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.b = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.c = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.d = Collections.unmodifiableSet(new HashSet(arrayList));
        this.e = parcel.readString();
        this.f = AccessTokenSource.valueOf(parcel.readString());
        this.g = new Date(parcel.readLong());
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = new Date(parcel.readLong());
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.a.getTime());
        parcel.writeStringList(new ArrayList(this.b));
        parcel.writeStringList(new ArrayList(this.c));
        parcel.writeStringList(new ArrayList(this.d));
        parcel.writeString(this.e);
        parcel.writeString(this.f.name());
        parcel.writeLong(this.g.getTime());
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeLong(this.j.getTime());
    }
}
