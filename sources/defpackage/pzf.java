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

/* renamed from: pzf reason: default package */
public final class pzf extends FrameLayout implements kmm<pzd, pzb> {
    private ProgressBar a = ((ProgressBar) ip.d((View) this, (int) R.id.progress_circular));
    private Button b = ((Button) ip.d((View) this, (int) R.id.preview_button));
    private PreviewSubmissionView c = ((PreviewSubmissionView) ip.d((View) this, (int) R.id.preview_submission_view));

    public pzf(Context context) {
        super(context);
        inflate(getContext(), R.layout.preview_tool, this);
    }

    static /* synthetic */ void a(pzf pzf) {
        pzf.b.setVisibility(8);
        pzf.c.setVisibility(8);
        pzf.a.setVisibility(0);
        pzf.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(knw knw, View view) {
        String obj = this.c.b.getSelectedItem().toString();
        String str = "Navigation".equals(obj) ? "URI" : "Playback Started".equals(obj) ? "PLAYBACK_STARTED" : "CLIENT_EVENT";
        PreviewSubmissionView previewSubmissionView = this.c;
        knw.accept(new h(str, previewSubmissionView.a.getText() == null ? null : previewSubmissionView.a.getText().toString()));
    }

    static /* synthetic */ void b(pzf pzf) {
        pzf.a.setVisibility(8);
        pzf.b.setVisibility(8);
        pzf.c.setVisibility(0);
        PreviewSubmissionView previewSubmissionView = pzf.c;
        previewSubmissionView.a.requestFocus();
        ((InputMethodManager) previewSubmissionView.getContext().getSystemService("input_method")).showSoftInput(previewSubmissionView.a, 1);
    }

    static /* synthetic */ void c(pzf pzf) {
        pzf.a.setVisibility(8);
        pzf.c.setVisibility(8);
        pzf.b.setVisibility(0);
        pzf.c.a();
    }

    public final kmn<pzd> connect(final knw<pzb> knw) {
        this.b.setOnClickListener(new $$Lambda$pzf$3NzmV0U1xuKRDuhbhsvsqEXZ6g(knw));
        this.c.a(new $$Lambda$pzf$TH1vcqhhNLJI4_wCnQZVp_sSfMs(this, knw));
        PreviewSubmissionView previewSubmissionView = this.c;
        previewSubmissionView.c.setOnClickListener(new $$Lambda$pzf$_S75FmjGtLfJJhP596WQmNPBh10(knw));
        return new kmn<pzd>() {
            private pyz a;

            /* access modifiers changed from: private */
            public /* synthetic */ void a(a aVar) {
                pzf.a(pzf.this);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(b bVar) {
                pzf.c(pzf.this);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(c cVar) {
                pzf.b(pzf.this);
            }

            public final /* synthetic */ void accept(Object obj) {
                pzd pzd = (pzd) obj;
                if (!pzd.a().equals(this.a)) {
                    pzd.a().a(new $$Lambda$pzf$1$7Hv4hmTtKcZl0gEnpYNn_cFjB_I(this), new $$Lambda$pzf$1$NTRWFP4aXeeJ6zI3im4duQoT60g(this), new $$Lambda$pzf$1$BOnaKF6c1HYOJ9b47_RIFrkTX4(this));
                    this.a = pzd.a();
                }
                if (!fbo.a(pzd.c())) {
                    Toast.makeText(pzf.this.getContext(), pzd.c(), 1).show();
                    knw.accept(new b());
                }
            }

            public final void dispose() {
            }
        };
    }
}
