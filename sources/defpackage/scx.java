package defpackage;

import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.mediabrowserservice.RecentlyUsedComparator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: scx reason: default package */
public final class scx {
    final HashMap<String, String> a = new HashMap<>(5);
    final HashMap<String, defpackage.scr.a> b = new HashMap<>(5);
    final HashMap<String, scw> c;
    final MediaSessionCompat d;
    WeakReference<hpt> e;
    a f;
    private final RecentlyUsedComparator g;
    private final Set<scp> h;
    private final scn i;

    /* renamed from: scx$a */
    public interface a {
        void a(MediaSessionCompat mediaSessionCompat);

        void b();
    }

    public scx(MediaSessionCompat mediaSessionCompat, Set<scp> set, scn scn, RecentlyUsedComparator recentlyUsedComparator) {
        this.d = mediaSessionCompat;
        this.h = set;
        this.i = scn;
        this.g = recentlyUsedComparator;
        this.c = new HashMap<>(5);
    }

    private scw a(String str) {
        String b2 = this.i.b(str);
        scw scw = (scw) this.c.get(b2);
        if (scw == null) {
            Logger.d("No service session found for packageName: %s", b2);
        }
        return scw;
    }

    private void a(hpt hpt, MediaSessionCompat mediaSessionCompat, String str, String str2) {
        for (scp scp : this.h) {
            if (scp.a(str)) {
                Logger.b("Using %s to create MediaBrowserServiceSession for package %s", scp.getClass().getName(), str);
                a(str, mediaSessionCompat, scp.a(str, hpt, str2));
                return;
            }
        }
    }

    private void a(String str, MediaSessionCompat mediaSessionCompat, scw scw) {
        this.c.put(str, scw);
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(mediaSessionCompat);
        }
    }

    private hpt b() {
        WeakReference<hpt> weakReference = this.e;
        if (weakReference == null) {
            return null;
        }
        return (hpt) weakReference.get();
    }

    public final ArrayList<scw> a() {
        return new ArrayList<>(this.c.values());
    }

    /* access modifiers changed from: 0000 */
    public void a(MediaSessionCompat mediaSessionCompat) {
        hpt b2 = b();
        for (Entry entry : this.a.entrySet()) {
            if (!(entry == null || b2 == null)) {
                a((String) entry.getKey(), mediaSessionCompat, (String) entry.getValue());
            }
        }
        this.a.clear();
        for (Entry entry2 : this.b.entrySet()) {
            String str = (String) entry2.getKey();
            defpackage.scr.a aVar = (defpackage.scr.a) entry2.getValue();
            if (!(str == null || b2 == null)) {
                a(str, aVar);
            }
        }
        this.b.clear();
    }

    public final void a(String str, MediaSessionCompat mediaSessionCompat, String str2) {
        hpt b2 = b();
        if (b2 != null) {
            String b3 = this.i.b(str);
            if (!this.c.containsKey(str) && b3 != null) {
                a(b2, mediaSessionCompat, b3, str2);
            }
            return;
        }
        this.a.put(str, str2);
    }

    public final void a(String str, defpackage.scr.a aVar) {
        if (b() != null) {
            scw a2 = a(str);
            if (a2 != null) {
                aVar.a(a2);
            } else {
                aVar.a();
            }
        } else {
            this.b.put(str, aVar);
        }
    }
}
