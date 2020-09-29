package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;

/* renamed from: naq reason: default package */
public final class naq implements vua<Policy> {
    private static final naq a = new naq();

    public static naq a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        ListPolicy listPolicy = new ListPolicy();
        String str = "inCollection";
        listPolicy.setListAttributes(ImmutableMap.g().b("link", Boolean.TRUE).b(str, Boolean.TRUE).b());
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        return (Policy) vuf.a(new Policy(decorationPolicy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
