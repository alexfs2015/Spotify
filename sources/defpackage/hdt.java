package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.playlist.endpoints.exceptions.NotFoundException;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Single;
import java.util.concurrent.TimeUnit;

/* renamed from: hdt reason: default package */
public final class hdt {
    private static final a b;
    private final vje a;

    static {
        String str = "username";
        ImmutableMap b2 = ImmutableMap.g().b(str, Boolean.TRUE).b();
        String str2 = "name";
        ImmutableMap b3 = ImmutableMap.g().b(str2, Boolean.TRUE).b(str, Boolean.TRUE).b();
        String str3 = "offline";
        String str4 = "ownedBySelf";
        String str5 = "link";
        String str6 = "picture";
        String str7 = "published";
        String str8 = "browsableOffline";
        String str9 = "collaborative";
        String str10 = "followed";
        String str11 = "loaded";
        b = a.t().a(Optional.b(Policy.builder().a(DecorationPolicy.builder().a(ListPolicy.builder().a(ImmutableMap.f()).b(ImmutableMap.f()).c(ImmutableMap.f()).e(ImmutableMap.f()).d(ImmutableMap.f()).a()).a(HeaderPolicy.builder().a(ImmutableMap.g().b("description", Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b(str2, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b(str7, Boolean.TRUE).b(str8, Boolean.TRUE).b(str9, Boolean.TRUE).b(str10, Boolean.TRUE).b(str11, Boolean.TRUE).b()).b(b2).c(b3).a()).a()).a())).i(vkg.a(0, 0)).a();
    }

    public hdt(vje vje) {
        this.a = vje;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vlc a(final String str, Throwable th) {
        if (th instanceof NotFoundException) {
            return new vlc() {
                public final String a() {
                    return "";
                }

                public final String b() {
                    return null;
                }

                public final Covers c() {
                    return null;
                }

                public final vlg d() {
                    return null;
                }

                public final boolean e() {
                    return false;
                }

                public final boolean f() {
                    return false;
                }

                public final boolean g() {
                    return false;
                }

                public final String getHeader() {
                    return null;
                }

                public final String getImageUri() {
                    return "";
                }

                public final String getImageUri(Size size) {
                    return "";
                }

                public final String getTargetUri() {
                    return "";
                }

                public final String getTitle() {
                    return "";
                }

                public final String getUri() {
                    return str;
                }

                public final boolean h() {
                    return true;
                }

                public final boolean i() {
                    return false;
                }

                public final boolean isHeader() {
                    return false;
                }

                public final boolean j() {
                    return false;
                }

                public final boolean k() {
                    return true;
                }

                public final boolean l() {
                    return false;
                }

                public final boolean m() {
                    return false;
                }

                public final Optional<Boolean> n() {
                    return Optional.e();
                }

                public final boolean o() {
                    return false;
                }

                public final String p() {
                    return "";
                }

                public final ImmutableMap<String, String> q() {
                    return ImmutableMap.f();
                }

                public final vky r() {
                    return null;
                }

                public final vli s() {
                    return new f();
                }

                public final int t() {
                    return 0;
                }

                public final String u() {
                    return null;
                }

                public final int v() {
                    return 0;
                }

                public final vlg w() {
                    return null;
                }
            };
        }
        throw xiq.a(th);
    }

    public final Single<vlc> a(String str) {
        return this.a.a(str, b).f($$Lambda$NGcCMGZFQvzXMEFAzc0vFxrhb_w.INSTANCE).g(new $$Lambda$hdt$PY6NadUSTaEHR9081PWzHJ4Khks(str)).a(10, TimeUnit.SECONDS);
    }
}
