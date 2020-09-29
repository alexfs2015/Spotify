package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kpu$sC8V2FcVv9XxS6h79ywTc7xQoXo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kpu$sC8V2FcVv9XxS6h79ywTc7xQoXo implements Function {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ $$Lambda$kpu$sC8V2FcVv9XxS6h79ywTc7xQoXo(Context context) {
        this.f$0 = context;
    }

    public final Object apply(Object obj) {
        return ImmutableList.a(fbx.a((Iterable<E>) ((RecentlyPlayedItems) obj).items).a((faz<? super E>) $$Lambda$1giVtGMmJy4GOWvpLVZzpDYRR0.INSTANCE).a((faz<? super E>) new $$Lambda$kpu$OUuR2QvhmXPaLwYRV9amg094NE<Object>(this.f$0)).a((com.google.common.base.Function<? super E, T>) new $$Lambda$kpu$lU8XPlsJ2A1eYwrmwkyEABin_qs<Object,T>(this.f$0)).a());
    }
}
