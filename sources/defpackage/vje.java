package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: vje reason: default package */
public interface vje {

    /* renamed from: vje$a */
    public static abstract class a implements Parcelable {

        /* renamed from: vje$a$a reason: collision with other inner class name */
        public interface C0083a {
            C0083a a(int i);

            C0083a a(Optional<Policy> optional);

            C0083a a(String str);

            C0083a a(boolean z);

            a a();

            C0083a b(Optional<way> optional);

            C0083a b(boolean z);

            C0083a c(Optional<Boolean> optional);

            C0083a d(Optional<Boolean> optional);

            C0083a e(Optional<Boolean> optional);

            C0083a f(Optional<Boolean> optional);

            C0083a g(Optional<Boolean> optional);

            C0083a h(Optional<Boolean> optional);

            C0083a i(Optional<vkg> optional);

            C0083a j(Optional<Integer> optional);
        }

        private static <T> void a(String str, List<String> list, String str2, Optional<T> optional) {
            if (optional.b()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(' ');
                sb.append(str);
                sb.append(' ');
                sb.append(optional.c());
                list.add(sb.toString());
            }
        }

        private static <T> void a(List<String> list, String str, Optional<T> optional) {
            a("eq", list, str, optional);
        }

        private static void a(Map<String, String> map, String str, Optional<Boolean> optional) {
            if (optional.b()) {
                map.put(str, String.valueOf(optional.c()));
            }
        }

        public static C0083a t() {
            return new a().a(Optional.e()).b(Optional.e()).a("").c(Optional.e()).d(Optional.e()).e(Optional.e()).f(Optional.e()).a(true).b(false).g(Optional.e()).h(Optional.e()).i(Optional.e()).j(Optional.e()).a(500);
        }

        public abstract Optional<Policy> a();

        public abstract Optional<way> b();

        public abstract String c();

        public abstract Optional<Boolean> d();

        public abstract Optional<Boolean> e();

        public abstract Optional<Boolean> f();

        public abstract Optional<Boolean> g();

        public abstract boolean h();

        public abstract boolean i();

        public abstract Optional<Boolean> j();

        public abstract Optional<Boolean> k();

        public abstract Optional<vkg> l();

        public abstract Optional<Integer> m();

        public abstract int n();

        public abstract C0083a o();

        public final Map<String, String> u() {
            LinkedHashMap linkedHashMap = new LinkedHashMap(10);
            linkedHashMap.put("updateThrottling", String.valueOf(n()));
            linkedHashMap.put("responseFormat", "protobuf");
            Optional b = b();
            linkedHashMap.put("sort", b.b() ? waz.a((way) b.c()) : "");
            ArrayList arrayList = new ArrayList(5);
            a((List<String>) arrayList, "availableOffline", d());
            a((List<String>) arrayList, "isBanned", e());
            a((List<String>) arrayList, "isExplicit", f());
            a((List<String>) arrayList, "artist.isBanned", g());
            a("lt", arrayList, "originalIndex", m());
            String c = c();
            if (!fbo.a(c)) {
                StringBuilder sb = new StringBuilder("text contains ");
                sb.append(Uri.encode(Uri.encode(c)));
                arrayList.add(sb.toString());
            }
            linkedHashMap.put("filter", fbl.a(',').a((Iterable<?>) arrayList));
            a((Map<String, String>) linkedHashMap, "showUnavailable", j());
            a((Map<String, String>) linkedHashMap, "alwaysShowWindowed", k());
            if (h()) {
                a((Map<String, String>) linkedHashMap, "includeEpisodes", Optional.b(Boolean.TRUE));
            }
            if (i()) {
                a((Map<String, String>) linkedHashMap, "loadRecommendations", Optional.b(Boolean.TRUE));
            }
            Optional l = l();
            if (l.b()) {
                vkg vkg = (vkg) l.c();
                linkedHashMap.put("start", String.valueOf(vkg.a()));
                linkedHashMap.put("length", String.valueOf(vkg.b()));
            }
            return linkedHashMap;
        }
    }

    /* renamed from: vje$b */
    public static abstract class b {

        /* renamed from: vje$b$a */
        public interface a {
            a a(List<String> list);

            b a();

            a b(List<String> list);
        }

        public abstract List<String> a();

        public abstract List<String> b();

        public final boolean c() {
            return a().size() != b().size();
        }
    }

    Completable a(String str, a aVar, PlayOptions playOptions, PlayOrigin playOrigin, Map<String, String> map);

    Single<vld> a(String str);

    Single<b> a(String str, List<String> list);

    Single<vld> a(String str, a aVar);

    Observable<vld> b(String str, a aVar);
}
