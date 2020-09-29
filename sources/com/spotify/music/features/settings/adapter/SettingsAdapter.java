package com.spotify.music.features.settings.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.SpinnerAdapter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.loader.SettingsState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.R;
import com.spotify.music.features.settings.soundeffects.SoundEffectsWarningActivity;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties;
import com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties.SettingsDebugLabel;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class SettingsAdapter extends BaseAdapter {
    private static final int H = ViewType.n.length;
    private static final Pattern I = Pattern.compile("<br>");
    public boolean A;
    public String B;
    public String C;
    public boolean D;
    public int E;
    public boolean F;
    public ConnectState G;
    private final Resources J;
    /* access modifiers changed from: private */
    public final jlr K;
    /* access modifiers changed from: private */
    public final jtz L;
    private final rqb M;
    private final rzo N;
    private final mqc O;
    private final kxs P;
    private final gvs Q;
    private final SpSharedPreferences<Object> R;
    private final AppsMusicLibsRemoteconfigProperties S;
    private final gts T;
    private final kfm U;
    private final gfk<fli> V;
    private final rwl W;
    private final rym X;
    private final jwe Y;
    private final List<Item> Z = new ArrayList();
    public final fqn a;
    private fbq<Item> aa;
    private b ab = new qmv();
    private b ac = new qmm();
    /* access modifiers changed from: private */
    public final jqr ad;
    private final RxResolver ae;
    private final String[] af;
    private final b ag = new b() {
        private int[] a = {2, 1, 0};

        public final int a(int i) {
            return this.a[i];
        }

        public final int b(int i) {
            int a2 = xdo.a(this.a, i);
            return a2 == -1 ? xdo.a(this.a, 1) : a2;
        }
    };
    private final boolean ah;
    private final boolean ai;
    private final boolean aj;
    private final boolean ak;
    private final boolean al;
    private final String am;
    private final vwu an;
    private final tmu ao;
    private final rtg ap;
    private final jvf aq;
    private final jwo ar;
    private final gwd as;
    public final Context b;
    public final lqj c;
    final jlv d;
    final waq e;
    public final ijt f;
    public SettingsState g;
    public List<Item> h = new ArrayList();
    public qmp i;
    public qmr j;
    public String[] k;
    public String[] l;
    public String[] m;
    public String[] n;
    public boolean o;
    public qng p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* renamed from: com.spotify.music.features.settings.adapter.SettingsAdapter$7 reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] b = new int[SettingsDebugLabel.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(100:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(101:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(103:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|106) */
        /* JADX WARNING: Can't wrap try/catch for region: R(98:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(99:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x0239 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0245 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x010d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0119 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0131 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x013d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0149 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0155 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0161 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x016d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0179 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0185 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0191 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x019d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01b5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01c1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x01cd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01d9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01e5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x01f1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x01fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0209 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0215 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0221 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x022d */
        static {
            /*
                com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties$SettingsDebugLabel[] r0 = com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties.SettingsDebugLabel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties$SettingsDebugLabel r2 = com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties.SettingsDebugLabel.DEBUG_TOOLING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties$SettingsDebugLabel r3 = com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties.SettingsDebugLabel.QA_TOOLS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties$SettingsDebugLabel r4 = com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties.SettingsDebugLabel.DEBUG_TOOLS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.spotify.music.features.settings.adapter.Item[] r3 = com.spotify.music.features.settings.adapter.Item.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                int[] r3 = a     // Catch:{ NoSuchFieldError -> 0x003d }
                com.spotify.music.features.settings.adapter.Item r4 = com.spotify.music.features.settings.adapter.Item.OFFLINE_MODE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.spotify.music.features.settings.adapter.Item r3 = com.spotify.music.features.settings.adapter.Item.PRIVATE_SESSION     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.LISTENING_ACTIVITY     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x005c }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.RECENTLY_PLAYED_ARTISTS     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0067 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.SEND_BROADCASTS     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0072 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.AUTOPLAY     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007d }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.CANVAS     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0089 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.DATA_SAVER_MODE     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0095 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.NOTIFICATIONS     // Catch:{ NoSuchFieldError -> 0x0095 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0095 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0095 }
            L_0x0095:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a1 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.DEVICE_PICKER     // Catch:{ NoSuchFieldError -> 0x00a1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a1 }
            L_0x00a1:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00ad }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.APPS_NAVIGATION     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b9 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.LANGUAGE_PREFERENCE     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c5 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.LOCAL_DEVICE_SETTINGS     // Catch:{ NoSuchFieldError -> 0x00c5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c5 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c5 }
            L_0x00c5:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00d1 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.DRIVING_MODE_AUTO_LAUNCH     // Catch:{ NoSuchFieldError -> 0x00d1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d1 }
            L_0x00d1:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00dd }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.DRIVING_MODE_ALWAYS_ON     // Catch:{ NoSuchFieldError -> 0x00dd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dd }
            L_0x00dd:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00e9 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.DOWNLOAD_OVER_3G     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00f5 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.STREAM_QUALITY     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0101 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.DOWNLOAD_QUALITY     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x010d }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.STORAGE_BAR     // Catch:{ NoSuchFieldError -> 0x010d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010d }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010d }
            L_0x010d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0119 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.DELETE_CACHE     // Catch:{ NoSuchFieldError -> 0x0119 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0119 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0119 }
            L_0x0119:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.FACEBOOK     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0131 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.WAZE     // Catch:{ NoSuchFieldError -> 0x0131 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0131 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0131 }
            L_0x0131:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x013d }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.LICENSES     // Catch:{ NoSuchFieldError -> 0x013d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x013d }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x013d }
            L_0x013d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0149 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.LICENSING_INFO     // Catch:{ NoSuchFieldError -> 0x0149 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0149 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0149 }
            L_0x0149:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0155 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.SCTA_INFO     // Catch:{ NoSuchFieldError -> 0x0155 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0155 }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0155 }
            L_0x0155:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0161 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.TERMS_CONDITIONS     // Catch:{ NoSuchFieldError -> 0x0161 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0161 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0161 }
            L_0x0161:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x016d }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.SUPPORT     // Catch:{ NoSuchFieldError -> 0x016d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x016d }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x016d }
            L_0x016d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0179 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.VOICE_EULA     // Catch:{ NoSuchFieldError -> 0x0179 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0179 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0179 }
            L_0x0179:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0185 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.ACCOUNT     // Catch:{ NoSuchFieldError -> 0x0185 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0185 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0185 }
            L_0x0185:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0191 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.PRIVACY_POLICY     // Catch:{ NoSuchFieldError -> 0x0191 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0191 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0191 }
            L_0x0191:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x019d }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.AD_PARTNER_PREFERENCES     // Catch:{ NoSuchFieldError -> 0x019d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x019d }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x019d }
            L_0x019d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01a9 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.VOICE_ADS     // Catch:{ NoSuchFieldError -> 0x01a9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a9 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a9 }
            L_0x01a9:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01b5 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.VERSION     // Catch:{ NoSuchFieldError -> 0x01b5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b5 }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b5 }
            L_0x01b5:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01c1 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.LOCAL_FILES_IMPORT     // Catch:{ NoSuchFieldError -> 0x01c1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c1 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c1 }
            L_0x01c1:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01cd }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.LOGOUT     // Catch:{ NoSuchFieldError -> 0x01cd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01cd }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01cd }
            L_0x01cd:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01d9 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.AUDIO_EFFECTS     // Catch:{ NoSuchFieldError -> 0x01d9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d9 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d9 }
            L_0x01d9:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01e5 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.DEBUG_TOOLS     // Catch:{ NoSuchFieldError -> 0x01e5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e5 }
                r2 = 37
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e5 }
            L_0x01e5:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01f1 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.BUG_REPORTING     // Catch:{ NoSuchFieldError -> 0x01f1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f1 }
                r2 = 38
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01f1 }
            L_0x01f1:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x01fd }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.GAPLESS     // Catch:{ NoSuchFieldError -> 0x01fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01fd }
                r2 = 39
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01fd }
            L_0x01fd:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0209 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.AUTOMIX     // Catch:{ NoSuchFieldError -> 0x0209 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0209 }
                r2 = 40
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0209 }
            L_0x0209:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0215 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.PLAY_EXPLICIT_CONTENT     // Catch:{ NoSuchFieldError -> 0x0215 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0215 }
                r2 = 41
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0215 }
            L_0x0215:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0221 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.UNAVAILABLE_TRACKS     // Catch:{ NoSuchFieldError -> 0x0221 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0221 }
                r2 = 42
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0221 }
            L_0x0221:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x022d }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.NORMALIZE     // Catch:{ NoSuchFieldError -> 0x022d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x022d }
                r2 = 43
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x022d }
            L_0x022d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0239 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.LOUDNESS_ENVIRONMENT     // Catch:{ NoSuchFieldError -> 0x0239 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0239 }
                r2 = 44
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0239 }
            L_0x0239:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0245 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.CROSSFADE     // Catch:{ NoSuchFieldError -> 0x0245 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0245 }
                r2 = 45
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0245 }
            L_0x0245:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0251 }
                com.spotify.music.features.settings.adapter.Item r1 = com.spotify.music.features.settings.adapter.Item.STORAGE     // Catch:{ NoSuchFieldError -> 0x0251 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0251 }
                r2 = 46
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0251 }
            L_0x0251:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.settings.adapter.SettingsAdapter.AnonymousClass7.<clinit>():void");
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class OfflineResource implements JacksonModel {
        @JsonProperty("offline_availabilty")
        String mOfflineAvailability;
        @JsonProperty("uri")
        String mUri;

        OfflineResource() {
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class OfflineResources implements JacksonModel {
        @JsonProperty("resources")
        List<OfflineResource> mResources;

        OfflineResources() {
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class ResyncBitratePreference implements JacksonModel {
        private final boolean mResyncBitrateV2;

        public ResyncBitratePreference(@JsonProperty("audio.resync_bitrate_v2") boolean z) {
            this.mResyncBitrateV2 = z;
        }

        @JsonProperty("audio.resync_bitrate_v2")
        public boolean isResyncBitrateV2() {
            return this.mResyncBitrateV2;
        }
    }

    public SettingsAdapter(Context context, Resources resources, fqn fqn, jty jty, jlr jlr, jtz jtz, rqb rqb, rzo rzo, mqc mqc, kxs kxs, jlv jlv, lqj lqj, SpSharedPreferences<Object> spSharedPreferences, AppsMusicLibsRemoteconfigProperties appsMusicLibsRemoteconfigProperties, gts gts, waq waq, RxResolver rxResolver, kfm kfm, rtg rtg, jvf jvf, ijt ijt, jwo jwo, vwu vwu, tmu tmu, gwd gwd, gbg gbg, rwl rwl, gfk<fli> gfk, rym rym, gvs gvs, jwe jwe) {
        Context context2 = context;
        this.R = (SpSharedPreferences) fbp.a(spSharedPreferences);
        this.a = (fqn) fbp.a(fqn);
        this.b = (Context) fbp.a(context);
        this.J = (Resources) fbp.a(resources);
        this.K = (jlr) fbp.a(jlr);
        this.L = (jtz) fbp.a(jtz);
        this.M = (rqb) fbp.a(rqb);
        this.N = (rzo) fbp.a(rzo);
        this.O = (mqc) fbp.a(mqc);
        this.P = (kxs) fbp.a(kxs);
        this.d = (jlv) fbp.a(jlv);
        this.c = (lqj) fbp.a(lqj);
        this.ad = new jqr(context);
        this.ae = rxResolver;
        this.U = kfm;
        this.am = jty.a();
        this.an = vwu;
        this.ao = tmu;
        this.W = rwl;
        this.Q = gvs;
        this.Y = jwe;
        this.B = "";
        this.u = ((Boolean) this.a.a(jrl.a)).booleanValue();
        this.v = ((Boolean) this.a.a(gwf.d)).booleanValue();
        this.k = a(context);
        this.l = b(context);
        this.m = a(this.u);
        this.n = b(this.u);
        boolean z2 = true;
        this.o = !fbo.a((String) this.a.a(jrl.b));
        this.af = new String[]{context.getString(R.string.settings_loudness_environment_loud), context.getString(R.string.settings_loudness_environment_normal), context.getString(R.string.settings_loudness_environment_quiet)};
        fqn fqn2 = fqn;
        this.r = !((Boolean) fqn.a(rqa.a)).booleanValue();
        this.f = ijt;
        this.s = ijr.a(fqn);
        this.t = nxp.a(fqn);
        Context context3 = this.b;
        this.ah = !context3.getPackageManager().queryIntentActivities(new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL"), 65536).isEmpty();
        this.aj = ((Boolean) this.a.a(jrl.c)).booleanValue();
        if (gbg.a("/proc/mounts").size() <= 1) {
            z2 = false;
        }
        this.ai = z2;
        this.ak = uvx.a(this.a);
        this.al = ((String) this.a.a(lqg.a)).equals("Enabled");
        this.y = gvm.b(this.a);
        this.S = (AppsMusicLibsRemoteconfigProperties) fbp.a(appsMusicLibsRemoteconfigProperties);
        this.T = (gts) fbp.a(gts);
        this.e = waq;
        this.ap = rtg;
        this.aq = jvf;
        this.ar = jwo;
        this.as = gwd;
        this.V = (gfk) fbp.a(gfk);
        this.X = rym;
        this.Z.add(Item.DATA_SAVER_MODE);
        this.Z.add(Item.ACCOUNT);
        if (!this.M.a(this.a)) {
            this.Z.add(Item.OFFLINE_MODE);
        }
        this.Z.add(Item.CROSSFADE);
        this.Z.add(Item.GAPLESS);
        if (((Boolean) this.a.a(qmc.a)).booleanValue()) {
            this.Z.add(Item.AUTOMIX);
        }
        this.Z.add(Item.PLAY_EXPLICIT_CONTENT);
        this.Z.add(Item.UNAVAILABLE_TRACKS);
        this.Z.add(Item.NORMALIZE);
        if (this.o) {
            this.Z.add(Item.LOUDNESS_ENVIRONMENT);
        }
        this.Z.add(Item.SEND_BROADCASTS);
        this.Z.add(Item.AUTOPLAY);
        if (this.a.a(kxu.a) == RolloutFlag.ENABLED && !((Boolean) this.a.a(kxu.b)).booleanValue()) {
            this.Z.add(Item.CANVAS);
        }
        if (((Boolean) this.a.a(lcl.a)).booleanValue()) {
            this.Z.add(Item.LANGUAGE_PREFERENCE);
        }
        this.Z.add(Item.PRIVATE_SESSION);
        this.Z.add(Item.LISTENING_ACTIVITY);
        if (!this.M.a(this.a)) {
            this.Z.add(Item.RECENTLY_PLAYED_ARTISTS);
        }
        this.Z.add(Item.FACEBOOK);
        this.Z.add(Item.STREAM_QUALITY);
        this.Z.add(Item.DOWNLOAD_QUALITY);
        this.Z.add(Item.DOWNLOAD_OVER_3G);
        this.Z.add(Item.AUDIO_EFFECTS);
        this.Z.add(Item.STORAGE_BAR);
        this.Z.add(Item.DELETE_CACHE);
        this.Z.add(Item.NOTIFICATIONS);
        this.Z.add(Item.LOCAL_FILES_IMPORT);
        this.Z.add(Item.AD_PARTNER_PREFERENCES);
        this.Z.add(Item.VOICE_ADS);
        this.Z.add(Item.VERSION);
        this.Z.add(Item.BUG_REPORTING);
        this.Z.add(Item.LICENSES);
        this.Z.add(Item.LICENSING_INFO);
        this.Z.add(Item.SCTA_INFO);
        this.Z.add(Item.TERMS_CONDITIONS);
        this.Z.add(Item.VOICE_EULA);
        this.Z.add(Item.PRIVACY_POLICY);
        this.Z.add(Item.SUPPORT);
        this.Z.add(Item.DEVICE_PICKER);
        this.Z.add(Item.LOCAL_DEVICE_SETTINGS);
        if (this.a.a(sen.a) == RolloutFlag.ENABLED) {
            this.Z.add(Item.APPS_NAVIGATION);
        } else {
            this.Z.add(Item.WAZE);
        }
        this.Z.add(Item.DRIVING_MODE_AUTO_LAUNCH);
        if (!this.M.a(this.a)) {
            this.Z.add(Item.DRIVING_MODE_ALWAYS_ON);
        }
        this.Z.add(Item.STORAGE);
        this.Z.add(Item.LOGOUT);
        this.Z.add(Item.DEBUG_TOOLS);
        b();
    }

    private qnd a(ViewGroup viewGroup, qnd qnd, int i2) {
        return a(viewGroup, qnd, viewGroup.getContext().getString(i2));
    }

    private qnd a(ViewGroup viewGroup, qnd qnd, final Intent intent) {
        if (qnd == null) {
            qnd = qne.a(this.b, viewGroup);
        }
        qnd.a((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                SettingsAdapter.this.b.startActivity(intent);
            }
        });
        return qnd;
    }

    private qnd a(ViewGroup viewGroup, qnd qnd, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return a(viewGroup, qnd, intent);
    }

    private qnd a(ViewGroup viewGroup, qnf qnf, String[] strArr, b bVar, String[] strArr2, a<Integer> aVar, xiy<SettingsState, Integer> xiy) {
        if (qnf == null) {
            qnf = qne.a(this.b, viewGroup, this.ap, this.aq, this.ar);
        }
        qnf.e = aVar;
        qnf.f = xiy;
        qnf.a((SpinnerAdapter) new qmu(this.b, strArr));
        qnf.h = bVar;
        if (strArr2 != null) {
            qnf.a(strArr2);
        }
        return qnf;
    }

    private qnd a(ViewGroup viewGroup, qnh qnh, a<Boolean> aVar, xiy<SettingsState, Boolean> xiy) {
        if (qnh == null || (qnh instanceof qnc)) {
            qnh = qne.a(this.b, viewGroup, this.ar);
        }
        qnh.e.requestLayout();
        qnh.f = aVar;
        qnh.g = xiy;
        return qnh;
    }

    private qnd a(qnd qnd, int i2, ViewGroup viewGroup, boolean z2, OnCheckedChangeListener onCheckedChangeListener) {
        if (qnd == null) {
            qnd = qne.b(this.b, viewGroup);
        }
        qnc qnc = (qnc) qnd;
        qnc.a(i2);
        qnc.e.requestLayout();
        qnc.e.setOnCheckedChangeListener(null);
        qnc.e.setChecked(z2);
        qnc.e.setOnCheckedChangeListener(onCheckedChangeListener);
        return qnd;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        bg bgVar = new bg(null, uqo.O.a(), ViewUris.T.toString(), null, 0, null, "hit", "car-view-always-on-launch-car-view", (double) this.L.a());
        this.K.a(bgVar);
        this.ao.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent, View view) {
        rym rym = this.X;
        ConnectState connectState = this.G;
        String str = PageIdentifiers.SETTINGS.mPageIdentifier;
        String sso = ViewUris.T.toString();
        StringBuilder sb = new StringBuilder("connect-device-picker/");
        int i2 = defpackage.rym.AnonymousClass1.b[connectState.ordinal()];
        String str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "unknown" : "connecting" : "connected" : "unavailable" : "available";
        sb.append(str2);
        ah ahVar = new ah(null, sb.toString(), null, InteractionIntent.NAVIGATE.mInteractionIntent, str, sso);
        rym.a.a(ahVar);
        Logger.b(ahVar.a(), new Object[0]);
        this.b.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(android.widget.CompoundButton r14, boolean r15) {
        /*
            r13 = this;
            ijt r14 = r13.f
            if (r15 == 0) goto L_0x0026
            jxz r0 = r14.b
            androidx.fragment.app.Fragment r1 = r14.a
            android.content.Context r1 = r1.n()
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            boolean r0 = r0.a(r1, r2)
            if (r0 != 0) goto L_0x0026
            jxz r0 = r14.b
            androidx.fragment.app.Fragment r14 = r14.a
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]
            r4 = 0
            r3[r4] = r2
            java.util.HashSet r2 = com.google.common.collect.Sets.a((E[]) r3)
            r0.a(r1, r14, r2)
            goto L_0x0029
        L_0x0026:
            r14.a(r15)
        L_0x0029:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "voice-ads-"
            r14.<init>(r0)
            if (r15 == 0) goto L_0x0035
            java.lang.String r0 = "on"
            goto L_0x0037
        L_0x0035:
            java.lang.String r0 = "off"
        L_0x0037:
            r14.append(r0)
            java.lang.String r10 = r14.toString()
            hdr$bg r14 = new hdr$bg
            uqm r0 = defpackage.uqo.bh
            java.lang.String r3 = r0.a()
            sso r0 = com.spotify.music.libs.viewuri.ViewUris.T
            java.lang.String r4 = r0.toString()
            r5 = 0
            r6 = 0
            r8 = 0
            jtz r0 = r13.L
            long r0 = r0.a()
            double r11 = (double) r0
            java.lang.String r2 = "voice-ads"
            java.lang.String r9 = "hit"
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11)
            jlr r0 = r13.K
            r0.a(r14)
            com.spotify.messages.VoiceAdLog$b r14 = com.spotify.messages.VoiceAdLog.k()
            if (r15 == 0) goto L_0x006d
            java.lang.String r15 = "voice_optin"
            goto L_0x006f
        L_0x006d:
            java.lang.String r15 = "voice_optout"
        L_0x006f:
            com.spotify.messages.VoiceAdLog$b r14 = r14.a(r15)
            jtz r15 = r13.L
            long r0 = r15.a()
            com.spotify.messages.VoiceAdLog$b r14 = r14.a(r0)
            java.lang.String r15 = ""
            com.spotify.messages.VoiceAdLog$b r14 = r14.b(r15)
            com.google.protobuf.GeneratedMessageLite r14 = r14.g()
            com.spotify.messages.VoiceAdLog r14 = (com.spotify.messages.VoiceAdLog) r14
            gfk<fli> r15 = r13.V
            r15.a(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.settings.adapter.SettingsAdapter.a(android.widget.CompoundButton, boolean):void");
    }

    static /* synthetic */ void a(SettingsAdapter settingsAdapter, int i2, int i3) {
        settingsAdapter.c(false);
        if (i2 >= i3) {
            new gmp(OfflineResources.class, settingsAdapter.W, settingsAdapter.ae, ((hhc) gih.a(hhc.class)).b()).resolve(RequestBuilder.get("sp://offline/v1/resources").build()).a((xis<? super T>) new xis() {
                public final void call(Object obj) {
                    SettingsAdapter.a(xis.this, (OfflineResources) obj);
                }
            }, (xis<Throwable>) $$Lambda$SettingsAdapter$P2oAgYoKTi1G9HUQOzs71mMbDhs.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        if (num.intValue() != 0) {
            ((Activity) this.b).runOnUiThread(new Runnable() {
                public final void run() {
                    SettingsAdapter.this.ad.a(new a() {
                        public final void a() {
                            SettingsAdapter.this.c(true);
                        }
                    });
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        throw new RuntimeException("RxJava 1 exception in SettingsAdapter", th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(xis xis, OfflineResources offlineResources) {
        if (offlineResources.mResources != null) {
            xis.call(Integer.valueOf(offlineResources.mResources.size()));
        } else {
            xis.call(Integer.valueOf(0));
        }
    }

    public static String[] a(Context context) {
        return new String[]{context.getString(R.string.settings_bitrate_automatic), context.getString(R.string.settings_bitrate_low), context.getString(R.string.settings_bitrate_normal), context.getString(R.string.settings_bitrate_high), context.getString(R.string.settings_bitrate_very_high)};
    }

    public static String[] a(boolean z2) {
        String[] strArr = new String[5];
        String str = null;
        strArr[0] = null;
        strArr[1] = null;
        strArr[2] = null;
        strArr[3] = null;
        if (!z2) {
            str = "streaming-quality";
        }
        strArr[4] = str;
        return strArr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
        bg bgVar = new bg(null, uqo.O.a(), ViewUris.T.toString(), null, 0, null, "hit", "car-view-always-on-not-now", (double) this.L.a());
        this.K.a(bgVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(CompoundButton compoundButton, boolean z2) {
        this.Q.b(z2);
        StringBuilder sb = new StringBuilder("car-view-always-on-");
        sb.append(z2 ? "enable" : "disable");
        bg bgVar = new bg(null, uqo.O.a(), ViewUris.T.toString(), null, 0, null, "hit", sb.toString(), (double) this.L.a());
        this.K.a(bgVar);
        this.as.a(z2);
        if (z2) {
            fts.a(this.b, "", this.J.getString(R.string.settings_driving_mode_always_on_popup_title), SpotifyIconV2.DEVICE_CAR).b(this.J.getString(R.string.settings_driving_mode_always_on_popup_negative_button), new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SettingsAdapter.this.b(dialogInterface, i);
                }
            }).a(this.J.getString(R.string.settings_driving_mode_always_on_popup_positive_button), new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SettingsAdapter.this.a(dialogInterface, i);
                }
            }).a().a();
        }
    }

    public static String[] b(Context context) {
        return new String[]{context.getString(R.string.settings_bitrate_normal), context.getString(R.string.settings_bitrate_high), context.getString(R.string.settings_bitrate_very_high)};
    }

    public static String[] b(boolean z2) {
        String[] strArr = new String[3];
        String str = null;
        strArr[0] = null;
        strArr[1] = null;
        if (!z2) {
            str = "download-quality";
        }
        strArr[2] = str;
        return strArr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(CompoundButton compoundButton, boolean z2) {
        this.Q.a(z2);
        StringBuilder sb = new StringBuilder("car-view-");
        sb.append(z2 ? "enable" : "disable");
        bg bgVar = new bg(null, uqo.O.a(), ViewUris.T.toString(), null, 0, null, "hit", sb.toString(), (double) this.L.a());
        this.K.a(bgVar);
    }

    /* access modifiers changed from: private */
    public void c(boolean z2) {
        try {
            this.ae.resolve(RequestBuilder.put("sp://prefs/v1/", new ResyncBitratePreference(z2)).build()).i();
        } catch (ParserException unused) {
            Logger.d("Unable to serialize resync bitrate message", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(CompoundButton compoundButton, boolean z2) {
        this.T.a(z2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(CompoundButton compoundButton, boolean z2) {
        this.N.b(z2);
        mqc mqc = this.O;
        StringBuilder sb = new StringBuilder("data-saver-mode-");
        sb.append(z2 ? "opt-in" : "opt-out");
        String sb2 = sb.toString();
        jlr jlr = mqc.a;
        bg bgVar = new bg(null, "datasavermode/settings", mqc.c.toString(), null, -1, null, "hit", sb2, (double) mqc.b.a());
        jlr.a(bgVar);
        b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(CompoundButton compoundButton, boolean z2) {
        this.P.b.a().a(kxs.a, z2).b();
        StringBuilder sb = new StringBuilder("canvas-");
        sb.append(z2 ? "on" : "off");
        bg bgVar = new bg("canvas", "com.spotify.feature.canvas", ViewUris.T.toString(), null, 0, null, "hit", sb.toString(), (double) this.L.a());
        this.K.a(bgVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(CompoundButton compoundButton, boolean z2) {
        this.R.a().a(kty.a, z2).b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(CompoundButton compoundButton, boolean z2) {
        qmr qmr = this.j;
        if (qmr != null) {
            qmr.i(z2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(CompoundButton compoundButton, boolean z2) {
        qmp qmp = this.i;
        if (qmp != null) {
            qmp.a(z2);
        }
    }

    static /* synthetic */ void i(SettingsAdapter settingsAdapter) {
        if (SoundEffectsWarningActivity.a(settingsAdapter.b)) {
            SoundEffectsWarningActivity.a((Activity) settingsAdapter.b);
        } else {
            SoundEffectsWarningActivity.b(settingsAdapter.b);
        }
    }

    public final fbq<Item> a() {
        qmw qmw = new qmw();
        qmo qmo = r2;
        qmo qmo2 = new qmo(false, this.ah, this.u, this.v, this.t, this.ai, this.r, this.aj, this.ak, this.al, this.w, this.x, this.y, this.s);
        fbq<Item> a2 = Predicates.a(qmw, qmo);
        SettingsState settingsState = this.g;
        this.aa = Predicates.a(a2, new qmn(this.q, settingsState != null && settingsState.normalize(), this.N.a(false), this.F));
        return a2;
    }

    public final void a(int i2) {
        this.E = i2;
        notifyDataSetChanged();
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public void b() {
        this.h = Lists.a(fdd.b(this.Z, a()));
        notifyDataSetChanged();
    }

    public final String[] c() {
        String str;
        String str2 = "";
        if (this.q) {
            StringBuilder sb = new StringBuilder(" ");
            sb.append(this.b.getString(R.string.settings_section_unavailable_with_connect));
            str = sb.toString();
        } else {
            str = str2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.b.getString(R.string.settings_section_playback));
        sb2.append(str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.b.getString(R.string.settings_section_social));
        sb3.append(str);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.b.getString(R.string.settings_section_music_quality));
        sb4.append(str);
        return new String[]{this.b.getString(R.string.settings_section_data_saver), str2, sb2.toString(), this.b.getString(R.string.settings_section_language), this.b.getString(R.string.settings_section_spotify_connect), this.b.getString(R.string.settings_section_apps), this.b.getString(R.string.settings_section_car), sb3.toString(), sb4.toString(), this.b.getString(R.string.settings_storage_title), this.b.getString(R.string.settings_notification_title), this.b.getString(R.string.settings_section_import), this.b.getString(R.string.settings_section_advertisements), this.b.getString(R.string.settings_section_help), this.b.getString(R.string.settings_section_about), this.b.getString(R.string.settings_section_other)};
    }

    public final int getCount() {
        return this.h.size();
    }

    public final Object getItem(int i2) {
        if (i2 < this.h.size()) {
            return this.h.get(i2);
        }
        return null;
    }

    public final long getItemId(int i2) {
        return (long) i2;
    }

    public final int getItemViewType(int i2) {
        if (i2 < this.h.size()) {
            return ((Item) this.h.get(i2)).d().ordinal();
        }
        Assertion.a("Unknown position when fetching item view type");
        return -1;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r1v3, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v5, types: [qnd] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v7, types: [qnd] */
    /* JADX WARNING: type inference failed for: r13v23 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r13v26, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v9, types: [qnd] */
    /* JADX WARNING: type inference failed for: r13v28, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v10, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v23, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v12, types: [qmy, fqy] */
    /* JADX WARNING: type inference failed for: r13v33, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v13, types: [qnd] */
    /* JADX WARNING: type inference failed for: r13v35, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v14, types: [qnd] */
    /* JADX WARNING: type inference failed for: r13v38 */
    /* JADX WARNING: type inference failed for: r1v15, types: [qnd] */
    /* JADX WARNING: type inference failed for: r13v40, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r13v42, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v39, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v16, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v41, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v17, types: [qnd] */
    /* JADX WARNING: type inference failed for: r1v19, types: [qnb] */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r0v42 */
    /* JADX WARNING: type inference failed for: r0v44, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v21, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v46, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v22, types: [qnd] */
    /* JADX WARNING: type inference failed for: r13v64, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v23, types: [qnd] */
    /* JADX WARNING: type inference failed for: r13v66, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v24, types: [qnd] */
    /* JADX WARNING: type inference failed for: r13v68, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v25, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v60, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v27, types: [qnd] */
    /* JADX WARNING: type inference failed for: r13v73, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v61 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r1v28, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v62 */
    /* JADX WARNING: type inference failed for: r13v74 */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r0v63 */
    /* JADX WARNING: type inference failed for: r13v76, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v64 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r1v30, types: [qnd] */
    /* JADX WARNING: type inference failed for: r14v12 */
    /* JADX WARNING: type inference failed for: r0v66 */
    /* JADX WARNING: type inference failed for: r1v32, types: [qng] */
    /* JADX WARNING: type inference failed for: r0v68, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v33, types: [qnd] */
    /* JADX WARNING: type inference failed for: r1v35, types: [qnb] */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r1v37, types: [qna, fqy] */
    /* JADX WARNING: type inference failed for: r0v70, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v39, types: [qni, fqy] */
    /* JADX WARNING: type inference failed for: r0v72, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v40, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v74, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v41, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v76, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v42, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v78, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v43, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v80, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v44, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v82, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v45, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v84, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v46, types: [qnd] */
    /* JADX WARNING: type inference failed for: r1v48, types: [qnb] */
    /* JADX WARNING: type inference failed for: r0v86, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v49, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v88, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v50, types: [qnd] */
    /* JADX WARNING: type inference failed for: r13v116, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v51, types: [qnd] */
    /* JADX WARNING: type inference failed for: r13v118, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v52, types: [qnd] */
    /* JADX WARNING: type inference failed for: r1v54, types: [qnb] */
    /* JADX WARNING: type inference failed for: r0v96, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v55, types: [qnd] */
    /* JADX WARNING: type inference failed for: r1v57, types: [qnb] */
    /* JADX WARNING: type inference failed for: r0v98, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v58, types: [qnd] */
    /* JADX WARNING: type inference failed for: r1v60, types: [qnb] */
    /* JADX WARNING: type inference failed for: r0v100, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v61, types: [qnd] */
    /* JADX WARNING: type inference failed for: r1v63, types: [qnb] */
    /* JADX WARNING: type inference failed for: r13v135, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r13v136 */
    /* JADX WARNING: type inference failed for: r0v105 */
    /* JADX WARNING: type inference failed for: r1v64, types: [qnd] */
    /* JADX WARNING: type inference failed for: r1v66, types: [qnb] */
    /* JADX WARNING: type inference failed for: r13v140, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r13v142, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r13v144, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r13v146, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v67, types: [qnd] */
    /* JADX WARNING: type inference failed for: r1v69, types: [qnb] */
    /* JADX WARNING: type inference failed for: r0v110, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v71, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v112, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v73, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v114, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v75, types: [qnd] */
    /* JADX WARNING: type inference failed for: r14v29 */
    /* JADX WARNING: type inference failed for: r14v31 */
    /* JADX WARNING: type inference failed for: r0v116, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v77, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v118, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v79, types: [qnd] */
    /* JADX WARNING: type inference failed for: r14v36 */
    /* JADX WARNING: type inference failed for: r0v120, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v55 */
    /* JADX WARNING: type inference failed for: r1v80, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v122, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v81, types: [qnd] */
    /* JADX WARNING: type inference failed for: r1v84, types: [qmz, fqy] */
    /* JADX WARNING: type inference failed for: r0v124, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v85, types: [qnd] */
    /* JADX WARNING: type inference failed for: r0v125 */
    /* JADX WARNING: type inference failed for: r0v126 */
    /* JADX WARNING: type inference failed for: r0v127 */
    /* JADX WARNING: type inference failed for: r0v128 */
    /* JADX WARNING: type inference failed for: r1v86 */
    /* JADX WARNING: type inference failed for: r0v129 */
    /* JADX WARNING: type inference failed for: r1v87 */
    /* JADX WARNING: type inference failed for: r1v88 */
    /* JADX WARNING: type inference failed for: r13v171 */
    /* JADX WARNING: type inference failed for: r1v89 */
    /* JADX WARNING: type inference failed for: r13v172 */
    /* JADX WARNING: type inference failed for: r1v90 */
    /* JADX WARNING: type inference failed for: r1v91 */
    /* JADX WARNING: type inference failed for: r13v173 */
    /* JADX WARNING: type inference failed for: r1v92 */
    /* JADX WARNING: type inference failed for: r13v174 */
    /* JADX WARNING: type inference failed for: r1v93 */
    /* JADX WARNING: type inference failed for: r13v175 */
    /* JADX WARNING: type inference failed for: r1v94 */
    /* JADX WARNING: type inference failed for: r13v176 */
    /* JADX WARNING: type inference failed for: r13v177 */
    /* JADX WARNING: type inference failed for: r0v130 */
    /* JADX WARNING: type inference failed for: r1v95 */
    /* JADX WARNING: type inference failed for: r0v131 */
    /* JADX WARNING: type inference failed for: r1v96 */
    /* JADX WARNING: type inference failed for: r1v97 */
    /* JADX WARNING: type inference failed for: r1v98 */
    /* JADX WARNING: type inference failed for: r0v132 */
    /* JADX WARNING: type inference failed for: r0v133 */
    /* JADX WARNING: type inference failed for: r1v99 */
    /* JADX WARNING: type inference failed for: r0v134 */
    /* JADX WARNING: type inference failed for: r1v100 */
    /* JADX WARNING: type inference failed for: r13v178 */
    /* JADX WARNING: type inference failed for: r1v101 */
    /* JADX WARNING: type inference failed for: r13v179 */
    /* JADX WARNING: type inference failed for: r1v102 */
    /* JADX WARNING: type inference failed for: r13v180 */
    /* JADX WARNING: type inference failed for: r1v103 */
    /* JADX WARNING: type inference failed for: r0v135 */
    /* JADX WARNING: type inference failed for: r1v104 */
    /* JADX WARNING: type inference failed for: r13v181 */
    /* JADX WARNING: type inference failed for: r1v105 */
    /* JADX WARNING: type inference failed for: r1v106 */
    /* JADX WARNING: type inference failed for: r13v182 */
    /* JADX WARNING: type inference failed for: r1v107 */
    /* JADX WARNING: type inference failed for: r1v108 */
    /* JADX WARNING: type inference failed for: r0v136 */
    /* JADX WARNING: type inference failed for: r1v109 */
    /* JADX WARNING: type inference failed for: r1v110 */
    /* JADX WARNING: type inference failed for: r1v111 */
    /* JADX WARNING: type inference failed for: r1v112 */
    /* JADX WARNING: type inference failed for: r1v113 */
    /* JADX WARNING: type inference failed for: r0v137 */
    /* JADX WARNING: type inference failed for: r1v114 */
    /* JADX WARNING: type inference failed for: r0v138 */
    /* JADX WARNING: type inference failed for: r1v115 */
    /* JADX WARNING: type inference failed for: r0v139 */
    /* JADX WARNING: type inference failed for: r1v116 */
    /* JADX WARNING: type inference failed for: r0v140 */
    /* JADX WARNING: type inference failed for: r1v117 */
    /* JADX WARNING: type inference failed for: r0v141 */
    /* JADX WARNING: type inference failed for: r1v118 */
    /* JADX WARNING: type inference failed for: r0v142 */
    /* JADX WARNING: type inference failed for: r1v119 */
    /* JADX WARNING: type inference failed for: r0v143 */
    /* JADX WARNING: type inference failed for: r1v120 */
    /* JADX WARNING: type inference failed for: r1v121 */
    /* JADX WARNING: type inference failed for: r0v144 */
    /* JADX WARNING: type inference failed for: r1v122 */
    /* JADX WARNING: type inference failed for: r0v145 */
    /* JADX WARNING: type inference failed for: r1v123 */
    /* JADX WARNING: type inference failed for: r13v183 */
    /* JADX WARNING: type inference failed for: r1v124 */
    /* JADX WARNING: type inference failed for: r13v184 */
    /* JADX WARNING: type inference failed for: r1v125 */
    /* JADX WARNING: type inference failed for: r1v126 */
    /* JADX WARNING: type inference failed for: r0v146 */
    /* JADX WARNING: type inference failed for: r1v127 */
    /* JADX WARNING: type inference failed for: r1v128 */
    /* JADX WARNING: type inference failed for: r0v147 */
    /* JADX WARNING: type inference failed for: r1v129 */
    /* JADX WARNING: type inference failed for: r1v130 */
    /* JADX WARNING: type inference failed for: r0v148 */
    /* JADX WARNING: type inference failed for: r1v131 */
    /* JADX WARNING: type inference failed for: r1v132 */
    /* JADX WARNING: type inference failed for: r13v185 */
    /* JADX WARNING: type inference failed for: r1v133 */
    /* JADX WARNING: type inference failed for: r1v134 */
    /* JADX WARNING: type inference failed for: r13v186 */
    /* JADX WARNING: type inference failed for: r13v187 */
    /* JADX WARNING: type inference failed for: r13v188 */
    /* JADX WARNING: type inference failed for: r13v189 */
    /* JADX WARNING: type inference failed for: r1v135 */
    /* JADX WARNING: type inference failed for: r1v136 */
    /* JADX WARNING: type inference failed for: r0v149 */
    /* JADX WARNING: type inference failed for: r1v137 */
    /* JADX WARNING: type inference failed for: r0v150 */
    /* JADX WARNING: type inference failed for: r1v138 */
    /* JADX WARNING: type inference failed for: r0v151 */
    /* JADX WARNING: type inference failed for: r1v139 */
    /* JADX WARNING: type inference failed for: r0v152 */
    /* JADX WARNING: type inference failed for: r1v140 */
    /* JADX WARNING: type inference failed for: r0v153 */
    /* JADX WARNING: type inference failed for: r1v141 */
    /* JADX WARNING: type inference failed for: r0v154 */
    /* JADX WARNING: type inference failed for: r1v142 */
    /* JADX WARNING: type inference failed for: r0v155 */
    /* JADX WARNING: type inference failed for: r1v143 */
    /* JADX WARNING: type inference failed for: r1v144 */
    /* JADX WARNING: type inference failed for: r0v156 */
    /* JADX WARNING: type inference failed for: r1v145 */
    /* JADX INFO: used method not loaded: qnd.a(boolean):null, types can be incorrect */
    /* JADX INFO: used method not loaded: qnd.a(java.lang.String):null, types can be incorrect */
    /* JADX INFO: used method not loaded: qnd.a(java.lang.CharSequence):null, types can be incorrect */
    /* JADX INFO: used method not loaded: qnd.a(com.spotify.mobile.android.util.loader.SettingsState):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0645, code lost:
        r13 = r2;
        r1 = r1;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x07b4, code lost:
        r0 = r13;
        r13 = r6;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0896, code lost:
        r1.a(isEnabled(r12));
        r1.a((java.lang.String) r0);
        r1.a(r13);
        r12 = r11.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x08a5, code lost:
        if (r12 == null) goto L_0x08aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x08a7, code lost:
        r1.a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x08ae, code lost:
        return r1.getView();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x047d, code lost:
        r13 = null;
        r0 = r0;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0502, code lost:
        r0 = r13;
        r1 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v8
      assigns: []
      uses: []
      mth insns count: 743
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 108 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
            r11 = this;
            java.util.List<com.spotify.music.features.settings.adapter.Item> r0 = r11.h
            int r0 = r0.size()
            java.lang.String r1 = "index"
            defpackage.fbp.a(r12, r0, r1)
            java.lang.Class<qnd> r0 = defpackage.qnd.class
            fqy r13 = defpackage.fqz.b(r13, r0)
            r1 = r13
            qnd r1 = (defpackage.qnd) r1
            int[] r13 = com.spotify.music.features.settings.adapter.SettingsAdapter.AnonymousClass7.a
            java.util.List<com.spotify.music.features.settings.adapter.Item> r0 = r11.h
            java.lang.Object r0 = r0.get(r12)
            com.spotify.music.features.settings.adapter.Item r0 = (com.spotify.music.features.settings.adapter.Item) r0
            int r0 = r0.ordinal()
            r13 = r13[r0]
            r0 = 0
            r2 = 1
            r3 = 0
            switch(r13) {
                case 1: goto L_0x07dc;
                case 2: goto L_0x07b8;
                case 3: goto L_0x078d;
                case 4: goto L_0x0764;
                case 5: goto L_0x0739;
                case 6: goto L_0x070f;
                case 7: goto L_0x06da;
                case 8: goto L_0x06a0;
                case 9: goto L_0x067a;
                case 10: goto L_0x0648;
                case 11: goto L_0x060d;
                case 12: goto L_0x05e1;
                case 13: goto L_0x05b9;
                case 14: goto L_0x0591;
                case 15: goto L_0x0569;
                case 16: goto L_0x054b;
                case 17: goto L_0x0505;
                case 18: goto L_0x04c5;
                case 19: goto L_0x04aa;
                case 20: goto L_0x0480;
                case 21: goto L_0x0466;
                case 22: goto L_0x0437;
                case 23: goto L_0x0415;
                case 24: goto L_0x03fa;
                case 25: goto L_0x03df;
                case 26: goto L_0x03c4;
                case 27: goto L_0x03a9;
                case 28: goto L_0x038e;
                case 29: goto L_0x036a;
                case 30: goto L_0x034f;
                case 31: goto L_0x0334;
                case 32: goto L_0x02f5;
                case 33: goto L_0x02dd;
                case 34: goto L_0x02b9;
                case 35: goto L_0x027e;
                case 36: goto L_0x025a;
                case 37: goto L_0x0203;
                case 38: goto L_0x01e3;
                case 39: goto L_0x01bf;
                case 40: goto L_0x019b;
                case 41: goto L_0x0118;
                case 42: goto L_0x00f4;
                case 43: goto L_0x00c6;
                case 44: goto L_0x00a0;
                case 45: goto L_0x0056;
                case 46: goto L_0x0030;
                default: goto L_0x002a;
            }
        L_0x002a:
            java.lang.String r12 = "Got unexpected position"
            com.spotify.mobile.android.util.Assertion.a(r12)
            return r0
        L_0x0030:
            android.content.res.Resources r13 = r11.J
            r0 = 2131951821(0x7f1300cd, float:1.9540067E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131951820(0x7f1300cc, float:1.9540065E38)
            java.lang.String r13 = r13.getString(r2)
            android.content.Context r2 = r11.b
            sso r3 = com.spotify.music.libs.viewuri.ViewUris.bJ
            java.lang.String r3 = r3.toString()
            kpo$a r2 = defpackage.kpo.a(r2, r3)
            android.content.Intent r2 = r2.a
            qnd r1 = r11.a(r14, r1, r2)
            goto L_0x0896
        L_0x0056:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953582(0x7f1307ae, float:1.954364E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953580(0x7f1307ac, float:1.9543635E38)
            java.lang.String r13 = r13.getString(r2)
            if (r1 != 0) goto L_0x0098
            android.content.Context r1 = r11.b
            jwo r2 = r11.ar
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r1)
            r5 = 2131624611(0x7f0e02a3, float:1.8876407E38)
            android.view.View r4 = r4.inflate(r5, r14, r3)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            defpackage.fqv.b()
            fsb r14 = defpackage.fsk.a(r1, r14, r3)
            android.view.View r1 = r14.getView()
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r7 = -2
            r5.<init>(r6, r7)
            r4.addView(r1, r3, r5)
            qmz r1 = new qmz
            r1.<init>(r4, r14, r2)
            defpackage.fqz.a(r1)
        L_0x0098:
            r14 = 2131430408(0x7f0b0c08, float:1.8482516E38)
            r1.a(r14)
            goto L_0x0896
        L_0x00a0:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953617(0x7f1307d1, float:1.954371E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953613(0x7f1307cd, float:1.9543702E38)
            java.lang.String r13 = r13.getString(r2)
            r4 = r1
            qnf r4 = (defpackage.qnf) r4
            java.lang.String[] r5 = r11.af
            qnf$b r6 = r11.ag
            r7 = 0
            jwo$a<java.lang.Integer> r8 = defpackage.jwo.j
            com.spotify.music.features.settings.adapter.-$$Lambda$MUjw1aZnF-InfRheyurrAfxTjhY r9 = com.spotify.music.features.settings.adapter.$$Lambda$MUjw1aZnFInfRheyurrAfxTjhY.INSTANCE
            r2 = r11
            r3 = r14
            qnd r1 = r2.a(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0896
        L_0x00c6:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953619(0x7f1307d3, float:1.9543714E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953618(0x7f1307d2, float:1.9543712E38)
            java.lang.String r13 = r13.getString(r2)
            qnh r1 = (defpackage.qnh) r1
            jwo$a<java.lang.Boolean> r2 = defpackage.jwo.i
            com.spotify.music.features.settings.adapter.-$$Lambda$YtMrf9umami2n0eXd77XUc4tPv4 r3 = com.spotify.music.features.settings.adapter.$$Lambda$YtMrf9umami2n0eXd77XUc4tPv4.INSTANCE
            qnd r1 = r11.a(r14, r1, r2, r3)
            r14 = 2131430419(0x7f0b0c13, float:1.8482538E38)
            r1.a(r14)
            r14 = r1
            qnh r14 = (defpackage.qnh) r14
            com.spotify.music.features.settings.adapter.SettingsAdapter$12 r2 = new com.spotify.music.features.settings.adapter.SettingsAdapter$12
            r2.<init>()
            r14.h = r2
            goto L_0x0896
        L_0x00f4:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953676(0x7f13080c, float:1.954383E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953675(0x7f13080b, float:1.9543828E38)
            java.lang.String r13 = r13.getString(r2)
            qnh r1 = (defpackage.qnh) r1
            jwo$a<java.lang.Boolean> r2 = defpackage.jwo.m
            com.spotify.music.features.settings.adapter.-$$Lambda$7kPACyZoptBihGuDwq4w4TVs5RU r3 = com.spotify.music.features.settings.adapter.$$Lambda$7kPACyZoptBihGuDwq4w4TVs5RU.INSTANCE
            qnd r1 = r11.a(r14, r1, r2, r3)
            r14 = 2131430427(0x7f0b0c1b, float:1.8482555E38)
            r1.a(r14)
            goto L_0x0896
        L_0x0118:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953634(0x7f1307e2, float:1.9543745E38)
            java.lang.String r0 = r13.getString(r0)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            android.content.res.Resources r4 = r11.J
            boolean r5 = r11.F
            if (r5 == 0) goto L_0x012d
            r5 = 2131953632(0x7f1307e0, float:1.954374E38)
            goto L_0x0130
        L_0x012d:
            r5 = 2131953631(0x7f1307df, float:1.9543738E38)
        L_0x0130:
            java.lang.String r4 = r4.getString(r5)
            r13.<init>(r4)
            r4 = 10
            r13.append(r4)
            android.content.res.Resources r4 = r11.J
            r5 = 2131953633(0x7f1307e1, float:1.9543743E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = "<EXPLICIT>"
            r2[r3] = r6
            java.lang.String r2 = r4.getString(r5, r2)
            r13.append(r2)
            int r2 = r13.indexOf(r6)
            java.lang.CharSequence r4 = r13.subSequence(r3, r2)
            int r5 = r2 + 10
            int r6 = r13.length()
            java.lang.CharSequence r5 = r13.subSequence(r5, r6)
            r13.setLength(r3)
            r13.append(r4)
            r13.append(r5)
            android.content.Context r4 = r11.b
            java.lang.String r5 = defpackage.jzb.a(r4)
            java.lang.CharSequence r13 = defpackage.jzb.a(r4, r13, r5, r2)
            qnh r1 = (defpackage.qnh) r1
            jwo$a<java.lang.Boolean> r2 = defpackage.jwo.b
            com.spotify.music.features.settings.adapter.-$$Lambda$QvDkc67Kpvy5ze58azAghfLHgEk r4 = com.spotify.music.features.settings.adapter.$$Lambda$QvDkc67Kpvy5ze58azAghfLHgEk.INSTANCE
            qnd r1 = r11.a(r14, r1, r2, r4)
            r14 = 2131430421(0x7f0b0c15, float:1.8482542E38)
            r1.a(r14)
            boolean r14 = r11.F
            if (r14 == 0) goto L_0x018f
            r14 = r1
            qnh r14 = (defpackage.qnh) r14
            androidx.appcompat.widget.SwitchCompat r14 = r14.e
            r14.setChecked(r3)
        L_0x018f:
            r14 = r1
            qnh r14 = (defpackage.qnh) r14
            com.spotify.music.features.settings.adapter.SettingsAdapter$11 r2 = new com.spotify.music.features.settings.adapter.SettingsAdapter$11
            r2.<init>()
            r14.h = r2
            goto L_0x0896
        L_0x019b:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953569(0x7f1307a1, float:1.9543613E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953568(0x7f1307a0, float:1.954361E38)
            java.lang.String r13 = r13.getString(r2)
            qnh r1 = (defpackage.qnh) r1
            jwo$a<java.lang.Boolean> r2 = defpackage.jwo.h
            com.spotify.music.features.settings.adapter.-$$Lambda$ETMPViv6tsyERqrBcYuuC2ohEQU r3 = com.spotify.music.features.settings.adapter.$$Lambda$ETMPViv6tsyERqrBcYuuC2ohEQU.INSTANCE
            qnd r1 = r11.a(r14, r1, r2, r3)
            r14 = 2131430402(0x7f0b0c02, float:1.8482504E38)
            r1.a(r14)
            goto L_0x0896
        L_0x01bf:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953596(0x7f1307bc, float:1.9543667E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953595(0x7f1307bb, float:1.9543665E38)
            java.lang.String r13 = r13.getString(r2)
            qnh r1 = (defpackage.qnh) r1
            jwo$a<java.lang.Boolean> r2 = defpackage.jwo.g
            com.spotify.music.features.settings.adapter.-$$Lambda$BTc4dkXUsMyD2kWTC43-U8i1TPo r3 = com.spotify.music.features.settings.adapter.$$Lambda$BTc4dkXUsMyD2kWTC43U8i1TPo.INSTANCE
            qnd r1 = r11.a(r14, r1, r2, r3)
            r14 = 2131430414(0x7f0b0c0e, float:1.8482528E38)
            r1.a(r14)
            goto L_0x0896
        L_0x01e3:
            jwe r13 = r11.Y
            java.lang.String r13 = r13.a()
            jwe r2 = r11.Y
            java.lang.String r2 = r2.b()
            jwe r3 = r11.Y
            if (r1 != 0) goto L_0x01f9
            android.content.Context r1 = r11.b
            qnb r1 = defpackage.qne.a(r1, r14)
        L_0x01f9:
            android.content.Context r14 = r11.b
            defpackage.fbp.a(r14)
            r1.a(r0)
            goto L_0x0502
        L_0x0203:
            int[] r13 = com.spotify.music.features.settings.adapter.SettingsAdapter.AnonymousClass7.b
            com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties r0 = r11.S
            com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties$SettingsDebugLabel r0 = r0.a()
            int r0 = r0.ordinal()
            r13 = r13[r0]
            if (r13 == r2) goto L_0x0235
            r0 = 2
            if (r13 == r0) goto L_0x022b
            r0 = 3
            r2 = 2131952331(0x7f1302cb, float:1.9541102E38)
            if (r13 == r0) goto L_0x0224
            android.content.Context r13 = r11.b
            java.lang.String r13 = r13.getString(r2)
        L_0x0222:
            r0 = r13
            goto L_0x023f
        L_0x0224:
            android.content.Context r13 = r11.b
            java.lang.String r13 = r13.getString(r2)
            goto L_0x0222
        L_0x022b:
            android.content.Context r13 = r11.b
            r0 = 2131952329(0x7f1302c9, float:1.9541098E38)
            java.lang.String r13 = r13.getString(r0)
            goto L_0x0222
        L_0x0235:
            android.content.Context r13 = r11.b
            r0 = 2131952330(0x7f1302ca, float:1.95411E38)
            java.lang.String r13 = r13.getString(r0)
            goto L_0x0222
        L_0x023f:
            android.content.Context r13 = r11.b
            r2 = 2131952327(0x7f1302c7, float:1.9541094E38)
            java.lang.String r13 = r13.getString(r2)
            if (r1 != 0) goto L_0x0250
            android.content.Context r1 = r11.b
            qnb r1 = defpackage.qne.a(r1, r14)
        L_0x0250:
            com.spotify.music.features.settings.adapter.SettingsAdapter$5 r14 = new com.spotify.music.features.settings.adapter.SettingsAdapter$5
            r14.<init>()
            r1.a(r14)
            goto L_0x0896
        L_0x025a:
            android.content.Context r13 = r11.b
            r0 = 2131953566(0x7f13079e, float:1.9543607E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.Context r13 = r11.b
            r2 = 2131953567(0x7f13079f, float:1.9543609E38)
            java.lang.String r13 = r13.getString(r2)
            if (r1 != 0) goto L_0x0274
            android.content.Context r1 = r11.b
            qnb r1 = defpackage.qne.a(r1, r14)
        L_0x0274:
            com.spotify.music.features.settings.adapter.SettingsAdapter$4 r14 = new com.spotify.music.features.settings.adapter.SettingsAdapter$4
            r14.<init>()
            r1.a(r14)
            goto L_0x0896
        L_0x027e:
            android.content.Context r13 = r11.b
            r0 = 2131953612(0x7f1307cc, float:1.95437E38)
            java.lang.String r0 = r13.getString(r0)
            java.lang.String r13 = r11.B
            int r13 = r13.length()
            if (r13 <= 0) goto L_0x029f
            android.content.Context r13 = r11.b
            r4 = 2131953611(0x7f1307cb, float:1.9543698E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r11.B
            r2[r3] = r5
            java.lang.String r13 = r13.getString(r4, r2)
            goto L_0x02a1
        L_0x029f:
            java.lang.String r13 = ""
        L_0x02a1:
            if (r1 != 0) goto L_0x02a9
            android.content.Context r1 = r11.b
            qnb r1 = defpackage.qne.a(r1, r14)
        L_0x02a9:
            com.spotify.music.features.settings.adapter.SettingsAdapter$3 r14 = new com.spotify.music.features.settings.adapter.SettingsAdapter$3
            r14.<init>()
            r1.a(r14)
            r14 = 2131430418(0x7f0b0c12, float:1.8482536E38)
            r1.a(r14)
            goto L_0x0896
        L_0x02b9:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953610(0x7f1307ca, float:1.9543696E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953609(0x7f1307c9, float:1.9543694E38)
            java.lang.String r13 = r13.getString(r2)
            if (r1 != 0) goto L_0x02d3
            android.content.Context r1 = r11.b
            qnb r1 = defpackage.qne.a(r1, r14)
        L_0x02d3:
            com.spotify.music.features.settings.adapter.SettingsAdapter$10 r14 = new com.spotify.music.features.settings.adapter.SettingsAdapter$10
            r14.<init>()
            r1.a(r14)
            goto L_0x0896
        L_0x02dd:
            android.content.Context r13 = r11.b
            r2 = 2131953677(0x7f13080d, float:1.9543832E38)
            java.lang.String r13 = r13.getString(r2)
            java.lang.String r2 = r11.am
            if (r1 != 0) goto L_0x02f0
            android.content.Context r1 = r11.b
            qnb r1 = defpackage.qne.a(r1, r14)
        L_0x02f0:
            r1.a(r0)
            goto L_0x0502
        L_0x02f5:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953680(0x7f130810, float:1.9543838E38)
            java.lang.String r13 = r13.getString(r0)
            android.content.res.Resources r0 = r11.J
            r4 = 2131953679(0x7f13080f, float:1.9543836E38)
            java.lang.String r6 = r0.getString(r4)
            ijt r0 = r11.f
            jxz r4 = r0.b
            androidx.fragment.app.Fragment r5 = r0.a
            android.content.Context r5 = r5.n()
            java.lang.String r7 = "android.permission.RECORD_AUDIO"
            boolean r4 = r4.a(r5, r7)
            if (r4 == 0) goto L_0x0323
            ijr r0 = r0.c
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0323
            r4 = 1
            goto L_0x0324
        L_0x0323:
            r4 = 0
        L_0x0324:
            r2 = 2131430428(0x7f0b0c1c, float:1.8482557E38)
            com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$P7LdRqW0wcTPWgR4d8J2f3xFjLA r5 = new com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$P7LdRqW0wcTPWgR4d8J2f3xFjLA
            r5.<init>()
            r0 = r11
            r3 = r14
            qnd r1 = r0.a(r1, r2, r3, r4, r5)
            goto L_0x07b4
        L_0x0334:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953563(0x7f13079b, float:1.95436E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953562(0x7f13079a, float:1.9543598E38)
            java.lang.String r13 = r13.getString(r2)
            r2 = 2131951665(0x7f130031, float:1.953975E38)
            qnd r1 = r11.a(r14, r1, r2)
            goto L_0x0896
        L_0x034f:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953600(0x7f1307c0, float:1.9543676E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953599(0x7f1307bf, float:1.9543674E38)
            java.lang.String r13 = r13.getString(r2)
            r2 = 2131953905(0x7f1308f1, float:1.9544294E38)
            qnd r1 = r11.a(r14, r1, r2)
            goto L_0x0896
        L_0x036a:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953561(0x7f130799, float:1.9543596E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953560(0x7f130798, float:1.9543594E38)
            java.lang.String r13 = r13.getString(r2)
            if (r1 != 0) goto L_0x0384
            android.content.Context r1 = r11.b
            qnb r1 = defpackage.qne.a(r1, r14)
        L_0x0384:
            com.spotify.music.features.settings.adapter.SettingsAdapter$14 r14 = new com.spotify.music.features.settings.adapter.SettingsAdapter$14
            r14.<init>()
            r1.a(r14)
            goto L_0x0896
        L_0x038e:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953682(0x7f130812, float:1.9543842E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953681(0x7f130811, float:1.954384E38)
            java.lang.String r13 = r13.getString(r2)
            r2 = 2131954091(0x7f1309ab, float:1.9544671E38)
            qnd r1 = r11.a(r14, r1, r2)
            goto L_0x0896
        L_0x03a9:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953671(0x7f130807, float:1.954382E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953670(0x7f130806, float:1.9543818E38)
            java.lang.String r13 = r13.getString(r2)
            r2 = 2131953898(0x7f1308ea, float:1.954428E38)
            qnd r1 = r11.a(r14, r1, r2)
            goto L_0x0896
        L_0x03c4:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953602(0x7f1307c2, float:1.954368E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953601(0x7f1307c1, float:1.9543678E38)
            java.lang.String r13 = r13.getString(r2)
            r2 = 2131953913(0x7f1308f9, float:1.954431E38)
            qnd r1 = r11.a(r14, r1, r2)
            goto L_0x0896
        L_0x03df:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953638(0x7f1307e6, float:1.9543753E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953637(0x7f1307e5, float:1.954375E38)
            java.lang.String r13 = r13.getString(r2)
            r2 = 2131953517(0x7f13076d, float:1.9543507E38)
            qnd r1 = r11.a(r14, r1, r2)
            goto L_0x0896
        L_0x03fa:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953606(0x7f1307c6, float:1.9543688E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953605(0x7f1307c5, float:1.9543686E38)
            java.lang.String r13 = r13.getString(r2)
            r2 = 2131952861(0x7f1304dd, float:1.9542177E38)
            qnd r1 = r11.a(r14, r1, r2)
            goto L_0x0896
        L_0x0415:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953604(0x7f1307c4, float:1.9543684E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953603(0x7f1307c3, float:1.9543682E38)
            java.lang.String r13 = r13.getString(r2)
            android.content.Context r2 = r11.b
            java.lang.String r3 = "spotify:internal:licenses"
            kpo$a r2 = defpackage.kpo.a(r2, r3)
            android.content.Intent r2 = r2.a
            qnd r1 = r11.a(r14, r1, r2)
            goto L_0x0896
        L_0x0437:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953684(0x7f130814, float:1.9543846E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953683(0x7f130813, float:1.9543844E38)
            java.lang.String r13 = r13.getString(r2)
            if (r1 != 0) goto L_0x0896
            android.content.Context r1 = r11.b
            kfm r2 = r11.U
            vwu r4 = r11.an
            defpackage.fqv.b()
            fsb r14 = defpackage.fsk.a(r1, r14, r3)
            qni r1 = new qni
            android.view.View r3 = r14.getView()
            r1.<init>(r3, r14, r2, r4)
            defpackage.fqz.a(r1)
            goto L_0x0896
        L_0x0466:
            if (r1 != 0) goto L_0x047d
            android.content.Context r13 = r11.b
            defpackage.fqv.b()
            fsb r13 = defpackage.fsk.a(r13, r14, r3)
            qna r1 = new qna
            android.view.View r14 = r13.getView()
            r1.<init>(r14, r13)
            defpackage.fqz.a(r1)
        L_0x047d:
            r13 = r0
            goto L_0x0896
        L_0x0480:
            android.content.Context r13 = r11.b
            r0 = 2131953659(0x7f1307fb, float:1.9543795E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.Context r13 = r11.b
            r2 = 2131953658(0x7f1307fa, float:1.9543793E38)
            java.lang.String r13 = r13.getString(r2)
            if (r1 != 0) goto L_0x049a
            android.content.Context r1 = r11.b
            qnb r1 = defpackage.qne.a(r1, r14)
        L_0x049a:
            com.spotify.music.features.settings.adapter.SettingsAdapter$2 r14 = new com.spotify.music.features.settings.adapter.SettingsAdapter$2
            r14.<init>()
            r1.a(r14)
            r14 = 2131430410(0x7f0b0c0a, float:1.848252E38)
            r1.a(r14)
            goto L_0x0896
        L_0x04aa:
            if (r1 != 0) goto L_0x047d
            android.content.Context r13 = r11.b
            com.spotify.cosmos.android.RxResolver r1 = r11.ae
            qng r2 = new qng
            r2.<init>(r13, r14, r1)
            defpackage.fqz.a(r2)
            r11.p = r2
            com.spotify.music.features.settings.adapter.SettingsAdapter$15 r13 = new com.spotify.music.features.settings.adapter.SettingsAdapter$15
            r13.<init>()
            r11.registerDataSetObserver(r13)
            qng r1 = r11.p
            goto L_0x047d
        L_0x04c5:
            android.content.res.Resources r13 = r11.J
            r2 = 2131953586(0x7f1307b2, float:1.9543647E38)
            java.lang.String r13 = r13.getString(r2)
            android.content.res.Resources r2 = r11.J
            r4 = 2131953585(0x7f1307b1, float:1.9543645E38)
            java.lang.String r2 = r2.getString(r4)
            boolean r4 = r11.A
            if (r4 == 0) goto L_0x04de
            r11.A = r3
            goto L_0x04df
        L_0x04de:
            r0 = r1
        L_0x04df:
            r5 = r0
            qnf r5 = (defpackage.qnf) r5
            java.lang.String[] r6 = r11.l
            qnf$b r7 = r11.ac
            java.lang.String[] r8 = r11.n
            jwo$a<java.lang.Integer> r9 = defpackage.jwo.e
            com.spotify.music.features.settings.adapter.-$$Lambda$EB1r_RdmMNsfjoQz4Pq2XecrBXY r10 = com.spotify.music.features.settings.adapter.$$Lambda$EB1r_RdmMNsfjoQz4Pq2XecrBXY.INSTANCE
            r3 = r11
            r4 = r14
            qnd r1 = r3.a(r4, r5, r6, r7, r8, r9, r10)
            r14 = 2131430411(0x7f0b0c0b, float:1.8482522E38)
            r1.a(r14)
            r14 = r1
            qnf r14 = (defpackage.qnf) r14
            com.spotify.music.features.settings.adapter.SettingsAdapter$9 r0 = new com.spotify.music.features.settings.adapter.SettingsAdapter$9
            r0.<init>()
            r14.i = r0
        L_0x0502:
            r0 = r13
            goto L_0x0645
        L_0x0505:
            android.content.res.Resources r13 = r11.J
            r2 = 2131953669(0x7f130805, float:1.9543816E38)
            java.lang.String r13 = r13.getString(r2)
            rzo r2 = r11.N
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L_0x0520
            android.content.res.Resources r2 = r11.J
            r4 = 2131952311(0x7f1302b7, float:1.9541061E38)
            java.lang.String r2 = r2.getString(r4)
            goto L_0x0529
        L_0x0520:
            android.content.res.Resources r2 = r11.J
            r4 = 2131953668(0x7f130804, float:1.9543813E38)
            java.lang.String r2 = r2.getString(r4)
        L_0x0529:
            boolean r4 = r11.z
            if (r4 == 0) goto L_0x0530
            r11.z = r3
            goto L_0x0531
        L_0x0530:
            r0 = r1
        L_0x0531:
            r5 = r0
            qnf r5 = (defpackage.qnf) r5
            java.lang.String[] r6 = r11.k
            qnf$b r7 = r11.ab
            java.lang.String[] r8 = r11.m
            jwo$a<java.lang.Integer> r9 = defpackage.jwo.f
            com.spotify.music.features.settings.adapter.-$$Lambda$G3v2omMhlXijiYkQNFZFuSVRajE r10 = com.spotify.music.features.settings.adapter.$$Lambda$G3v2omMhlXijiYkQNFZFuSVRajE.INSTANCE
            r3 = r11
            r4 = r14
            qnd r1 = r3.a(r4, r5, r6, r7, r8, r9, r10)
            r14 = 2131430425(0x7f0b0c19, float:1.848255E38)
            r1.a(r14)
            goto L_0x0502
        L_0x054b:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953584(0x7f1307b0, float:1.9543643E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953583(0x7f1307af, float:1.9543641E38)
            java.lang.String r13 = r13.getString(r2)
            qnh r1 = (defpackage.qnh) r1
            jwo$a<java.lang.Boolean> r2 = defpackage.jwo.d
            com.spotify.music.features.settings.adapter.-$$Lambda$G2IBbt6tgpj65S11atvidSPjJPo r3 = com.spotify.music.features.settings.adapter.$$Lambda$G2IBbt6tgpj65S11atvidSPjJPo.INSTANCE
            qnd r1 = r11.a(r14, r1, r2, r3)
            goto L_0x0896
        L_0x0569:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953591(0x7f1307b7, float:1.9543657E38)
            java.lang.String r13 = r13.getString(r0)
            android.content.res.Resources r0 = r11.J
            r2 = 2131953587(0x7f1307b3, float:1.954365E38)
            java.lang.String r6 = r0.getString(r2)
            gvs r0 = r11.Q
            boolean r4 = r0.b()
            r2 = 2131430412(0x7f0b0c0c, float:1.8482524E38)
            com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$yjPjggZ_Te24ZnuTK24vSA9Kh9E r5 = new com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$yjPjggZ_Te24ZnuTK24vSA9Kh9E
            r5.<init>()
            r0 = r11
            r3 = r14
            qnd r1 = r0.a(r1, r2, r3, r4, r5)
            goto L_0x07b4
        L_0x0591:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953592(0x7f1307b8, float:1.954366E38)
            java.lang.String r13 = r13.getString(r0)
            android.content.res.Resources r0 = r11.J
            r2 = 2131953593(0x7f1307b9, float:1.9543661E38)
            java.lang.String r6 = r0.getString(r2)
            gvs r0 = r11.Q
            boolean r4 = r0.a()
            r2 = 2131430413(0x7f0b0c0d, float:1.8482526E38)
            com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$URul1X6WjmFgdCf50nieqY3ZVqM r5 = new com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$URul1X6WjmFgdCf50nieqY3ZVqM
            r5.<init>()
            r0 = r11
            r3 = r14
            qnd r1 = r0.a(r1, r2, r3, r4, r5)
            goto L_0x07b4
        L_0x05b9:
            android.content.res.Resources r13 = r11.J
            r0 = 2131952137(0x7f130209, float:1.9540708E38)
            java.lang.String r13 = r13.getString(r0)
            android.content.res.Resources r0 = r11.J
            r2 = 2131952136(0x7f130208, float:1.9540706E38)
            java.lang.String r6 = r0.getString(r2)
            gts r0 = r11.T
            boolean r4 = r0.b()
            r2 = 2131430417(0x7f0b0c11, float:1.8482534E38)
            com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$1a5rnrZNu7GCatTem9iPncF8uTs r5 = new com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$1a5rnrZNu7GCatTem9iPncF8uTs
            r5.<init>()
            r0 = r11
            r3 = r14
            qnd r1 = r0.a(r1, r2, r3, r4, r5)
            goto L_0x07b4
        L_0x05e1:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953598(0x7f1307be, float:1.9543672E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953597(0x7f1307bd, float:1.954367E38)
            java.lang.String r13 = r13.getString(r2)
            android.content.Context r2 = r11.b
            sso r3 = com.spotify.music.libs.viewuri.ViewUris.bA
            java.lang.String r3 = r3.toString()
            kpo$a r2 = defpackage.kpo.a(r2, r3)
            android.content.Intent r2 = r2.a
            qnd r1 = r11.a(r14, r1, r2)
            r14 = 2131430415(0x7f0b0c0f, float:1.848253E38)
            r1.a(r14)
            goto L_0x0896
        L_0x060d:
            com.spotify.mobile.android.util.LinkType r13 = com.spotify.mobile.android.util.LinkType.NAVIGATION_APPS_SETTINGS
            jwk r13 = defpackage.jwl.a(r13)
            java.lang.Object r13 = defpackage.fbp.a(r13)
            jwk r13 = (defpackage.jwk) r13
            java.util.List<java.lang.String> r13 = r13.c
            java.lang.Object r13 = r13.get(r3)
            java.lang.String r13 = (java.lang.String) r13
            android.content.res.Resources r0 = r11.J
            r2 = 2131953565(0x7f13079d, float:1.9543605E38)
            java.lang.String r0 = r0.getString(r2)
            android.content.res.Resources r2 = r11.J
            r3 = 2131953564(0x7f13079c, float:1.9543603E38)
            java.lang.String r2 = r2.getString(r3)
            android.content.Context r3 = r11.b
            kpo$a r13 = defpackage.kpo.a(r3, r13)
            android.content.Intent r13 = r13.a
            qnd r1 = r11.a(r14, r1, r13)
            r13 = 2131430401(0x7f0b0c01, float:1.8482502E38)
            r1.a(r13)
        L_0x0645:
            r13 = r2
            goto L_0x0896
        L_0x0648:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953579(0x7f1307ab, float:1.9543633E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953578(0x7f1307aa, float:1.954363E38)
            java.lang.String r13 = r13.getString(r2)
            android.content.Context r2 = r11.b
            fqn r3 = r11.a
            android.content.Intent r2 = com.spotify.music.features.connect.picker.ui.DevicePickerActivity.a(r2, r3)
            if (r1 != 0) goto L_0x066a
            android.content.Context r1 = r11.b
            qnb r1 = defpackage.qne.a(r1, r14)
        L_0x066a:
            com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$ZDEPmBcBaqwf2Qq93uXDMiMewH4 r14 = new com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$ZDEPmBcBaqwf2Qq93uXDMiMewH4
            r14.<init>(r2)
            r1.a(r14)
            r14 = 2131430406(0x7f0b0c06, float:1.8482512E38)
            r1.a(r14)
            goto L_0x0896
        L_0x067a:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953621(0x7f1307d5, float:1.9543718E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953620(0x7f1307d4, float:1.9543716E38)
            java.lang.String r13 = r13.getString(r2)
            android.content.Context r2 = r11.b
            sso r3 = com.spotify.music.libs.viewuri.ViewUris.bC
            java.lang.String r3 = r3.toString()
            kpo$a r2 = defpackage.kpo.a(r2, r3)
            android.content.Intent r2 = r2.a
            qnd r1 = r11.a(r14, r1, r2)
            goto L_0x0896
        L_0x06a0:
            rzo r13 = r11.N
            boolean r13 = r13.a(r3)
            if (r13 == 0) goto L_0x06b2
            android.content.res.Resources r13 = r11.J
            r0 = 2131952322(0x7f1302c2, float:1.9541083E38)
            java.lang.String r13 = r13.getString(r0)
            goto L_0x06bb
        L_0x06b2:
            android.content.res.Resources r13 = r11.J
            r0 = 2131952321(0x7f1302c1, float:1.9541081E38)
            java.lang.String r13 = r13.getString(r0)
        L_0x06bb:
            android.content.res.Resources r0 = r11.J
            r2 = 2131952320(0x7f1302c0, float:1.954108E38)
            java.lang.String r6 = r0.getString(r2)
            rzo r0 = r11.N
            boolean r4 = r0.a(r3)
            r2 = 2131430409(0x7f0b0c09, float:1.8482518E38)
            com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$DK0AXFmWKdf5lHDTMezWWjslFfs r5 = new com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$DK0AXFmWKdf5lHDTMezWWjslFfs
            r5.<init>()
            r0 = r11
            r3 = r14
            qnd r1 = r0.a(r1, r2, r3, r4, r5)
            goto L_0x07b4
        L_0x06da:
            android.content.res.Resources r13 = r11.J
            r0 = 2131951828(0x7f1300d4, float:1.9540082E38)
            java.lang.String r13 = r13.getString(r0)
            android.content.res.Resources r0 = r11.J
            r4 = 2131951827(0x7f1300d3, float:1.954008E38)
            java.lang.String r6 = r0.getString(r4)
            kxs r0 = r11.P
            boolean r0 = r0.a()
            rzo r4 = r11.N
            boolean r4 = r4.a(r3)
            if (r4 != 0) goto L_0x06fe
            if (r0 == 0) goto L_0x06fe
            r4 = 1
            goto L_0x06ff
        L_0x06fe:
            r4 = 0
        L_0x06ff:
            r2 = 2131430405(0x7f0b0c05, float:1.848251E38)
            com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$HH6fZgkDhKb_oId-1NARk4gQya8 r5 = new com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$HH6fZgkDhKb_oId-1NARk4gQya8
            r5.<init>()
            r0 = r11
            r3 = r14
            qnd r1 = r0.a(r1, r2, r3, r4, r5)
            goto L_0x07b4
        L_0x070f:
            android.content.res.Resources r13 = r11.J
            r0 = 2131951758(0x7f13008e, float:1.953994E38)
            java.lang.String r13 = r13.getString(r0)
            android.content.res.Resources r0 = r11.J
            r3 = 2131951757(0x7f13008d, float:1.9539938E38)
            java.lang.String r6 = r0.getString(r3)
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r0 = r11.R
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Boolean> r3 = defpackage.kty.a
            boolean r4 = r0.a(r3, r2)
            r2 = 2131430403(0x7f0b0c03, float:1.8482506E38)
            com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$mt6Vrfr2xWHpiWNy6GdXLEJ7WUY r5 = new com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$mt6Vrfr2xWHpiWNy6GdXLEJ7WUY
            r5.<init>()
            r0 = r11
            r3 = r14
            qnd r1 = r0.a(r1, r2, r3, r4, r5)
            goto L_0x07b4
        L_0x0739:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953576(0x7f1307a8, float:1.9543627E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953575(0x7f1307a7, float:1.9543625E38)
            java.lang.String r13 = r13.getString(r2)
            if (r1 != 0) goto L_0x0896
            android.content.Context r1 = r11.b
            defpackage.fqv.b()
            fsb r14 = defpackage.fsk.a(r1, r14, r3)
            qmy r1 = new qmy
            android.view.View r2 = r14.getView()
            r1.<init>(r2, r14)
            defpackage.fqz.a(r1)
            goto L_0x0896
        L_0x0764:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953654(0x7f1307f6, float:1.9543785E38)
            java.lang.String r13 = r13.getString(r0)
            android.content.res.Resources r0 = r11.J
            r4 = 2131953655(0x7f1307f7, float:1.9543787E38)
            java.lang.String r6 = r0.getString(r4)
            int r0 = r11.E
            r0 = r0 & r2
            if (r0 != r2) goto L_0x077d
            r4 = 1
            goto L_0x077e
        L_0x077d:
            r4 = 0
        L_0x077e:
            r2 = 2131430423(0x7f0b0c17, float:1.8482547E38)
            com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$eWc4t7-oDLVkVL0hzaD6rCZEMtI r5 = new com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$eWc4t7-oDLVkVL0hzaD6rCZEMtI
            r5.<init>()
            r0 = r11
            r3 = r14
            qnd r1 = r0.a(r1, r2, r3, r4, r5)
            goto L_0x07b4
        L_0x078d:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953608(0x7f1307c8, float:1.9543692E38)
            java.lang.String r13 = r13.getString(r0)
            android.content.res.Resources r0 = r11.J
            r2 = 2131953607(0x7f1307c7, float:1.954369E38)
            java.lang.String r6 = r0.getString(r2)
            r2 = 2131430416(0x7f0b0c10, float:1.8482532E38)
            boolean r4 = r11.D
            com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$3wdDGelbwHdfzVVie3cilTlhuLs r5 = new com.spotify.music.features.settings.adapter.-$$Lambda$SettingsAdapter$3wdDGelbwHdfzVVie3cilTlhuLs
            r5.<init>()
            r0 = r11
            r3 = r14
            qnd r1 = r0.a(r1, r2, r3, r4, r5)
            boolean r14 = r11.D
            r1.a(r14)
        L_0x07b4:
            r0 = r13
            r13 = r6
            goto L_0x0896
        L_0x07b8:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953636(0x7f1307e4, float:1.9543749E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            r2 = 2131953635(0x7f1307e3, float:1.9543747E38)
            java.lang.String r13 = r13.getString(r2)
            qnh r1 = (defpackage.qnh) r1
            jwo$a<java.lang.Boolean> r2 = defpackage.jwo.c
            com.spotify.music.features.settings.adapter.-$$Lambda$4xpFCc82bCbYNuE3TrU9XwR4Re0 r3 = com.spotify.music.features.settings.adapter.$$Lambda$4xpFCc82bCbYNuE3TrU9XwR4Re0.INSTANCE
            qnd r1 = r11.a(r14, r1, r2, r3)
            r14 = 2131430422(0x7f0b0c16, float:1.8482545E38)
            r1.a(r14)
            goto L_0x0896
        L_0x07dc:
            android.content.res.Resources r13 = r11.J
            r0 = 2131953630(0x7f1307de, float:1.9543736E38)
            java.lang.String r0 = r13.getString(r0)
            android.content.res.Resources r13 = r11.J
            fqn r4 = r11.a
            boolean r4 = defpackage.isu.a(r4)
            if (r4 == 0) goto L_0x07f3
            r4 = 2131953629(0x7f1307dd, float:1.9543734E38)
            goto L_0x07f6
        L_0x07f3:
            r4 = 2131953628(0x7f1307dc, float:1.9543732E38)
        L_0x07f6:
            java.lang.String r13 = r13.getString(r4)
            com.spotify.mobile.android.util.loader.SettingsState r4 = r11.g
            if (r4 == 0) goto L_0x087c
            boolean r4 = r4.offlineMode()
            if (r4 == 0) goto L_0x087c
            com.spotify.mobile.android.util.loader.SettingsState r4 = r11.g
            int r4 = r4.secondsToOfflineExpiry()
            if (r4 < 0) goto L_0x087c
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = (long) r4
            long r6 = r13.toHours(r4)
            int r13 = (int) r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = r6.toDays(r4)
            int r5 = (int) r4
            if (r5 <= 0) goto L_0x083b
            android.content.res.Resources r13 = r11.J
            fqn r4 = r11.a
            boolean r4 = defpackage.isu.a(r4)
            if (r4 == 0) goto L_0x082b
            r4 = 2131953625(0x7f1307d9, float:1.9543726E38)
            goto L_0x082e
        L_0x082b:
            r4 = 2131953624(0x7f1307d8, float:1.9543724E38)
        L_0x082e:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r3] = r5
            java.lang.String r13 = r13.getString(r4, r2)
            goto L_0x0870
        L_0x083b:
            if (r13 <= 0) goto L_0x085b
            android.content.res.Resources r4 = r11.J
            fqn r5 = r11.a
            boolean r5 = defpackage.isu.a(r5)
            if (r5 == 0) goto L_0x084b
            r5 = 2131953627(0x7f1307db, float:1.954373E38)
            goto L_0x084e
        L_0x084b:
            r5 = 2131953626(0x7f1307da, float:1.9543728E38)
        L_0x084e:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2[r3] = r13
            java.lang.String r13 = r4.getString(r5, r2)
            goto L_0x0870
        L_0x085b:
            android.content.res.Resources r13 = r11.J
            fqn r2 = r11.a
            boolean r2 = defpackage.isu.a(r2)
            if (r2 == 0) goto L_0x0869
            r2 = 2131953623(0x7f1307d7, float:1.9543722E38)
            goto L_0x086c
        L_0x0869:
            r2 = 2131953622(0x7f1307d6, float:1.954372E38)
        L_0x086c:
            java.lang.String r13 = r13.getString(r2)
        L_0x0870:
            java.util.regex.Pattern r2 = I
            java.util.regex.Matcher r13 = r2.matcher(r13)
            java.lang.String r2 = "\n"
            java.lang.String r13 = r13.replaceAll(r2)
        L_0x087c:
            qnh r1 = (defpackage.qnh) r1
            jwo$a<java.lang.Boolean> r2 = defpackage.jwo.a
            com.spotify.music.features.settings.adapter.-$$Lambda$oO3DxoCureX1Iiegvf3HmfxO1As r3 = com.spotify.music.features.settings.adapter.$$Lambda$oO3DxoCureX1Iiegvf3HmfxO1As.INSTANCE
            qnd r1 = r11.a(r14, r1, r2, r3)
            r14 = 2131430420(0x7f0b0c14, float:1.848254E38)
            r1.a(r14)
            r14 = r1
            qnh r14 = (defpackage.qnh) r14
            com.spotify.music.features.settings.adapter.SettingsAdapter$8 r2 = new com.spotify.music.features.settings.adapter.SettingsAdapter$8
            r2.<init>()
            r14.h = r2
        L_0x0896:
            boolean r12 = r11.isEnabled(r12)
            r1.a(r12)
            r1.a(r0)
            r1.a(r13)
            com.spotify.mobile.android.util.loader.SettingsState r12 = r11.g
            if (r12 == 0) goto L_0x08aa
            r1.a(r12)
        L_0x08aa:
            android.view.View r12 = r1.getView()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.settings.adapter.SettingsAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final int getViewTypeCount() {
        return H;
    }

    public final boolean isEnabled(int i2) {
        return !this.aa.apply(this.h.get(i2));
    }
}
