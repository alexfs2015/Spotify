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

/* renamed from: tjq reason: default package */
public final class tjq {
    final Context a;
    final Player b;
    private final vdj c;

    public tjq(Context context, Player player, vdj vdj) {
        this.a = context;
        this.b = player;
        this.c = vdj;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fvb fvb) {
        PlayerState playerState = (PlayerState) fbp.a(this.b.getLastPlayerState());
        RepeatState a2 = vda.a(playerState);
        RepeatState a3 = vda.a(a2, playerState.restrictions());
        this.c.b(a3);
        if (a2 != a3) {
            this.b.setRepeatingContext(a3.mRepeatContext);
            this.b.setRepeatingTrack(a3.mRepeatTrack);
        }
    }

    /* access modifiers changed from: 0000 */
    public ImmutableList<Drawable> a(RepeatState repeatState, PlayerRestrictions playerRestrictions) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(ven.a(repeatState, this.a));
        RepeatState a2 = vda.a(repeatState, playerRestrictions);
        while (a2 != repeatState) {
            arrayList.add(ven.a(a2, this.a));
            a2 = vda.a(a2, playerRestrictions);
        }
        return ImmutableList.a((Collection<? extends E>) arrayList);
    }

    public final a a() {
        return new $$Lambda$tjq$qbRhPfdEkn2xdyWkzvZ5rniGLw(this);
    }
}
