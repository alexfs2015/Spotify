package defpackage;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState;
import com.spotify.music.nowplaying.drivingmode.view.micbutton.DrivingMicButton;
import com.spotify.music.nowplaying.drivingmode.view.progressxbutton.DrivingProgressXButton;
import com.spotify.music.nowplaying.drivingmode.view.voicebottomsheet.DrivingVoiceBottomSheetView;
import com.spotify.music.nowplaying.drivingmode.view.voiceinputanimation.VoiceInputAnimationView;
import com.spotify.music.nowplaying.drivingmode.view.voiceview.DrivingVoiceView;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.util.Collections;

/* renamed from: toy reason: default package */
public class toy extends jrd implements OnKeyListener, a, tqr, tqt, a, uqq {
    public tqh T;
    public tpz U;
    public Picasso V;
    public MediaPlayer W;
    private View X;
    private DrivingProgressXButton Y;
    public tot a;
    public tos b;

    /* renamed from: toy$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[DrivingVoiceState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState[] r0 = com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState r1 = com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState.LISTENING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState r1 = com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.toy.AnonymousClass1.<clinit>():void");
        }
    }

    public static toy a(fqn fqn) {
        toy toy = new toy();
        fqo.a((Fragment) toy, fqn);
        return toy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            tot tot = this.a;
            int i = defpackage.tot.AnonymousClass1.a[tot.j.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    tot.e();
                }
            } else if (jvb.b(jva.a(tot.h.uri()))) {
                new irb(tot.i, "@").a(new Builder().build(), new PlayOrigin(uqo.Q.toString(), "", ViewUris.w.toString(), null), Collections.emptyMap());
            } else {
                ((Player) tot.a.get()).play(tot.h, null);
            }
        }
    }

    public final void A() {
        if (this.H != null) {
            this.H.setOnKeyListener(null);
        }
        super.A();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.a(layoutInflater, viewGroup, bundle);
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.fragment_driving_voice, viewGroup, false);
        DrivingVoiceView drivingVoiceView = (DrivingVoiceView) inflate.findViewById(R.id.driving_voice_view);
        drivingVoiceView.b = this;
        drivingVoiceView.c.a = this.V;
        DrivingVoiceBottomSheetView drivingVoiceBottomSheetView = (DrivingVoiceBottomSheetView) inflate.findViewById(R.id.driving_voice_bottom_sheet_view);
        this.X = inflate.findViewById(R.id.driving_voice_view_background);
        this.Y = (DrivingProgressXButton) inflate.findViewById(R.id.driving_progress_x_button);
        tqh tqh = this.T;
        drivingVoiceBottomSheetView.d = tqh;
        tqh.b = drivingVoiceBottomSheetView;
        tqh.c = this;
        tqh.d = this;
        tqh.b.b();
        tqh.d.a(0.0f);
        tpz tpz = this.U;
        tpz.e = this.Y;
        tpz.d = drivingVoiceBottomSheetView;
        tpz.e.a((a) tpz);
        tpz.b.a((a<T>) tpz);
        PlayerState lastPlayerState = ((Player) tpz.c.get()).getLastPlayerState();
        tpz.g = lastPlayerState != null && !lastPlayerState.isPaused();
        DrivingMicButton drivingMicButton = (DrivingMicButton) inflate.findViewById(R.id.driving_mic_button);
        VoiceInputAnimationView voiceInputAnimationView = (VoiceInputAnimationView) inflate.findViewById(R.id.driving_voice_input_animation_view);
        inflate.setFocusableInTouchMode(true);
        inflate.requestFocus();
        tot tot = this.a;
        tot.b = drivingVoiceView;
        tot.c = drivingMicButton;
        tot.d = this;
        tot.e = voiceInputAnimationView;
        tot.c.a((a) tot);
        PlayerState lastPlayerState2 = ((Player) tot.a.get()).getLastPlayerState();
        if (lastPlayerState2 != null && !lastPlayerState2.isPaused()) {
            z = true;
        }
        tot.g = z;
        tot.f();
        drivingVoiceView.a(this.b);
        this.W.setOnCompletionListener(new $$Lambda$toy$LEhGev5aH9n_oV9voFNbC1qZk(this));
        return inflate;
    }

    public final void a(float f) {
        View view = this.X;
        if (view != null) {
            view.setAlpha(f);
        }
        DrivingProgressXButton drivingProgressXButton = this.Y;
        if (drivingProgressXButton != null) {
            drivingProgressXButton.setAlpha(f);
        }
    }

    public final void a(DrivingVoiceState drivingVoiceState) {
        if (this.W != null) {
            int i = AnonymousClass1.a[drivingVoiceState.ordinal()];
            int i2 = i != 1 ? i != 2 ? R.raw.driving_voice_error : R.raw.driving_voice_success : R.raw.driving_voice_listening;
            if (n() != null) {
                Resources resources = n().getResources();
                Uri build = new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(i2)).appendPath(resources.getResourceTypeName(i2)).appendPath(resources.getResourceEntryName(i2)).build();
                try {
                    this.W.reset();
                    this.W.setDataSource(n(), build);
                    this.W.prepare();
                } catch (IOException e) {
                    Logger.e(e, "Error while playing audio", new Object[0]);
                }
            }
            this.W.start();
        }
        tpz tpz = this.U;
        tpz.f = drivingVoiceState;
        if (tpz.f == DrivingVoiceState.LISTENING) {
            tpz.a.c();
            tpz.e.a();
        } else if (tpz.f != DrivingVoiceState.ERROR || tpz.g) {
            tpz.h = true;
        } else {
            tpz.a();
        }
    }

    public final uqm ag() {
        return uqo.Q;
    }

    public final gkq aj() {
        return PageIdentifiers.NOWPLAYING;
    }

    public final void aw_() {
        super.aw_();
        this.U.a.c();
        tot tot = this.a;
        tot.f.bd_();
        tot.e();
        MediaPlayer mediaPlayer = this.W;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.W = null;
        }
    }

    public final void c() {
        q().i().c();
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (4 == keyEvent.getKeyCode() && keyEvent.getAction() == 1) {
            this.T.a.d();
        }
        return false;
    }

    public final void z() {
        super.z();
        if (this.H != null) {
            this.H.setOnKeyListener(this);
        }
        this.a.a();
    }
}
