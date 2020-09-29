package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.IconSize;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.ImageSize;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;

/* renamed from: hap reason: default package */
public final class hap {
    final Context a;
    final float b;
    private final SpotifyIconV2 c;
    private final Drawable d = vgl.a(this.a, (int) R.attr.pasteColorPlaceholderBackground);
    private final b e = new b();

    /* renamed from: hap$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b = new int[IconSize.values().length];
        static final /* synthetic */ int[] c = new int[ImageSize.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0098 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a3 */
        static {
            /*
                com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate$ImageConfig$ImageSize[] r0 = com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.ImageSize.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c = r0
                r0 = 1
                int[] r1 = c     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate$ImageConfig$ImageSize r2 = com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.ImageSize.SMALL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = c     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate$ImageConfig$ImageSize r3 = com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.ImageSize.MEDIUM     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = c     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate$ImageConfig$ImageSize r4 = com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.ImageSize.LARGE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate$ImageConfig$IconSize[] r3 = com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.IconSize.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                b = r3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x003d }
                com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate$ImageConfig$IconSize r4 = com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.IconSize.X_SMALL     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate$ImageConfig$IconSize r4 = com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.IconSize.MEDIUM     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate$ImageConfig$IconSize r4 = com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.IconSize.SMALL     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x005c }
                com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate$ImageConfig$IconSize r5 = com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.IconSize.LARGE     // Catch:{ NoSuchFieldError -> 0x005c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                com.spotify.android.paste.graphics.SpotifyIconV2[] r4 = com.spotify.android.paste.graphics.SpotifyIconV2.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                int[] r4 = a     // Catch:{ NoSuchFieldError -> 0x006f }
                com.spotify.android.paste.graphics.SpotifyIconV2 r5 = com.spotify.android.paste.graphics.SpotifyIconV2.DISCOVER     // Catch:{ NoSuchFieldError -> 0x006f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.spotify.android.paste.graphics.SpotifyIconV2 r4 = com.spotify.android.paste.graphics.SpotifyIconV2.RELEASED     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.spotify.android.paste.graphics.SpotifyIconV2 r1 = com.spotify.android.paste.graphics.SpotifyIconV2.BROWSE     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008d }
                com.spotify.android.paste.graphics.SpotifyIconV2 r1 = com.spotify.android.paste.graphics.SpotifyIconV2.HIGHLIGHT     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0098 }
                com.spotify.android.paste.graphics.SpotifyIconV2 r1 = com.spotify.android.paste.graphics.SpotifyIconV2.SHOWS     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a3 }
                com.spotify.android.paste.graphics.SpotifyIconV2 r1 = com.spotify.android.paste.graphics.SpotifyIconV2.MIX     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00ae }
                com.spotify.android.paste.graphics.SpotifyIconV2 r1 = com.spotify.android.paste.graphics.SpotifyIconV2.VIDEO     // Catch:{ NoSuchFieldError -> 0x00ae }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ae }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ae }
            L_0x00ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hap.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: hap$a */
    static final class a {
        public final SpotifyIconV2 a;
        public final ImageSize b;
        public final IconSize c;

        private a(SpotifyIconV2 spotifyIconV2, ImageSize imageSize, IconSize iconSize) {
            this.a = (SpotifyIconV2) fbp.a(spotifyIconV2);
            this.b = (ImageSize) fbp.a(imageSize);
            this.c = (IconSize) fbp.a(iconSize);
        }

        /* synthetic */ a(SpotifyIconV2 spotifyIconV2, ImageSize imageSize, IconSize iconSize, byte b2) {
            this(spotifyIconV2, imageSize, iconSize);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
            }
        }

        public final int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }
    }

    /* renamed from: hap$b */
    class b extends LruCache<a, Drawable> {
        b() {
            super(30);
        }

        /* access modifiers changed from: 0000 */
        public final Drawable a(SpotifyIconV2 spotifyIconV2, ImageConfig imageConfig) {
            return (Drawable) get(new a(spotifyIconV2, imageConfig.b(), imageConfig.a(), 0));
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object create(Object obj) {
            float f;
            float f2;
            a aVar = (a) obj;
            hap hap = hap.this;
            switch (aVar.a) {
                case DISCOVER:
                case RELEASED:
                case BROWSE:
                case HIGHLIGHT:
                case SHOWS:
                case MIX:
                case VIDEO:
                    IconSize iconSize = aVar.c;
                    int i = AnonymousClass1.b[iconSize.ordinal()];
                    if (i == 1) {
                        f2 = 0.33f;
                    } else if (i == 2) {
                        f2 = 0.66f;
                    } else if (i == 3) {
                        f2 = 0.5f;
                    } else if (i != 4) {
                        StringBuilder sb = new StringBuilder("Unmapped size : ");
                        sb.append(iconSize);
                        Assertion.b(sb.toString());
                        f2 = 1.0f;
                    } else {
                        f2 = 0.75f;
                    }
                    f = f2;
                    break;
                default:
                    f = Float.NaN;
                    break;
            }
            return aVar.b == ImageSize.SMALL ? gaa.a(hap.a, aVar.a, f, true, false, hap.b) : gaa.b(hap.a, aVar.a, f, false, false, hap.b);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
            int i = AnonymousClass1.c[((a) obj).b.ordinal()];
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return 3;
                }
            }
            return i2;
        }
    }

    public hap(Context context, SpotifyIconV2 spotifyIconV2) {
        this.c = (SpotifyIconV2) fbp.a(spotifyIconV2);
        this.a = (Context) fbp.a(context);
        this.b = (float) vfj.b(32.0f, context.getResources());
    }

    public final Drawable a(String str, ImageConfig imageConfig) {
        return str == null ? this.d : this.e.a((SpotifyIconV2) defpackage.haq.a.a.a(str).a(this.c), imageConfig);
    }
}
