package defpackage;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import io.reactivex.functions.Action;

/* renamed from: kwd reason: default package */
public final class kwd extends kwf {
    private final kwc a;
    private final Action b;
    /* access modifiers changed from: private */
    public TextView c;
    /* access modifiers changed from: private */
    public Button d;
    private final Handler e = new Handler();
    private final Runnable f = new Runnable() {
        public final void run() {
            kwd.this.c.setVisibility(8);
            kwd.this.d.setScaleX(0.0f);
            kwd.this.d.setScaleY(0.0f);
            kwd.this.d.setVisibility(0);
            kwd.this.d.animate().scaleX(1.0f).scaleY(1.0f);
        }
    };

    public kwd(kwc kwc, Action action) {
        this.a = (kwc) fay.a(kwc);
        this.b = (Action) fay.a(action);
    }

    public final View getSlateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.a.a(), viewGroup, false);
        TextView textView = (TextView) fay.a(inflate.findViewById(R.id.title));
        TextView textView2 = (TextView) fay.a(inflate.findViewById(R.id.sub_title));
        this.c = (TextView) inflate.findViewById(R.id.loading_title);
        this.d = (Button) fay.a(inflate.findViewById(R.id.action_button));
        a(this.a.b(), textView);
        a(this.a.c(), textView2);
        a(this.a.d(), this.c);
        Long i = this.a.i();
        if (i != null) {
            this.e.postDelayed(this.f, i.longValue());
        }
        a(this.a.e(), this.d);
        this.d.setOnClickListener(new $$Lambda$kwd$kna1qfxIhdxgFJuU1oSOpYhvtQ0(this));
        return inflate;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        try {
            this.b.run();
        } catch (Exception unused) {
            Logger.e("Failed to run actions.", new Object[0]);
        }
    }

    public final void a() {
        this.e.removeCallbacks(this.f);
    }
}
