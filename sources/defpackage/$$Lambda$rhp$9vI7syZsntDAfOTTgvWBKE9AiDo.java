package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.recsloader.RecsResponse;
import io.reactivex.functions.Function;
import java.util.Collection;

/* renamed from: -$$Lambda$rhp$9vI7syZsntDAfOTTgvWBKE9AiDo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rhp$9vI7syZsntDAfOTTgvWBKE9AiDo implements Function {
    public static final /* synthetic */ $$Lambda$rhp$9vI7syZsntDAfOTTgvWBKE9AiDo INSTANCE = new $$Lambda$rhp$9vI7syZsntDAfOTTgvWBKE9AiDo();

    private /* synthetic */ $$Lambda$rhp$9vI7syZsntDAfOTTgvWBKE9AiDo() {
    }

    public final Object apply(Object obj) {
        return rhm.a(ImmutableList.a((Collection<? extends E>) ((RecsResponse) obj).recommendedTracks()));
    }
}
