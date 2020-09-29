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

public class CappedOndemandDialogActivity extends lbm {
    public Picasso g;
    private kzo h;
    /* access modifiers changed from: private */
    public View i;
    /* access modifiers changed from: private */
    public View j;
    /* access modifiers changed from: private */
    public SlateView k;
    private final Handler l = new Handler();
    private final Runnable m = new Runnable() {
        /* access modifiers changed from: private */
        public /* synthetic */ boolean a(DisplayMode displayMode) {
            return CappedOndemandDialogActivity.this.n;
        }

        public final void run() {
            CappedOndemandDialogActivity.this.n = true;
            CappedOndemandDialogActivity.this.k.a((a) new a() {
                public final boolean canDismiss(DisplayMode displayMode) {
                    return AnonymousClass1.this.a(displayMode);
                }
            });
        }
    };
    /* access modifiers changed from: private */
    public boolean n = true;

    public static Intent a(Context context, uly uly) {
        Intent intent = new Intent(context, CappedOndemandDialogActivity.class);
        intent.putExtra("VIEW_MODEL", uly);
        return intent;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.j = layoutInflater.inflate(R.layout.slate_header_spotify_icon, viewGroup, false);
        return this.j;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View a(uly uly, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.i = layoutInflater.inflate(R.layout.slate_modal_dismiss, viewGroup, false);
        if (uly.b() != null) {
            uly.b().a((TextView) this.i.findViewById(R.id.negative_action));
        }
        if (uly.a() instanceof kzl) {
            this.i.setOnClickListener(new OnClickListener((kzl) uly.a()) {
                private final /* synthetic */ kzl f$1;

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
    public /* synthetic */ void a(View view) {
        c(102);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kzl kzl) {
        c(kzl.m());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kzl kzl, View view) {
        c(kzl.n());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(DisplayMode displayMode) {
        return this.n;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(kzl kzl) {
        c(kzl.l());
    }

    /* access modifiers changed from: private */
    public void c(int i2) {
        this.h.a();
        this.l.removeCallbacks(this.m);
        setResult(i2);
        finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k() {
        c(103);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.CAPPED_ONDEMAND_DIALOG, null);
    }

    public void onBackPressed() {
        if (this.k == null || this.n) {
            c(103);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() != null) {
            String str = "VIEW_MODEL";
            if (getIntent().getExtras().getParcelable(str) != null) {
                uly uly = (uly) fbp.a(getIntent().getExtras().getParcelable(str));
                if (uly.a() instanceof kzl) {
                    kzl kzl = (kzl) uly.a();
                    this.h = kzl.e() == null ? new kzn(kzl, new Action(kzl) {
                        private final /* synthetic */ kzl f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            CappedOndemandDialogActivity.this.b(this.f$1);
                        }
                    }, new Action(kzl) {
                        private final /* synthetic */ kzl f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            CappedOndemandDialogActivity.this.a(this.f$1);
                        }
                    }, this.g) : new kzm(kzl, new Action() {
                        public final void run() {
                            CappedOndemandDialogActivity.this.k();
                        }
                    });
                }
                this.k = new SlateView(this);
                setContentView((View) this.k);
                this.k.b(new ulg(uly) {
                    private final /* synthetic */ uly f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final View getView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        return CappedOndemandDialogActivity.this.a(this.f$1, layoutInflater, viewGroup);
                    }
                });
                this.k.a((ulg) new ulg() {
                    public final View getView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        return CappedOndemandDialogActivity.this.a(layoutInflater, viewGroup);
                    }
                });
                this.k.a((ulf) fbp.a(this.h));
                Long i2 = ((kzl) uly.a()).i();
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

                    public final void aC_() {
                        super.aC_();
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
}
