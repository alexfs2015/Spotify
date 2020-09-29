package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.nowplaying.core.repeat.RepeatState;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: szj reason: default package */
public final class szj {
    final Context a;
    final Player b;
    private final use c;

    public szj(Context context, Player player, use use) {
        this.a = context;
        this.b = player;
        this.c = use;
    }

    public final a a() {
        return new $$Lambda$szj$L5M2BlZ9GjEqxzWdn06Gje8zKrU(this);
    }

    /* access modifiers changed from: 0000 */
    public ImmutableList<Drawable> a(RepeatState repeatState, PlayerRestrictions playerRestrictions) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(uti.a(repeatState, this.a));
        RepeatState a2 = urv.a(repeatState, playerRestrictions);
        while (a2 != repeatState) {
            arrayList.add(uti.a(a2, this.a));
            a2 = urv.a(a2, playerRestrictions);
        }
        return ImmutableList.a((Collection<? extends E>) arrayList);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fuh fuh) {
        PlayerState playerState = (PlayerState) fay.a(this.b.getLastPlayerState());
        RepeatState a2 = urv.a(playerState);
        RepeatState a3 = urv.a(a2, playerState.restrictions());
        this.c.b(a3);
        if (a2 != a3) {
            this.b.setRepeatingContext(a3.mRepeatContext);
            this.b.setRepeatingTrack(a3.mRepeatTrack);
        }
    }
}
