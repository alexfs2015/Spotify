package defpackage;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState;
import com.spotify.music.nowplaying.drivingmode.view.micbutton.DrivingMicButton;
import com.spotify.music.nowplaying.drivingmode.view.voicebottomsheet.DrivingVoiceBottomSheetView;
import com.spotify.music.nowplaying.drivingmode.view.voiceinputanimation.VoiceInputAnimationView;
import com.spotify.music.nowplaying.drivingmode.view.voiceview.DrivingVoiceView;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.util.Collections;

/* renamed from: teo reason: default package */
public class teo extends jor implements a, tga, tgb, a, udv {
    public tfq T;
    public Picasso U;
    public MediaPlayer V;
    private View W;
    public tej a;
    public tei b;

    /* renamed from: teo$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.teo.AnonymousClass1.<clinit>():void");
        }
    }

    public final void e() {
    }

    public static teo a(fpt fpt) {
        teo teo = new teo();
        fpu.a((Fragment) teo, fpt);
        return teo;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.a(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_driving_voice_search, viewGroup, false);
        DrivingVoiceView drivingVoiceView = (DrivingVoiceView) inflate.findViewById(R.id.driving_voice_view);
        drivingVoiceView.b = this;
        drivingVoiceView.c.a = this.U;
        this.W = inflate.findViewById(R.id.driving_voice_view_background);
        DrivingVoiceBottomSheetView drivingVoiceBottomSheetView = (DrivingVoiceBottomSheetView) inflate.findViewById(R.id.driving_voice_bottom_sheet_view);
        tfq tfq = this.T;
        drivingVoiceBottomSheetView.d = tfq;
        tfq.a = drivingVoiceBottomSheetView;
        tfq.b = this;
        tfq.c = this;
        tfq.a.b();
        tfq.c.a(0.0f);
        DrivingMicButton drivingMicButton = (DrivingMicButton) inflate.findViewById(R.id.driving_mic_button);
        VoiceInputAnimationView voiceInputAnimationView = (VoiceInputAnimationView) inflate.findViewById(R.id.driving_voice_input_animation_view);
        tej tej = this.a;
        tej.b = drivingVoiceView;
        tej.c = drivingMicButton;
        tej.d = this;
        tej.e = voiceInputAnimationView;
        tej.c.a((a) tej);
        drivingVoiceView.a(this.b);
        this.V.setOnCompletionListener(new $$Lambda$teo$AWKO337l0LjguSbBU7IDQCCEWo(this));
        return inflate;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            tej tej = this.a;
            int i = defpackage.tej.AnonymousClass1.a[tej.i.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    tej.d();
                }
            } else if (jsu.b(jst.a(tej.g.uri()))) {
                new ioo(tej.h, "@").a(new Builder().build(), new PlayOrigin(udt.Q.toString(), "", ViewUris.x.toString(), null), Collections.emptyMap());
            } else {
                tej.a.play(tej.g, null);
            }
        }
    }

    public final void z() {
        super.z();
        this.a.a();
    }

    public final udr ag() {
        return udt.Q;
    }

    public final gjf aj() {
        return PageIdentifiers.NOWPLAYING;
    }

    public final void ax_() {
        super.ax_();
        tej tej = this.a;
        tej.f.bf_();
        tej.d();
        MediaPlayer mediaPlayer = this.V;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.V = null;
        }
    }

    public final void af() {
        q().i().c();
    }

    public final void a(DrivingVoiceState drivingVoiceState) {
        if (this.V != null) {
            int i = AnonymousClass1.a[drivingVoiceState.ordinal()];
            int i2 = i != 1 ? i != 2 ? R.raw.driving_voice_error : R.raw.driving_voice_success : R.raw.driving_voice_listening;
            if (n() != null) {
                Resources resources = n().getResources();
                Uri build = new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(i2)).appendPath(resources.getResourceTypeName(i2)).appendPath(resources.getResourceEntryName(i2)).build();
                try {
                    this.V.reset();
                    this.V.setDataSource(n(), build);
                    this.V.prepare();
                } catch (IOException e) {
                    Logger.e(e, "Error while playing audio", new Object[0]);
                }
            }
            this.V.start();
        }
    }

    public final void a(float f) {
        this.W.setAlpha(f);
    }
}
