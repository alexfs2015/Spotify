package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.music.R;
import com.spotify.music.features.placebobanner.models.PlaceboBannerControl;
import com.spotify.music.features.placebobanner.models.PlaceboBannerView;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import java.util.List;

/* renamed from: jqq reason: default package */
public class jqq extends jqn implements odd {
    /* access modifiers changed from: private */
    public a b;
    private ViewGroup c;
    private TextView d;
    private TextView e;
    private Button f;

    public jqq(SnackBar snackBar) {
        super(snackBar, 0, jqq.class.getSimpleName());
    }

    public final void a(ViewGroup viewGroup) {
        this.c = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.placebo_banner_one_button, viewGroup, false);
        this.d = (TextView) this.c.findViewById(R.id.tvTitle_placeboBannerOneButton);
        this.e = (TextView) this.c.findViewById(R.id.tvDescription_placeboBannerOneButton);
        this.f = (Button) this.c.findViewById(R.id.btnCta_placeboBannerOneButton);
        SpotifyIconView spotifyIconView = (SpotifyIconView) this.c.findViewById(R.id.ivClose_placeboBannerOneButton);
        int a = jqt.a(viewGroup.getContext());
        if (a != 0) {
            ViewGroup viewGroup2 = this.c;
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), this.c.getPaddingTop() + a, this.c.getPaddingRight(), this.c.getPaddingBottom());
        }
        this.f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (jqq.this.b != null) {
                    jqq.this.b.a();
                }
            }
        });
        spotifyIconView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (jqq.this.b != null) {
                    jqq.this.b.b();
                }
            }
        });
        viewGroup.addView(this.c);
    }

    public final void a(a aVar) {
        this.b = aVar;
    }

    public final void a(PlaceboBannerView placeboBannerView, int i) {
        if (this.c != null) {
            List controls = placeboBannerView.controls();
            if (controls != null && controls.size() == 1) {
                this.d.setText(placeboBannerView.title());
                this.e.setText(placeboBannerView.description());
                this.f.setText(((PlaceboBannerControl) controls.get(0)).text());
                this.c.setBackgroundColor(i);
            }
        }
    }
}
