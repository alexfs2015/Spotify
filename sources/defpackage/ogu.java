package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingActivity;
import com.spotify.music.slate.container.view.SlateView;
import com.spotify.music.slate.container.view.card.CardInteractionHandler.SwipeDirection;
import com.spotify.music.slate.container.view.card.CardInteractionHandler.b;

/* renamed from: ogu reason: default package */
public class ogu extends jrd implements a {
    private TextView T;
    public ogs a;
    private SlateView b;

    /* access modifiers changed from: private */
    public /* synthetic */ View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.T = (TextView) layoutInflater.inflate(R.layout.slate_account_linking_footer_view, viewGroup, false);
        this.T.setOnClickListener(new $$Lambda$ogu$w1C4ANSDxdDK94pNyLXw67RtyFc(this));
        return this.T;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        e();
    }

    static ogu c() {
        return new ogu();
    }

    /* access modifiers changed from: private */
    public void e() {
        kf p = p();
        if (p != null) {
            p.i().a().a((Fragment) this).b();
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass1 r5 = new b() {
            public final void a(SwipeDirection swipeDirection) {
                ogu.this.e();
            }
        };
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.slate_account_linking_container, viewGroup, false);
        this.b = (SlateView) viewGroup2.findViewById(R.id.slate_view);
        this.b.a = r5;
        return viewGroup2;
    }

    public final void a() {
        e();
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        ((TextView) fbp.a(this.T)).setVisibility(8);
        if (i2 == -1) {
            this.a.a();
        } else {
            this.a.b();
        }
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        ((SlateView) fbp.a(this.b)).b(new $$Lambda$ogu$zWov7luDoO86HzT5IJFM8rcegFw(this));
        ((SlateView) fbp.a(this.b)).a((ulg) $$Lambda$ogu$XjBxRScXBuMow3Aq_Ko5HqFQ5_E.INSTANCE);
        ((SlateView) fbp.a(this.b)).a((ulf) this.a);
    }

    public final void b() {
        startActivityForResult(new Intent(n(), PartnerAccountLinkingActivity.class), 0);
    }
}
