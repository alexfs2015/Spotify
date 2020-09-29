package com.spotify.music.follow;

import android.net.Uri;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class FollowManager {
    private final RxResolver a;
    private final FireAndForgetResolver b;
    private final ObjectMapper c;
    private final Map<String, a> d = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private final Map<String, Set<b>> e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private final Scheduler f;

    static class Items implements JacksonModel {
        public String contextSource;
        public String[] items;
        public String source;

        public Items(String str) {
            String str2 = "followManager";
            this.source = str2;
            this.contextSource = str2;
            this.items = new String[]{str};
        }
    }

    public static class a {
        public final String a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a(String str, int i, int i2, boolean z, boolean z2) {
            this.a = str;
            this.c = i;
            this.b = i2;
            this.d = z;
            this.e = z2;
        }

        /* access modifiers changed from: 0000 */
        public synchronized void a(boolean z) {
            int i;
            if (z == this.d) {
                StringBuilder sb = new StringBuilder("following is already ");
                sb.append(z);
                Assertion.b(sb.toString());
                return;
            }
            if (z) {
                i = this.c + 1;
                this.c = i;
            } else {
                i = this.c - 1;
                this.c = i;
            }
            this.c = i;
            this.d = z;
        }

        /* access modifiers changed from: 0000 */
        public synchronized void b(boolean z) {
            if (z == this.e) {
                StringBuilder sb = new StringBuilder("dismissed is already ");
                sb.append(z);
                Assertion.b(sb.toString());
                return;
            }
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return TextUtils.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.c), Integer.valueOf(this.b), Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
        }

        public final String toString() {
            return String.format(Locale.US, "uri: %s  followingCount: %s  followersCount: %s  isFollowing: %s, isDismissed: %s", new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
        }
    }

    public interface b {
        void a(a aVar);
    }

    interface c {
        void a(boolean z);
    }

    public FollowManager(RxResolver rxResolver, FireAndForgetResolver fireAndForgetResolver, rwl rwl, Scheduler scheduler) {
        this.a = rxResolver;
        this.b = fireAndForgetResolver;
        this.c = rwl.b();
        this.f = scheduler;
    }

    private synchronized void a(String str, boolean z, String str2, c cVar) {
        final String str3 = z ? Request.POST : Request.DELETE;
        final String format = String.format("{\"target_uris\": [\"%s\"]}", new Object[]{Uri.decode(str)});
        Observable a2 = this.a.resolve(new Request(str3, str2, null, format.getBytes(fbi.c))).a(this.f);
        final c cVar2 = cVar;
        final boolean z2 = z;
        AnonymousClass3 r1 = new Observer<Response>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
                Logger.e(th, "Failed to %s. Rolling back follow state.", str3);
                cVar2.a(true ^ z2);
            }

            public final /* synthetic */ void onNext(Object obj) {
                Logger.c("%s %s succeeded", str3, format);
            }

            public final void onSubscribe(Disposable disposable) {
            }
        };
        a2.subscribe(r1);
    }

    private synchronized void b(String str) {
        String decode = Uri.decode(str);
        Set<b> set = (Set) this.e.get(decode);
        if (set != null) {
            a aVar = (a) this.d.get(decode);
            for (b a2 : set) {
                a2.a(aVar);
            }
        }
    }

    private synchronized void e(final String str, boolean z) {
        a(str, z, "hm://socialgraph/v2/following?format=json", new c() {
            public final void a(boolean z) {
                FollowManager.this.a(str, z, true);
                if (jva.a(str).b == LinkType.ARTIST) {
                    FollowManager.this.c(str, z);
                }
            }
        });
    }

    private synchronized void f(final String str, boolean z) {
        a(str, z, "hm://socialgraph/v2/dismissed?format=json", new c() {
            public final void a(boolean z) {
                FollowManager.this.b(str, z, true);
                if (jva.a(str).b == LinkType.ARTIST) {
                    FollowManager.this.d(str, z);
                }
            }
        });
    }

    public final synchronized a a(String str) {
        return (a) this.d.get(Uri.decode(str));
    }

    public final synchronized void a(a aVar) {
        this.d.put(Uri.decode(aVar.a), aVar);
        b(aVar.a);
    }

    public final synchronized void a(String str, boolean z) {
        String decode = Uri.decode(str);
        boolean containsKey = this.d.containsKey(decode);
        StringBuilder sb = new StringBuilder("no model exists for ");
        sb.append(decode);
        fbp.a(containsKey, (Object) sb.toString());
        boolean z2 = true;
        boolean z3 = jva.a(decode).b == LinkType.ARTIST;
        boolean z4 = ((a) this.d.get(decode)).e;
        if (z3 && z) {
            if (z4) {
                z2 = false;
            }
        }
        a(decode, z, z2);
        e(decode, z);
        if (z3) {
            c(decode, z);
            if (z && z4) {
                b(decode, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized void a(String str, boolean z, boolean z2) {
        String decode = Uri.decode(str);
        ((a) this.d.get(decode)).a(z);
        if (z2) {
            b(decode);
        }
    }

    public final synchronized boolean a(String str, b bVar) {
        String decode;
        decode = Uri.decode(str);
        if (!this.e.containsKey(decode)) {
            this.e.put(decode, Collections.newSetFromMap(gcm.a()));
        }
        return ((Set) this.e.get(decode)).add(bVar);
    }

    public final synchronized void b(String str, boolean z) {
        String decode = Uri.decode(str);
        boolean containsKey = this.d.containsKey(decode);
        StringBuilder sb = new StringBuilder("no model exists for ");
        sb.append(decode);
        fbp.a(containsKey, (Object) sb.toString());
        boolean z2 = true;
        boolean z3 = jva.a(decode).b == LinkType.ARTIST;
        boolean z4 = ((a) this.d.get(decode)).d;
        if (z3 && z) {
            if (z4) {
                z2 = false;
            }
        }
        b(decode, z, z2);
        f(decode, z);
        if (z3) {
            d(decode, z);
            if (z && z4) {
                a(decode, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized void b(String str, boolean z, boolean z2) {
        String decode = Uri.decode(str);
        ((a) this.d.get(decode)).b(z);
        if (z2) {
            b(decode);
        }
    }

    public final synchronized boolean b(String str, b bVar) {
        Set set;
        set = (Set) this.e.get(Uri.decode(str));
        return set != null && set.remove(bVar);
    }

    /* access modifiers changed from: 0000 */
    public synchronized void c(String str, boolean z) {
        fbp.a(jva.a(str).b == LinkType.ARTIST, (Object) "Uri is not an artist uri");
        try {
            this.b.resolve(new Request(z ? Request.POST : Request.DELETE, "sp://core-collection/v1/items", Collections.emptyMap(), this.c.writeValueAsString(new Items(str)).getBytes(fbi.c)));
        } catch (JsonProcessingException e2) {
            Logger.e(e2, "Failed to serialize json for following/unfollowing artist.", new Object[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized void d(String str, boolean z) {
        fbp.a(jva.a(str).b == LinkType.ARTIST, (Object) "Uri is not an artist uri");
        try {
            this.b.resolve(new Request(z ? Request.POST : Request.DELETE, "sp://core-collection/unstable/bans", Collections.emptyMap(), this.c.writeValueAsString(new Items(str)).getBytes(fbi.c)));
        } catch (JsonProcessingException e2) {
            Logger.e(e2, "Failed to serialize json for ban/unbaning of artist.", new Object[0]);
        }
    }
}
