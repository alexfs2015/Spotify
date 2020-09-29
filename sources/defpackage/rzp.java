package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;
import java.util.List;

/* renamed from: rzp reason: default package */
final class rzp {
    public static List<Entity> a(List<Entity> list) {
        return ImmutableList.a(fbx.a((Iterable<E>) list).a((faz<? super E>) $$Lambda$rzp$1Ax7uiUa7EgqjOGSMafGB9H7tZ8.INSTANCE).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Entity entity) {
        return (entity == null || EntityCase.a(entity.d) == EntityCase.ENTITY_NOT_SET) ? false : true;
    }
}
