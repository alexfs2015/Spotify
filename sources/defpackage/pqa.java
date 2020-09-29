package defpackage;

import android.content.Context;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.user.ProfileListModel;
import com.spotify.mobile.android.spotlets.user.ProfileModel;
import com.spotify.music.R;
import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.model.ProfileListItem;
import io.reactivex.Observable;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: pqa reason: default package */
public final class pqa implements pqi {
    private final String a;
    private final pqz b;
    private final Context c;

    public pqa(String str, pqz pqz, Context context) {
        this.a = str;
        this.b = pqz;
        this.c = context;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ProfileListItem a(ProfileModel profileModel) {
        return pql.a((ProfileModel) fbp.a(profileModel), this.c);
    }

    /* access modifiers changed from: private */
    public prg a(ProfileListModel profileListModel) {
        return prg.f().a(LoadingState.LOADED).a(ImmutableList.a(fdd.a((Iterable<F>) profileListModel.getProfiles() != null ? Arrays.asList(profileListModel.getProfiles()) : Collections.emptyList(), (Function<? super F, ? extends T>) new $$Lambda$pqa$YkDEFVyjx2YCsmljUlXQL6Dk9y4<Object,Object>(this)))).a();
    }

    public final String a() {
        return this.c.getResources().getString(R.string.profile_list_followers_title);
    }

    public final Observable<prg> b() {
        return this.b.b(this.a).f(new $$Lambda$pqa$5JeiS74NcOOVWXiWUrRNQWOghZo(this)).d();
    }
}
