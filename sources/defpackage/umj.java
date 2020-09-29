package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.util.Locale;

/* renamed from: umj reason: default package */
public class umj extends jor implements jol, umn {
    private TextView T;
    private TextView U;
    private TextView V;
    private TextView W;
    private TextView X;
    private SpotifyIconView Y;
    /* access modifiers changed from: private */
    public uvb Z;
    public umm a;
    private vsr aa;
    private float ab;
    private AccelerateInterpolator ac;
    private Handler ad;
    public Picasso b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "voice-interaction-assistant-fragment";
    }

    public final void a(String str, String str2) {
        if (n() != null) {
            if (str != null) {
                a(this.U, str);
            } else {
                a(this.U, (String) null);
            }
            a(this.T, str2);
        }
    }

    public final void b(String str, String str2) {
        a(this.V, str2);
        a(this.W, str);
    }

    public final void b(String str) {
        this.b.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(this.aa);
    }

    public final void d(int i) {
        a(this.X, a(i));
    }

    public final void a(SpotifyIconV2 spotifyIconV2, int i, boolean z) {
        this.Y.animate().cancel();
        this.Y.setVisibility(0);
        this.Y.setScaleX(1.0f);
        this.Y.setScaleY(1.0f);
        this.Y.setAlpha(1.0f);
        this.Y.setTranslationY(0.0f);
        Context context = (Context) fay.a(n());
        if (z) {
            this.Y.a(fr.c(context, R.color.gray_inactive));
        } else {
            this.Y.a(fr.c(context, R.color.white));
        }
        this.Y.a(spotifyIconV2);
        this.Y.setContentDescription(context.getString(i));
        ip.n(this.Y).a(0.0f).c(0.9f).d(0.9f).b(this.ab).a((Interpolator) this.ac).b(2000).a(300).a((Runnable) new $$Lambda$umj$gTF7T58xnMfM6BsP0t8p5PlXtn4(this));
    }

    public final void c(String str) {
        a(this.X, a((int) R.string.voice_vav_dynamic_suggestion, str));
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.VOICERECOGNITION_LISTENINGOVERLAY, null);
    }

    public final udr ag() {
        return udt.bg;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_voice_assistant, viewGroup, false);
        this.ac = new AccelerateInterpolator(2.0f);
        this.ab = o().getResources().getDimension(R.dimen.animation_displacement_y);
        this.T = (TextView) viewGroup2.findViewById(R.id.text_header);
        this.U = (TextView) viewGroup2.findViewById(R.id.text_header_small);
        this.V = (TextView) viewGroup2.findViewById(R.id.text_track);
        this.W = (TextView) viewGroup2.findViewById(R.id.text_artist);
        this.X = (TextView) viewGroup2.findViewById(R.id.text_suggestion);
        this.Y = (SpotifyIconView) viewGroup2.findViewById(R.id.image_player_state);
        this.Z = new uvb();
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.image_album);
        imageView.setImageDrawable(this.Z);
        imageView.setOnClickListener(new $$Lambda$umj$mTSrJd0MX_ipIVL7Pc4dvba2p0Y(this));
        ImageButton imageButton = (ImageButton) viewGroup2.findViewById(R.id.microphone);
        ip.a((View) imageButton, umi.a((Context) fay.a(n())));
        imageButton.setOnClickListener(new $$Lambda$umj$fFjZJoj_gJgXrqVjcUlQUlTGME(this));
        this.ad = new Handler();
        this.aa = new vsr() {
            public final void b(Drawable drawable) {
            }

            public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                fay.a(!bitmap.isRecycled());
                if (umj.this.w()) {
                    umj.this.Z.a((Drawable) new BitmapDrawable(umj.this.o().getResources(), bitmap), true);
                }
                fay.a(!bitmap.isRecycled());
            }

            public final void a(Drawable drawable) {
                Logger.e("Failed to load image.", new Object[0]);
            }
        };
        return viewGroup2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        umm umm = this.a;
        umm.i.a(umm.k.a, ViewUris.bW.toString(), ViewUris.bV.toString(), "mic_button", 0, InteractionIntent.PREVIOUS, InteractionType.TAP);
        umm.f.a(VoiceInteractionViewState.INTERACTION, umm.g, null, umm.h);
    }

    public final void g() {
        jst jst;
        String str;
        super.g();
        umm umm = this.a;
        umm.a = this;
        rda rda = umm.c;
        String str2 = PageIdentifiers.VOICERECOGNITION_LISTENINGOVERLAY.mPageIdentifier;
        StringBuilder sb = new StringBuilder();
        sb.append(ViewUris.bW.toString());
        sb.append(':');
        sb.append(umm.d.name().toLowerCase(Locale.getDefault()));
        rda.a(str2, sb.toString());
        umm.i.a(umm.k.a, ViewUris.bW.toString(), ViewUris.bW.toString(), "voice-now-playing-screen", 0, "page");
        if (umm.e != null) {
            jst = umm.e.b;
        } else {
            jst = null;
        }
        if (umm.e != null) {
            str = umm.e.c;
        } else {
            str = "";
        }
        Logger.b("NLU executing intent=%s, link=%s, title=%s", umm.d, jst, str);
        umm.c();
        if (jst == null || jst.b == LinkType.DUMMY) {
            switch (AnonymousClass1.a[umm.d.ordinal()]) {
                case 1:
                case 2:
                    umm.j.e();
                    umm.a.a(SpotifyIconV2.PLAY, R.string.voice_confirmation_play_content_description, false);
                    break;
                case 3:
                    umm.a.a(SpotifyIconV2.SHUFFLE, R.string.voice_confirmation_shuffle_off_content_description, true);
                    break;
                case 4:
                    umm.j.e();
                    umm.a.a(SpotifyIconV2.SHUFFLE, R.string.voice_confirmation_shuffle_on_content_description, false);
                    break;
                case 5:
                    umm.j.f();
                    umm.a.a(SpotifyIconV2.PAUSE, R.string.voice_confirmation_pause_content_description, false);
                    break;
                case 6:
                    umm.j.c();
                    umm.a.a(SpotifyIconV2.SKIP_FORWARD, R.string.voice_confirmation_skip_forward_content_description, false);
                    break;
                case 7:
                    umm.j.d();
                    umm.a.a(SpotifyIconV2.SKIP_BACK, R.string.voice_confirmation_skip_backward_content_description, false);
                    break;
                case 8:
                    umm.a.a(SpotifyIconV2.REPEAT, R.string.voice_confirmation_repeat_on_content_description, false);
                    break;
                case 9:
                    umm.a.a(SpotifyIconV2.REPEAT, R.string.voice_confirmation_repeat_off_content_description, true);
                    break;
                case 10:
                    umm.a.a(SpotifyIconV2.REPEATONCE, R.string.voice_confirmation_repeat_once_content_description, false);
                    break;
                case 11:
                    umm.a.a(SpotifyIconV2.VOLUME, R.string.voice_confirmation_vol_up_content_description, false);
                    break;
                case 12:
                    umm.a.a(SpotifyIconV2.VOLUME_ONEWAVE, R.string.voice_confirmation_vol_down_content_description, false);
                    break;
                default:
                    Logger.d("Unsupported intent %s", umm.d.name());
                    umm.f.a(VoiceInteractionViewState.DID_NOT_UNDERSTAND, umm.g, null, umm.h);
                    break;
            }
        }
        umm.b();
    }

    public final void h() {
        super.h();
        this.a.b.a();
    }

    public final void ax_() {
        super.ax_();
        this.ad.removeCallbacksAndMessages(null);
    }

    public static umj a(fpt fpt) {
        umj umj = new umj();
        fpu.a((Fragment) umj, fpt);
        return umj;
    }

    private void a(TextView textView, String str) {
        if (!textView.getText().equals(str)) {
            ip.n(textView).a(0.0f).a(200).a((Runnable) new $$Lambda$umj$eGOONp3Y6cUF32uYbCN_jQvbSME(this, textView, str)).c();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(TextView textView, String str) {
        textView.setText(str);
        ip.n(textView).a(1.0f).a(200).c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.Y.setVisibility(8);
    }
}
