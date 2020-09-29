package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.connect.model.DeviceState;
import com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState;
import com.spotify.music.R;

/* renamed from: mku reason: default package */
public final class mku implements gtw {
    public final mmf a;
    public a b;
    public c c;
    public boolean d;
    public boolean e;
    private final mmr f;
    private final mmt g;
    private final mmo h;

    /* renamed from: mku$a */
    public interface a {
        void onClick(gtz gtz, int i);
    }

    /* renamed from: mku$b */
    public static class b extends u {
        final fsc a;

        public b(fsc fsc) {
            super(fsc.getView());
            this.a = fsc;
        }
    }

    /* renamed from: mku$c */
    public interface c {
        void onClick(gtz gtz, int i);
    }

    public mku(mmf mmf, mmr mmr, mmt mmt, mmo mmo) {
        this.a = mmf;
        this.f = mmr;
        this.g = mmt;
        this.h = mmo;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gtz gtz, int i, View view) {
        c cVar = this.c;
        if (cVar != null) {
            cVar.onClick(gtz, i);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, gtz gtz, int i, View view) {
        if (this.b != null && bVar.o.isEnabled() && mmo.b(gtz)) {
            this.b.onClick(gtz, i);
        }
    }

    public final int a() {
        return 31;
    }

    public final long a(int i) {
        return (long) ((gtz) this.a.a.get(i)).hashCode();
    }

    public final u a(ViewGroup viewGroup, int i) {
        fqv.b();
        return new b(fsk.b(viewGroup.getContext(), viewGroup, false));
    }

    public final void a(u uVar, int i) {
        String str;
        gtz gtz = (gtz) this.a.a.get(i);
        if (uVar instanceof b) {
            b bVar = (b) uVar;
            Context context = bVar.o.getContext();
            bVar.a.a(jyz.b(context, SpotifyIconV2.MORE_ANDROID));
            TextView d2 = bVar.a.d();
            d2.setTextColor(fr.b(context, (int) R.color.txt_connect_picker_subtitle));
            bVar.a.a(gtz.isActive());
            bVar.o.setEnabled(!this.d && !gtz.isDisabled());
            if (gtz.isActive()) {
                bVar.a.a(this.g.a(this.e));
            } else {
                bVar.a.a(gtz.getName());
            }
            fsc fsc = bVar.a;
            mmt mmt = this.g;
            DeviceState state = gtz.getState();
            if (state == GaiaDeviceState.CONNECTING) {
                str = mmt.a.getString(R.string.connect_device_connecting);
            } else if (state == GaiaDeviceState.UNAVAILABLE) {
                str = mmt.a.getString(R.string.connect_device_unavailable_for_playback);
            } else if (state == GaiaDeviceState.PREMIUM_REQUIRED) {
                str = mmt.a.getString(R.string.connect_device_premium_only);
            } else if (state == GaiaDeviceState.INCOMPATIBLE) {
                str = mmt.a.getString(R.string.connect_device_incompatible);
            } else if (state == GaiaDeviceState.NOT_INSTALLED) {
                str = mmt.a.getString(R.string.connect_device_not_installed);
            } else if (state == GaiaDeviceState.UNSUPPORTED_URI || state == GaiaDeviceState.NOT_AUTHORIZED) {
                str = mmt.a.getString(R.string.connect_device_unsupported_uri);
            } else if (gtz.isActive()) {
                str = gtz.getName();
            } else {
                int i2 = mmo.c(gtz) ? R.string.connect_device_tech_cast : mmo.d(gtz) ? R.string.connect_device_tech_bluetooth : R.string.connect_device_tech_connect;
                str = mmt.a.getString(i2);
            }
            fsc.b(str);
            mmr mmr = this.f;
            int b2 = vfj.b(12.0f, mmr.b.getResources());
            mmo mmo = mmr.c;
            char c2 = gtz.isDisabled() ? 0 : mmo.c(gtz) ? mmo.e(gtz) ? 3 : gtz.isActive() ? (char) 4 : 2 : mmo.d(gtz) ? (char) 5 : 1;
            Drawable drawable = c2 != 1 ? c2 != 2 ? c2 != 3 ? c2 != 4 ? c2 != 5 ? null : mmr.a(SpotifyIconV2.BLUETOOTH, b2, mmr.txt_connect_picker_subtitle) : mmr.a(SpotifyIconV2.CHROMECAST_CONNECTED, b2, mmr.txt_connect_picker_subtitle) : mmr.a((View) d2, b2, mmr.txt_connect_picker_subtitle) : mmr.a(SpotifyIconV2.CHROMECAST_DISCONNECTED, b2, mmr.txt_connect_picker_subtitle) : mmr.a(SpotifyIconV2.SPOTIFY_CONNECT, b2, mmr.txt_connect_picker_subtitle);
            d2.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
            int b3 = this.f.b();
            bVar.a.c().setPadding(b3, b3, b3, b3);
            ImageView c3 = bVar.a.c();
            mmr mmr2 = this.f;
            SpotifyIconV2 spotifyIconV2 = (SpotifyIconV2) mmr2.d.get(gtz.getType());
            if (spotifyIconV2 == null) {
                spotifyIconV2 = SpotifyIconV2.DEVICE_SPEAKER;
            }
            if (SpotifyIconV2.DEVICE_SPEAKER == spotifyIconV2 && gtz.isGrouped()) {
                spotifyIconV2 = SpotifyIconV2.DEVICE_MULTISPEAKER;
            }
            c3.setImageDrawable(mmr2.a(spotifyIconV2));
            if (mmo.a(gtz)) {
                View a2 = bVar.a.a();
                a2.setVisibility(0);
                a2.setOnClickListener(new $$Lambda$mku$9Jhldxi4yKjm1LmAqySv7U5NmKg(this, gtz, i));
            } else {
                View a3 = bVar.a.a();
                a3.setVisibility(4);
                a3.setOnClickListener(null);
            }
            bVar.o.setOnClickListener(new $$Lambda$mku$D31F22Scg5HOLHuDWbHtZeUi6I(this, bVar, gtz, i));
            return;
        }
        throw new RuntimeException(String.format("Wrong ViewHolder received. Expected: %s Received: %s", new Object[]{b.class.getSimpleName(), uVar.getClass().getSimpleName()}));
    }

    public final int b() {
        return this.a.a.size();
    }

    public final int[] c() {
        return new int[]{31};
    }
}
