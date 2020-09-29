package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$oeh$8ZEx58PkvdAI2BDeUGwjgh4Jn60 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$oeh$8ZEx58PkvdAI2BDeUGwjgh4Jn60 implements Predicate {
    public static final /* synthetic */ $$Lambda$oeh$8ZEx58PkvdAI2BDeUGwjgh4Jn60 INSTANCE = new $$Lambda$oeh$8ZEx58PkvdAI2BDeUGwjgh4Jn60();

    private /* synthetic */ $$Lambda$oeh$8ZEx58PkvdAI2BDeUGwjgh4Jn60() {
    }

    public final boolean test(Object obj) {
        return ((PlayerState) obj).track().b();
    }
}
