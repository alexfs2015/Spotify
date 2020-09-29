package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: ohd reason: default package */
public class ohd extends jsy {
    a b;
    TextView c;
    private ViewGroup d;
    private TextView e;
    private Button f;

    /* renamed from: ohd$a */
    public interface a {
        void a();

        void b();
    }

    public ohd(SnackBar snackBar) {
        super(snackBar, 0, ohd.class.getSimpleName());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void a(int i) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public final void a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.d = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_failure_banner, viewGroup, false);
        this.c = (TextView) this.d.findViewById(R.id.tvTitle_paymentFailureBanner);
        this.e = (TextView) this.d.findViewById(R.id.tvDescription_paymentFailureBanner);
        this.f = (Button) this.d.findViewById(R.id.btnCta_paymentFailureBanner);
        SpotifyIconView spotifyIconView = (SpotifyIconView) this.d.findViewById(R.id.ivClose_paymentFailureBanner);
        if (gau.b(context)) {
            int a2 = gau.a(context.getResources());
            ViewGroup viewGroup2 = this.d;
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), this.d.getPaddingTop() + a2, this.d.getPaddingRight(), this.d.getPaddingBottom());
        }
        this.f.setOnClickListener(new $$Lambda$ohd$LUwOkvKRZsOon9VodQ9vGgP5gfY(this));
        spotifyIconView.setOnClickListener(new $$Lambda$ohd$ounSxORH2D5mhoEVrpNB_6KXfVc(this));
        viewGroup.addView(this.d);
    }

    public final void b(int i) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public final void c(int i) {
        Button button = this.f;
        if (button != null) {
            button.setText(i);
        }
    }
}
