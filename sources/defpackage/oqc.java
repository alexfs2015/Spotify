package defpackage;

import android.os.Bundle;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: oqc reason: default package */
final class oqc implements oqa {
    private static final Policy j = Policy.builder().a(DecorationPolicy.builder().a(HeaderPolicy.builder().a(ImmutableMap.f()).b(ImmutableMap.f()).c(ImmutableMap.f()).a()).a()).a();
    private static final Policy k;
    private static final Policy l;
    private static final Policy m;
    private static final BiPredicate<opy, opy> n = $$Lambda$oqc$cbCnBmsioVm9s7uyDVqDoPvm03A.INSTANCE;
    private final String b;
    private final vje c;
    private final jwo d;
    private final PlaylistDataSourceConfiguration e;
    private final hfp f;
    private final hdz g;
    private final omp h;
    private final BehaviorSubject<opy> i = BehaviorSubject.a();
    private Observable<oqf> o;
    private Observable<oqg> p;
    private Observable<a> q;

    /* renamed from: oqc$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[PlaylistDataSourceConfiguration.DecorationPolicy.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration$DecorationPolicy[] r0 = com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.DecorationPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration$DecorationPolicy r1 = com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.DecorationPolicy.LARGE_WITH_VIEWPORT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration$DecorationPolicy r1 = com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.DecorationPolicy.LARGE_WITHOUT_VIEWPORT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration$DecorationPolicy r1 = com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.DecorationPolicy.LIMITED_WITHOUT_VIEWPORT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.oqc.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: oqc$a */
    public static abstract class a {

        /* renamed from: oqc$a$a reason: collision with other inner class name */
        public interface C0066a {
            C0066a a(Optional<Integer> optional);

            C0066a a(opy opy);

            C0066a a(boolean z);

            a a();
        }

        public abstract Optional<Integer> a();

        public abstract boolean b();

        public abstract opy c();

        public abstract C0066a d();
    }

