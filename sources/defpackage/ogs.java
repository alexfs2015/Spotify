package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: ogs reason: default package */
public final class ogs implements ulf {
    private ImageView a;
    private TextView b;
    private TextView c;
    private Button d;
    private final a e;

    /* renamed from: ogs$a */
    public interface a {
        void a();

        void b();
    }

    ogs(a aVar) {
        this.e = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.e.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.e.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.e.b();
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        ((ImageView) fbp.a(this.a)).setImageDrawable(this.a.getResources().getDrawable(R.drawable.connect_success));
        ((TextView) fbp.a(this.b)).setText(R.string.account_linking_success_title);
        ((TextView) fbp.a(this.c)).setText(R.string.account_linking_success_subtitle);
        ((Button) fbp.a(this.d)).setText(R.string.account_linking_got_it);
        ((Button) fbp.a(this.d)).setOnClickListener(new $$Lambda$ogs$S4emYsy0jDMOoR_dUIVzDsVLTbY(this));
    }

    public final void b() {
        ((ImageView) fbp.a(this.a)).setImageDrawable(this.a.getResources().getDrawable(R.drawable.connect_fail));
        ((TextView) fbp.a(this.b)).setText(R.string.account_linking_error_title);
        ((TextView) fbp.a(this.c)).setText(R.string.account_linking_error_subtitle);
        ((Button) fbp.a(this.d)).setText(R.string.account_linking_got_it);
        ((Button) fbp.a(this.d)).setOnClickListener(new $$Lambda$ogs$mqtOIzET_8ThSocSBAXWrPc68(this));
    }

    public final View getSlateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.partner_account_linking_fragment_view, viewGroup, false);
        this.a = (ImageView) inflate.findViewById(R.id.connect_image);
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.c = (TextView) inflate.findViewById(R.id.subtitle);
        this.d = (Button) inflate.findViewById(R.id.link_button);
        this.d.setOnClickListener(new $$Lambda$ogs$koGraJkMgC4UJBAAki4nH2LixZY(this));
        return inflate;
    }
}
