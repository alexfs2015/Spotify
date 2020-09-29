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

/* renamed from: iua reason: default package */
final class iua extends sxz<iuk> {
    final PlayerTrack a;
    private final OnClickListener d;
    private final iud e;

    public final /* synthetic */ void a(u uVar, int i) {
        ((iuk) uVar).a(f(i));
    }

    iua(Context context, OnClickListener onClickListener, iud iud) {
        this.e = (iud) fay.a(iud);
        this.d = (OnClickListener) fay.a(onClickListener);
        HashMap hashMap = new HashMap(2);
        hashMap.put("title", context.getString(R.string.placeholders_loading));
        hashMap.put("artist_name", context.getString(R.string.placeholders_loading));
        this.a = PlayerTrack.create("", hashMap);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        MiniPlayerPageView miniPlayerPageView = (MiniPlayerPageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.player_preview_item_new, viewGroup, false);
        miniPlayerPageView.setOnClickListener(this.d);
        return new iuk(miniPlayerPageView, this.e);
    }
}
