package com.spotify.music.cappedondemand.dialog.dialogv2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.slate.container.view.SlateView;
import com.spotify.music.slate.container.view.SlateView.DisplayMode;
import com.spotify.music.slate.container.view.SlateView.a;
import com.spotify.music.slate.container.view.card.CardInteractionHandler.SwipeDirection;
import com.spotify.music.slate.container.view.card.CardInteractionHandler.b;
import com.squareup.picasso.Picasso;
import io.reactivex.functions.Action;

public class CappedOndemandDialogActivity extends kyd {
    public Picasso g;
    private kwf h;
    /* access modifiers changed from: private */
    public View i;
    /* access modifiers changed from: private */
    public View j;
    /* access modifiers changed from: private */
    public SlateView k;
    private final Handler l = new Handler();
    private final Runnable m = new Runnable() {
        public final void run() {
            CappedOndemandDialogActivity.this.n = true;
            CappedOndemandDialogActivity.this.k.a((a) new a() {
                public final boolean canDismiss(DisplayMode displayMode) {
                    return AnonymousClass1.this.a(displayMode);
                }
            });
        }

        /* access modifiers changed from: private */
        public /* synthetic */ boolean a(DisplayMode displayMode) {
            return CappedOndemandDialogActivity.this.n;
        }
    };
    /* access modifiers changed from: private */
    public boolean n = true;

    public static Intent a(Context context, tzd tzd) {
        Intent intent = new Intent(context, CappedOndemandDialogActivity.class);
        intent.putExtra("VIEW_MODEL", tzd);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() != null) {
            String str = "VIEW_MODEL";
            if (getIntent().getExtras().getParcelable(str) != null) {
                tzd tzd = (tzd) fay.a(getIntent().getExtras().getParcelable(str));
                if (tzd.a() instanceof kwc) {
                    kwc kwc = (kwc) tzd.a();
                    this.h = kwc.e() == null ? new kwe(kwc, new Action(kwc) {
                        private final /* synthetic */ kwc f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            CappedOndemandDialogActivity.this.b(this.f$1);
                        }
                    }, new Action(kwc) {
                        private final /* synthetic */ kwc f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            CappedOndemandDialogActivity.this.a(this.f$1);
                        }
                    }, this.g) : new kwd(kwc, new Action() {
                        public final void run() {
                            CappedOndemandDialogActivity.this.k();
                        }
                    });
                }
                this.k = new SlateView(this);
                setContentView((View) this.k);
                this.k.b(new tyl(tzd) {
                    private final /* synthetic */ tzd f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final View getView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        return CappedOndemandDialogActivity.this.a(this.f$1, layoutInflater, viewGroup);
                    }
                });
                this.k.a((tyl) new tyl() {
                    public final View getView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        return CappedOndemandDialogActivity.this.a(layoutInflater, viewGroup);
                    }
                });
                this.k.a((tyk) fay.a(this.h));
                Long i2 = ((kwc) tzd.a()).i();
                if (i2 != null) {
                    this.n = false;
                    this.k.a((a) new a() {
                        public final boolean canDismiss(DisplayMode displayMode) {
                            return CappedOndemandDialogActivity.this.a(displayMode);
                        }
                    });
                    this.l.postDelayed(this.m, i2.longValue());
                }
                this.k.a = new b() {
                    public final void a(SwipeDirection swipeDirection) {
                        super.a(swipeDirection);
                        CappedOndemandDialogActivity.this.c(103);
                    }

                    public final void aE_() {
                        super.aE_();
                        CappedOndemandDialogActivity.this.j.setVisibility(8);
                        CappedOndemandDialogActivity.this.i.setVisibility(8);
                    }

                    public final void b() {
                        super.b();
                        CappedOndemandDialogActivity.this.j.setVisibility(0);
                        CappedOndemandDialogActivity.this.i.setVisibility(0);
                    }
                };
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.j = layoutInflater.inflate(R.layout.slate_header_spotify_icon, viewGroup, false);
        return this.j;
    }

    public void onBackPressed() {
        if (this.k == null || this.n) {
            c(103);
        }
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CAPPED_ONDEMAND_DIALOG, null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View a(tzd tzd, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.i = layoutInflater.inflate(R.layout.slate_modal_dismiss, viewGroup, false);
        if (tzd.b() != null) {
            tzd.b().a((TextView) this.i.findViewById(R.id.negative_action));
        }
        if (tzd.a() instanceof kwc) {
            this.i.setOnClickListener(new OnClickListener((kwc) tzd.a()) {
                private final /* synthetic */ kwc f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    CappedOndemandDialogActivity.this.a(this.f$1, view);
                }
            });
        } else {
            this.i.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    CappedOndemandDialogActivity.this.a(view);
                }
            });
        }
        return this.i;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kwc kwc, View view) {
        c(kwc.n());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        c(102);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(DisplayMode displayMode) {
        return this.n;
    }

    /* access modifiers changed from: private */
    public void c(int i2) {
        this.h.a();
        this.l.removeCallbacks(this.m);
        setResult(i2);
        finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(kwc kwc) {
        c(kwc.l());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kwc kwc) {
        c(kwc.m());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k() {
        c(103);
    }
}
