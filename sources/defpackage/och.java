package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;

/* renamed from: och reason: default package */
public class och extends jor implements gnl {
    public ujc a;
    public gnj b;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(d dVar) {
    }

    public static och c() {
        Bundle bundle = new Bundle();
        och och = new och();
        och.g(bundle);
        return och;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_continue_with_email, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        view.findViewById(R.id.sign_up).setOnClickListener(new $$Lambda$och$TwUiS9hUk2hyvP01AooDhXdc0ok(this));
        view.findViewById(R.id.login).setOnClickListener(new $$Lambda$och$BFR16srdvWwwdEKmOabmXHG9_zY(this));
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        vke.a(i, i2, intent).a(new $$Lambda$och$0qh6o87HieJVkJ5trLKQDllzC2A(this), $$Lambda$och$4F24enBdidUdwbrxKbsbi_J2RM.INSTANCE, new $$Lambda$och$WrFOr2IK7HLshLRuRuhh7KkR4(this), $$Lambda$och$jQA5jrN8J30QUcaG_OP2_WWg_A.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.b.f();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.b.a(cVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_CONTINUE_WITH_EMAIL, ClickIdentifier.LOGIN_BUTTON);
        this.b.a((String) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.a(ScreenIdentifier.PHONE_NUMBER_CONTINUE_WITH_EMAIL, ClickIdentifier.SIGN_UP_BUTTON);
        vke.a(this);
    }
}
