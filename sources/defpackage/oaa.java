package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: oaa reason: default package */
public final class oaa implements tyk {
    private ImageView a;
    private TextView b;
    private TextView c;
    private Button d;
    private final a e;

    /* renamed from: oaa$a */
    public interface a {
        void a();

        void b();
    }

    oaa(a aVar) {
        this.e = aVar;
    }

    public final View getSlateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.partner_account_linking_fragment_view, viewGroup, false);
        this.a = (ImageView) inflate.findViewById(R.id.connect_image);
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.c = (TextView) inflate.findViewById(R.id.subtitle);
        this.d = (Button) inflate.findViewById(R.id.link_button);
        this.d.setOnClickListener(new $$Lambda$oaa$C_WdlCB_iAemhAHKHDvLSUbjQiY(this));
        return inflate;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.e.b();
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        ((ImageView) fay.a(this.a)).setImageDrawable(this.a.getResources().getDrawable(R.drawable.connect_success));
        ((TextView) fay.a(this.b)).setText(R.string.account_linking_success_title);
        ((TextView) fay.a(this.c)).setText(R.string.account_linking_success_subtitle);
        ((Button) fay.a(this.d)).setText(R.string.account_linking_got_it);
        ((Button) fay.a(this.d)).setOnClickListener(new $$Lambda$oaa$rxLypFlcDG_eRuHSlmWcmqYHqT8(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.e.a();
    }

    public final void b() {
        ((ImageView) fay.a(this.a)).setImageDrawable(this.a.getResources().getDrawable(R.drawable.connect_fail));
        ((TextView) fay.a(this.b)).setText(R.string.account_linking_error_title);
        ((TextView) fay.a(this.c)).setText(R.string.account_linking_error_subtitle);
        ((Button) fay.a(this.d)).setText(R.string.account_linking_got_it);
        ((Button) fay.a(this.d)).setOnClickListener(new $$Lambda$oaa$1HK35TXfGFfUQi6bQrkufyEAPz4(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.e.a();
    }
}
