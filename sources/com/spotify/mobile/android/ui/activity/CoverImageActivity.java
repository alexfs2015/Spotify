package com.spotify.mobile.android.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

public class CoverImageActivity extends Activity implements b {
    private static final TimeInterpolator a = new DecelerateInterpolator();
    private ImageView b;
    private int c;
    private ColorDrawable d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public float g;
    /* access modifiers changed from: private */
    public float h;

    /* access modifiers changed from: private */
    public void a() {
        a((Runnable) new Runnable() {
            public final void run() {
                CoverImageActivity.this.finish();
            }
        });
    }

    public static void a(Context context, int i, int i2, int i3, int i4, Uri uri, int i5) {
        Class<CoverImageActivity> cls = CoverImageActivity.class;
        Intent intent = new Intent(context, CoverImageActivity.class);
        intent.putExtra("ARGUMENT_LEFT", i);
        String str = "TPsORTUN_MEG";
        intent.putExtra("ARGUMENT_TOP", i2);
        String str2 = "IDRmGTENUWTA_M";
        intent.putExtra("ARGUMENT_WIDTH", i3);
        intent.putExtra("ARGUMENT_HEIGHT", i4);
        String str3 = "T_IRoEMGARU_IGANME";
        intent.putExtra("ARGUMENT_IMAGE_URI", uri);
        intent.putExtra("ARGUMENT_ORIENTATION", i5);
        context.startActivity(intent, ActivityOptions.makeCustomAnimation(context, 0, 0).toBundle());
    }

    public static void a(final Context context, final ImageView imageView, final Uri uri) {
        imageView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                int[] iArr = new int[2];
                imageView.getLocationOnScreen(iArr);
                CoverImageActivity.a(context, iArr[0], iArr[1], imageView.getWidth(), imageView.getHeight(), uri, context.getResources().getConfiguration().orientation);
            }
        });
    }

    static /* synthetic */ void a(CoverImageActivity coverImageActivity) {
        coverImageActivity.b.setPivotX(0.0f);
        coverImageActivity.b.setPivotY(0.0f);
        coverImageActivity.b.setScaleX(coverImageActivity.g);
        coverImageActivity.b.setScaleY(coverImageActivity.h);
        coverImageActivity.b.setTranslationX((float) coverImageActivity.e);
        coverImageActivity.b.setTranslationY((float) coverImageActivity.f);
        coverImageActivity.d.setAlpha(0);
        coverImageActivity.b.animate().setDuration(300).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setInterpolator(a);
        String str = "baphl";
        ObjectAnimator ofInt = ObjectAnimator.ofInt(coverImageActivity.d, "alpha", new int[]{0, 255});
        ofInt.setDuration(300);
        ofInt.start();
    }

    private void a(final Runnable runnable) {
        boolean z;
        if (getResources().getConfiguration().orientation != this.c) {
            ImageView imageView = this.b;
            imageView.setPivotX(((float) imageView.getWidth()) / 2.0f);
            ImageView imageView2 = this.b;
            imageView2.setPivotY(((float) imageView2.getHeight()) / 2.0f);
            this.e = 0;
            this.f = 0;
            z = true;
        } else {
            z = false;
        }
        this.b.animate().setDuration(300).scaleX(this.g).scaleY(this.h).translationX((float) this.e).translationY((float) this.f).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                runnable.run();
            }
        });
        if (z) {
            this.b.animate().alpha(0.0f);
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.d, "alpha", new int[]{0});
        ofInt.setDuration(300);
        ofInt.start();
    }

    public static void b(Context context, ImageView imageView, Uri uri) {
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        Context context2 = context;
        Uri uri2 = uri;
        a(context, iArr[0], iArr[1], imageView.getWidth(), imageView.getHeight(), uri, context.getResources().getConfiguration().orientation);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.COVERIMAGE, ViewUris.bL.toString());
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onBackPressed() {
        a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_cover_image);
        this.b = (ImageView) findViewById(R.id.cover_image);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content_frame);
        this.d = new ColorDrawable(-16777216);
        ip.a((View) frameLayout, (Drawable) this.d);
        Bundle extras = getIntent().getExtras();
        String str = "LEU_NAbTTGMEF";
        final int i = extras.getInt("ARGUMENT_LEFT");
        String str2 = "_ATGNUPtTORM";
        final int i2 = extras.getInt("ARGUMENT_TOP");
        String str3 = "DRMU_WNEpAHTTG";
        final int i3 = extras.getInt("ARGUMENT_WIDTH");
        String str4 = "GTANURIHEtGME_T";
        final int i4 = extras.getInt("ARGUMENT_HEIGHT");
        String str5 = "MTsANUI_GEUG_MIERA";
        Uri uri = (Uri) extras.getParcelable("ARGUMENT_IMAGE_URI");
        this.c = extras.getInt("ARGUMENT_ORIENTATION");
        Class<vhj> cls = vhj.class;
        ((vhj) gih.a(vhj.class)).a().a(uri).g().a(this.b);
        if (bundle == null) {
            ImageView imageView = this.b;
            AnonymousClass2 r3 = r3;
            AnonymousClass2 r32 = new gcp<ImageView>() {
                public final /* synthetic */ void accept(Object obj) {
                    ImageView imageView = (ImageView) obj;
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    CoverImageActivity.this.e = i - iArr[0];
                    CoverImageActivity.this.f = i2 - iArr[1];
                    CoverImageActivity.this.g = ((float) i3) / ((float) imageView.getWidth());
                    CoverImageActivity.this.h = ((float) i4) / ((float) imageView.getHeight());
                    CoverImageActivity.a(CoverImageActivity.this);
                }
            };
            juq.a(imageView, r32);
        }
        frameLayout.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                CoverImageActivity.this.a();
            }
        });
    }
}
