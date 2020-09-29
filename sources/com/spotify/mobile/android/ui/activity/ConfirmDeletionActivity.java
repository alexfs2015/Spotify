package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.paste.widgets.DialogLayout;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public class ConfirmDeletionActivity extends lbm {
    public vjv g;
    private final SerialDisposable h = new SerialDisposable();
    private Button i;
    private Button j;
    private String k;
    private String l;

    /* renamed from: com.spotify.mobile.android.ui.activity.ConfirmDeletionActivity$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.mobile.android.util.LinkType[] r0 = com.spotify.mobile.android.util.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.COLLECTION_PLAYLIST_FOLDER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_PLAYLIST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PLAYLIST_V2     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.TOPLIST     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.ui.activity.ConfirmDeletionActivity.AnonymousClass1.<clinit>():void");
        }
    }

    public static Intent a(Context context, String str, String str2) {
        Assertion.a((Object) context);
        String str3 = "lfstl louainret ad  lnpreWeloninse-yd olt e";
        Assertion.a((Object) str, "We need a non-null playlist or folder title");
        String str4 = "-Wom  nreln le inudnae";
        Assertion.a((Object) str2, "We need a non-null uri");
        Assertion.a((CharSequence) str2, "We need a non-empty uri");
        Intent intent = new Intent();
        Class<ConfirmDeletionActivity> cls = ConfirmDeletionActivity.class;
        intent.setClass(context, ConfirmDeletionActivity.class);
        intent.putExtra("com.spotify.mobile.android.ui.activity.name", str);
        intent.putExtra("com.spotify.mobile.android.ui.activity.uri", str2);
        return intent;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        setResult(0);
        finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        String str = "CttpoelyfevDAnlcsloenia eil mfc:  oalw oig iar ifooedsnltaftrhyiott";
        Logger.e(th, "ConfirmDeletionActivity: failed to change follow state for playlist", new Object[0]);
        finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.h.a(this.g.b(this.l).a((Action) new Action() {
            public final void run() {
                ConfirmDeletionActivity.this.k();
            }
        }, (Consumer<? super Throwable>) new Consumer() {
            public final void accept(Object obj) {
                ConfirmDeletionActivity.this.a((Throwable) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k() {
        setResult(-1);
        finish();
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PLAYLIST_CONFIRMDELETE, null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DialogLayout dialogLayout = new DialogLayout(this);
        setContentView((View) dialogLayout);
        String str = ".t.boblynsio.mdaraceipit.oit.civodumi.uyri";
        String str2 = "com.spotify.mobile.android.ui.activity.uri";
        String str3 = "mcfiiobmatapic..idoa.ntm.ynuoiyebo.etivlrs.";
        String str4 = "com.spotify.mobile.android.ui.activity.name";
        if (bundle != null) {
            bundle.setClassLoader(getClassLoader());
            this.k = bundle.getString(str4);
            this.l = bundle.getString(str2);
        } else {
            Intent intent = getIntent();
            this.k = intent.getStringExtra(str4);
            this.l = intent.getStringExtra(str2);
        }
        String str5 = " ayitl ttedenopreites el ndl onluWa- nl frl";
        String str6 = "We need a non-null playlist or folder title";
        Assertion.a((Object) this.k, str6);
        Assertion.a((Object) this.k, str6);
        Assertion.a((Object) this.l, "We need the uri to the item to be deleted.");
        jva a = jva.a(this.l);
        int i2 = -1;
        int i3 = AnonymousClass1.a[a.b.ordinal()];
        if (i3 == 1) {
            i2 = R.string.confirm_deletion_folder_title;
        } else if (i3 == 2 || i3 == 3 || i3 == 4) {
            i2 = R.string.confirm_deletion_playlist_title;
        } else {
            String str7 = "Tyt  lctpdnkgrlo opi cneeyri:leer ttn ye";
            StringBuilder sb = new StringBuilder("Trying to incorrectly delete link type :");
            sb.append(a.b);
            Assertion.a(sb.toString());
        }
        dialogLayout.a(i2);
        dialogLayout.b((CharSequence) getString(R.string.confirm_deletion_body, new Object[]{this.k}));
        dialogLayout.a((int) R.string.confirm_deletion_button_delete, (OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                ConfirmDeletionActivity.this.b(view);
            }
        });
        dialogLayout.b((int) R.string.confirm_deletion_button_cancel, (OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                ConfirmDeletionActivity.this.a(view);
            }
        });
        this.j = dialogLayout.b;
        this.i = dialogLayout.a;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.spotify.mobile.android.ui.activity.name", this.k);
        String str = "t.cr..imutbcinioi.ypos.titdouoiavrmfl.eady";
        bundle.putString("com.spotify.mobile.android.ui.activity.uri", this.l);
    }

    public void onStop() {
        super.onStop();
        this.h.a(Disposables.b());
    }
}
