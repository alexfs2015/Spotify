package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: uxn reason: default package */
public interface uxn {

    /* renamed from: uxn$a */
    public static abstract class a implements Parcelable {

        /* renamed from: uxn$a$a reason: collision with other inner class name */
        public interface C0082a {
            C0082a a(int i);

            C0082a a(Optional<RootlistRequestPayload> optional);

            C0082a a(String str);

            C0082a a(boolean z);

            a a();

            C0082a b(Optional<vns> optional);

            C0082a c(Optional<Boolean> optional);

            C0082a d(Optional<Boolean> optional);

            C0082a e(Optional<uyd> optional);
        }

        public abstract Optional<RootlistRequestPayload> a();

        public abstract Optional<vns> b();

        public abstract String c();

        public abstract Optional<Boolean> d();

        public abstract Optional<Boolean> e();

        public abstract boolean f();

        public abstract Optional<uyd> g();

        public abstract int h();

        public static C0082a m() {
            return new a().a(Optional.e()).b(Optional.e()).a("").c(Optional.e()).d(Optional.e()).a(false).e(Optional.e()).a(500);
        }

        private static void a(List<String> list, String str, Optional<Boolean> optional) {
            if (optional.b()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" eq ");
                sb.append(optional.c());
                list.add(sb.toString());
            }
        }

        public final Map<String, String> n() {
            LinkedHashMap linkedHashMap = new LinkedHashMap(10);
            linkedHashMap.put("updateThrottling", String.valueOf(h()));
            linkedHashMap.put("responseFormat", "protobuf");
            Optional b = b();
            linkedHashMap.put("sort", b.b() ? vnt.a((vns) b.c()) : "");
            ArrayList arrayList = new ArrayList(5);
            a(arrayList, "availableOffline", d());
            a(arrayList, "isWritable", e());
            String c = c();
            if (!fax.a(c)) {
                StringBuilder sb = new StringBuilder("text contains ");
                sb.append(Uri.encode(Uri.encode(c)));
                arrayList.add(sb.toString());
            }
            linkedHashMap.put("filter", fau.a(',').a((Iterable<?>) arrayList));
            if (f()) {
                Optional b2 = Optional.b(Boolean.TRUE);
                if (b2.b()) {
                    linkedHashMap.put("flattenTree", String.valueOf(b2.c()));
                }
            }
            Optional g = g();
            if (g.b()) {
                uyd uyd = (uyd) g.c();
                linkedHashMap.put("start", String.valueOf(uyd.a()));
                linkedHashMap.put("length", String.valueOf(uyd.b()));
            }
            return linkedHashMap;
        }
    }

    Single<uyv> a(Optional<String> optional, a aVar);

    Observable<uyv> b(Optional<String> optional, a aVar);
}
