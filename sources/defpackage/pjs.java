package defpackage;

import com.spotify.music.features.profile.domain.ProfileModel;
import com.spotify.music.features.profile.domain.ProfileModel.LoadingState;

/* renamed from: pjs reason: default package */
public final class pjs {
    public static kjn<ProfileModel, pjq> a(ProfileModel profileModel) {
        return kjn.a(profileModel);
    }

    public static kjx<ProfileModel, pjq> a(ProfileModel profileModel, pjr pjr) {
        return (kjx) pjr.a(new $$Lambda$pjs$uGzaJ2PTsfaHecFWxmupm2470rA(profileModel), new $$Lambda$pjs$h1o6HCgOeLyXHyQzNLP3pw0BuA(profileModel), new $$Lambda$pjs$r73xA0HEapRMjwiz1EgkfYOOkqo(profileModel), new $$Lambda$pjs$bOXJE_GAUYuwFCyt8dVNjWrspvQ(profileModel));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ProfileModel profileModel, a aVar) {
        if (aVar.a && profileModel.k() != LoadingState.LOADED && profileModel.k() != LoadingState.LOADING) {
            return kjx.a(profileModel.a(LoadingState.LOADING), kjk.a(new a(profileModel.b())));
        } else if (aVar.a || profileModel.k() == LoadingState.LOADED) {
            return kjx.e();
        } else {
            return kjx.b(profileModel.a(LoadingState.OFFLINE));
        }
    }
}
