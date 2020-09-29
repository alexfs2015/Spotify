package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.google.common.collect.ImmutableList;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.ByteArrayConverters;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.ProtoJavaliteConverters;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.StringConverters;

/* renamed from: glc reason: default package */
public final class glc implements vua<Cosmonaut> {
    private final wlc<rnf> a;

    private glc(wlc<rnf> wlc) {
        this.a = wlc;
    }

    public static glc a(wlc<rnf> wlc) {
        return new glc(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Cosmonaut) vuf.a(new Cosmonaut(ImmutableList.g().c(new ByteArrayConverters()).c(new StringConverters()).c(new ProtoJavaliteConverters()).c(new gkx(((rnf) this.a.get()).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(Include.NON_NULL).a())).a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
