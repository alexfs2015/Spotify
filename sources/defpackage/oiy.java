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

/* renamed from: oiy reason: default package */
final class oiy implements oiw {
    private static final Policy j = Policy.builder().a(DecorationPolicy.builder().a(HeaderPolicy.builder().a(ImmutableMap.f()).b(ImmutableMap.f()).c(ImmutableMap.f()).a()).a()).a();
    private static final Policy k;
    private static final Policy l;
    private static final Policy m;
    private static final BiPredicate<oiu, oiu> n = $$Lambda$oiy$SayR6t0kQ0qNCfIwTiBzKYPCgZ4.INSTANCE;
    private final String b;
    private final uxc c;
    private final jug d;
    private final PlaylistDataSourceConfiguration e;
    private final hct f;
    private final hbg g;
    private final ofl h;
    private final BehaviorSubject<oiu> i = BehaviorSubject.a();
    private Observable<ojb> o;
    private Observable<ojc> p;
    private Observable<a> q;

    /* renamed from: oiy$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.oiy.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: oiy$a */
    public static abstract class a {

        /* renamed from: oiy$a$a reason: collision with other inner class name */
        public interface C0065a {
            C0065a a(Optional<Integer> optional);

            C0065a a(oiu oiu);

            C0065a a(boolean z);

            a a();
        }

        public abstract Optional<Integer> a();

        public abstract boolean b();

        public abstract oiu c();

        public abstract C0065a d();
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
        String str26 = "followed";
        String str27 = "picture";
        String str28 = "published";
        String str29 = "formatListType";
        String str30 = "canReportAnnotationAbuse";
        String str31 = "syncProgress";
        String str32 = "hasExplicitContent";
        String str33 = "onlyContainsExplicit";
        String str34 = "containsEpisodes";
        String str35 = "containsTracks";
        String str36 = "containsAudioEpisodes";
        String str37 = "numberOfEpisodes";
        String str38 = "numberOfTracks";
        String str39 = "totalLength";
        String str40 = "ownedBySelf";
        String str41 = "addTime";
        String str42 = "collaborative";
        String str43 = "loaded";
        String str44 = "lastModification";
        ImmutableMap b6 = ImmutableMap.g().b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b("followers", Boolean.TRUE).b(str26, Boolean.TRUE).b(str13, Boolean.TRUE).b(str27, Boolean.TRUE).b(str28, Boolean.TRUE).b(str16, Boolean.TRUE).b(str12, Boolean.TRUE).b(str29, Boolean.TRUE).b(str30, Boolean.TRUE).b(str10, Boolean.TRUE).b(str31, Boolean.TRUE).b(str32, Boolean.TRUE).b(str33, Boolean.TRUE).b(str34, Boolean.TRUE).b(str35, Boolean.TRUE).b(str36, Boolean.TRUE).b(str37, Boolean.TRUE).b(str38, Boolean.TRUE).b(str39, Boolean.TRUE).b(str40, Boolean.TRUE).b(str41, Boolean.TRUE).b(str42, Boolean.TRUE).b(str43, Boolean.TRUE).b(str44, Boolean.TRUE).b();
        String str45 = "thumbnail";
        ImmutableMap b7 = ImmutableMap.g().b(str2, Boolean.TRUE).b(str25, Boolean.TRUE).b("image", Boolean.TRUE).b(str45, Boolean.TRUE).b(str, Boolean.TRUE).b();
        m = Policy.builder().a(DecorationPolicy.builder().a(ListPolicy.builder().a(ImmutableMap.f()).b(ImmutableMap.f()).c(ImmutableMap.f()).e(ImmutableMap.f()).d(ImmutableMap.f()).a()).a(HeaderPolicy.builder().a(b6).b(b7).c(ImmutableMap.g().b(str2, Boolean.TRUE).b(str25, Boolean.TRUE).b()).a()).a()).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(oiu oiu, oiu oiu2) {
        Optional a2 = oiu.a();
        Optional a3 = oiu2.a();
        boolean z = (!a2.b() || !a3.b()) ? a2.b() == a3.b() : ((String) a2.c()).equals(a3.c());
        if (!z) {
            return false;
        }
        Optional b2 = oiu.b();
        Optional b3 = oiu2.b();
        boolean z2 = (!b2.b() || !b3.b()) ? b2.b() == b3.b() : ((vns) b2.c()).equals((vns) b3.c());
        return z2;
    }

