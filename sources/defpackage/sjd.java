package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;
import java.util.List;

/* renamed from: sjd reason: default package */
final class sjd {
    public static List<Entity> a(List<Entity> list) {
        return ImmutableList.a(fcp.a((Iterable<E>) list).a((fbq<? super E>) $$Lambda$sjd$sr55S4i6ZrzSIOoUEmyf846aFFY.INSTANCE).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Entity entity) {
        return (entity == null || EntityCase.a(entity.d) == EntityCase.ENTITY_NOT_SET) ? false : true;
    }
}
