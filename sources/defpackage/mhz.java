package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.ui.view.DraggableSeekBar;
import com.spotify.mobile.android.ui.view.DraggableSeekBar.a;
import com.spotify.music.R;
import com.spotify.music.features.connect.dialogs.VolumeWidgetActivity;
import com.spotify.music.features.connect.picker.contextmenu.ui.DeviceContextMenuActivity;
import com.spotify.music.features.connect.picker.ui.DevicePickerActivity;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.reactivex.disposables.Disposables;
import io.reactivex.observers.DisposableObserver;

/* renamed from: mhz reason: default package */
public class mhz extends jor implements jol, mho, a, udv {
    public mii T;
    DraggableSeekBar U;
    private LinearLayout V;
    private RecyclerView W;
    private GridLayoutManager X;
    /* access modifiers changed from: private */
    public boolean Y;
    private boolean Z;
    public mfq a;
    private float aa;
    private final a ab = new a() {
        public final void a() {
            mhz.this.Y = true;
        }

        public final void a(SeekBar seekBar) {
            float a2 = VolumeWidgetActivity.a.a(mhz.this.U);
            mhz.this.b.a(a2);
            mhz.this.Y = false;
            mhz.this.T.a(a2);
        }

        public final void b(SeekBar seekBar) {
            mhz.this.b.a(VolumeWidgetActivity.a.a(mhz.this.U));
        }

        public final void a(int i) {
            float d = mhz.this.d(i - 6);
            mhz.this.b.a(d);
            mhz.this.T.a(d);
        }

        public final void b(int i) {
            float d = mhz.this.d(i + 6);
            mhz.this.b.a(d);
            mhz.this.T.a(d);
        }
    };
    public mhm b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "devices";
    }

    public static mhz a(fpt fpt) {
        mhz mhz = new mhz();
        fpu.a((Fragment) mhz, fpt);
        return mhz;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.b.a();
        c(false);
    }

    public final void g() {
        super.g();
        this.a.a((a) new a() {
            public final void a(String str, String str2, String str3, String str4, String str5) {
                Logger.b("Login device: %s", str);
            }

            public final void a(String str) {
                Logger.b("Logout device: %s", str);
            }
        });
    }

    public final void z() {
        super.z();
        mhm mhm = this.b;
        mhm.e.a(mhm.b.d());
        mhm.c();
        mhm.g = new DisposableObserver<PlayerState>() {
            public final void onComplete() {
            }

            public final /* synthetic */ void onNext(Object obj) {
                boolean z;
                PlayerState playerState = (PlayerState) obj;
                boolean z2 = false;
                if (playerState.track() != null) {
                    String str = (String) playerState.contextMetadata().get("media.type");
                    z2 = PlayerTrackUtil.isAd(playerState.track());
                    if (str == null) {
                        str = "audio";
                    }
                    z = "video".equals(str);
                } else {
                    z = false;
                }
                mhm.this.h = PlayerStateUtil.isEmptyContext(playerState);
                mhk mhk = mhm.this.a;
                mhk.h.d = z2;
                mhk.h.e = z;
                mhm.this.b();
            }

            public final void onError(Throwable th) {
                Logger.e(th, th.getMessage(), new Object[0]);
            }
        };
        mhm.f.subscribe(mhm.g);
        mhk mhk = mhm.a;
        mhk.h.a.a();
        mhk.f.a.a();
        if (mhk.k) {
            mhk.j.d();
        }
        mhm.d.a();
    }

    public final void A() {
        super.A();
        mhm mhm = this.b;
        mhm.c();
        mhk mhk = mhm.a;
        mhk.h.a.b();
        mhp mhp = mhk.f.a;
        mhp.a.bf_();
        mhp.b.bf_();
        if (mhk.k) {
            mhk.j.b.a(Disposables.b());
        }
        min min = mhm.d;
        iqy iqy = min.b;
        iqy.a.getContentResolver().unregisterContentObserver(iqy.b);
        iqy.b.b = null;
        min.c.c();
        mhm.e.bf_();
        this.Z = false;
    }

    public final void h() {
        super.h();
        this.a.a.c();
    }

    public void a() {
        ka p = p();
        if (p != null) {
            p.finish();
        }
    }

    public final String b(Context context) {
        return context.getString(R.string.connect_picker_header_text);
    }

    public final udr ag() {
        return udt.M;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.bp.toString());
    }

    public final sih ae_() {
        return ViewUris.bp;
    }

    public final void a(float f) {
        if (!this.Y) {
            VolumeWidgetActivity.a.a(f, this.U);
            this.aa = f;
        }
    }

    public final void b() {
        if (!this.Z) {
            mik mik = new mik(this.V, 200);
            mik.b = 0;
            mik.a = -this.V.getMeasuredHeight();
            this.V.startAnimation(mik);
            this.Z = true;
        }
    }

    public final void av_() {
        if (this.Z) {
            mik mik = new mik(this.V, 200);
            mik.b = -this.V.getMeasuredHeight();
            mik.a = 0;
            this.V.startAnimation(mik);
            this.Z = false;
        }
    }

    public void aw_() {
        new a(p(), 2132017711).b(R.string.connect_picker_empty_context_body).a((int) R.string.two_button_dialog_button_ok, (OnClickListener) $$Lambda$mhz$Yb1Ejm7DqrlMxonw0iJ9zOADo8I.INSTANCE).a((rdc) p(), PageIdentifiers.CONNECT_DEVICEPICKER.mPageIdentifier, ViewUris.bp.toString()).a().show();
    }

    public final float d(int i) {
        return ((float) i) / ((float) this.U.getMax());
    }

    public final gjf aj() {
        return PageIdentifiers.CONNECT_DEVICEPICKER;
    }

    public void a(mhc mhc, int i) {
        ka p = p();
        if (p instanceof DevicePickerActivity) {
            DevicePickerActivity devicePickerActivity = (DevicePickerActivity) p;
            devicePickerActivity.r = mhc;
            rpg rpg = devicePickerActivity.k;
            int i2 = mhc.a;
            StringBuilder sb = new StringBuilder("devices-list/");
            sb.append(i);
            sb.append("education/");
            sb.append(i2);
            String sb2 = sb.toString();
            Logger.b("LOG - itemId          : %s", sb2);
            Logger.b("LOG - intent          : %s", InteractionIntent.NAVIGATE);
            Logger.b("LOG - page_identifier : %s", PageIdentifiers.CONNECT_DEVICEPICKER);
            Logger.b("LOG - uri             : %s", ViewUris.bp);
            ai aiVar = new ai(null, sb2, null, InteractionIntent.NAVIGATE.toString(), PageIdentifiers.CONNECT_DEVICEPICKER.toString(), ViewUris.bp.toString());
            rpg.a.a(aiVar);
            Logger.b(aiVar.a(), new Object[0]);
            devicePickerActivity.a((Fragment) DevicePickerActivity.a(mhc), "tag_education_steps_fragment", mhc.b);
        }
    }

    public void j() {
        ka p = p();
        if (p instanceof DevicePickerActivity) {
            DevicePickerActivity devicePickerActivity = (DevicePickerActivity) p;
            devicePickerActivity.a((Fragment) ucw.e(), "tag_participant_list_fragment", ucw.b(devicePickerActivity));
        }
    }

    public final void a(GaiaDevice gaiaDevice, int i) {
        ka p = p();
        if (p != null) {
            DeviceContextMenuActivity.a(p, gaiaDevice, i);
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device, viewGroup, false);
        this.W = (RecyclerView) inflate.findViewById(R.id.devices_list);
        this.U = (DraggableSeekBar) inflate.findViewById(R.id.volume_slider);
        this.V = (LinearLayout) inflate.findViewById(R.id.volume_bar);
        ka p = p();
        if (p != null) {
            this.X = new GridLayoutManager(p, ((Integer) this.b.c.get()).intValue());
            mhm mhm = this.b;
            RecyclerView recyclerView = this.W;
            GridLayoutManager gridLayoutManager = this.X;
            recyclerView.a((i) gridLayoutManager);
            recyclerView.a((RecyclerView.a) mhm.a);
            gridLayoutManager.b = new b() {
                public final int a(int i) {
                    return mhm.this.a.g(i);
                }
            };
            ka p2 = p();
            Context n = n();
            if (n != null && (p2 instanceof DevicePickerActivity)) {
                this.W.a((m) new mih(gab.a(n), ((DevicePickerActivity) p2).j.e, this.X));
            }
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.volume_img);
        ka p3 = p();
        Context n2 = n();
        if (!(p3 == null || n2 == null)) {
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable((Context) p3, SpotifyIconV2.NEW_VOLUME, (float) o().getResources().getDimensionPixelSize(R.dimen.device_picker_volume_image_height));
            spotifyIconDrawable.a(fr.c(n2, R.color.device_picker_volume_icon));
            imageView.setImageDrawable(spotifyIconDrawable);
            this.U.setMax(100);
            VolumeWidgetActivity.a.a(this.aa, this.U);
            this.U.a = this.ab;
            ((MarginLayoutParams) this.V.getLayoutParams()).bottomMargin = -o().getResources().getDimensionPixelSize(R.dimen.device_volume_bar_height);
            this.V.requestLayout();
        }
        return inflate;
    }

    public final int i() {
        return o().getResources().getConfiguration().orientation;
    }
}
