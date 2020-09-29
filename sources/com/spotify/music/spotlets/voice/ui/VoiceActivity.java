package com.spotify.music.spotlets.voice.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity.a;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class VoiceActivity extends lbm implements uwz {
    public hgy g;
    public sxw h;
    public uwe i;
    public uwx j;
    private final rly k = new rly();
    private final xok l = new xok();
    private final xij<fqn> m = new xij<fqn>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
        }

        public final /* synthetic */ void onNext(Object obj) {
            fqn fqn = (fqn) obj;
            if (!uvx.a(fqn)) {
                VoiceActivity.this.h.a(VoiceInteractionViewState.FLAG_DISABLED, fqn, VoiceActivity.this, null);
            }
        }
    };

    public static Intent a(Context context, fqn fqn, String str) {
        Intent intent = new Intent(context, VoiceActivity.class);
        intent.putExtra("voice_internal_referrer", str);
        fqo.a(intent, fqn);
        return intent;
    }

    public final rmf af() {
        return rmf.a((a) this.k);
    }

    public final void k() {
        this.h.a(VoiceInteractionViewState.OFFLINE, fqo.a((Activity) this), this, null);
    }

    public final void l() {
        fqn a = fqo.a((Activity) this);
        boolean shouldShowRequestPermissionRationale = shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO");
        Logger.a("Permission rejected %s", Boolean.valueOf(shouldShowRequestPermissionRationale));
        Bundle bundle = new Bundle();
        bundle.putBoolean("voice_permissions_donotshow", !shouldShowRequestPermissionRationale);
        this.h.a(VoiceInteractionViewState.NO_PERMISSIONS, a, this, bundle);
    }

    public final void m() {
        this.h.a(VoiceInteractionViewState.INTERACTION, fqo.a((Activity) this), this, null);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 4660) {
            a a = PermissionsRequestActivity.a(intent);
            boolean z = a == null || !a.a();
            uwx uwx = this.j;
            boolean z2 = !z;
            fqo.a((Activity) this);
            if (!z2) {
                if (uwx.a != null) {
                    uwx.a.l();
                }
                return;
            }
            uwx.a();
        }
    }

    public void onBackPressed() {
        this.j.a("back", InteractionIntent.CLOSE);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_voice_interaction);
        if (!uvx.a(fqo.a((Activity) this))) {
            Logger.d("Somehow started %s, but will not allow access", VoiceActivity.class.getSimpleName());
            finish();
            return;
        }
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable((Context) this, SpotifyIconV2.X, (float) getResources().getDimensionPixelSize(R.dimen.action_bar_close_icon));
        spotifyIconDrawable.a(fr.c(this, R.color.white));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.b((Drawable) spotifyIconDrawable);
        toolbar.b((int) R.string.voice_activity_close_content_description);
        toolbar.a((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                VoiceActivity.this.j.a("X", InteractionIntent.CLOSE);
                VoiceActivity.this.finish();
            }
        });
        Window window = getWindow();
        window.setSharedElementEnterTransition(new uww(0));
        window.setSharedElementReturnTransition(new uww(3));
    }

    public void onDestroy() {
        super.onDestroy();
        this.i.g();
    }

    public void onStart() {
        super.onStart();
        this.l.a(wit.a((xfk<T>) this.g.a()).a(this.m));
        this.j.a((uwz) this, (Activity) this, this.l);
    }

    public void onStop() {
        super.onStop();
        this.l.a();
        uwx uwx = this.j;
        if (!isFinishing()) {
            uwx.a("background", InteractionIntent.UNKNOWN);
        }
    }
}
