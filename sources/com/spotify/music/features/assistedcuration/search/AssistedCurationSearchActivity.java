package com.spotify.music.features.assistedcuration.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.collect.Lists;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.Visibility;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.SimpleNavigationManager;
import com.spotify.music.navigation.SimpleNavigationManager.NavigationType;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;

public class AssistedCurationSearchActivity extends lbm implements lbr {
    public fqn g;
    public SimpleNavigationManager h;
    public ToastieManager i;
    public uix j;
    public rqb k;
    public jvf l;
    public hxx m;
    private lbp n;
    private Intent o;
    private SessionState p;
    /* access modifiers changed from: private */
    public fzm q;
    private ArrayList<String> r;
    private ArrayList<String> s = Lists.a();
    private String t;
    private Disposable u = Disposables.b();
    private final OnClickListener v = new OnClickListener() {
        public final void onClick(View view) {
            AssistedCurationSearchActivity.this.h.a(NavigationType.UP);
        }
    };
    private final lbq w = new lbq() {
        public final void onCurrentFragmentChanged(Fragment fragment, String str) {
            AssistedCurationSearchActivity.this.q.a(ToolbarConfig.a(fragment) == Visibility.HIDE);
            AssistedCurationSearchActivity.this.q.b(!AssistedCurationSearchActivity.this.h.a());
            AssistedCurationSearchActivity.this.q.a();
        }
    };

    public static Intent a(Context context, fqn fqn, ArrayList<String> arrayList, String str) {
        Intent intent = new Intent(context, AssistedCurationSearchActivity.class);
        fqo.a(intent, fqn);
        intent.putStringArrayListExtra("track_uris_to_ignore", arrayList);
        intent.putExtra("playlist_title", str);
        return intent;
    }

    public final void a(Fragment fragment, String str) {
        this.q.a(str);
    }

    /* access modifiers changed from: 0000 */
    public void a(SessionState sessionState) {
        if (sessionState != null && vbg.a((SessionState) fbp.a(sessionState))) {
            if (this.p == null) {
                this.p = sessionState;
                if (this.o == null) {
                    this.o = lwd.a(this, this.g, ViewUris.ag.toString(), null);
                }
                onNewIntent(this.o);
                return;
            }
            this.p = sessionState;
        }
    }

    public final void a(lbp lbp) {
        this.n = lbp;
    }

    public final void a(lbq lbq) {
    }

    public final void a(a aVar) {
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.ASSISTED_CURATION_SEARCH, ViewUris.C.toString());
    }

    public final void ao_() {
    }

    public final fyh b() {
        return this.q;
    }

    public final void b(lbq lbq) {
    }

    public final void b(a aVar) {
    }

    public final Fragment m() {
        return this.h.a;
    }

    public void onBackPressed() {
        lbp lbp = this.n;
        if ((lbp == null || !lbp.onBackPressed()) && !this.h.a(NavigationType.BACK)) {
            super.onBackPressed();
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_assisted_curation_search);
        gau.a((Context) this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar_wrapper);
        fsy a = ftc.a(this, viewGroup);
        gav.a(a.getView(), this);
        viewGroup.addView(a.getView());
        this.q = new fzm(this, a, this.v);
        this.q.c(true);
        String str = "playlist_title";
        String str2 = "track_uris_to_ignore";
        if (bundle != null) {
            bundle.setClassLoader(getClassLoader());
            this.o = (Intent) bundle.getParcelable("key_last_intent");
            this.p = (SessionState) bundle.getParcelable("key_last_session");
            this.h.a(bundle.getBundle("key_navigation"));
            this.r = bundle.getStringArrayList(str2);
            this.s = bundle.getStringArrayList("added_tracks");
            this.t = bundle.getString(str);
            return;
        }
        this.r = getIntent().getStringArrayListExtra(str2);
        this.t = getIntent().getStringExtra(str);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            if ("close_search".equals(intent.getAction())) {
                setResult(0);
                finish();
            } else if (intent.getDataString() != null) {
                if ("add_track".equals(intent.getAction())) {
                    String dataString = intent.getDataString();
                    ArrayList<String> arrayList = this.r;
                    if (arrayList == null || !arrayList.contains(dataString)) {
                        ArrayList<String> arrayList2 = this.r;
                        if (arrayList2 != null) {
                            arrayList2.add(dataString);
                        }
                        this.s.add(dataString);
                        Intent intent2 = new Intent();
                        intent2.putStringArrayListExtra("added_tracks", this.s);
                        setResult(-1, intent2);
                        finish();
                    } else {
                        if (this.k.a(this.g) || uix.a(this.g)) {
                            uzy a = uzy.a(getString(R.string.assisted_curation_duplicates_toast_body, new Object[]{this.t}), 3000).c(R.color.white).b(R.color.cat_black).a();
                            if (this.i.b()) {
                                this.i.a(a);
                            } else {
                                this.i.a = a;
                            }
                        } else {
                            this.l.a((int) R.string.assisted_curation_duplicates_toast_body, 0, this.t);
                        }
                    }
                } else if (this.p != null) {
                    this.h.a(intent.getDataString(), intent.getStringExtra("ac_search_title"), (SessionState) fbp.a(this.p), rta.b, intent.getExtras());
                } else {
                    this.o = intent;
                }
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.i.a((q) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("key_last_intent", this.o);
        bundle.putParcelable("key_last_session", this.p);
        bundle.putBundle("key_navigation", this.h.b());
        bundle.putStringArrayList("track_uris_to_ignore", this.r);
        bundle.putStringArrayList("added_tracks", this.s);
        bundle.putString("playlist_title", this.t);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.u = this.m.a.c((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                AssistedCurationSearchActivity.this.a((SessionState) obj);
            }
        });
        SimpleNavigationManager simpleNavigationManager = this.h;
        simpleNavigationManager.b.add(this.w);
    }

    public void onStop() {
        SimpleNavigationManager simpleNavigationManager = this.h;
        simpleNavigationManager.b.remove(this.w);
        this.u.bd_();
        super.onStop();
    }
}
