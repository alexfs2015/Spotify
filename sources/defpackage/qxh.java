package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.features.user.model.DecoratedUser;
import com.spotify.music.features.user.model.DecoratedUsers;
import java.util.HashMap;
import java.util.Map;

/* renamed from: qxh reason: default package */
public final class qxh extends jwa<DecoratedUser> {
    private final ObjectMapper b = ((rwl) gih.a(rwl.class)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();

    public qxh(RxResolver rxResolver, Policy policy, xil xil, xil xil2) {
        super(rxResolver, policy, xil, xil2);
    }

    public final String a() {
        return "sp://core-social/unstable/decorate";
    }

    public final Map<String, DecoratedUser> a(byte[] bArr) {
        DecoratedUsers decoratedUsers = (DecoratedUsers) this.b.readValue(bArr, DecoratedUsers.class);
        HashMap hashMap = new HashMap();
        for (DecoratedUser decoratedUser : decoratedUsers.decoratedUsers) {
            hashMap.put(decoratedUser.username, decoratedUser);
        }
        return hashMap;
    }
}
