package defpackage;

import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.RootListType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: rtn reason: default package */
public final class rtn {
    final HashMap<String, RootListType> a = new HashMap<>(5);
    final HashMap<String, defpackage.rtk.a> b = new HashMap<>(5);
    final HashMap<String, rtm> c;
    final MediaSessionCompat d;
    WeakReference<hne> e;
    a f;
    private final Set<rti> g;
    private final rtg h;

    /* renamed from: rtn$a */
    public interface a {
        void a(MediaSessionCompat mediaSessionCompat);

        void b();
    }

    public rtn(MediaSessionCompat mediaSessionCompat, Set<rti> set, rtg rtg) {
        this.d = mediaSessionCompat;
        this.g = set;
        this.h = rtg;
        this.c = new HashMap<>(5);
    }

    public final void a(String str, MediaSessionCompat mediaSessionCompat, RootListType rootListType) {
        hne b2 = b();
        if (b2 != null) {
            String b3 = this.h.b(str);
            if (!this.c.containsKey(str) && b3 != null) {
                a(b2, mediaSessionCompat, b3, rootListType);
            }
            return;
        }
        this.a.put(str, rootListType);
    }

    private void a(hne hne, MediaSessionCompat mediaSessionCompat, String str, RootListType rootListType) {
        for (rti rti : this.g) {
            if (rti.a(str)) {
                Logger.b("Using %s to create MediaBrowserServiceSession for package %s", rti.getClass().getName(), str);
                a(str, mediaSessionCompat, rti.a(str, hne, rootListType));
                return;
            }
        }
    }

    private void a(String str, MediaSessionCompat mediaSessionCompat, rtm rtm) {
        this.c.put(str, rtm);
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(mediaSessionCompat);
        }
    }

    public final void a(String str, defpackage.rtk.a aVar) {
        if (b() != null) {
            rtm a2 = a(str);
            if (a2 != null) {
                aVar.a(a2);
            } else {
                aVar.a();
            }
        } else {
            this.b.put(str, aVar);
        }
    }

    private rtm a(String str) {
        String b2 = this.h.b(str);
        rtm rtm = (rtm) this.c.get(b2);
        if (rtm == null) {
            Logger.d("No service session found for packageName: %s", b2);
        }
        return rtm;
    }

    public final ArrayList<rtm> a() {
        return new ArrayList<>(this.c.values());
    }

    /* access modifiers changed from: 0000 */
    public void a(MediaSessionCompat mediaSessionCompat) {
        hne b2 = b();
        for (Entry entry : this.a.entrySet()) {
            if (!(entry == null || b2 == null)) {
                a((String) entry.getKey(), mediaSessionCompat, (RootListType) entry.getValue());
            }
        }
        this.a.clear();
        for (Entry entry2 : this.b.entrySet()) {
            String str = (String) entry2.getKey();
            defpackage.rtk.a aVar = (defpackage.rtk.a) entry2.getValue();
            if (!(str == null || b2 == null)) {
                a(str, aVar);
            }
        }
        this.b.clear();
    }

    private hne b() {
        WeakReference<hne> weakReference = this.e;
        if (weakReference == null) {
            return null;
        }
        return (hne) weakReference.get();
    }
}
