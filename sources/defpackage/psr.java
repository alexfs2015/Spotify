package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel.HeaderViewType;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: psr reason: default package */
public final class psr {
    final Activity a;
    final udr b;
    final spi c;
    final jsz d;
    final ToastieManager e;
    public final jmf<RadioStationModel> f = new jmf<RadioStationModel>() {
        public final /* synthetic */ jms onCreateContextMenu(Object obj) {
            RadioStationModel radioStationModel = (RadioStationModel) obj;
            ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
            ptp ptp = new ptp(psr.this.a, psr.this.b, radioStationModel.stationUri, contextMenuViewModel, psr.this.c, psr.this.d, psr.this.e);
            psr.this.a(contextMenuViewModel, radioStationModel, ptp);
            return jms.a(contextMenuViewModel);
        }
    };
    private final fpt g;
    private final boolean h;

    /* renamed from: psr$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.spotify.mobile.android.util.LinkType[] r0 = com.spotify.mobile.android.util.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.ALBUM     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.ARTIST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_PLAYLIST     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PLAYLIST_V2     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.TRACK     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.psr.AnonymousClass2.<clinit>():void");
        }
    }

    public psr(Activity activity, udr udr, fpt fpt, spi spi, jsz jsz, ToastieManager toastieManager, boolean z) {
        this.a = (Activity) fay.a(activity);
        this.b = (udr) fay.a(udr);
        this.g = fpt;
        this.d = jsz;
        this.e = toastieManager;
        this.h = true;
        this.c = spi;
    }

    /* access modifiers changed from: 0000 */
    public final void a(ContextMenuViewModel contextMenuViewModel, RadioStationModel radioStationModel, ptp ptp) {
        String str;
        ptp.b(radioStationModel.uri);
        String e2 = uhq.e(radioStationModel.uri);
        int i = AnonymousClass2.a[jst.a(e2).b.ordinal()];
        if (i == 1) {
            ptp.a(e2, radioStationModel.title, (int) R.string.context_menu_browse_album);
        } else if (i == 2) {
            ptp.a(e2, radioStationModel.title);
            if (!this.h) {
                contextMenuViewModel.c.g = true;
            }
        } else if (i == 3 || i == 4) {
            ptp.b(e2, radioStationModel.title);
        } else if (i == 5 && !fax.a(radioStationModel.subtitleUri) && !fax.a(radioStationModel.subtitle)) {
            ptp.a(radioStationModel.subtitleUri, radioStationModel.subtitle);
        }
        if (this.h) {
            str = uhs.a(radioStationModel.uri);
            contextMenuViewModel.e = HeaderViewType.LARGE_IMAGE;
        } else {
            str = radioStationModel.imageUri;
        }
        contextMenuViewModel.a(Uri.parse((String) jtc.a(str, "")));
        contextMenuViewModel.c.a = radioStationModel.title;
        contextMenuViewModel.c.b = uhq.a((Context) this.a, jst.a(uhq.e(radioStationModel.uri)));
    }
}
