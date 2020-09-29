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

/* renamed from: kpw reason: default package */
public class kpw extends jsy {
    kpx b;
    private ImageView c;
    private TextView d;
    private TextView e;

    public kpw(SnackBar snackBar) {
        super(snackBar, R.layout.layout_active_session_banner, kpw.class.getSimpleName());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        kpx kpx = (kpx) fbp.a(this.b);
        if (kpx.f) {
            kpx.c.a(kpx.d, UserIntent.DISMISS, null);
            kpx.a(false);
            kpx.e.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        kpx kpx = (kpx) fbp.a(this.b);
        if (kpx.f) {
            kpx.c.a(kpx.d, UserIntent.GOTO_PARTNER_APP, kpx.d().a);
            kpx.a(false);
            kpx.a.a(kpx.d());
        }
    }

    public final void a(ViewGroup viewGroup) {
        int i = 0;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_active_session_banner, viewGroup, false);
        Context context = viewGroup.getContext();
        if (gau.b(context)) {
            i = gau.a(context.getResources());
        }
        if (i != 0) {
            LayoutParams layoutParams = (LayoutParams) inflate.getLayoutParams();
            layoutParams.topMargin += i;
            inflate.setLayoutParams(layoutParams);
        }
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.banner_close_button);
        imageButton.setImageDrawable(new SpotifyIconDrawable(viewGroup.getContext(), SpotifyIconV2.X, viewGroup.getContext().getResources().getDimension(R.dimen.banner_img_size)));
        inflate.setOnClickListener(new $$Lambda$kpw$CH_Ua8TApYDuqR3PUlspiwwnWUE(this));
        imageButton.setOnClickListener(new $$Lambda$kpw$BhVmilsVbM0lQZX5mbe2wnTxlvc(this));
        this.c = (ImageView) inflate.findViewById(R.id.banner_icon);
        this.d = (TextView) inflate.findViewById(R.id.banner_title);
        this.e = (TextView) inflate.findViewById(R.id.banner_subtitle);
        viewGroup.addView(inflate);
    }

    /* access modifiers changed from: 0000 */
    public final void a(kpy kpy) {
        ((TextView) fbp.a(this.d)).setText(kpy.a());
        ((ImageView) fbp.a(this.c)).setImageDrawable(kpy.c());
        TextView textView = (TextView) fbp.a(this.e);
        if (!TextUtils.isEmpty(kpy.b())) {
            textView.setVisibility(0);
            textView.setText(kpy.b());
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
}
