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

/* renamed from: pul reason: default package */
public final class pul extends iti<pvh> {
    final pvb a;
    public final Map<String, Boolean> b = new HashMap();
    public boolean c;
    private final pux d;
    private final puz e;

    public pul(pux pux, pvb pvb, puz puz) {
        this.d = (pux) fbp.a(pux);
        this.a = (pvb) fbp.a(pvb);
        this.e = (puz) fbp.a(puz);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerTrack playerTrack, View view) {
        this.e.a(playerTrack);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerTrack playerTrack, pvh pvh, CompoundButton compoundButton, boolean z) {
        this.b.put(PlayTrackQueueUtils.getGloballyUniqueUid(playerTrack), Boolean.valueOf(z));
        this.d.a(pvh, z);
    }

    public final u a(ViewGroup viewGroup) {
        return new pwc(viewGroup.getContext(), viewGroup);
    }

    public final /* synthetic */ void b(u uVar, Object obj, int i) {
        pvh pvh = (pvh) obj;
        final pwc pwc = (pwc) uVar;
        PlayerTrack playerTrack = pvh.a;
        pwc.b.setText(jya.a(playerTrack, "title"));
        pwc.c.setText(PlayerTrackUtil.getArtists(playerTrack));
        jzb.a(pwc.c.getContext(), pwc.c, PlayerTrackUtil.isExplicit(playerTrack));
        pwc.c(this.c && PlayerTrackUtil.isExplicit(playerTrack));
        if (pvh.e || !jya.a(playerTrack, "availability_restrictions").isEmpty()) {
            vgl.b(pwc.b.getContext(), pwc.b, R.attr.pasteTextAppearanceMuted);
            vgl.b(pwc.c.getContext(), pwc.c, R.attr.pasteTextAppearanceSecondaryMuted);
            pwc.o.setEnabled(false);
            pwc.o.setClickable(false);
            pwc.d(false);
        } else {
            pwc.o.setOnClickListener(new $$Lambda$pul$vdFJQIxPlp5cIjeYq_V7brGK2kg(this, playerTrack));
            pwc.a.setOnCheckedChangeListener(new $$Lambda$pul$uAih77AxQUyxIkORAxsfUH8vjNU(this, playerTrack, pvh));
            pwc.o.setEnabled(true);
            pwc.o.setClickable(true);
            pwc.d(true);
            vgl.b(pwc.b.getContext(), pwc.b, R.attr.pasteTextAppearance);
            vgl.b(pwc.c.getContext(), pwc.c, R.attr.pasteTextAppearanceSecondary);
        }
        pwc.a.setChecked(((Boolean) jvi.a(this.b.get(PlayTrackQueueUtils.getGloballyUniqueUid(playerTrack)), Boolean.FALSE)).booleanValue());
        if (pvh.d) {
            pwc.d.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        pul.this.a.onStartDrag(pwc);
                    }
                    return true;
                }
            });
            pwc.a(true);
            return;
        }
        pwc.a(false);
    }
}
