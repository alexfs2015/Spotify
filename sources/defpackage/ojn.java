package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;

/* renamed from: ojn reason: default package */
public class ojn extends jrd implements gpa {
    public uun a;
    public goy b;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.b.e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.b.a(cVar.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(d dVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_CONTINUE_WITH_EMAIL, ClickIdentifier.LOGIN_BUTTON);
        this.b.a((String) null);
    }

    public static ojn c() {
        Bundle bundle = new Bundle();
        ojn ojn = new ojn();
        ojn.g(bundle);
        return ojn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_CONTINUE_WITH_EMAIL, ClickIdentifier.SIGN_UP_BUTTON);
        vxk.a(this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_continue_with_email, viewGroup, false);
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        vxk.a(i, i2, intent).a(new $$Lambda$ojn$QyyLeDzqLUMAcfIqx59uvxek0Tw(this), $$Lambda$ojn$kW81IUzwtIsXkzZihk5oG8KIG2o.INSTANCE, new $$Lambda$ojn$1jCdgID8CicxhL4VMKYdVagLWw(this), $$Lambda$ojn$6VQbbZwV4zjCA04tH5gtomHJa8U.INSTANCE);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        view.findViewById(R.id.sign_up).setOnClickListener(new $$Lambda$ojn$xRy6BhBHldPNOmLsj1bRfcDscM(this));
        view.findViewById(R.id.login).setOnClickListener(new $$Lambda$ojn$lmg2emmwQt6CDIal8jejBgkefJk(this));
    }
}
