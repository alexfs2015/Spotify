package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutInfo.Builder;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: ft reason: default package */
public final class ft {
    Context a;
    String b;
    Intent[] c;
    CharSequence d;
    IconCompat e;

    /* renamed from: ft$a */
    public static class a {
        private final ft a = new ft();

        public a(Context context, String str) {
            ft ftVar = this.a;
            ftVar.a = context;
            ftVar.b = str;
        }

        public final a a(CharSequence charSequence) {
            this.a.d = charSequence;
            return this;
        }

        public final a a(IconCompat iconCompat) {
            this.a.e = iconCompat;
            return this;
        }

        public final ft a() {
            if (TextUtils.isEmpty(this.a.d)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            } else if (this.a.c != null && this.a.c.length != 0) {
                return this.a;
            } else {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
        }

        public final a a(Intent intent) {
            this.a.c = new Intent[]{intent};
            return this;
        }
    }

    ft() {
    }

    public final ShortcutInfo a() {
        Icon icon;
        Builder intents = new Builder(this.a, this.b).setShortLabel(this.d).setIntents(this.c);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            int i = iconCompat.a;
            if (i != -1) {
                if (i == 1) {
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.b);
                } else if (i == 2) {
                    icon = Icon.createWithResource(iconCompat.a(), iconCompat.e);
                } else if (i == 3) {
                    icon = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                } else if (i == 4) {
                    icon = Icon.createWithContentUri((String) iconCompat.b);
                } else if (i != 5) {
                    throw new IllegalArgumentException("Unknown type");
                } else if (VERSION.SDK_INT >= 26) {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.b);
                } else {
                    icon = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.b, false));
                }
                if (iconCompat.g != null) {
                    icon.setTintList(iconCompat.g);
                }
                if (iconCompat.i != IconCompat.h) {
                    icon.setTintMode(iconCompat.i);
                }
            } else {
                icon = (Icon) iconCompat.b;
            }
            intents.setIcon(icon);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setLongLabel(null);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setDisabledMessage(null);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putBoolean("extraLongLived", false);
        intents.setExtras(persistableBundle);
        return intents.build();
    }

    /* access modifiers changed from: 0000 */
    public final Intent a(Intent intent) {
        Bitmap bitmap;
        Intent[] intentArr = this.c;
        String str = "android.intent.extra.shortcut.NAME";
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra(str, this.d.toString());
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            Context context = this.a;
            if (iconCompat.a == 2) {
                String str2 = (String) iconCompat.b;
                String str3 = ":";
                if (str2.contains(str3)) {
                    String str4 = str2.split(str3, -1)[1];
                    String str5 = "/";
                    String str6 = str4.split(str5, -1)[0];
                    String str7 = str4.split(str5, -1)[1];
                    String str8 = str2.split(str3, -1)[0];
                    int identifier = IconCompat.a(context, str8).getIdentifier(str7, str6, str8);
                    if (iconCompat.e != identifier) {
                        StringBuilder sb = new StringBuilder("Id has changed for ");
                        sb.append(str8);
                        sb.append(str5);
                        sb.append(str7);
                        iconCompat.e = identifier;
                    }
                }
            }
            int i = iconCompat.a;
            if (i == 1) {
                bitmap = (Bitmap) iconCompat.b;
            } else if (i == 2) {
                try {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", ShortcutIconResource.fromContext(context.createPackageContext(iconCompat.a(), 0), iconCompat.e));
                } catch (NameNotFoundException e2) {
                    StringBuilder sb2 = new StringBuilder("Can't find package ");
                    sb2.append(iconCompat.b);
                    throw new IllegalArgumentException(sb2.toString(), e2);
                }
            } else if (i == 5) {
                bitmap = IconCompat.a((Bitmap) iconCompat.b, true);
            } else {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        }
        return intent;
    }
}
