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

/* renamed from: mgg reason: default package */
public final class mgg implements gru {
    public final mhr a;
    public a b;
    public c c;
    public boolean d;
    public boolean e;
    private final mid f;
    private final mif g;
    private final mia h;

    /* renamed from: mgg$a */
    public interface a {
        void onClick(grz grz, int i);
    }

    /* renamed from: mgg$b */
    public static class b extends u {
        final fri a;

        public b(fri fri) {
            super(fri.getView());
            this.a = fri;
        }
    }

    /* renamed from: mgg$c */
    public interface c {
        void onClick(grz grz, int i);
    }

    public final int a() {
        return 31;
    }

    public final int[] c() {
        return new int[]{31};
    }

    public mgg(mhr mhr, mid mid, mif mif, mia mia) {
        this.a = mhr;
        this.f = mid;
        this.g = mif;
        this.h = mia;
    }

    public final u a(ViewGroup viewGroup, int i) {
        fqb.b();
        return new b(frq.b(viewGroup.getContext(), viewGroup, false));
    }

    public final void a(u uVar, int i) {
        String str;
        grz grz = (grz) this.a.a.get(i);
        if (uVar instanceof b) {
            b bVar = (b) uVar;
            Context context = bVar.o.getContext();
            bVar.a.a(jwz.b(context, SpotifyIconV2.MORE_ANDROID));
            TextView d2 = bVar.a.d();
            d2.setTextColor(fr.b(context, (int) R.color.txt_connect_picker_subtitle));
            bVar.a.a(grz.isActive());
            bVar.o.setEnabled(!this.d && !grz.isDisabled());
            if (grz.isActive()) {
                bVar.a.a(this.g.a(this.e));
            } else {
                bVar.a.a(grz.getName());
            }
            fri fri = bVar.a;
            mif mif = this.g;
            DeviceState state = grz.getState();
            if (state == GaiaDeviceState.CONNECTING) {
                str = mif.a.getString(R.string.connect_device_connecting);
            } else if (state == GaiaDeviceState.UNAVAILABLE) {
                str = mif.a.getString(R.string.connect_device_unavailable_for_playback);
            } else if (state == GaiaDeviceState.PREMIUM_REQUIRED) {
                str = mif.a.getString(R.string.connect_device_premium_only);
            } else if (state == GaiaDeviceState.INCOMPATIBLE) {
                str = mif.a.getString(R.string.connect_device_incompatible);
            } else if (state == GaiaDeviceState.NOT_INSTALLED) {
                str = mif.a.getString(R.string.connect_device_not_installed);
            } else if (state == GaiaDeviceState.UNSUPPORTED_URI || state == GaiaDeviceState.NOT_AUTHORIZED) {
                str = mif.a.getString(R.string.connect_device_unsupported_uri);
            } else if (grz.isActive()) {
                str = grz.getName();
            } else {
                int i2 = mia.c(grz) ? R.string.connect_device_tech_cast : mia.d(grz) ? R.string.connect_device_tech_bluetooth : R.string.connect_device_tech_connect;
                str = mif.a.getString(i2);
            }
            fri.b(str);
            mid mid = this.f;
            int b2 = uts.b(12.0f, mid.b.getResources());
            mia mia = mid.c;
            char c2 = grz.isDisabled() ? 0 : mia.c(grz) ? mia.e(grz) ? 3 : grz.isActive() ? (char) 4 : 2 : mia.d(grz) ? (char) 5 : 1;
            Drawable drawable = c2 != 1 ? c2 != 2 ? c2 != 3 ? c2 != 4 ? c2 != 5 ? null : mid.a(SpotifyIconV2.BLUETOOTH, b2, mid.txt_connect_picker_subtitle) : mid.a(SpotifyIconV2.CHROMECAST_CONNECTED, b2, mid.txt_connect_picker_subtitle) : mid.a((View) d2, b2, mid.txt_connect_picker_subtitle) : mid.a(SpotifyIconV2.CHROMECAST_DISCONNECTED, b2, mid.txt_connect_picker_subtitle) : mid.a(SpotifyIconV2.SPOTIFY_CONNECT, b2, mid.txt_connect_picker_subtitle);
            d2.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
            int b3 = this.f.b();
            bVar.a.c().setPadding(b3, b3, b3, b3);
            ImageView c3 = bVar.a.c();
            mid mid2 = this.f;
            SpotifyIconV2 spotifyIconV2 = (SpotifyIconV2) mid2.d.get(grz.getType());
            if (spotifyIconV2 == null) {
                spotifyIconV2 = SpotifyIconV2.DEVICE_SPEAKER;
            }
            if (SpotifyIconV2.DEVICE_SPEAKER == spotifyIconV2 && grz.isGrouped()) {
                spotifyIconV2 = SpotifyIconV2.DEVICE_MULTISPEAKER;
            }
            c3.setImageDrawable(mid2.a(spotifyIconV2));
            if (mia.a(grz)) {
                View a2 = bVar.a.a();
                a2.setVisibility(0);
                a2.setOnClickListener(new $$Lambda$mgg$b_ZY9EHKGSQWo9PZKUOCEeeTc0(this, grz, i));
            } else {
                View a3 = bVar.a.a();
                a3.setVisibility(4);
                a3.setOnClickListener(null);
            }
            bVar.o.setOnClickListener(new $$Lambda$mgg$7ox1AqXjBMctgYu4dWezlUaX8pc(this, bVar, grz, i));
            return;
        }
        throw new RuntimeException(String.format("Wrong ViewHolder received. Expected: %s Received: %s", new Object[]{b.class.getSimpleName(), uVar.getClass().getSimpleName()}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, grz grz, int i, View view) {
        if (this.b != null && bVar.o.isEnabled() && mia.b(grz)) {
            this.b.onClick(grz, i);
        }
    }

    public final long a(int i) {
        return (long) ((grz) this.a.a.get(i)).hashCode();
    }

    public final int b() {
        return this.a.a.size();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(grz grz, int i, View view) {
        c cVar = this.c;
        if (cVar != null) {
            cVar.onClick(grz, i);
        }
    }
}
