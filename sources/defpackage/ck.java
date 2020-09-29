package defpackage;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.music.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: ck reason: default package */
public final class ck extends js implements OnClickListener {
    private final SearchView b;
    private final SearchableInfo c;
    private final Context d;
    private final WeakHashMap<String, ConstantState> e;
    private final int f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    /* renamed from: ck$a */
    static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.content.Context, android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [android.content.Context, android.graphics.drawable.Drawable]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [android.content.Context, android.graphics.drawable.Drawable]
      mth insns count: 21
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
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable a(android.content.ComponentName r6) {
        /*
            r5 = this;
            r0 = 0
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r2 = r1.getActivityInfo(r6, r2)     // Catch:{ NameNotFoundException -> 0x0036 }
            int r3 = r2.getIconResource()
            if (r3 != 0) goto L_0x0012
            return r0
        L_0x0012:
            java.lang.String r4 = r6.getPackageName()
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r4, r3, r2)
            if (r1 != 0) goto L_0x0035
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid icon resource "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " for "
            r1.append(r2)
            java.lang.String r6 = r6.flattenToShortString()
            r1.append(r6)
            return r0
        L_0x0035:
            return r1
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck.a(android.content.ComponentName):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1 = new java.lang.StringBuilder("Resource does not exist: ");
        r1.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        throw new java.io.FileNotFoundException(r1.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable a(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0079 }
            if (r3 == 0) goto L_0x002a
            android.graphics.drawable.Drawable r7 = r6.b(r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.String r3 = "Resource does not exist: "
            r1.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0079 }
            r1.append(r7)     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x0079 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0079 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0079 }
        L_0x002a:
            android.content.Context r3 = r6.d     // Catch:{ FileNotFoundException -> 0x0079 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0079 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0079 }
            if (r3 == 0) goto L_0x0065
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x004f }
            r3.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x004e
        L_0x003e:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0079 }
            r5.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0079 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0079 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0079 }
        L_0x004e:
            return r4
        L_0x004f:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0064
        L_0x0054:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0079 }
            r5.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0079 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0079 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0079 }
        L_0x0064:
            throw r4     // Catch:{ FileNotFoundException -> 0x0079 }
        L_0x0065:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.String r3 = "Failed to open "
            r1.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0079 }
            r1.append(r7)     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x0079 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0079 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Icon not found: "
            r1.<init>(r3)
            r1.append(r7)
            java.lang.String r7 = ", "
            r1.append(r7)
            java.lang.String r7 = r0.getMessage()
            r1.append(r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck.a(android.net.Uri):android.graphics.drawable.Drawable");
    }

    private Drawable a(String str) {
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !Ad.DEFAULT_SKIPPABLE_AD_DELAY.equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder sb = new StringBuilder("android.resource://");
                sb.append(this.d.getPackageName());
                sb.append("/");
                sb.append(parseInt);
                String sb2 = sb.toString();
                Drawable b2 = b(sb2);
                if (b2 != null) {
                    return b2;
                }
                Drawable a2 = fr.a(this.d, parseInt);
                a(sb2, a2);
                return a2;
            } catch (NumberFormatException unused) {
                Drawable b3 = b(str);
                if (b3 != null) {
                    return b3;
                }
                drawable = a(Uri.parse(str));
                a(str, drawable);
            } catch (NotFoundException unused2) {
                new StringBuilder("Icon resource not found: ").append(str);
                return null;
            }
        }
        return drawable;
    }

    private static String a(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    public static String a(Cursor cursor, String str) {
        return a(cursor, cursor.getColumnIndex(str));
    }

    private static void a(ImageView imageView, Drawable drawable, int i2) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i2);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private static void a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void a(String str, Drawable drawable) {
        if (drawable != null) {
            this.e.put(str, drawable.getConstantState());
        }
    }

    private Drawable b(Uri uri) {
        int i2;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context context = null;
            try {
                Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
                List pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i2 = Integer.parseInt((String) pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb = new StringBuilder("Single path segment is not a resource ID: ");
                            sb.append(uri);
                            throw new FileNotFoundException(sb.toString());
                        }
                    } else if (size == 2) {
                        i2 = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
                    } else {
                        StringBuilder sb2 = new StringBuilder("More than two path segments: ");
                        sb2.append(uri);
                        throw new FileNotFoundException(sb2.toString());
                    }
                    if (i2 != 0) {
                        return resourcesForApplication.getDrawable(i2);
                    }
                    StringBuilder sb3 = new StringBuilder("No resource found for: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder("No path: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            } catch (NameNotFoundException unused2) {
                StringBuilder sb5 = new StringBuilder("No package found for authority: ");
                sb5.append(uri);
                throw new FileNotFoundException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder("No authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    private Drawable b(String str) {
        ConstantState constantState = (ConstantState) this.e.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private static void c(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r11v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r11v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0, types: [android.content.Context, android.database.Cursor]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [android.database.Cursor, android.content.Context, ?[OBJECT, ARRAY]]
      mth insns count: 48
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
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077 A[Catch:{ RuntimeException -> 0x007b }] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor a(java.lang.CharSequence r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            if (r11 != 0) goto L_0x0006
            r11 = r0
            goto L_0x000a
        L_0x0006:
            java.lang.String r11 = r11.toString()
        L_0x000a:
            androidx.appcompat.widget.SearchView r1 = r10.b
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x007b
            androidx.appcompat.widget.SearchView r1 = r10.b
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L_0x001c
            goto L_0x007b
        L_0x001c:
            android.app.SearchableInfo r1 = r10.c     // Catch:{ RuntimeException -> 0x007b }
            if (r1 != 0) goto L_0x0022
        L_0x0020:
            r11 = r2
            goto L_0x0075
        L_0x0022:
            java.lang.String r3 = r1.getSuggestAuthority()     // Catch:{ RuntimeException -> 0x007b }
            if (r3 != 0) goto L_0x0029
            goto L_0x0020
        L_0x0029:
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch:{ RuntimeException -> 0x007b }
            r4.<init>()     // Catch:{ RuntimeException -> 0x007b }
            java.lang.String r5 = "content"
            android.net.Uri$Builder r4 = r4.scheme(r5)     // Catch:{ RuntimeException -> 0x007b }
            android.net.Uri$Builder r3 = r4.authority(r3)     // Catch:{ RuntimeException -> 0x007b }
            android.net.Uri$Builder r3 = r3.query(r0)     // Catch:{ RuntimeException -> 0x007b }
            android.net.Uri$Builder r0 = r3.fragment(r0)     // Catch:{ RuntimeException -> 0x007b }
            java.lang.String r3 = r1.getSuggestPath()     // Catch:{ RuntimeException -> 0x007b }
            if (r3 == 0) goto L_0x0049
            r0.appendEncodedPath(r3)     // Catch:{ RuntimeException -> 0x007b }
        L_0x0049:
            java.lang.String r3 = "search_suggest_query"
            r0.appendPath(r3)     // Catch:{ RuntimeException -> 0x007b }
            java.lang.String r7 = r1.getSuggestSelection()     // Catch:{ RuntimeException -> 0x007b }
            if (r7 == 0) goto L_0x005c
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ RuntimeException -> 0x007b }
            r3 = 0
            r1[r3] = r11     // Catch:{ RuntimeException -> 0x007b }
            r8 = r1
            goto L_0x0060
        L_0x005c:
            r0.appendPath(r11)     // Catch:{ RuntimeException -> 0x007b }
            r8 = r2
        L_0x0060:
            java.lang.String r11 = "limit"
            java.lang.String r1 = "50"
            r0.appendQueryParameter(r11, r1)     // Catch:{ RuntimeException -> 0x007b }
            android.net.Uri r5 = r0.build()     // Catch:{ RuntimeException -> 0x007b }
            android.content.ContentResolver r4 = r2.getContentResolver()     // Catch:{ RuntimeException -> 0x007b }
            r6 = 0
            r9 = 0
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x007b }
        L_0x0075:
            if (r11 == 0) goto L_0x007b
            r11.getCount()     // Catch:{ RuntimeException -> 0x007b }
            return r11
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck.a(java.lang.CharSequence):android.database.Cursor");
    }

    public final View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a2 = super.a(context, cursor, viewGroup);
        a2.setTag(new a(a2));
        ((ImageView) a2.findViewById(R.id.edit_query)).setImageResource(this.f);
        return a2;
    }

    public final void a(Cursor cursor) {
        try {
            super.a(cursor);
            if (cursor != null) {
                this.h = cursor.getColumnIndex("suggest_text_1");
                this.i = cursor.getColumnIndex("suggest_text_2");
                this.j = cursor.getColumnIndex("suggest_text_2_url");
                this.k = cursor.getColumnIndex("suggest_icon_1");
                this.l = cursor.getColumnIndex("suggest_icon_2");
                this.m = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r3v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r3v4, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v9, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r3v10, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v3, types: [android.graphics.drawable.Drawable$ConstantState] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r3v14, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v8, types: [android.text.SpannableString] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0, types: [android.content.Context]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [android.content.Context, ?[OBJECT, ARRAY], android.graphics.drawable.Drawable]
      mth insns count: 100
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
    /* JADX WARNING: Unknown variable types count: 10 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r14, android.database.Cursor r15) {
        /*
            r13 = this;
            java.lang.Object r14 = r14.getTag()
            ck$a r14 = (defpackage.ck.a) r14
            int r0 = r13.m
            r1 = -1
            if (r0 == r1) goto L_0x000e
            r15.getInt(r0)
        L_0x000e:
            android.widget.TextView r0 = r14.a
            if (r0 == 0) goto L_0x001d
            int r0 = r13.h
            java.lang.String r0 = a(r15, r0)
            android.widget.TextView r2 = r14.a
            a(r2, r0)
        L_0x001d:
            android.widget.TextView r0 = r14.b
            r2 = 0
            if (r0 == 0) goto L_0x0095
            int r0 = r13.j
            java.lang.String r0 = a(r15, r0)
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0066
            android.content.res.ColorStateList r5 = r13.g
            if (r5 != 0) goto L_0x004b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r6 = r2.getTheme()
            r7 = 2130969494(0x7f040396, float:1.7547671E38)
            r6.resolveAttribute(r7, r5, r4)
            android.content.res.Resources r6 = r2.getResources()
            int r5 = r5.resourceId
            android.content.res.ColorStateList r5 = r6.getColorStateList(r5)
            r13.g = r5
        L_0x004b:
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r0)
            android.text.style.TextAppearanceSpan r12 = new android.text.style.TextAppearanceSpan
            r7 = 0
            r8 = 0
            r9 = 0
            android.content.res.ColorStateList r10 = r13.g
            r11 = 0
            r6 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            int r0 = r0.length()
            r6 = 33
            r5.setSpan(r12, r3, r0, r6)
            goto L_0x006c
        L_0x0066:
            int r0 = r13.i
            java.lang.String r5 = a(r15, r0)
        L_0x006c:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0082
            android.widget.TextView r0 = r14.a
            if (r0 == 0) goto L_0x0090
            android.widget.TextView r0 = r14.a
            r0.setSingleLine(r3)
            android.widget.TextView r0 = r14.a
            r3 = 2
            r0.setMaxLines(r3)
            goto L_0x0090
        L_0x0082:
            android.widget.TextView r0 = r14.a
            if (r0 == 0) goto L_0x0090
            android.widget.TextView r0 = r14.a
            r0.setSingleLine(r4)
            android.widget.TextView r0 = r14.a
            r0.setMaxLines(r4)
        L_0x0090:
            android.widget.TextView r0 = r14.b
            a(r0, r5)
        L_0x0095:
            android.widget.ImageView r0 = r14.c
            if (r0 == 0) goto L_0x00f5
            android.widget.ImageView r0 = r14.c
            int r3 = r13.k
            if (r3 != r1) goto L_0x00a1
            r3 = r2
            goto L_0x00f1
        L_0x00a1:
            java.lang.String r3 = r15.getString(r3)
            android.graphics.drawable.Drawable r3 = r13.a(r3)
            if (r3 == 0) goto L_0x00ac
            goto L_0x00f1
        L_0x00ac:
            android.app.SearchableInfo r3 = r13.c
            android.content.ComponentName r3 = r3.getSearchActivity()
            java.lang.String r4 = r3.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r13.e
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x00d5
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r3 = r13.e
            java.lang.Object r3 = r3.get(r4)
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3
            if (r3 != 0) goto L_0x00ca
            r3 = r2
            goto L_0x00e6
        L_0x00ca:
            android.content.Context r4 = r13.d
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.drawable.Drawable r3 = r3.newDrawable(r4)
            goto L_0x00e6
        L_0x00d5:
            android.graphics.drawable.Drawable r3 = r13.a(r3)
            if (r3 != 0) goto L_0x00dd
            r5 = r2
            goto L_0x00e1
        L_0x00dd:
            android.graphics.drawable.Drawable$ConstantState r5 = r3.getConstantState()
        L_0x00e1:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r6 = r13.e
            r6.put(r4, r5)
        L_0x00e6:
            if (r3 == 0) goto L_0x00e9
            goto L_0x00f1
        L_0x00e9:
            android.content.pm.PackageManager r3 = r2.getPackageManager()
            android.graphics.drawable.Drawable r3 = r3.getDefaultActivityIcon()
        L_0x00f1:
            r4 = 4
            a(r0, r3, r4)
        L_0x00f5:
            android.widget.ImageView r0 = r14.d
            r3 = 8
            if (r0 == 0) goto L_0x010d
            android.widget.ImageView r0 = r14.d
            int r4 = r13.l
            if (r4 != r1) goto L_0x0102
            goto L_0x010a
        L_0x0102:
            java.lang.String r15 = r15.getString(r4)
            android.graphics.drawable.Drawable r2 = r13.a(r15)
        L_0x010a:
            a(r0, r2, r3)
        L_0x010d:
            android.widget.ImageView r14 = r14.e
            r14.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck.a(android.view.View, android.database.Cursor):void");
    }

    public final CharSequence b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a2 = a(cursor, "suggest_intent_query");
        if (a2 != null) {
            return a2;
        }
        if (this.c.shouldRewriteQueryFromData()) {
            String a3 = a(cursor, "suggest_intent_data");
            if (a3 != null) {
                return a3;
            }
        }
        if (this.c.shouldRewriteQueryFromText()) {
            String a4 = a(cursor, "suggest_text_1");
            if (a4 != null) {
                return a4;
            }
        }
        return null;
    }

    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Cursor cursor = this.a;
            LayoutInflater layoutInflater = null;
            View inflate = layoutInflater.inflate(0, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).a.setText(e2.toString());
            }
            return inflate;
        }
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            View a2 = a((Context) null, this.a, viewGroup);
            if (a2 != null) {
                ((a) a2.getTag()).a.setText(e2.toString());
            }
            return a2;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        c(a());
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        c(a());
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.b.b((CharSequence) tag);
        }
    }
}
