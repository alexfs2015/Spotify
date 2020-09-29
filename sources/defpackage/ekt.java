package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ekt reason: default package */
public final class ekt implements ekw {
    static final Map<Uri, ekt> a = new dp();
    private static final String[] g = {"key", "value"};
    final Object b = new Object();
    volatile Map<String, String> c;
    final List<Object> d = new ArrayList();
    private final ContentResolver e;
    private final Uri f;

    private ekt(ContentResolver contentResolver, Uri uri) {
        this.e = contentResolver;
        this.f = uri;
        this.e.registerContentObserver(uri, false, new ekv(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ekt a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<ekt> r0 = defpackage.ekt.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, ekt> r1 = a     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            ekt r1 = (defpackage.ekt) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            ekt r2 = new ekt     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, ekt> r3 = a     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekt.a(android.content.ContentResolver, android.net.Uri):ekt");
    }

    public final Map<String, String> a() {
        Map<String, String> map = this.c;
        if (map == null) {
            synchronized (this.b) {
                map = this.c;
                if (map == null) {
                    map = c();
                    this.c = map;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    private final Map<String, String> c() {
        try {
            return (Map) ekx.a(new eku(this));
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    public final /* synthetic */ Object a(String str) {
        return (String) a().get(str);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Map b() {
        Map map;
        Cursor query = this.e.query(this.f, g, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new dp(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }
}