    public oiy(uxc uxc, String str, jug jug, hct hct, hbg hbg, ofl ofl, PlaylistDataSourceConfiguration playlistDataSourceConfiguration) {
        this.b = str;
        this.d = jug;
        this.e = playlistDataSourceConfiguration;
        this.f = hct;
        this.c = uxc;
        this.g = hbg;
        this.h = ofl;
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            oiu oiu = (oiu) bundle.getParcelable(oix.class.getName());
            if (oiu != null) {
                this.i.onNext(oiu);
            }
        }
        e();
    }

    public final void a() {
        e();
    }

    public final void b(Bundle bundle) {
        oiu oiu = (oiu) this.i.j();
        if (oiu != null) {
            bundle.putParcelable(oix.class.getName(), oiu);
        }
    }

    private void e() {
        if (this.i.j() == null) {
            Optional e2 = Optional.e();
            if (this.e.j()) {
                e2 = Optional.b(this.f.a(this.b, a, uxz.i));
            }
            this.i.onNext(oiu.f().b(e2).a());
        }
    }

    public final void a(Optional<vns> optional) {
        oiu oiu = (oiu) this.i.j();
        Assertion.a((Object) oiu, "Trying to set sort order \"%s\" too early.", optional);
        if (this.e.j()) {
            this.f.a(this.b, (vns) optional.a(a));
        }
        this.i.onNext(oiu.c().b(optional).a());
    }

    public final void b(Optional<String> optional) {
        oiu oiu = (oiu) this.i.j();
        Assertion.a((Object) oiu, "Trying to set text filter \"%s\" too early.", optional);
        this.i.onNext(oiu.c().a(optional).a());
    }

