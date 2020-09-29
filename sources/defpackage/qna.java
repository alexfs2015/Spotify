package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.loader.SettingsState;
import com.spotify.music.R;
import com.spotify.music.libs.facebook.FacebookPlaceholderActivity;

/* renamed from: qna reason: default package */
public final class qna extends qmx {
    private final OnClickListener d = new OnClickListener() {
        public final void onClick(View view) {
            Assertion.a((Object) qna.this.a, "Context was null, onClick called before view is instantiated properly.");
            qna.this.a.startActivity(new Intent(qna.this.a, FacebookPlaceholderActivity.class));
        }
    };
    private boolean e;

    public qna(View view, fsb fsb) {
        super(view, fsb);
        b();
    }

    private void b() {
        this.b.a(this.a.getString(R.string.settings_button_connect_to_facebook));
        this.c = this.d;
        getView().setEnabled(!this.e);
    }

    public final void a(SettingsState settingsState) {
        this.e = settingsState.offlineMode();
        b();
    }

    public final void a(CharSequence charSequence) {
    }

    public final void a(String str) {
    }
}
