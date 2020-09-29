package defpackage;

import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.music.features.findfriends.legacy.model.FindFriendsModel;

/* renamed from: mpi reason: default package */
public final class mpi {
    private final FireAndForgetResolver a;

    public mpi(FireAndForgetResolver fireAndForgetResolver) {
        this.a = fireAndForgetResolver;
    }

    public final void a(JsonCallbackReceiver<FindFriendsModel> jsonCallbackReceiver) {
        this.a.resolve(RequestBuilder.get("hm://follow-suggestions-view/v1/editorial/people").build(), jsonCallbackReceiver);
    }
}
