package com.spotify.music.features.addtoplaylist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.R;
import com.spotify.music.features.addtoplaylist.AddToPlaylistLogger.UserIntent;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.navigation.SimpleNavigationManager;
import com.spotify.music.navigation.SimpleNavigationManager.NavigationType;
import com.spotify.music.toastie.ToastieManager;
import java.util.ArrayList;
import java.util.List;

public class AddToPlaylistActivity extends lbm implements lqz, lro, a, uqq {
    public lra g;
    public lqq h;
    public SimpleNavigationManager i;
    public ToastieManager j;
    private SessionState k;
    private fqn l;
    private Intent m;
    private final OnClickListener n = new OnClickListener() {
        public final void onClick(View view) {
            lra lra = AddToPlaylistActivity.this.g;
            boolean a2 = AddToPlaylistActivity.this.i.a();
            lra.b.a(null, "toolbar", 0, InteractionType.HIT, UserIntent.UP);
            if (!a2) {
                lra.a.k();
            } else {
                lra.a.m();
            }
        }
    };

    public static Intent a(Context context) {
        Intent intent = new Intent(context, AddToPlaylistActivity.class);
        intent.setAction("close");
        return intent;
    }

    public static Intent a(Context context, String str, String str2, List<String> list, String str3, String str4) {
        Intent intent = new Intent(context, AddToPlaylistActivity.class);
        intent.putExtra("folder_uri", str);
        intent.putExtra("folder_title", str2);
        intent.putStringArrayListExtra("item_uris", new ArrayList(list));
        intent.putExtra("view_uri", str3);
        intent.putExtra("context_uri", str4);
        return intent;
    }

    public static Intent a(Context context, List<String> list, String str, String str2) {
        Intent intent = new Intent(context, AddToPlaylistActivity.class);
        intent.putStringArrayListExtra("item_uris", new ArrayList(list));
        intent.putExtra("context_uri", str2);
        intent.putExtra("view_uri", str);
        return intent;
    }

    public void a(SessionState sessionState) {
        if (this.k == null) {
            this.k = sessionState;
            if (this.m == null) {
                this.m = getIntent();
            }
            onNewIntent(this.m);
            return;
        }
        this.k = sessionState;
    }

    public final void a(fqn fqn) {
        if (this.l == null) {
            this.l = fqn;
            if (this.m == null) {
                this.m = getIntent();
            }
            onNewIntent(this.m);
            return;
        }
        this.l = fqn;
    }

    public final sso ae_() {
        return ViewUris.aL;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PLAYLIST_ADDTOPLAYLIST, ViewUris.aL.toString());
    }

    public final gkq aj() {
        return PageIdentifiers.PLAYLIST_ADDTOPLAYLIST;
    }

    public final void k() {
        this.i.a(NavigationType.UP);
    }

    public final void l() {
        setRequestedOrientation(1);
    }

    public final void m() {
        finish();
    }

    public final String n() {
        Intent intent = this.m;
        return intent != null ? intent.getStringExtra("context_uri") : "";
    }

    public void onBackPressed() {
        if (!this.i.a(NavigationType.BACK)) {
            super.onBackPressed();
            this.g.b.a(null, "view", 0, InteractionType.HIT, UserIntent.BACK_NAVIGATION);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_add_to_playlist);
        gau.a((Context) this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar_wrapper);
        fsy a = ftc.a(this, viewGroup);
        a.a((CharSequence) getString(R.string.add_to_playlist_title));
        gav.a(a.getView(), this);
        viewGroup.addView(a.getView());
        fzm fzm = new fzm(this, a, this.n);
        fzm.c(true);
        fzm.b(true);
        if (bundle != null) {
            bundle.setClassLoader(getClassLoader());
            this.m = (Intent) bundle.getParcelable("key_last_intent");
            this.k = (SessionState) bundle.getParcelable("key_last_session");
            this.i.a(bundle.getBundle("key_navigation"));
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            if ("close".equals(intent.getAction())) {
                this.j.onStop();
                this.g.a.m();
            } else if (this.k == null || this.l == null) {
                this.m = intent;
            } else {
                String stringExtra = intent.getStringExtra("folder_uri");
                String stringExtra2 = intent.getStringExtra("folder_title");
                this.h.a = this.l;
                SimpleNavigationManager simpleNavigationManager = this.i;
                if (fbo.a(stringExtra)) {
                    stringExtra = "rootlist";
                }
                simpleNavigationManager.a(stringExtra, stringExtra2, (SessionState) fbp.a(this.k), rta.i, intent.getExtras());
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("key_last_intent", this.m);
        bundle.putParcelable("key_last_session", this.k);
        bundle.putBundle("key_navigation", this.i.b());
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.g.a();
        this.j.a((q) this);
    }

    public void onStop() {
        this.g.c.c();
        super.onStop();
    }

    public final String q() {
        Intent intent = this.m;
        return intent != null ? intent.getStringExtra("view_uri") : "";
    }
}
