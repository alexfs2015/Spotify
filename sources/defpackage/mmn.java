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

/* renamed from: mmn reason: default package */
public class mmn extends jrd implements jqx, mmc, a, uqq {
    public mnc T;
    DraggableSeekBar U;
    private LinearLayout V;
    private RecyclerView W;
    private GridLayoutManager X;
    /* access modifiers changed from: private */
    public boolean Y;
    private boolean Z;
    public mkc a;
    private float aa;
    private final a ab = new a() {
        public final void a() {
            mmn.this.Y = true;
        }

        public final void a(int i) {
            float d = mmn.this.d(i - 6);
            mmn.this.b.a(d);
            mmn.this.T.a(d);
        }

        public final void a(SeekBar seekBar) {
            float a2 = VolumeWidgetActivity.a.a(mmn.this.U);
            mmn.this.b.a(a2);
            mmn.this.Y = false;
            mmn.this.T.a(a2);
        }

        public final void b(int i) {
            float d = mmn.this.d(i + 6);
            mmn.this.b.a(d);
            mmn.this.T.a(d);
        }

        public final void b(SeekBar seekBar) {
            mmn.this.b.a(VolumeWidgetActivity.a.a(mmn.this.U));
        }
    };
    public mma b;

    public static mmn a(fqn fqn) {
        mmn mmn = new mmn();
        fqo.a((Fragment) mmn, fqn);
        return mmn;
    }

    public final void A() {
        super.A();
        mma mma = this.b;
        mma.c();
        mly mly = mma.a;
        mly.h.a.b();
        mmd mmd = mly.f.a;
        mmd.a.bd_();
        mmd.b.bd_();
        if (mly.k) {
            mly.j.b.a(Disposables.b());
        }
        mng mng = mma.d;
        rzf rzf = mng.b;
        rzf.a.getContentResolver().unregisterContentObserver(rzf.b);
        rzf.b.b = null;
        mng.c.c();
        mma.e.bd_();
        this.Z = false;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device, viewGroup, false);
        this.W = (RecyclerView) inflate.findViewById(R.id.devices_list);
        this.U = (DraggableSeekBar) inflate.findViewById(R.id.volume_slider);
        this.V = (LinearLayout) inflate.findViewById(R.id.volume_bar);
        kf p = p();
        if (p != null) {
            this.X = new GridLayoutManager(p, ((Integer) this.b.c.get()).intValue());
            mma mma = this.b;
            RecyclerView recyclerView = this.W;
            GridLayoutManager gridLayoutManager = this.X;
            recyclerView.a((i) gridLayoutManager);
            recyclerView.a((RecyclerView.a) mma.a);
            gridLayoutManager.b = new b() {
                public final int a(int i) {
                    return mma.this.a.g(i);
                }
            };
            kf p2 = p();
            Context n = n();
            if (n != null && (p2 instanceof DevicePickerActivity)) {
                this.W.a((m) new mmv(gav.a(n), ((DevicePickerActivity) p2).j.e, this.X));
            }
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.volume_img);
        kf p3 = p();
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

    public void a() {
        kf p = p();
        if (p != null) {
            p.finish();
        }
    }

    public final void a(float f) {
        if (!this.Y) {
            VolumeWidgetActivity.a.a(f, this.U);
            this.aa = f;
        }
    }

    public final void a(GaiaDevice gaiaDevice, int i) {
        kf p = p();
        if (p != null) {
            DeviceContextMenuActivity.a(p, gaiaDevice, i);
        }
    }

    public void a(mlq mlq, int i) {
        kf p = p();
        if (p instanceof DevicePickerActivity) {
            DevicePickerActivity devicePickerActivity = (DevicePickerActivity) p;
            devicePickerActivity.r = mlq;
            gkq b2 = mli.b(mlq);
            rym rym = devicePickerActivity.k;
            StringBuilder sb = new StringBuilder("devices-list/");
            sb.append(i);
            sb.append("/education/");
            sb.append(b2.a());
            ah ahVar = new ah(null, sb.toString(), null, InteractionIntent.NAVIGATE.mInteractionIntent, PageIdentifiers.CONNECT_DEVICEPICKER.mPageIdentifier, ViewUris.bo.toString());
            rym.a.a(ahVar);
            Logger.b(ahVar.a(), new Object[0]);
            devicePickerActivity.a((Fragment) DevicePickerActivity.a(mlq), "tag_education_steps_fragment", mlq.b);
        }
    }

    public final void aP_() {
        super.aP_();
        this.a.a((a) new a() {
            public final void a(String str) {
                Logger.b("Logout device: %s", str);
            }

            public final void a(String str, String str2, String str3, String str4, String str5) {
                Logger.b("Login device: %s", str);
            }
        });
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.bo;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.bo.toString());
    }

    public final uqm ag() {
        return uqo.M;
    }

    public final gkq aj() {
        return PageIdentifiers.CONNECT_DEVICEPICKER;
    }

    public final void au_() {
        if (this.Z) {
            mne mne = new mne(this.V, 200);
            mne.b = -this.V.getMeasuredHeight();
            mne.a = 0;
            this.V.startAnimation(mne);
            this.Z = false;
        }
    }

    public void av_() {
        new a(p(), 2132017714).b(R.string.connect_picker_empty_context_body).a((int) R.string.two_button_dialog_button_ok, (OnClickListener) $$Lambda$mmn$4D0guNhmIqOrPBXOCZHPR2izIAc.INSTANCE).a((rma) p(), PageIdentifiers.CONNECT_DEVICEPICKER.mPageIdentifier, ViewUris.bo.toString()).a().show();
    }

    public final String b(Context context) {
        return context.getString(R.string.connect_picker_header_text);
    }

    public final void b() {
        if (!this.Z) {
            mne mne = new mne(this.V, 200);
            mne.b = 0;
            mne.a = -this.V.getMeasuredHeight();
            this.V.startAnimation(mne);
            this.Z = true;
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.b.a();
        c(false);
    }

    public final float d(int i) {
        return ((float) i) / ((float) this.U.getMax());
    }

    public final String e() {
        return "devices";
    }

    public final void h() {
        super.h();
        this.a.a.c();
    }

    public final int i() {
        return o().getResources().getConfiguration().orientation;
    }

    public void j() {
        kf p = p();
        if (p instanceof DevicePickerActivity) {
            DevicePickerActivity devicePickerActivity = (DevicePickerActivity) p;
            devicePickerActivity.a((Fragment) upr.e(), "tag_participant_list_fragment", upr.b(devicePickerActivity));
        }
    }

    public final void z() {
        super.z();
        mma mma = this.b;
        mma.e.a(mma.b.d());
        mma.c();
        mma.g = new DisposableObserver<PlayerState>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
                Logger.e(th, th.getMessage(), new Object[0]);
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
                mma.this.h = PlayerStateUtil.isEmptyContext(playerState);
                mly mly = mma.this.a;
                mly.h.d = z2;
                mly.h.e = z;
                mma.this.b();
            }
        };
        mma.f.subscribe(mma.g);
        mly mly = mma.a;
        mly.h.a.a();
        mly.f.a.a();
        if (mly.k) {
            mly.j.d();
        }
        mma.d.a();
    }
}
