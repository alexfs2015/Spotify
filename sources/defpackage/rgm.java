package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.pages.EmptyPageAction;

/* renamed from: rgm reason: default package */
public final class rgm {
    public final FrameLayout a;
    public a b;
    private final fvi c;
    private final Button d = this.c.V_();

    /* renamed from: rgm$a */
    public interface a {
        void onEmptyButtonClicked();
    }

    public rgm(Context context) {
        this.a = new FrameLayout(context);
        this.a.setId(R.id.music_pages_empty_container);
        this.c = fvm.b(context, this.a);
        this.d.setOnClickListener(new $$Lambda$rgm$nc_eDDSCF3OQRc1HMEeAPgjsowQ(this));
        this.c.getView().setBackgroundColor(0);
        this.a.addView(this.c.getView());
        this.a.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.b.onEmptyButtonClicked();
    }

    public final void a(rgq rgq) {
        this.c.a((CharSequence) rgq.i());
        CharSequence j = rgq.j();
        this.c.b(j);
        int i = 8;
        this.c.c().setVisibility(fbo.a((String) j) ? 8 : 0);
        this.c.c((CharSequence) rgq.k());
        Button button = this.d;
        if (rgq.l() != EmptyPageAction.NO_ACTION) {
            i = 0;
        }
        button.setVisibility(i);
    }
}
