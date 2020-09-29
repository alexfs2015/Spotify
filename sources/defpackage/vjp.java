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

/* renamed from: vjp reason: default package */
public interface vjp {

    /* renamed from: vjp$a */
    public static abstract class a implements Parcelable {

        /* renamed from: vjp$a$a reason: collision with other inner class name */
        public interface C0084a {
            C0084a a(int i);

            C0084a a(Optional<RootlistRequestPayload> optional);

            C0084a a(String str);

            C0084a a(boolean z);

            a a();

            C0084a b(Optional<way> optional);

            C0084a c(Optional<Boolean> optional);

            C0084a d(Optional<Boolean> optional);

            C0084a e(Optional<vkg> optional);
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

        public static C0084a m() {
            return new a().a(Optional.e()).b(Optional.e()).a("").c(Optional.e()).d(Optional.e()).a(false).e(Optional.e()).a(500);
        }

        public abstract Optional<RootlistRequestPayload> a();

        public abstract Optional<way> b();

        public abstract String c();

        public abstract Optional<Boolean> d();

        public abstract Optional<Boolean> e();

        public abstract boolean f();

        public abstract Optional<vkg> g();

        public abstract int h();

        public final Map<String, String> n() {
            LinkedHashMap linkedHashMap = new LinkedHashMap(10);
            linkedHashMap.put("updateThrottling", String.valueOf(h()));
            linkedHashMap.put("responseFormat", "protobuf");
            Optional b = b();
            linkedHashMap.put("sort", b.b() ? waz.a((way) b.c()) : "");
            ArrayList arrayList = new ArrayList(5);
            a(arrayList, "availableOffline", d());
            a(arrayList, "isWritable", e());
            String c = c();
            if (!fbo.a(c)) {
                StringBuilder sb = new StringBuilder("text contains ");
                sb.append(Uri.encode(Uri.encode(c)));
                arrayList.add(sb.toString());
            }
            linkedHashMap.put("filter", fbl.a(',').a((Iterable<?>) arrayList));
            if (f()) {
                Optional b2 = Optional.b(Boolean.TRUE);
                if (b2.b()) {
                    linkedHashMap.put("flattenTree", String.valueOf(b2.c()));
                }
            }
            Optional g = g();
            if (g.b()) {
                vkg vkg = (vkg) g.c();
                linkedHashMap.put("start", String.valueOf(vkg.a()));
                linkedHashMap.put("length", String.valueOf(vkg.b()));
            }
            return linkedHashMap;
        }
    }

    Single<vky> a(Optional<String> optional, a aVar);

    Observable<vky> b(Optional<String> optional, a aVar);
}
