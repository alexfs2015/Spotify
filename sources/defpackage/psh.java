package defpackage;

import com.spotify.mobile.android.spotlets.user.ProfileV2VolatileModel;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.FollowManager.a;
import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;

/* renamed from: psh reason: default package */
public final class psh {
    private static ObservableTransformer<a, pse> a(pqz pqz, Scheduler scheduler, FollowManager followManager) {
        return new $$Lambda$psh$wArSC8ee4rYtDaFz_iR3PFWTeA4(pqz, scheduler, followManager);
    }

    public static ObservableTransformer<psd, pse> a(pqz pqz, pqw pqw, pqe pqe, pqg pqg, Scheduler scheduler, szp szp, pry pry, FollowManager followManager, hgz hgz, RxWebToken rxWebToken) {
        return kok.a().a(a.class, a(pqz, scheduler, followManager)).a(b.class, (ObservableTransformer<G, E>) new $$Lambda$psh$SYQbl4sGhqyW8w2UpDkiGHHQHDU<G,E>(pqw, scheduler)).a(d.class, (ObservableTransformer<G, E>) new $$Lambda$psh$l_TYMVlPDoPmgT16xwVu_ayRq0<G,E>(pqe)).a(c.class, (ObservableTransformer<G, E>) new $$Lambda$psh$7WKSCtBrkyS_r48JIXF3x3yvqtA<G,E>(pqg)).a(g.class, (Consumer<G>) new $$Lambda$psh$kKHTYRtKsxx_l3L_r5pjrpuCon8<G>(pry), scheduler).a(m.class, (Consumer<G>) new $$Lambda$psh$1bZIm7SNjRSmwni97DBz0knsGq0<G>(followManager)).a(j.class, (Consumer<G>) new $$Lambda$psh$UjhhRBJCcImAxlUtbfpyEGzgWLM<G>(pry)).a(h.class, (Consumer<G>) new $$Lambda$psh$c0YGDJbpQwvdomW1wEPVLq1AcQ<G>(pry)).a(i.class, (Consumer<G>) new $$Lambda$psh$J0g3dG9AMnsA4xpBZhvHDRne5Nw<G>(pry)).a(k.class, (Consumer<G>) new $$Lambda$psh$JFurPlUXhJasppKvvTABcuHF1T8<G>(pry)).a(l.class, (Consumer<G>) new $$Lambda$psh$8_wQeejHGDrEmnC52FTyqjNPcIY<G>(szp)).a(e.class, (ObservableTransformer<G, E>) new $$Lambda$psh$PsWDdtw3eQjkBZ9HOpMEhqgvqI<G,E>(hgz, scheduler)).a(f.class, (ObservableTransformer<G, E>) new $$Lambda$psh$n39FUVh88KMZtJedCfmmf1tqgCk<G,E>(rxWebToken, scheduler)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(FollowManager followManager, ProfileV2VolatileModel profileV2VolatileModel) {
        a aVar = new a(profileV2VolatileModel.uri, profileV2VolatileModel.followersCount, profileV2VolatileModel.followingCount, profileV2VolatileModel.isFollowing, false);
        followManager.a(aVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(pry pry, h hVar) {
        String str = hVar.a;
        StringBuilder sb = new StringBuilder();
        sb.append(jva.b(str).h());
        sb.append(":followers");
        pry.b.a(sb.toString());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(pry pry, i iVar) {
        String str = iVar.a;
        StringBuilder sb = new StringBuilder();
        sb.append(jva.b(str).h());
        sb.append(":following");
        pry.b.a(sb.toString());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(pry pry, j jVar) {
        String str = jVar.a;
        StringBuilder sb = new StringBuilder();
        sb.append(jva.b(str).h());
        sb.append(":playlists");
        pry.b.a(sb.toString());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(pry pry, k kVar) {
        String str = kVar.a;
        StringBuilder sb = new StringBuilder();
        sb.append(jva.b(str).h());
        sb.append(":artists");
        pry.b.a(sb.toString());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pse c(Throwable th) {
        return new c();
    }
}
