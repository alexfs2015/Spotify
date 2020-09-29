package defpackage;

import android.net.Uri;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: amg reason: default package */
public final class amg {
    public boolean a;
    public String b;
    public boolean c;
    public boolean d;
    public int e;
    public EnumSet<SmartLoginOption> f;
    public boolean g;
    public amc h;
    public boolean i;
    public boolean j;
    public String k;
    public JSONArray l;
    private Map<String, Map<String, a>> m;
    private String n;
    private String o;
    private boolean p;

    /* renamed from: amg$a */
    public static class a {
        public String a;
        public String b;
        public Uri c;
        int[] d;

        public static int[] a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int i2 = -1;
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!amw.a(optString)) {
                        try {
                            i2 = Integer.parseInt(optString);
                        } catch (NumberFormatException e) {
                            amw.a("FacebookSDK", (Exception) e);
                        }
                        iArr[i] = i2;
                    }
                }
                i2 = optInt;
                iArr[i] = i2;
            }
            return iArr;
        }

        public a(String str, String str2, Uri uri, int[] iArr) {
            this.a = str;
            this.b = str2;
            this.c = uri;
            this.d = iArr;
        }
    }

    public amg(boolean z, String str, boolean z2, boolean z3, int i2, EnumSet<SmartLoginOption> enumSet, Map<String, Map<String, a>> map, boolean z4, amc amc, String str2, String str3, boolean z5, boolean z6, JSONArray jSONArray, String str4, boolean z7) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
        this.m = map;
        this.h = amc;
        this.e = i2;
        this.g = z4;
        this.f = enumSet;
        this.n = str2;
        this.o = str3;
        this.i = z5;
        this.j = z6;
        this.l = jSONArray;
        this.k = str4;
        this.p = z7;
    }

    public static a a(String str, String str2, String str3) {
        if (!amw.a(str2) && !amw.a(str3)) {
            amg a2 = FetchedAppSettingsManager.a(str);
            if (a2 != null) {
                Map map = (Map) a2.m.get(str2);
                if (map != null) {
                    return (a) map.get(str3);
                }
            }
        }
        return null;
    }
}
