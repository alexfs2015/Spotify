package defpackage;

import com.google.common.base.Optional;
import com.spotify.podcast.endpoints.policy.Policy;
import io.reactivex.Single;
import java.util.List;
import java.util.Map;

/* renamed from: vlx reason: default package */
public interface vlx {

    /* renamed from: vlx$a */
    public static abstract class a {

        /* renamed from: vlx$a$a reason: collision with other inner class name */
        public interface C0085a {
            C0085a a(int i);

            C0085a a(Optional<Policy> optional);

            a a();

            C0085a b(Optional<way> optional);

            C0085a c(Optional<vlw> optional);

            C0085a d(Optional<Double> optional);

            C0085a e(Optional<Integer> optional);

            C0085a f(Optional<Boolean> optional);

            C0085a g(Optional<Boolean> optional);

            C0085a h(Optional<Integer> optional);

            C0085a i(Optional<Boolean> optional);

            C0085a j(Optional<Integer> optional);
        }

        public abstract Optional<Policy> a();

        public abstract Optional<way> b();

        public abstract Optional<vlw> c();

        public abstract Optional<Double> d();

        public abstract Optional<Integer> e();

        public abstract Optional<Boolean> f();

        public abstract Optional<Boolean> g();

        public abstract Optional<Integer> h();

        public abstract Optional<Boolean> i();

        public abstract Optional<Integer> j();

        public abstract int k();

        public final Map<String, String> l() {
            String str = "hasTimeLeft";
            String str2 = "unique";
            vme a = new vme().a("available", f()).a(str, g()).a(str2, i());
            String str3 = "lt";
            vme.a(str3, a.a, "daysLastPlayed", j());
            String str4 = "gt";
            vme.a(str4, a.a, "timePlayed", h());
            vmf a2 = new vmf().a("updateThrottling", Optional.b(Integer.valueOf(k())));
            Optional b = Optional.b("protobuf");
            if (b.b()) {
                a2.a.put("responseFormat", b.c());
            }
            Optional b2 = b();
            if (b2.b()) {
                a2.a.put("sort", waz.a((way) b2.c()));
            }
            List<String> list = a.a;
            if (!list.isEmpty()) {
                a2.a.put("filter", fbl.a(',').a((Iterable<?>) list));
            }
            Optional d = d();
            if (d.b()) {
                a2.a.put("relTimeLeftTolerance", String.valueOf(d.c()));
            }
            vmf a3 = a2.a("absTimeLeftTolerance", e());
            Optional c = c();
            if (c.b()) {
                vlw vlw = (vlw) c.c();
                a3.a.put("start", String.valueOf(vlw.a()));
                a3.a.put("length", String.valueOf(vlw.b()));
            }
            return a3.a;
        }
    }

    Single<vlb<vkv>> a(a aVar);
}
