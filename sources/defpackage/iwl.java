package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.miniplayer.view.MiniPlayerPageView;
import com.spotify.music.R;
import java.util.HashMap;

/* renamed from: iwl reason: default package */
final class iwl extends tig<iwv> {
    final PlayerTrack a;
    private final OnClickListener d;
    private final iwo e;
    private final gto f;
    private final fqn g;

    iwl(Context context, OnClickListener onClickListener, iwo iwo, gto gto, fqn fqn) {
        this.e = (iwo) fbp.a(iwo);
        this.d = (OnClickListener) fbp.a(onClickListener);
        HashMap hashMap = new HashMap(2);
        hashMap.put("title", context.getString(R.string.placeholders_loading));
        hashMap.put("artist_name", context.getString(R.string.placeholders_loading));
        this.a = PlayerTrack.create("", hashMap);
        this.f = gto;
        this.g = fqn;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        MiniPlayerPageView miniPlayerPageView = (MiniPlayerPageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.player_preview_item_new, viewGroup, false);
        miniPlayerPageView.setOnClickListener(this.d);
        miniPlayerPageView.d = this.f;
        miniPlayerPageView.e = this.g;
        return new iwv(miniPlayerPageView, this.e);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((iwv) uVar).a(f(i));
    }
}
