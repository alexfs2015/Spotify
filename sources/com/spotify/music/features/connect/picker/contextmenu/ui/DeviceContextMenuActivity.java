package com.spotify.music.features.connect.picker.contextmenu.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.GaiaDeviceIncarnation;
import com.spotify.mobile.android.connect.model.Tech;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DeviceContextMenuActivity extends lbm {
    /* access modifiers changed from: private */
    public static int l;
    private static final ImmutableMap<Tech, SpotifyIconV2> r = ImmutableMap.a(Tech.CONNECT, SpotifyIconV2.SPOTIFY_CONNECT, Tech.CAST, SpotifyIconV2.CHROMECAST_DISCONNECTED, Tech.CAST_JS, SpotifyIconV2.CHROMECAST_DISCONNECTED);
    private static final Map<Tech, Integer> s;
    public gtb g;
    public ryo h;
    public jvf i;
    public jyx j;
    public jtz k;
    private long m;
    /* access modifiers changed from: private */
    public ConnectManager n;
    private final List<frx> o = new ArrayList(10);
    private frf p;
    private b q;
    private final defpackage.hjy.a<ConnectManager> t = new defpackage.hjy.a<ConnectManager>() {
        public final /* bridge */ /* synthetic */ void a(Object obj) {
            DeviceContextMenuActivity.this.n = (ConnectManager) obj;
        }

        public final void e() {
            DeviceContextMenuActivity.this.n = null;
        }
    };

    /* renamed from: com.spotify.music.features.connect.picker.contextmenu.ui.DeviceContextMenuActivity$5 reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a = new int[Tech.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.mobile.android.connect.model.Tech[] r0 = com.spotify.mobile.android.connect.model.Tech.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.connect.model.Tech r1 = com.spotify.mobile.android.connect.model.Tech.CAST     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.connect.model.Tech r1 = com.spotify.mobile.android.connect.model.Tech.CAST_JS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.connect.model.Tech r1 = com.spotify.mobile.android.connect.model.Tech.CONNECT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.connect.picker.contextmenu.ui.DeviceContextMenuActivity.AnonymousClass5.<clinit>():void");
        }
    }

    class a implements OnClickListener {
        private final mjz a;
        private final Context b;

        private a(mjz mjz, Context context) {
            this.a = mjz;
            this.b = context;
        }

        /* synthetic */ a(DeviceContextMenuActivity deviceContextMenuActivity, mjz mjz, Context context, byte b2) {
            this(mjz, context);
        }

        private static Intent a(Uri uri) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setData(uri);
            return intent;
        }

        private void a(Intent intent) {
            this.b.startActivity(intent);
        }

        public final void onClick(View view) {
            ryo ryo = DeviceContextMenuActivity.this.h;
            StringBuilder sb = new StringBuilder("connect-context-menu/");
            sb.append(DeviceContextMenuActivity.l);
            sb.append("/item/");
            ryo.a(sb.toString(), InteractionIntent.FORGET_DEVICE, (gkq) PageIdentifiers.CONNECT_CONTEXTMENU, ViewUris.bp);
            Intent a2 = a(this.a.c);
            if (!this.b.getPackageManager().queryIntentActivities(a2, 0).isEmpty()) {
                Logger.b("Opening companion app with uri [%s]", a2.getData().toString());
                a(a2);
                return;
            }
            Logger.b("Opening companion app not found. Will open app store [%s]", this.a.d.toString());
            a(a(this.a.d));
        }
    }

    static class b {
        final Context a;
        final ColorStateList b = new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842914}, new int[]{16842910}}, new int[]{fr.c(this.a, R.color.white), fr.c(this.a, R.color.green), fr.c(this.a, R.color.white)});
        final ColorStateList c = new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842910}}, new int[]{fr.c(this.a, R.color.green), fr.c(this.a, R.color.white)});
        private final jyx d;

        b(Context context, jyx jyx) {
            this.a = context;
            this.d = jyx;
        }

        static LayoutParams a(int i, int i2, int i3) {
            LayoutParams layoutParams = new LayoutParams(i, i2);
            layoutParams.setMargins(i3, i3, i3, i3);
            return layoutParams;
        }

        /* access modifiers changed from: private */
        public fry a(ViewGroup viewGroup, String str, String str2, OnClickListener onClickListener) {
            int a2 = a(28);
            int a3 = a(8);
            int a4 = a(16);
            fqv.b();
            fry b2 = fsk.b(this.a, viewGroup);
            TextView b3 = b2.b();
            b3.setText(str);
            b3.setTextColor(this.c);
            ImageView c2 = b2.c();
            this.d.a(c2, str2, gaa.a(this.a, SpotifyIconV2.SPOTIFY_CONNECT, 0.5f, true, true, (float) a(28)), (vfk) new vfk() {
                public final Drawable createDrawable(Bitmap bitmap) {
                    return new BitmapDrawable(b.this.a.getResources(), bitmap);
                }
            });
            c2.setLayoutParams(a(a2, a2, a3));
            ImageView imageView = new ImageView(this.a);
            imageView.setImageDrawable(gaa.a(this.a, SpotifyIconV2.ARROW_RIGHT, 0.5f, true, true, (float) a(28)));
            imageView.setRotation(-45.0f);
            imageView.setLayoutParams(a(a4, a4, a3));
            b2.a(imageView);
            b2.getView().setOnClickListener(onClickListener);
            return b2;
        }

        static void a(frt frt, boolean z) {
            frt.a().setVisibility(z ? 0 : 4);
            frt.a(z);
        }

        /* access modifiers changed from: 0000 */
        public int a(int i) {
            return vfj.b((float) i, this.a.getResources());
        }

        /* access modifiers changed from: 0000 */
        public frx a(ViewGroup viewGroup, String str, OnClickListener onClickListener) {
            fqv.b();
            fry b2 = fsk.b(this.a, viewGroup);
            TextView b3 = b2.b();
            b3.setText(str);
            b3.setTextColor(this.c);
            b2.getView().setOnClickListener(onClickListener);
            return b2;
        }

        /* access modifiers changed from: 0000 */
        public void a(SpotifyIconV2 spotifyIconV2, ColorStateList colorStateList, int i, ImageView imageView) {
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, spotifyIconV2, (float) i);
            spotifyIconDrawable.a(colorStateList);
            imageView.setImageDrawable(spotifyIconDrawable);
        }
    }

    static {
        Tech tech = Tech.CONNECT;
        Integer valueOf = Integer.valueOf(R.string.connect_device_tech_connect);
        Tech tech2 = Tech.CAST;
        Integer valueOf2 = Integer.valueOf(R.string.connect_device_tech_cast);
        s = ImmutableMap.a(tech, valueOf, tech2, valueOf2, Tech.CAST_JS, valueOf2);
    }

    public static void a(Context context, GaiaDevice gaiaDevice, int i2) {
        Intent intent = new Intent(context, DeviceContextMenuActivity.class);
        intent.putExtra("device", gaiaDevice);
        intent.putExtra("index", i2);
        intent.putParcelableArrayListExtra("gaia_incarnations", new ArrayList(gaiaDevice.getIncarnations()));
        intent.putParcelableArrayListExtra("gaia_capabilities", mkt.a(gaiaDevice.getCapabilities(), gaiaDevice.getPhysicalIdentifier()));
        intent.putExtra("gaia_support_logout", gaiaDevice.supportsLogout());
        intent.putExtra("gaia_support_rename", gaiaDevice.supportsRename());
        intent.putExtra("gaia_support_volume", gaiaDevice.supportsVolume());
        context.startActivity(intent);
    }

    private void a(ViewGroup viewGroup, List<mjz> list) {
        for (mjz mjz : list) {
            frx a2 = fbo.a(mjz.b) ? this.q.a(viewGroup, mjz.a, (OnClickListener) new a(this, mjz, this, 0)) : this.q.a(viewGroup, mjz.a, mjz.b, (OnClickListener) new a(this, mjz, this, 0));
            if (a2.getView() != null) {
                viewGroup.addView(a2.getView());
            } else {
                Logger.d("Error inflating capability item %s", mjz.a);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(GaiaDeviceIncarnation gaiaDeviceIncarnation) {
        ConnectManager connectManager = this.n;
        if (connectManager == null || !connectManager.o()) {
            Logger.e("Unable to set ZeroConf as preferred", new Object[0]);
        } else {
            this.n.b(gaiaDeviceIncarnation.getIdentifier());
            this.i.a(SpotifyIconV2.CHECK, (int) R.string.connect_device_connection_updated, 1);
        }
        finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(GaiaDeviceIncarnation gaiaDeviceIncarnation, View view) {
        a((frt) fqv.a(view, frt.class));
        int i2 = AnonymousClass5.a[gaiaDeviceIncarnation.getTech().ordinal()];
        InteractionIntent interactionIntent = (i2 == 1 || i2 == 2) ? InteractionIntent.DEFAULT_CAST : InteractionIntent.DEFAULT_CONNECT;
        ryo ryo = this.h;
        StringBuilder sb = new StringBuilder("connect-context-menu/");
        sb.append(l);
        sb.append("/item/");
        ryo.a(sb.toString(), interactionIntent, (gkq) PageIdentifiers.CONNECT_CONTEXTMENU, ViewUris.bp);
        a(gaiaDeviceIncarnation);
    }

    static /* synthetic */ void a(DeviceContextMenuActivity deviceContextMenuActivity, GaiaDevice gaiaDevice) {
        ConnectManager connectManager = deviceContextMenuActivity.n;
        if (connectManager != null) {
            connectManager.e(gaiaDevice.getIdentifier());
        }
    }

    /* access modifiers changed from: private */
    public void a(frt frt) {
        for (frt a2 : this.o) {
            b.a(a2, false);
        }
        b.a(frt, true);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.CONNECT_CONTEXTMENU, ViewUris.bp.toString());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gar.a(this);
        setContentView((int) R.layout.empty_layout);
        Intent intent = getIntent();
        Assertion.a((Object) intent);
        final GaiaDevice gaiaDevice = (GaiaDevice) intent.getParcelableExtra("device");
        l = intent.getIntExtra("index", -1);
        Assertion.a((Object) gaiaDevice);
        this.g.a(this.t);
        this.m = this.k.a();
        this.p = new frf(this);
        this.p.setOnDismissListener(new OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                DeviceContextMenuActivity.this.finish();
            }
        });
        frf frf = this.p;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this).inflate(R.layout.connect_device_dropdown, null);
        this.q = new b(this, this.j);
        b bVar = this.q;
        int i2 = 8;
        int a2 = bVar.a(8);
        int i3 = 24;
        int a3 = bVar.a(24);
        fqv.b();
        fry b2 = fsk.b(bVar.a, viewGroup);
        b2.a(gaiaDevice.getName());
        b2.b().setTextColor(fr.c(bVar.a, R.color.white));
        b2.b().setTypeface(b2.b().getTypeface(), 1);
        b2.c().setLayoutParams(b.a(a3, a3, a2));
        b2.c().setImageDrawable(new SpotifyIconDrawable(bVar.a, guh.a(gaiaDevice.getType(), gaiaDevice.isGrouped()), (float) a3));
        View view = b2.getView();
        view.setEnabled(false);
        view.setOnClickListener(null);
        viewGroup.addView(b2.getView());
        Intent intent2 = getIntent();
        Assertion.a((Object) intent2);
        ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("gaia_incarnations");
        Assertion.a((Object) parcelableArrayListExtra);
        if (!parcelableArrayListExtra.isEmpty()) {
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                final GaiaDeviceIncarnation gaiaDeviceIncarnation = (GaiaDeviceIncarnation) it.next();
                boolean isPreferred = gaiaDeviceIncarnation.isPreferred();
                Tech tech = gaiaDeviceIncarnation.getTech();
                SpotifyIconV2 spotifyIconV2 = (SpotifyIconV2) r.get(tech);
                Integer num = (Integer) s.get(tech);
                b bVar2 = this.q;
                AnonymousClass4 r15 = new OnClickListener() {
                    public final void onClick(View view) {
                        DeviceContextMenuActivity.this.a((frt) fqv.a(view, frt.class));
                        DeviceContextMenuActivity.this.a(gaiaDeviceIncarnation);
                    }
                };
                int a4 = bVar2.a(i2);
                int a5 = bVar2.a(16);
                int a6 = bVar2.a(i3);
                fqv.b();
                fry b3 = fsk.b(bVar2.a, viewGroup);
                Iterator it2 = it;
                b3.b().setTextColor(bVar2.b);
                ImageView c = b3.c();
                c.setLayoutParams(b.a(a6, a6, a4));
                bVar2.a(spotifyIconV2, bVar2.b, a6, c);
                c.setScaleType(ScaleType.CENTER);
                c.setPadding(a5, a5, a5, a5);
                ImageView imageView = new ImageView(bVar2.a);
                imageView.setLayoutParams(b.a(a6, a6, a4));
                bVar2.a(SpotifyIconV2.CHECK, bVar2.b, a6, imageView);
                imageView.setClickable(true);
                imageView.setFocusable(true);
                b3.b(true);
                b3.a(imageView);
                b3.a(bVar2.a.getText(num.intValue()));
                b3.a(isPreferred);
                vgl.a(b3.getView(), (int) R.attr.selectableItemBackground);
                b.a(b3, isPreferred);
                ViewGroup viewGroup2 = (ViewGroup) b3.getView();
                viewGroup2.setClickable(true);
                viewGroup2.setOnClickListener(r15);
                ViewGroup viewGroup3 = (ViewGroup) b3.getView();
                viewGroup3.setClickable(true);
                viewGroup3.setOnClickListener(new OnClickListener(gaiaDeviceIncarnation) {
                    private final /* synthetic */ GaiaDeviceIncarnation f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        DeviceContextMenuActivity.this.a(this.f$1, view);
                    }
                });
                viewGroup.addView(b3.getView());
                this.o.add(b3);
                it = it2;
                i2 = 8;
                i3 = 24;
            }
        }
        Intent intent3 = getIntent();
        Assertion.a((Object) intent3);
        if (intent3.getBooleanExtra("gaia_support_logout", false)) {
            b bVar3 = this.q;
            AnonymousClass3 r5 = new OnClickListener() {
                public final void onClick(View view) {
                    ryo ryo = DeviceContextMenuActivity.this.h;
                    StringBuilder sb = new StringBuilder("connect-context-menu/");
                    sb.append(DeviceContextMenuActivity.l);
                    sb.append("/item/");
                    ryo.a(sb.toString(), InteractionIntent.FORGET_DEVICE, (gkq) PageIdentifiers.CONNECT_CONTEXTMENU, ViewUris.bp);
                    DeviceContextMenuActivity.a(DeviceContextMenuActivity.this, gaiaDevice);
                    DeviceContextMenuActivity.this.finish();
                }
            };
            fqv.b();
            frx a7 = fsk.a(bVar3.a, viewGroup);
            TextView b4 = a7.b();
            b4.setText(R.string.connect_device_menu_logout);
            b4.setTextColor(bVar3.c);
            View view2 = a7.getView();
            view2.setClickable(true);
            view2.setOnClickListener(r5);
            viewGroup.addView(a7.getView());
        }
        Intent intent4 = getIntent();
        Assertion.a((Object) intent4);
        ArrayList parcelableArrayListExtra2 = intent4.getParcelableArrayListExtra("gaia_capabilities");
        if (!parcelableArrayListExtra2.isEmpty()) {
            a(viewGroup, (List<mjz>) parcelableArrayListExtra2);
        }
        frf.a.removeAllViews();
        frf.a.addView(viewGroup, new FrameLayout.LayoutParams(-1, -1));
        this.p.show();
    }

    public void onDestroy() {
        this.g.b(this.t);
        this.n = null;
        this.o.clear();
        frf frf = this.p;
        if (frf != null && frf.isShowing()) {
            this.p.setOnDismissListener(null);
            this.p.dismiss();
        }
        super.onDestroy();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.m = bundle.getLong("startTime", this.m);
        super.onRestoreInstanceState(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("startTime", this.m);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.g.a();
        super.onStart();
    }

    public void onStop() {
        this.g.b();
        super.onStop();
    }
}
