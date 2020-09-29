package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.spotify.music.R;
import com.spotify.music.features.quicksilver.preview.views.PreviewSubmissionView;

/* renamed from: pqj reason: default package */
public final class pqj extends FrameLayout implements kjd<pqh, pqf> {
    private ProgressBar a = ((ProgressBar) ip.c((View) this, (int) R.id.progress_circular));
    private Button b = ((Button) ip.c((View) this, (int) R.id.preview_button));
    private PreviewSubmissionView c = ((PreviewSubmissionView) ip.c((View) this, (int) R.id.preview_submission_view));

    public pqj(Context context) {
        super(context);
        inflate(getContext(), R.layout.preview_tool, this);
    }

    public final kje<pqh> connect(final kkn<pqf> kkn) {
        this.b.setOnClickListener(new $$Lambda$pqj$TXSmS5Iga_1NRk9OF5ePcM0huXo(kkn));
        this.c.a(new $$Lambda$pqj$hYyIkqappd3qbrSoZTq3oCct0qw(this, kkn));
        PreviewSubmissionView previewSubmissionView = this.c;
        previewSubmissionView.c.setOnClickListener(new $$Lambda$pqj$8tjVDn6JOWq_YHwSjvocB3XbQsY(kkn));
        return new kje<pqh>() {
            private pqd a;

            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                pqh pqh = (pqh) obj;
                if (!pqh.a().equals(this.a)) {
                    pqh.a().a(new $$Lambda$pqj$1$9x_px6hLErkEYH7J1_OnT4ByMg(this), new $$Lambda$pqj$1$m2dURNsgDoYTzeat_kpmC8wB4Q(this), new $$Lambda$pqj$1$YhKTG_ApGtuTBYzsnmEqTXpkJ6U(this));
                    this.a = pqh.a();
                }
                if (!fax.a(pqh.c())) {
                    Toast.makeText(pqj.this.getContext(), pqh.c(), 1).show();
                    kkn.accept(new b());
                }
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(b bVar) {
                pqj.c(pqj.this);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(c cVar) {
                pqj.b(pqj.this);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(a aVar) {
                pqj.a(pqj.this);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(kkn kkn, View view) {
        String obj = this.c.b.getSelectedItem().toString();
        String str = "Navigation".equals(obj) ? "URI" : "Playback Started".equals(obj) ? "PLAYBACK_STARTED" : "CLIENT_EVENT";
        PreviewSubmissionView previewSubmissionView = this.c;
        kkn.accept(new h(str, previewSubmissionView.a.getText() == null ? null : previewSubmissionView.a.getText().toString()));
    }

    static /* synthetic */ void a(pqj pqj) {
        pqj.b.setVisibility(8);
        pqj.c.setVisibility(8);
        pqj.a.setVisibility(0);
        pqj.c.a();
    }

    static /* synthetic */ void b(pqj pqj) {
        pqj.a.setVisibility(8);
        pqj.b.setVisibility(8);
        pqj.c.setVisibility(0);
        PreviewSubmissionView previewSubmissionView = pqj.c;
        previewSubmissionView.a.requestFocus();
        ((InputMethodManager) previewSubmissionView.getContext().getSystemService("input_method")).showSoftInput(previewSubmissionView.a, 1);
    }

    static /* synthetic */ void c(pqj pqj) {
        pqj.a.setVisibility(8);
        pqj.c.setVisibility(8);
        pqj.b.setVisibility(0);
        pqj.c.a();
    }
}
