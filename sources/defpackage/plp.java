package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayTrackQueueUtils;
import com.spotify.music.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: plp reason: default package */
public final class plp extends iqv<pml> {
    final pmf a;
    public final Map<String, Boolean> b = new HashMap();
    public boolean c;
    private final pmb d;
    private final pmd e;

    public final /* synthetic */ void b(u uVar, Object obj, int i) {
        pml pml = (pml) obj;
        final png png = (png) uVar;
        PlayerTrack playerTrack = pml.a;
        png.b.setText(jvs.a(playerTrack, "title"));
        png.c.setText(PlayerTrackUtil.getArtists(playerTrack));
        jxb.a(png.c.getContext(), png.c, PlayerTrackUtil.isExplicit(playerTrack));
        png.c(this.c && PlayerTrackUtil.isExplicit(playerTrack));
        if (pml.e || !jvs.a(playerTrack, "availability_restrictions").isEmpty()) {
            uuu.b(png.b.getContext(), png.b, R.attr.pasteTextAppearanceMuted);
            uuu.b(png.c.getContext(), png.c, R.attr.pasteTextAppearanceSecondaryMuted);
            png.o.setEnabled(false);
            png.o.setClickable(false);
            png.d(false);
        } else {
            png.o.setOnClickListener(new $$Lambda$plp$koZUUejdNWqnNRXONUfAyKMpZk(this, playerTrack));
            png.a.setOnCheckedChangeListener(new $$Lambda$plp$dtkiZzxoGuVrA8IvKq0s9IbPVbw(this, playerTrack, pml));
            png.o.setEnabled(true);
            png.o.setClickable(true);
            png.d(true);
            uuu.b(png.b.getContext(), png.b, R.attr.pasteTextAppearance);
            uuu.b(png.c.getContext(), png.c, R.attr.pasteTextAppearanceSecondary);
        }
        png.a.setChecked(((Boolean) jtc.a(this.b.get(PlayTrackQueueUtils.getGloballyUniqueUid(playerTrack)), Boolean.FALSE)).booleanValue());
        if (pml.d) {
            png.d.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        plp.this.a.onStartDrag(png);
                    }
                    return true;
                }
            });
            png.a(true);
            return;
        }
        png.a(false);
    }

    public plp(pmb pmb, pmf pmf, pmd pmd) {
        this.d = (pmb) fay.a(pmb);
        this.a = (pmf) fay.a(pmf);
        this.e = (pmd) fay.a(pmd);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerTrack playerTrack, View view) {
        this.e.a(playerTrack);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerTrack playerTrack, pml pml, CompoundButton compoundButton, boolean z) {
        this.b.put(PlayTrackQueueUtils.getGloballyUniqueUid(playerTrack), Boolean.valueOf(z));
        this.d.a(pml, z);
    }

    public final u a(ViewGroup viewGroup) {
        return new png(viewGroup.getContext(), viewGroup);
    }
}
