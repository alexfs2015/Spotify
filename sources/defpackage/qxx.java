package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.pages.EmptyPageAction;

/* renamed from: qxx reason: default package */
public final class qxx {
    public final FrameLayout a;
    public a b;
    private final fuo c;
    private final Button d = this.c.V_();

    /* renamed from: qxx$a */
    public interface a {
        void onEmptyButtonClicked();
    }

    public qxx(Context context) {
        this.a = new FrameLayout(context);
        this.a.setId(R.id.music_pages_empty_container);
        this.c = fus.b(context, this.a);
        this.d.setOnClickListener(new $$Lambda$qxx$7f2nK60hT1Pa470_1UFYLMQqVj8(this));
        this.c.getView().setBackgroundColor(0);
        this.a.addView(this.c.getView());
        this.a.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.b.onEmptyButtonClicked();
    }

    public final void a(qyb qyb) {
        this.c.a((CharSequence) qyb.i());
        CharSequence j = qyb.j();
        this.c.b(j);
        int i = 8;
        this.c.c().setVisibility(fax.a((String) j) ? 8 : 0);
        this.c.c((CharSequence) qyb.k());
        Button button = this.d;
        if (qyb.l() != EmptyPageAction.NO_ACTION) {
            i = 0;
        }
        button.setVisibility(i);
    }
}
