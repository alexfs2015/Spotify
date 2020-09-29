package defpackage;

import com.spotify.music.features.profile.domain.ProfileModel;
import com.spotify.music.features.profile.domain.ProfileModel.LoadingState;

/* renamed from: -$$Lambda$pjs$uGzaJ2PTsfaHecFWxmupm2470rA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$pjs$uGzaJ2PTsfaHecFWxmupm2470rA implements gct {
    private final /* synthetic */ ProfileModel f$0;

    public /* synthetic */ $$Lambda$pjs$uGzaJ2PTsfaHecFWxmupm2470rA(ProfileModel profileModel) {
        this.f$0 = profileModel;
    }

    public final Object apply(Object obj) {
        return kjx.b(this.f$0.l().c(((c) obj).a.fullName).d(((c) obj).a.imageUrl).a(((c) obj).a.isVerified).b(((c) obj).a.isFollowing).a(((c) obj).a.playlistCount).b(((c) obj).a.followersCount).c(((c) obj).a.followingCount).a(LoadingState.LOADED).a());
    }
}
