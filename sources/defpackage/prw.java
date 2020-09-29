package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverCardMessage;
import com.spotify.music.slate.container.view.SlateView;

/* renamed from: prw reason: default package */
public abstract class prw extends jor implements pru, tyk {
    private TextView T;
    private ImageView a;
    protected SlateView ae;
    protected ViewGroup af;
    public QuicksilverCardMessage ag;
    private TextView b;

    /* access modifiers changed from: protected */
    public abstract void e();

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.ag.isFullscreen()) {
            this.af = (ViewGroup) layoutInflater.inflate(R.layout.slate_quicksilver_fullscreen_container, viewGroup, false);
        } else {
            this.af = (ViewGroup) layoutInflater.inflate(R.layout.slate_quicksilver_container, viewGroup, false);
        }
        this.ae = (SlateView) this.af.findViewById(R.id.slate_view);
        return this.af;
    }

    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.ae.b(new $$Lambda$prw$XrksywEirYlGXkFJxqUYDSJStg(this));
        this.ae.a((tyl) new $$Lambda$prw$rjg9YwuKQ9_93lKcj4y8v7NdKQ(this));
        this.ae.a((tyk) this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.b = (TextView) layoutInflater.inflate(R.layout.slate_quicksilver_footer_view, viewGroup, false);
        this.b.setOnClickListener(new $$Lambda$prw$uGuZfUAfmzGdq2LsdVHkbCQLYI(this));
        return this.b;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.slate_quicksilver_header_view, viewGroup, false);
        this.a = (ImageView) inflate.findViewById(R.id.icon);
        this.T = (TextView) inflate.findViewById(R.id.simple_text_upsell);
        return inflate;
    }

    public final void i_(int i) {
        this.a.setVisibility(i);
    }

    public final void b(String str) {
        this.T.setText(str);
    }

    public final void b(int i) {
        this.T.setVisibility(i);
    }

    public final void c(String str) {
        this.b.setText(str);
    }

    public final void c(int i) {
        this.b.setVisibility(i);
    }
}
