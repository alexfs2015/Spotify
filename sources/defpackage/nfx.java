package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;

/* renamed from: nfx reason: default package */
public final class nfx implements wig<Policy> {
    private static final nfx a = new nfx();

    public static nfx a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        ListPolicy listPolicy = new ListPolicy();
        String str = "inCollection";
        listPolicy.setListAttributes(ImmutableMap.g().b("link", Boolean.TRUE).b(str, Boolean.TRUE).b());
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        return (Policy) wil.a(new Policy(decorationPolicy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