    public final Observable<ojb> b() {
        if (this.o == null) {
            this.o = f().h(new $$Lambda$oiy$0MBB6TH7dzsWeZ4JoVWTmUk5k(this)).a(1).a();
        }
        return this.o;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource d(a aVar) {
        Observable observable;
        int i2 = AnonymousClass1.a[this.e.k().ordinal()];
        if (i2 == 1) {
            defpackage.uxc.a a2 = defpackage.uxc.a.t().i(uyd.a(0, 0)).b(true).a(Optional.b(j)).a();
            if (this.e.b()) {
                observable = this.c.b(this.b, a2).c((Function<? super T, ? extends R>) $$Lambda$oiy$kcEnNztMAvq80HDOjTs0Q0syI.INSTANCE);
            } else {
                observable = Observable.b(Optional.e());
            }
            return Observable.a((ObservableSource<? extends T1>) this.g.a(this.b).a(b(aVar).o().b(false).a(Optional.b(k)).a(), this.h.a.a(Functions.a())), (ObservableSource<? extends T2>) observable, (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$oiy$2zlndWnBJEwmnhTB5Q2UZ875_xg<Object,Object,Object>(aVar));
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

    private Observable<ojb> a(Policy policy, a aVar) {
        return this.c.b(this.b, b(aVar).o().a(Optional.b(policy)).a()).c((Function<? super T, ? extends R>) new $$Lambda$oiy$aEJQkirwjFHtR2mqNApqsQ8TQY<Object,Object>(this, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ojb b(a aVar, uza uza) {
        Optional optional;
        ArrayList a2 = Lists.a((E[]) uza.getItems());
        List k2 = uza.k();
        defpackage.ojb.a a3 = ojb.e().a((List<uzb>) a2);
        if (this.e.b()) {
            optional = Optional.b(k2);
        } else {
            optional = Optional.e();
        }
        return a3.a(optional).a(a2.size()).a(aVar.c()).a();
    }

    public final Observable<ojc> c() {
        if (this.p == null) {
            this.p = f().h(new $$Lambda$oiy$8qg8aY2RrZsD8lYMeMEMIy3dr7s(this)).a(1).a();
        }
        return this.p;
    }

    /* access modifiers changed from: private */
    public Observable<ojc> a(a aVar) {
        return this.c.b(this.b, b(aVar).o().i(uyd.a(0, 0)).a(Optional.b(m)).a()).c((Function<? super T, ? extends R>) new $$Lambda$oiy$CiE_kfhMWJEaiDoHXJWbZ5ouw4<Object,Object>(this, aVar));
    }

    public final Completable a(PlayOptions playOptions, PlayOrigin playOrigin, Map<String, String> map) {
        return d().e(new $$Lambda$oiy$6g2KwZ2nxxWwFdU5XAhdW64RP4A(this, playOptions, playOrigin, map));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(PlayOptions playOptions, PlayOrigin playOrigin, Map map, defpackage.uxc.a aVar) {
        return this.c.a(this.b, aVar, playOptions, playOrigin, map);
    }

    public final Single<defpackage.uxc.a> d() {
        return f().a(0).f(new $$Lambda$oiy$GtUap9cW8CCntfv9SvTwSzGQCk(this)).f(new $$Lambda$oiy$fPUDVTT9eeZT7v508Mkhm4uMP7U(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ a c(a aVar) {
        Optional optional;
        Optional optional2;
        boolean i2 = this.e.i();
        defpackage.oiu.a c2 = aVar.c().c();
        if (i2) {
            optional = aVar.c().a();
        } else {
            optional = Optional.e();
        }
        oiu a2 = c2.a(optional).a();
        boolean h2 = this.e.h();
        C0065a d2 = aVar.d();
        if (h2) {
            optional2 = aVar.a();
        } else {
            optional2 = Optional.e();
        }
        return d2.a(optional2).a(a2).a();
    }

    /* access modifiers changed from: private */
    public defpackage.uxc.a b(a aVar) {
        oiu c2 = aVar.c();
        Optional a2 = aVar.a();
        PlaylistDataSourceConfiguration playlistDataSourceConfiguration = this.e;
        return defpackage.uxc.a.t().a((String) c2.a().a("")).b(c2.b()).f(playlistDataSourceConfiguration.e()).d(playlistDataSourceConfiguration.f()).j(a2).a(playlistDataSourceConfiguration.c()).b(playlistDataSourceConfiguration.b()).g(Optional.b(playlistDataSourceConfiguration.d().a(Boolean.valueOf(aVar.b())))).h(Optional.b(Boolean.valueOf(playlistDataSourceConfiguration.a()))).a();
    }

    private Observable<a> f() {
        if (this.q == null) {
            this.q = this.i.a(n).h(new $$Lambda$oiy$n9ZHWEtt_uUJ18irmQQSIdDSS9o(this)).a(1).a();
        }
        return this.q;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(oiu oiu) {
        return this.d.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) new $$Lambda$oiy$1RS0eADjRsvG_5mq7AxNomMFJI<Object,Object>(this, oiu));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ a a(oiu oiu, Boolean bool) {
        return new a().a(this.e.g()).a(bool.booleanValue()).a(oiu).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ojc a(a aVar, uza uza) {
        defpackage.ojc.a a2 = new a().a(uza.a());
        int unrangedLength = uza.getUnrangedLength();
        Optional g2 = this.e.g();
        if (g2.b()) {
            unrangedLength = Math.min(unrangedLength, ((Integer) g2.c()).intValue());
        }
        boolean z = true;
        defpackage.ojc.a d2 = a2.d(unrangedLength).a(uza.c()).a(uza.j()).b(uza.b()).a(uza.d()).b(uza.e() && !uza.f()).d(uza.g());
        if (!uza.f() || uza.e()) {
            z = false;
        }
        return d2.c(z).b(uza.h()).c(uza.i()).a(aVar.c()).a();
    }
}