    static {
        String str = "link";
        String str2 = "name";
        String str3 = "inCollection";
        String str4 = "isBanned";
        String str5 = "isExplicit";
        String str6 = "hasLyrics";
        String str7 = "isPremiumOnly";
        String str8 = "playable";
        String str9 = "available";
        String str10 = "offline";
        String str11 = "mediaTypeEnum";
        String str12 = "formatListAttributes";
        String str13 = "description";
        String str14 = "covers";
        String str15 = "freezeFrames";
        String str16 = "duration";
        String str17 = "imageUri";
        String str18 = "isNew";
        String str19 = "isPlayed";
        String str20 = "lastPlayedAt";
        String str21 = "timeLeft";
        String str22 = "publishDate";
        String str23 = "length";
        String str24 = "previewId";
        ImmutableMap b2 = ImmutableMap.g().b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b("rowId", Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b(str7, Boolean.TRUE).b(str8, Boolean.TRUE).b(str9, Boolean.TRUE).b(str10, Boolean.TRUE).b(str11, Boolean.TRUE).b(str12, Boolean.TRUE).b(str13, Boolean.TRUE).b(str14, Boolean.TRUE).b(str15, Boolean.TRUE).b(str16, Boolean.TRUE).b(str17, Boolean.TRUE).b(str18, Boolean.TRUE).b(str19, Boolean.TRUE).b(str20, Boolean.TRUE).b(str21, Boolean.TRUE).b(str22, Boolean.TRUE).b(str23, Boolean.TRUE).b(str24, Boolean.TRUE).b();
        ImmutableMap b3 = ImmutableMap.g().b(str2, Boolean.TRUE).b(str14, Boolean.TRUE).b();
        String str25 = "username";
        ListPolicy a2 = ListPolicy.builder().a(b2).b(b3).c(ImmutableMap.b(str2, Boolean.TRUE)).e(ImmutableMap.g().b(str2, Boolean.TRUE).b(str25, Boolean.TRUE).b()).d(ImmutableMap.g().b(str2, Boolean.TRUE).b(str14, Boolean.TRUE).b()).a();
        k = Policy.builder().a(DecorationPolicy.builder().a(a2).a(HeaderPolicy.builder().a(ImmutableMap.b(str, Boolean.TRUE)).a()).a()).a();
        ImmutableMap b4 = ImmutableMap.g().b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b(str11, Boolean.TRUE).b();
        ImmutableMap b5 = ImmutableMap.b(str2, Boolean.TRUE);
        ListPolicy a3 = ListPolicy.builder().a(b4).b(ImmutableMap.f()).c(b5).d(b5).a();
        l = Policy.builder().a(DecorationPolicy.builder().a(a3).a(HeaderPolicy.builder().a(ImmutableMap.b(str, Boolean.TRUE)).a()).a()).a();
        String str26 = "picture";
        String str27 = "published";
        String str28 = "formatListType";
        String str29 = "canReportAnnotationAbuse";
        String str30 = "syncProgress";
        String str31 = "hasExplicitContent";
        String str32 = "onlyContainsExplicit";
        String str33 = "containsEpisodes";
        String str34 = "containsTracks";
        String str35 = "containsAudioEpisodes";
        String str36 = "numberOfEpisodes";
        String str37 = "numberOfTracks";
        String str38 = "totalLength";
        String str39 = "ownedBySelf";
        String str40 = "addTime";
        String str41 = "collaborative";
        String str42 = "loaded";
        String str43 = "lastModification";
        ImmutableMap b6 = ImmutableMap.g().b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b("followed", Boolean.TRUE).b(str13, Boolean.TRUE).b(str26, Boolean.TRUE).b(str27, Boolean.TRUE).b(str16, Boolean.TRUE).b(str12, Boolean.TRUE).b(str28, Boolean.TRUE).b(str29, Boolean.TRUE).b(str10, Boolean.TRUE).b(str30, Boolean.TRUE).b(str31, Boolean.TRUE).b(str32, Boolean.TRUE).b(str33, Boolean.TRUE).b(str34, Boolean.TRUE).b(str35, Boolean.TRUE).b(str36, Boolean.TRUE).b(str37, Boolean.TRUE).b(str38, Boolean.TRUE).b(str39, Boolean.TRUE).b(str40, Boolean.TRUE).b(str41, Boolean.TRUE).b(str42, Boolean.TRUE).b(str43, Boolean.TRUE).b();
        String str44 = "thumbnail";
        ImmutableMap b7 = ImmutableMap.g().b(str2, Boolean.TRUE).b(str25, Boolean.TRUE).b("image", Boolean.TRUE).b(str44, Boolean.TRUE).b(str, Boolean.TRUE).b();
        m = Policy.builder().a(DecorationPolicy.builder().a(ListPolicy.builder().a(ImmutableMap.f()).b(ImmutableMap.f()).c(ImmutableMap.f()).e(ImmutableMap.f()).d(ImmutableMap.f()).a()).a(HeaderPolicy.builder().a(b6).b(b7).c(ImmutableMap.g().b(str2, Boolean.TRUE).b(str25, Boolean.TRUE).b()).a()).a()).a();
    }

    public oqc(vje vje, String str, jwo jwo, hfp hfp, hdz hdz, omp omp, PlaylistDataSourceConfiguration playlistDataSourceConfiguration) {
        this.b = str;
        this.d = jwo;
        this.e = playlistDataSourceConfiguration;
        this.f = hfp;
        this.c = vje;
        this.g = hdz;
        this.h = omp;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(PlayOptions playOptions, PlayOrigin playOrigin, Map map, defpackage.vje.a aVar) {
        return this.c.a(this.b, aVar, playOptions, playOrigin, map);
    }

    private Observable<oqf> a(Policy policy, a aVar) {
        return this.c.b(this.b, a(aVar).o().a(Optional.b(policy)).a()).c((Function<? super T, ? extends R>) new $$Lambda$oqc$vWz0muLyzauhjGubxpspHKXIKw<Object,Object>(this, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(opy opy) {
        return this.d.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) new $$Lambda$oqc$4El_UtoxE6KztQNOCByFFjqeW2I<Object,Object>(this, opy));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ a a(opy opy, Boolean bool) {
        return new a().a(this.e.g()).a(bool.booleanValue()).a(opy).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ oqg a(ho hoVar, Integer num) {
        vld vld = (vld) fbp.a(hoVar.a);
        a aVar = (a) fbp.a(hoVar.b);
        defpackage.oqg.a a2 = new a().a(vld.a());
        int unrangedLength = vld.getUnrangedLength();
        Optional g2 = this.e.g();
        if (g2.b()) {
            unrangedLength = Math.min(unrangedLength, ((Integer) g2.c()).intValue());
        }
        defpackage.oqg.a a3 = a2.d(unrangedLength).a(num.intValue()).a(vld.j()).b(vld.b()).a(vld.d());
        boolean z = true;
        defpackage.oqg.a d2 = a3.b(vld.e() && !vld.f()).d(vld.g());
        if (!vld.f() || vld.e()) {
            z = false;
        }
        return d2.c(z).b(vld.h()).c(vld.i()).a(aVar.c()).a();
    }

    /* access modifiers changed from: private */
    public defpackage.vje.a a(a aVar) {
        opy c2 = aVar.c();
        Optional a2 = aVar.a();
        PlaylistDataSourceConfiguration playlistDataSourceConfiguration = this.e;
        return defpackage.vje.a.t().a((String) c2.a().a("")).b(c2.b()).f(playlistDataSourceConfiguration.e()).d(playlistDataSourceConfiguration.f()).j(a2).a(playlistDataSourceConfiguration.c()).b(playlistDataSourceConfiguration.b()).g(Optional.b(playlistDataSourceConfiguration.d().a(Boolean.valueOf(aVar.b())))).h(Optional.b(Boolean.valueOf(playlistDataSourceConfiguration.a()))).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(opy opy, opy opy2) {
        Optional a2 = opy.a();
        Optional a3 = opy2.a();
        boolean z = (!a2.b() || !a3.b()) ? a2.b() == a3.b() : ((String) a2.c()).equals(a3.c());
        if (!z) {
            return false;
        }
        Optional b2 = opy.b();
        Optional b3 = opy2.b();
        boolean z2 = (!b2.b() || !b3.b()) ? b2.b() == b3.b() : ((way) b2.c()).equals((way) b3.c());
        return z2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ a b(a aVar) {
        return aVar.d().a(this.e.h() ? aVar.a() : Optional.e()).a(aVar.c().c().a(this.e.i() ? aVar.c().a() : Optional.e()).a()).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ oqf b(a aVar, vld vld) {
        ArrayList a2 = Lists.a((E[]) vld.getItems());
        return oqf.e().a((List<vle>) a2).a(this.e.b() ? Optional.b(vld.k()) : Optional.e()).a(a2.size()).a(aVar.c()).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource c(a aVar) {
        return this.c.b(this.b, a(aVar).o().i(vkg.a(0, 0)).a(Optional.b(m)).a()).c((Function<? super T, ? extends R>) new $$Lambda$oqc$jqQfL_D1hmSqHQBGn7ZHjzV7AMc<Object,Object>(aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource d(a aVar) {
        int i2 = AnonymousClass1.a[this.e.k().ordinal()];
        if (i2 == 1) {
            return Observable.a((ObservableSource<? extends T1>) this.g.a(this.b).a(a(aVar).o().b(false).a(Optional.b(k)).a(), this.h.a.a(Functions.a())), (ObservableSource<? extends T2>) this.e.b() ? this.c.b(this.b, defpackage.vje.a.t().i(vkg.a(0, 0)).b(true).a(Optional.b(j)).a()).c((Function<? super T, ? extends R>) $$Lambda$oqc$FeAg5qSith_Mj7IuMeUX9CoQyA.INSTANCE) : Observable.b(Optional.e()), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$oqc$fVKBBKvRRHO_dVWgmKXVhFOKQO0<Object,Object,Object>(aVar));
        } else if (i2 == 2) {
            return a(k, aVar);
        } else {
            if (i2 == 3) {
                return a(l, aVar);
            }
            StringBuilder sb = new StringBuilder("Unknown/Unsupported DecorationPolicy");
            sb.append(this.e.k());
            return Observable.a(new Throwable(sb.toString()));
        }
    }

    private void e() {
        if (this.i.j() == null) {
            Optional e2 = Optional.e();
            if (this.e.j()) {
                e2 = Optional.b(this.f.a(this.b, a, vkb.i));
            }
            this.i.onNext(opy.f().b(e2).a());
        }
    }

    private Observable<a> f() {
        if (this.q == null) {
            this.q = this.i.a(n).h(new $$Lambda$oqc$OZnCPUfdJdYomBQQNJhweChg1A(this)).a(1).a();
        }
        return this.q;
    }

    public final Completable a(PlayOptions playOptions, PlayOrigin playOrigin, Map<String, String> map) {
        return d().e(new $$Lambda$oqc$XvAOKvp43gVqiRa2mqfJp_bVx5Y(this, playOptions, playOrigin, map));
    }

    public final void a() {
        e();
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            opy opy = (opy) bundle.getParcelable(oqb.class.getName());
            if (opy != null) {
                this.i.onNext(opy);
            }
        }
        e();
    }

    public final void a(Optional<way> optional) {
        opy opy = (opy) this.i.j();
        Assertion.a((Object) opy, "Trying to set sort order \"%s\" too early.", optional);
        if (this.e.j()) {
            this.f.a(this.b, (way) optional.a(a));
        }
        this.i.onNext(opy.c().b(optional).a());
    }

    public final Observable<oqf> b() {
        if (this.o == null) {
            this.o = f().h(new $$Lambda$oqc$BfOculxqpK13s_Yk1wALW1LZWPI(this)).a(1).a();
        }
        return this.o;
    }

    public final void b(Bundle bundle) {
        opy opy = (opy) this.i.j();
        if (opy != null) {
            bundle.putParcelable(oqb.class.getName(), opy);
        }
    }

    public final void b(Optional<String> optional) {
        opy opy = (opy) this.i.j();
        Assertion.a((Object) opy, "Trying to set text filter \"%s\" too early.", optional);
        this.i.onNext(opy.c().a(optional).a());
    }

    public final Observable<oqg> c() {
        if (this.p == null) {
            this.p = Observable.a((ObservableSource<? extends T1>) f().h(new $$Lambda$oqc$TN7Qbem8p_JBkxWCACFeC39yi3Q(this)), (ObservableSource<? extends T2>) this.c.b(this.b, defpackage.vje.a.t().a(Optional.b(Policy.builder().a(DecorationPolicy.builder().a(HeaderPolicy.builder().a(ImmutableMap.b("followers", Boolean.TRUE)).c(ImmutableMap.f()).b(ImmutableMap.f()).a()).a(ListPolicy.builder().e(ImmutableMap.f()).b(ImmutableMap.f()).c(ImmutableMap.f()).d(ImmutableMap.f()).a(ImmutableMap.f()).a()).a()).a())).i(vkg.a(0, 0)).a()).c((Function<? super T, ? extends R>) $$Lambda$G3QlOpTqasmN1FIG_taYKsULTKA.INSTANCE), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$oqc$D64MQ0cAkGDOBy5z9h69yT5lhM<Object,Object,Object>(this)).a(1).a();
        }
        return this.p;
    }

    public final Single<defpackage.vje.a> d() {
        return f().a(0).f(new $$Lambda$oqc$Crqcy5Gp78gV0hNhfUvxT6jY4M(this)).f(new $$Lambda$oqc$wjLC8MdltRW1DQPSgrbS4Y7tpno(this));
    }
}
