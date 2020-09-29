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

/* renamed from: jtc reason: default package */
public final class jtc extends jsy implements okm {
    a b;
    private ViewGroup c;
    private TextView d;
    private TextView e;
    private Button f;
    private Button g;

    public jtc(SnackBar snackBar) {
        super(snackBar, 0, jtb.class.getSimpleName());
    }

    public final void a(ViewGroup viewGroup) {
        this.c = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.placebo_banner_two_buttons, viewGroup, false);
        this.d = (TextView) this.c.findViewById(R.id.tvTitle_placeboBannerTwoButtons);
        this.e = (TextView) this.c.findViewById(R.id.tvDescription_placeboBannerTwoButtons);
        this.f = (Button) this.c.findViewById(R.id.btnCtaLeft_placeboBannerTwoButtons);
        this.g = (Button) this.c.findViewById(R.id.btnCtaRight_placeboBannerTwoButtons);
        SpotifyIconView spotifyIconView = (SpotifyIconView) this.c.findViewById(R.id.ivClose_placeboBannerTwoButtons);
        int a = jte.a(viewGroup.getContext());
        if (a != 0) {
            ViewGroup viewGroup2 = this.c;
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), this.c.getPaddingTop() + a, this.c.getPaddingRight(), this.c.getPaddingBottom());
        }
        this.f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (jtc.this.b != null) {
                    jtc.this.b.a();
                }
            }
        });
        this.g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (jtc.this.b != null) {
                    jtc.this.b.b();
                }
            }
        });
        spotifyIconView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (jtc.this.b != null) {
                    jtc.this.b.c();
                }
            }
        });
        viewGroup.addView(this.c);
    }

    public final void a(PlaceboBannerView placeboBannerView, int i) {
        List controls = placeboBannerView.controls();
        if (controls != null && controls.size() == 2 && this.c != null) {
            this.d.setText(placeboBannerView.title());
            this.e.setText(placeboBannerView.description());
            this.f.setText(((PlaceboBannerControl) controls.get(0)).text());
            this.g.setText(((PlaceboBannerControl) controls.get(1)).text());
            this.c.setBackgroundColor(i);
        }
    }

    public final void a(a aVar) {
        this.b = aVar;
    }
}
