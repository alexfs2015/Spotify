package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.google.common.collect.ImmutableList;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.ByteArrayConverters;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.ProtoJavaliteConverters;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.StringConverters;

/* renamed from: gmq reason: default package */
public final class gmq implements wig<Cosmonaut> {
    private final wzi<rwl> a;

    private gmq(wzi<rwl> wzi) {
        this.a = wzi;
    }

    public static gmq a(wzi<rwl> wzi) {
        return new gmq(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Cosmonaut) wil.a(new Cosmonaut(ImmutableList.g().c(new ByteArrayConverters()).c(new StringConverters()).c(new ProtoJavaliteConverters()).c(new gml(((rwl) this.a.get()).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(Include.NON_NULL).a())).a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
