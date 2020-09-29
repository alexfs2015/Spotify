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

/* renamed from: uxn reason: default package */
public class uxn extends jrd implements jqx, uxr {
    private TextView T;
    private TextView U;
    private TextView V;
    private TextView W;
    private TextView X;
    private SpotifyIconView Y;
    /* access modifiers changed from: private */
    public vgs Z;
    public uxq a;
    private wgx aa;
    private float ab;
    private AccelerateInterpolator ac;
    private Handler ad;
    public Picasso b;

    public static uxn a(fqn fqn) {
        uxn uxn = new uxn();
        fqo.a((Fragment) uxn, fqn);
        return uxn;
    }

    private void a(TextView textView, String str) {
        if (!textView.getText().equals(str)) {
            ip.n(textView).a(0.0f).a(200).a((Runnable) new $$Lambda$uxn$XNIXj6BCoU5eoMBRp7iukPWFzJE(this, textView, str)).c();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        uxq uxq = this.a;
        uxq.i.a(uxq.k.a, ViewUris.bV.toString(), ViewUris.bU.toString(), "mic_button", 0, InteractionIntent.PREVIOUS, InteractionType.TAP);
        uxq.f.a(VoiceInteractionViewState.INTERACTION, uxq.g, null, uxq.h);
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

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.a();
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
        this.Z = new vgs();
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.image_album);
        imageView.setImageDrawable(this.Z);
        imageView.setOnClickListener(new $$Lambda$uxn$4iAjBy7wvx6ZHUvAA_gXpv4NC34(this));
        ImageButton imageButton = (ImageButton) viewGroup2.findViewById(R.id.microphone);
        ip.a((View) imageButton, uxm.a((Context) fbp.a(n())));
        imageButton.setOnClickListener(new $$Lambda$uxn$QxNLLrBVUZEIemIciR79Pvcwc6w(this));
        this.ad = new Handler();
        this.aa = new wgx() {
            public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                fbp.a(!bitmap.isRecycled());
                if (uxn.this.w()) {
                    uxn.this.Z.a((Drawable) new BitmapDrawable(uxn.this.o().getResources(), bitmap), true);
                }
                fbp.a(!bitmap.isRecycled());
            }

            public final void a(Drawable drawable) {
                Logger.e("Failed to load image.", new Object[0]);
            }

            public final void b(Drawable drawable) {
            }
        };
        return viewGroup2;
    }

    public final void a(SpotifyIconV2 spotifyIconV2, int i, boolean z) {
        this.Y.animate().cancel();
        this.Y.setVisibility(0);
        this.Y.setScaleX(1.0f);
        this.Y.setScaleY(1.0f);
        this.Y.setAlpha(1.0f);
        this.Y.setTranslationY(0.0f);
        Context context = (Context) fbp.a(n());
        if (z) {
            this.Y.a(fr.c(context, R.color.gray_inactive));
        } else {
            this.Y.a(fr.c(context, R.color.white));
        }
        this.Y.a(spotifyIconV2);
        this.Y.setContentDescription(context.getString(i));
        ip.n(this.Y).a(0.0f).c(0.9f).d(0.9f).b(this.ab).a((Interpolator) this.ac).b(2000).a(300).a((Runnable) new $$Lambda$uxn$6qXan6zKY2AYroS36NV6839W_b0(this));
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

    public final void aP_() {
        super.aP_();
        uxq uxq = this.a;
        uxq.a = this;
        rly rly = uxq.c;
        String str = PageIdentifiers.VOICERECOGNITION_LISTENINGOVERLAY.mPageIdentifier;
        StringBuilder sb = new StringBuilder();
        sb.append(ViewUris.bV.toString());
        sb.append(':');
        sb.append(uxq.d.name().toLowerCase(Locale.getDefault()));
        rly.a(str, sb.toString());
        uxq.i.a(uxq.k.a, ViewUris.bV.toString(), ViewUris.bV.toString(), "voice-now-playing-screen", 0, "page");
        jva jva = uxq.e != null ? uxq.e.b : null;
        Logger.b("NLU executing intent=%s, link=%s, title=%s", uxq.d, jva, uxq.e != null ? uxq.e.c : "");
        uxq.c();
        if (jva == null || jva.b == LinkType.DUMMY) {
            switch (AnonymousClass1.a[uxq.d.ordinal()]) {
                case 1:
                case 2:
                    uxq.j.e();
                    uxq.a.a(SpotifyIconV2.PLAY, R.string.voice_confirmation_play_content_description, false);
                    break;
                case 3:
                    uxq.a.a(SpotifyIconV2.SHUFFLE, R.string.voice_confirmation_shuffle_off_content_description, true);
                    break;
                case 4:
                    uxq.j.e();
                    uxq.a.a(SpotifyIconV2.SHUFFLE, R.string.voice_confirmation_shuffle_on_content_description, false);
                    break;
                case 5:
                    uxq.j.f();
                    uxq.a.a(SpotifyIconV2.PAUSE, R.string.voice_confirmation_pause_content_description, false);
                    break;
                case 6:
                    uxq.j.c();
                    uxq.a.a(SpotifyIconV2.SKIP_FORWARD, R.string.voice_confirmation_skip_forward_content_description, false);
                    break;
                case 7:
                    uxq.j.d();
                    uxq.a.a(SpotifyIconV2.SKIP_BACK, R.string.voice_confirmation_skip_backward_content_description, false);
                    break;
                case 8:
                    uxq.a.a(SpotifyIconV2.REPEAT, R.string.voice_confirmation_repeat_on_content_description, false);
                    break;
                case 9:
                    uxq.a.a(SpotifyIconV2.REPEAT, R.string.voice_confirmation_repeat_off_content_description, true);
                    break;
                case 10:
                    uxq.a.a(SpotifyIconV2.REPEATONCE, R.string.voice_confirmation_repeat_once_content_description, false);
                    break;
                case 11:
                    uxq.a.a(SpotifyIconV2.VOLUME, R.string.voice_confirmation_vol_up_content_description, false);
                    break;
                case 12:
                    uxq.a.a(SpotifyIconV2.VOLUME_ONEWAVE, R.string.voice_confirmation_vol_down_content_description, false);
                    break;
                default:
                    Logger.d("Unsupported intent %s", uxq.d.name());
                    uxq.f.a(VoiceInteractionViewState.DID_NOT_UNDERSTAND, uxq.g, null, uxq.h);
                    break;
            }
        }
        uxq.b();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.VOICERECOGNITION_LISTENINGOVERLAY, null);
    }

    public final uqm ag() {
        return uqo.bg;
    }

    public final void aw_() {
        super.aw_();
        this.ad.removeCallbacksAndMessages(null);
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(String str) {
        this.b.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(this.aa);
    }

    public final void b(String str, String str2) {
        a(this.V, str2);
        a(this.W, str);
    }

    public final void c(String str) {
        a(this.X, a((int) R.string.voice_vav_dynamic_suggestion, str));
    }

    public final void d(int i) {
        a(this.X, a(i));
    }

    public final String e() {
        return "voice-interaction-assistant-fragment";
    }

    public final void h() {
        super.h();
        this.a.b.a();
    }
}
