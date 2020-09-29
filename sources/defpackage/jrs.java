package defpackage;

import android.content.ContentResolver;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.UUID;

/* renamed from: jrs reason: default package */
public final class jrs {
    public static final b<Object, String> a = b.a("tmw_device_legacy_id");
    private static final b<Object, String> d = b.a("installation_id");
    private static final Object f = new Object();
    public String b;
    public final SpSharedPreferences<Object> c;
    private final ContentResolver e;
    private String g;

    public jrs(ContentResolver contentResolver, SpSharedPreferences<Object> spSharedPreferences) {
        this.e = (ContentResolver) fay.a(contentResolver);
        this.c = (SpSharedPreferences) fay.a(spSharedPreferences);
    }

    public final String a() {
        String string = Secure.getString(this.e, "android_id");
        return (string == null || string.isEmpty()) ? Ad.DEFAULT_SKIPPABLE_AD_DELAY : string;
    }

    public final String b() {
        synchronized (f) {
            if (this.g != null) {
                String str = this.g;
                return str;
            }
            this.g = this.c.b(d, "");
            if (TextUtils.isEmpty(this.g)) {
                String bigInteger = new BigInteger(130, new SecureRandom()).toString(32);
                this.c.a().a(d, bigInteger).b();
                this.g = bigInteger;
            }
            String str2 = this.g;
            return str2;
        }
    }

    public final String c() {
        if (fax.a(this.b)) {
            this.b = UUID.randomUUID().toString();
        }
        return this.b;
    }
}
