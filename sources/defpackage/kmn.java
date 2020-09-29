package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.mobile.android.ui.view.snackbar.SnackItem.Priority;
import com.spotify.mobile.android.ui.view.snackbar.SnackItem.Type;
import com.spotify.music.R;
import com.spotify.music.activesessionbanner.ActiveSessionBannerLogger.UserIntent;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: kmn reason: default package */
public class kmn extends jqn {
    kmo b;
    private ImageView c;
    private TextView d;
    private TextView e;

    public kmn(SnackBar snackBar) {
        super(snackBar, R.layout.layout_active_session_banner, kmn.class.getSimpleName());
    }

    public final void a(ViewGroup viewGroup) {
        int i = 0;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_active_session_banner, viewGroup, false);
        Context context = viewGroup.getContext();
        if (gaa.b(context)) {
            i = gaa.a(context.getResources());
        }
        if (i != 0) {
            LayoutParams layoutParams = (LayoutParams) inflate.getLayoutParams();
            layoutParams.topMargin += i;
            inflate.setLayoutParams(layoutParams);
        }
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.banner_close_button);
        imageButton.setImageDrawable(new SpotifyIconDrawable(viewGroup.getContext(), SpotifyIconV2.X, viewGroup.getContext().getResources().getDimension(R.dimen.banner_img_size)));
        inflate.setOnClickListener(new $$Lambda$kmn$SkMOc3zWuuVrcvbfBZuOyfOAEDc(this));
        imageButton.setOnClickListener(new $$Lambda$kmn$yYb1nCi8snUO5_8kYzaJInAd098(this));
        this.c = (ImageView) inflate.findViewById(R.id.banner_icon);
        this.d = (TextView) inflate.findViewById(R.id.banner_title);
        this.e = (TextView) inflate.findViewById(R.id.banner_subtitle);
        viewGroup.addView(inflate);
    }

    /* access modifiers changed from: 0000 */
    public final void a(kmp kmp) {
        ((TextView) fay.a(this.d)).setText(kmp.a());
        ((ImageView) fay.a(this.c)).setImageDrawable(kmp.c());
        TextView textView = (TextView) fay.a(this.e);
        if (!TextUtils.isEmpty(kmp.b())) {
            textView.setVisibility(0);
            textView.setText(kmp.b());
            return;
        }
        textView.setVisibility(8);
    }

    public final Priority c() {
        return Priority.HIGH;
    }

    public final Type d() {
        return Type.NAVIGATION;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        kmo kmo = (kmo) fay.a(this.b);
        if (kmo.f) {
            kmo.c.a(kmo.d, UserIntent.DISMISS, null);
            kmo.a(false);
            kmo.e.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        kmo kmo = (kmo) fay.a(this.b);
        if (kmo.f) {
            kmo.c.a(kmo.d, UserIntent.GOTO_PARTNER_APP, kmo.d().a);
            kmo.a(false);
            kmo.a.a(kmo.d());
        }
    }
}
