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

/* renamed from: qas reason: default package */
public abstract class qas extends jrd implements qaq, ulf {
    private TextView T;
    private ImageView a;
    protected SlateView ae;
    protected ViewGroup af;
    public QuicksilverCardMessage ag;
    private TextView b;

    /* access modifiers changed from: private */
    public /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.slate_quicksilver_header_view, viewGroup, false);
        this.a = (ImageView) inflate.findViewById(R.id.icon);
        this.T = (TextView) inflate.findViewById(R.id.simple_text_upsell);
        return inflate;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.b = (TextView) layoutInflater.inflate(R.layout.slate_quicksilver_footer_view, viewGroup, false);
        this.b.setOnClickListener(new $$Lambda$qas$5DyFGc4w5XQmS7OSyd174CUZg6w(this));
        return this.b;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        e();
    }

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
        this.ae.b(new $$Lambda$qas$Y8zb3sQw9xp4ScW2cF65HXNyWkg(this));
        this.ae.a((ulg) new $$Lambda$qas$TRNPeWA46qQyv2SzW2ibWGXoRZs(this));
        this.ae.a((ulf) this);
    }

    public final void b(int i) {
        this.T.setVisibility(i);
    }

    public final void b(String str) {
        this.T.setText(str);
    }

    public final void c(int i) {
        this.b.setVisibility(i);
    }

    public final void c(String str) {
        this.b.setText(str);
    }

    /* access modifiers changed from: protected */
    public abstract void e();

    public final void h_(int i) {
        this.a.setVisibility(i);
    }
}
