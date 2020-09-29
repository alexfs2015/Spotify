package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.FacebookException;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: akr reason: default package */
public class akr {
    public static final String a = akr.class.getSimpleName();
    /* access modifiers changed from: private */
    public static final String i;
    private static Pattern j = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private static volatile String n;
    aki b;
    public JSONObject c;
    public Bundle d;
    b e;
    public Object f;
    public String g;
    public boolean h;
    private HttpMethod k;
    private String l;
    private boolean m;

    /* renamed from: akr$a */
    static class a {
        final akr a;
        final Object b;

        public a(akr akr, Object obj) {
            this.a = akr;
            this.b = obj;
        }
    }

    /* renamed from: akr$b */
    public interface b {
        void a(aku aku);
    }

    /* renamed from: akr$c */
    interface c {
        void a(String str, String str2);
    }

    /* renamed from: akr$d */
    public interface d extends b {
    }

    /* renamed from: akr$e */
    public static class e<RESOURCE extends Parcelable> implements Parcelable {
        public static final Creator<e> CREATOR = new Creator<e>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new e(parcel, 0);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new e[i];
            }
        };
        final String a;
        final RESOURCE b;

        private e(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readParcelable(akq.g().getClassLoader());
        }

        /* synthetic */ e(Parcel parcel, byte b2) {
            this(parcel);
        }

        public e(RESOURCE resource, String str) {
            this.a = str;
            this.b = resource;
        }

        public final int describeContents() {
            return 1;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeParcelable(this.b, i);
        }
    }

    /* renamed from: akr$f */
    static class f implements c {
        private final OutputStream a;
        private final and b;
        private boolean c = true;
        private boolean d = false;

        public f(OutputStream outputStream, and and, boolean z) {
            this.a = outputStream;
            this.b = and;
            this.d = z;
        }

        private static RuntimeException a() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        private void a(String str, Bitmap bitmap) {
            a(str, str, "image/png");
            bitmap.compress(CompressFormat.PNG, 100, this.a);
            b("", new Object[0]);
            b();
            and and = this.b;
            if (and != null) {
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                and.a(sb.toString(), (Object) "<Image>");
            }
        }

        private void a(String str, Uri uri, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            a(str, str, str2);
            if (this.a instanceof akz) {
                ((akz) this.a).a(ank.e(uri));
                i = 0;
            } else {
                i = ank.a(akq.g().getContentResolver().openInputStream(uri), this.a) + 0;
            }
            b("", new Object[0]);
            b();
            and and = this.b;
            if (and != null) {
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                and.a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        private void a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            a(str, str, str2);
            OutputStream outputStream = this.a;
            if (outputStream instanceof akz) {
                ((akz) outputStream).a(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = ank.a((InputStream) new AutoCloseInputStream(parcelFileDescriptor), this.a) + 0;
            }
            b("", new Object[0]);
            b();
            and and = this.b;
            if (and != null) {
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                and.a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        private void a(String str, String str2, String str3) {
            if (!this.d) {
                a("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    a("; filename=\"%s\"", str2);
                }
                String str4 = "";
                b(str4, new Object[0]);
                if (str3 != null) {
                    b("%s: %s", "Content-Type", str3);
                }
                b(str4, new Object[0]);
                return;
            }
            this.a.write(String.format("%s=", new Object[]{str}).getBytes());
        }

        private void a(String str, byte[] bArr) {
            a(str, str, "content/unknown");
            this.a.write(bArr);
            b("", new Object[0]);
            b();
            and and = this.b;
            if (and != null) {
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                and.a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
        }

        private void a(String str, Object... objArr) {
            if (!this.d) {
                if (this.c) {
                    this.a.write("--".getBytes());
                    this.a.write(akr.i.getBytes());
                    this.a.write("\r\n".getBytes());
                    this.c = false;
                }
                this.a.write(String.format(str, objArr).getBytes());
                return;
            }
            this.a.write(URLEncoder.encode(String.format(Locale.US, str, objArr), "UTF-8").getBytes());
        }

        private void b() {
            if (!this.d) {
                b("--%s", akr.i);
                return;
            }
            this.a.write("&".getBytes());
        }

        private void b(String str, Object... objArr) {
            a(str, objArr);
            if (!this.d) {
                a("\r\n", new Object[0]);
            }
        }

        public final void a(String str, Object obj, akr akr) {
            OutputStream outputStream = this.a;
            if (outputStream instanceof alb) {
                ((alb) outputStream).a(akr);
            }
            if (akr.d(obj)) {
                a(str, akr.e(obj));
            } else if (obj instanceof Bitmap) {
                a(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                a(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                a(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                a(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof e) {
                e eVar = (e) obj;
                RESOURCE resource = eVar.b;
                String str2 = eVar.a;
                if (resource instanceof ParcelFileDescriptor) {
                    a(str, (ParcelFileDescriptor) resource, str2);
                } else if (resource instanceof Uri) {
                    a(str, (Uri) resource, str2);
                } else {
                    throw a();
                }
            } else {
                throw a();
            }
        }

        public final void a(String str, String str2) {
            a(str, (String) null, (String) null);
            b("%s", str2);
            b();
            and and = this.b;
            if (and != null) {
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                and.a(sb.toString(), (Object) str2);
            }
        }

        public final void a(String str, JSONArray jSONArray, Collection<akr> collection) {
            OutputStream outputStream = this.a;
            if (!(outputStream instanceof alb)) {
                a(str, jSONArray.toString());
                return;
            }
            alb alb = (alb) outputStream;
            a(str, (String) null, (String) null);
            a("[", new Object[0]);
            int i = 0;
            for (akr akr : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                alb.a(akr);
                if (i > 0) {
                    a(",%s", jSONObject.toString());
                } else {
                    a("%s", jSONObject.toString());
                }
                i++;
            }
            a("]", new Object[0]);
            and and = this.b;
            if (and != null) {
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                and.a(sb.toString(), (Object) jSONArray.toString());
            }
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i2 = 0; i2 < nextInt; i2++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        i = sb.toString();
    }

    public akr() {
        this(null, null, null, null, null);
    }

    public akr(aki aki, String str, Bundle bundle, HttpMethod httpMethod) {
        this(aki, str, bundle, httpMethod, null);
    }

    public akr(aki aki, String str, Bundle bundle, HttpMethod httpMethod, b bVar) {
        this(aki, str, bundle, httpMethod, bVar, null);
    }

    private akr(aki aki, String str, Bundle bundle, HttpMethod httpMethod, b bVar, String str2) {
        this.m = true;
        this.h = false;
        this.b = aki;
        this.l = str;
        this.g = null;
        a(bVar);
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.k = httpMethod;
        if (bundle != null) {
            this.d = new Bundle(bundle);
        } else {
            this.d = new Bundle();
        }
        if (this.g == null) {
            this.g = akq.h();
        }
    }

    public static akr a(aki aki, String str, b bVar) {
        akr akr = new akr(null, str, null, null, null);
        return akr;
    }

    public static akr a(aki aki, String str, JSONObject jSONObject, b bVar) {
        akr akr = new akr(aki, str, null, HttpMethod.POST, null);
        akr.c = jSONObject;
        return akr;
    }

    public static aku a(akr akr) {
        List a2 = a(akr);
        if (a2 != null && a2.size() == 1) {
            return (aku) a2.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    private String a(String str, Boolean bool) {
        if (!bool.booleanValue() && this.k == HttpMethod.POST) {
            return str;
        }
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.d.keySet()) {
            Object obj = this.d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (d(obj)) {
                buildUpon.appendQueryParameter(str2, e(obj).toString());
            } else if (this.k == HttpMethod.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{obj.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    public static List<aku> a(akt akt) {
        anl.a((Collection<T>) akt, "requests");
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = c(akt);
            return a(httpURLConnection, akt);
        } catch (Exception e2) {
            List<aku> a2 = aku.a(akt.b, httpURLConnection, new FacebookException((Throwable) e2));
            a(akt, a2);
            return a2;
        } finally {
            ank.a((URLConnection) httpURLConnection);
        }
    }

    public static List<aku> a(HttpURLConnection httpURLConnection, akt akt) {
        List<aku> a2 = aku.a(httpURLConnection, akt);
        ank.a((URLConnection) httpURLConnection);
        int size = akt.size();
        if (size == a2.size()) {
            a(akt, a2);
            akk.a().b();
            return a2;
        }
        throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(a2.size()), Integer.valueOf(size)}));
    }

    private static List<aku> a(Collection<akr> collection) {
        return a(new akt(collection));
    }

    private static List<aku> a(akr... akrArr) {
        anl.a((Object) akrArr, "requests");
        return a((Collection<akr>) Arrays.asList(akrArr));
    }

    private static void a(f fVar, Collection<akr> collection, Map<String, a> map) {
        JSONArray jSONArray = new JSONArray();
        for (akr a2 : collection) {
            a2.a(jSONArray, map);
        }
        fVar.a("batch", jSONArray, collection);
    }

    private static void a(akt akt, and and, int i2, URL url, OutputStream outputStream, boolean z) {
        f fVar = new f(outputStream, and, z);
        String str = "  Attachments:\n";
        if (i2 == 1) {
            akr a2 = akt.get(0);
            HashMap hashMap = new HashMap();
            for (String str2 : a2.d.keySet()) {
                Object obj = a2.d.get(str2);
                if (c(obj)) {
                    hashMap.put(str2, new a(a2, obj));
                }
            }
            if (and != null) {
                and.b("  Parameters:\n");
            }
            a(a2.d, fVar, a2);
            if (and != null) {
                and.b(str);
            }
            a((Map<String, a>) hashMap, fVar);
            JSONObject jSONObject = a2.c;
            if (jSONObject != null) {
                a(jSONObject, url.getPath(), (c) fVar);
            }
            return;
        }
        String f2 = f(akt);
        if (!ank.a(f2)) {
            fVar.a("batch_app_id", f2);
            HashMap hashMap2 = new HashMap();
            a(fVar, (Collection<akr>) akt, (Map<String, a>) hashMap2);
            if (and != null) {
                and.b(str);
            }
            a((Map<String, a>) hashMap2, fVar);
            return;
        }
        throw new FacebookException("App ID was not specified at the request or Settings.");
    }

    private static void a(final akt akt, List<aku> list) {
        int size = akt.size();
        final ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = akt.get(i2).e;
            if (bVar != null) {
                arrayList.add(new Pair(bVar, list.get(i2)));
            }
        }
        if (arrayList.size() > 0) {
            AnonymousClass2 r7 = new Runnable() {
                public final void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((b) pair.first).a((aku) pair.second);
                    }
                    for (defpackage.akt.a a2 : akt.d) {
                        a2.a();
                    }
                }
            };
            Handler handler = akt.a;
            if (handler == null) {
                r7.run();
                return;
            }
            handler.post(r7);
        }
    }

    private static void a(Bundle bundle, f fVar, akr akr) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (d(obj)) {
                fVar.a(str, obj, akr);
            }
        }
    }

    private static void a(String str, Object obj, c cVar, boolean z) {
        Class cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    a(String.format("%s[%s]", new Object[]{str, str2}), jSONObject.opt(str2), cVar, z);
                }
            } else {
                String str3 = "id";
                if (jSONObject.has(str3)) {
                    a(str, (Object) jSONObject.optString(str3), cVar, z);
                } else {
                    String str4 = "url";
                    if (jSONObject.has(str4)) {
                        a(str, (Object) jSONObject.optString(str4), cVar, z);
                    } else {
                        if (jSONObject.has("fbsdk:create_object")) {
                            a(str, (Object) jSONObject.toString(), cVar, z);
                        }
                    }
                }
            }
        } else if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                a(String.format(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i2)}), jSONArray.opt(i2), cVar, z);
            }
        } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            cVar.a(str, obj.toString());
        } else if (Date.class.isAssignableFrom(cls)) {
            cVar.a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
        }
    }

    private static void a(Map<String, a> map, f fVar) {
        for (String str : map.keySet()) {
            a aVar = (a) map.get(str);
            if (c(aVar.b)) {
                fVar.a(str, aVar.b, aVar.a);
            }
        }
    }

    private void a(JSONArray jSONArray, Map<String, a> map) {
        JSONObject jSONObject = new JSONObject();
        String d2 = d();
        jSONObject.put("relative_url", d2);
        jSONObject.put("method", this.k);
        aki aki = this.b;
        if (aki != null) {
            and.a(aki.e);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.d.keySet()) {
            Object obj = this.d.get(str);
            if (c(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(format);
                map.put(format, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.c != null) {
            final ArrayList arrayList2 = new ArrayList();
            a(this.c, d2, (c) new c() {
                public final void a(String str, String str2) {
                    arrayList2.add(String.format(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, "UTF-8")}));
                }
            });
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(org.json.JSONObject r6, java.lang.String r7, defpackage.akr.c r8) {
        /*
            java.util.regex.Pattern r0 = j
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r1 = r0.matches()
            r2 = 1
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = r0.group(r2)
            goto L_0x0013
        L_0x0012:
            r0 = r7
        L_0x0013:
            java.lang.String r1 = "me/"
            boolean r1 = r0.startsWith(r1)
            r3 = 0
            if (r1 != 0) goto L_0x0027
            java.lang.String r1 = "/me/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r0 = 0
            goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = ":"
            int r0 = r7.indexOf(r0)
            java.lang.String r1 = "?"
            int r7 = r7.indexOf(r1)
            r1 = 3
            if (r0 <= r1) goto L_0x0040
            r1 = -1
            if (r7 == r1) goto L_0x003e
            if (r0 >= r7) goto L_0x0040
        L_0x003e:
            r7 = 1
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            java.util.Iterator r0 = r6.keys()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0066
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r6.opt(r1)
            if (r7 == 0) goto L_0x0061
            java.lang.String r5 = "image"
            boolean r5 = r1.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0061
            r5 = 1
            goto L_0x0062
        L_0x0061:
            r5 = 0
        L_0x0062:
            a(r1, r4, r8, r5)
            goto L_0x0045
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akr.a(org.json.JSONObject, java.lang.String, akr$c):void");
    }

    public static aks b(akt akt) {
        anl.a((Collection<T>) akt, "requests");
        aks aks = new aks(akt);
        aks.executeOnExecutor(akq.e(), new Void[0]);
        return aks;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r12v0, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r9v4, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01e5 A[Catch:{ IOException | JSONException -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.net.HttpURLConnection c(defpackage.akt r15) {
        /*
            java.lang.String r0 = "User-Agent"
            java.util.Iterator r1 = r15.iterator()
        L_0x0006:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "Request"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0080
            java.lang.Object r2 = r1.next()
            akr r2 = (defpackage.akr) r2
            com.facebook.HttpMethod r7 = com.facebook.HttpMethod.GET
            com.facebook.HttpMethod r8 = r2.k
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0006
            java.lang.String r7 = r2.g
            boolean r8 = defpackage.ank.a(r7)
            if (r8 == 0) goto L_0x002b
        L_0x0029:
            r4 = 1
            goto L_0x005b
        L_0x002b:
            java.lang.String r8 = "v"
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto L_0x0037
            java.lang.String r7 = r7.substring(r5)
        L_0x0037:
            java.lang.String r8 = "\\."
            java.lang.String[] r7 = r7.split(r8)
            int r8 = r7.length
            if (r8 < r4) goto L_0x0048
            r8 = r7[r6]
            int r8 = java.lang.Integer.parseInt(r8)
            if (r8 > r4) goto L_0x0029
        L_0x0048:
            r8 = r7[r6]
            int r8 = java.lang.Integer.parseInt(r8)
            if (r8 < r4) goto L_0x005a
            r4 = r7[r5]
            int r4 = java.lang.Integer.parseInt(r4)
            r7 = 4
            if (r4 < r7) goto L_0x005a
            goto L_0x0029
        L_0x005a:
            r4 = 0
        L_0x005b:
            if (r4 == 0) goto L_0x0006
            android.os.Bundle r4 = r2.d
            java.lang.String r7 = "fields"
            boolean r8 = r4.containsKey(r7)
            if (r8 == 0) goto L_0x0071
            java.lang.String r4 = r4.getString(r7)
            boolean r4 = defpackage.ank.a(r4)
            if (r4 == 0) goto L_0x0006
        L_0x0071:
            com.facebook.LoggingBehavior r4 = com.facebook.LoggingBehavior.DEVELOPER_ERRORS
            r7 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r2 = r2.l
            r5[r6] = r2
            java.lang.String r2 = "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter."
            defpackage.and.a(r4, r7, r3, r2, r5)
            goto L_0x0006
        L_0x0080:
            int r1 = r15.size()     // Catch:{ MalformedURLException -> 0x01fc }
            java.lang.String r2 = "%s/%s"
            if (r1 != r5) goto L_0x00c6
            akr r1 = r15.get(r6)     // Catch:{ MalformedURLException -> 0x01fc }
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01fc }
            com.facebook.HttpMethod r8 = r1.k     // Catch:{ MalformedURLException -> 0x01fc }
            com.facebook.HttpMethod r9 = com.facebook.HttpMethod.POST     // Catch:{ MalformedURLException -> 0x01fc }
            if (r8 != r9) goto L_0x00a7
            java.lang.String r8 = r1.l     // Catch:{ MalformedURLException -> 0x01fc }
            if (r8 == 0) goto L_0x00a7
            java.lang.String r8 = r1.l     // Catch:{ MalformedURLException -> 0x01fc }
            java.lang.String r9 = "/videos"
            boolean r8 = r8.endsWith(r9)     // Catch:{ MalformedURLException -> 0x01fc }
            if (r8 == 0) goto L_0x00a7
            java.lang.String r8 = defpackage.ani.c()     // Catch:{ MalformedURLException -> 0x01fc }
            goto L_0x00ab
        L_0x00a7:
            java.lang.String r8 = defpackage.ani.b()     // Catch:{ MalformedURLException -> 0x01fc }
        L_0x00ab:
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ MalformedURLException -> 0x01fc }
            r9[r6] = r8     // Catch:{ MalformedURLException -> 0x01fc }
            java.lang.String r8 = r1.e()     // Catch:{ MalformedURLException -> 0x01fc }
            r9[r5] = r8     // Catch:{ MalformedURLException -> 0x01fc }
            java.lang.String r8 = java.lang.String.format(r2, r9)     // Catch:{ MalformedURLException -> 0x01fc }
            r1.c()     // Catch:{ MalformedURLException -> 0x01fc }
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch:{ MalformedURLException -> 0x01fc }
            java.lang.String r1 = r1.a(r8, r9)     // Catch:{ MalformedURLException -> 0x01fc }
            r7.<init>(r1)     // Catch:{ MalformedURLException -> 0x01fc }
            goto L_0x00cf
        L_0x00c6:
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01fc }
            java.lang.String r1 = defpackage.ani.b()     // Catch:{ MalformedURLException -> 0x01fc }
            r7.<init>(r1)     // Catch:{ MalformedURLException -> 0x01fc }
        L_0x00cf:
            r1 = 0
            java.net.URLConnection r7 = r7.openConnection()     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            java.lang.String r8 = n     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            if (r8 != 0) goto L_0x0104
            java.lang.String r8 = "%s.%s"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            java.lang.String r10 = "FBAndroidSDK"
            r9[r6] = r10     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            java.lang.String r10 = "5.0.1"
            r9[r5] = r10     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            java.lang.String r8 = java.lang.String.format(r8, r9)     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            n = r8     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            java.lang.String r8 = defpackage.anb.a     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            boolean r9 = defpackage.ank.a(r8)     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            if (r9 != 0) goto L_0x0104
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            java.lang.String r10 = n     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            r4[r6] = r10     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            r4[r5] = r8     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            java.lang.String r2 = java.lang.String.format(r9, r2, r4)     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            n = r2     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
        L_0x0104:
            java.lang.String r2 = n     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            r7.setRequestProperty(r0, r2)     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            java.lang.String r2 = "Accept-Language"
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            r7.setRequestProperty(r2, r4)     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            r7.setChunkedStreamingMode(r6)     // Catch:{ IOException -> 0x01ef, JSONException -> 0x01ed }
            and r2 = new and     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            com.facebook.LoggingBehavior r4 = com.facebook.LoggingBehavior.REQUESTS     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            r2.<init>(r4, r3)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            int r3 = r15.size()     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            boolean r4 = e(r15)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            if (r3 != r5) goto L_0x0131
            akr r8 = r15.get(r6)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            com.facebook.HttpMethod r8 = r8.k     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            goto L_0x0133
        L_0x0131:
            com.facebook.HttpMethod r8 = com.facebook.HttpMethod.POST     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
        L_0x0133:
            java.lang.String r9 = r8.name()     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            r7.setRequestMethod(r9)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            java.lang.String r9 = "Content-Type"
            if (r4 == 0) goto L_0x014b
            java.lang.String r10 = "application/x-www-form-urlencoded"
            r7.setRequestProperty(r9, r10)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            java.lang.String r10 = "Content-Encoding"
            java.lang.String r11 = "gzip"
            r7.setRequestProperty(r10, r11)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            goto L_0x015a
        L_0x014b:
            java.lang.String r10 = "multipart/form-data; boundary=%s"
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            java.lang.String r12 = i     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            r11[r6] = r12     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            java.lang.String r10 = java.lang.String.format(r10, r11)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            r7.setRequestProperty(r9, r10)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
        L_0x015a:
            java.net.URL r14 = r7.getURL()     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            java.lang.String r10 = "Request:\n"
            r2.b(r10)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            java.lang.String r10 = "Id"
            java.lang.String r11 = r15.c     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            r2.a(r10, r11)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            java.lang.String r10 = "URL"
            r2.a(r10, r14)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            java.lang.String r10 = "Method"
            java.lang.String r11 = r7.getRequestMethod()     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            r2.a(r10, r11)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            java.lang.String r10 = r7.getRequestProperty(r0)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            r2.a(r0, r10)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            java.lang.String r0 = r7.getRequestProperty(r9)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            r2.a(r9, r0)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            r7.setConnectTimeout(r6)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            r7.setReadTimeout(r6)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            com.facebook.HttpMethod r0 = com.facebook.HttpMethod.POST     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            if (r8 != r0) goto L_0x0191
            r6 = 1
        L_0x0191:
            if (r6 != 0) goto L_0x0197
            r2.a()     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            goto L_0x01de
        L_0x0197:
            r7.setDoOutput(r5)     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x01e1 }
            java.io.OutputStream r5 = r7.getOutputStream()     // Catch:{ all -> 0x01e1 }
            r0.<init>(r5)     // Catch:{ all -> 0x01e1 }
            if (r4 == 0) goto L_0x01ab
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x01df }
            r1.<init>(r0)     // Catch:{ all -> 0x01df }
            r0 = r1
        L_0x01ab:
            boolean r1 = d(r15)     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x01cf
            akz r1 = new akz     // Catch:{ all -> 0x01df }
            android.os.Handler r5 = r15.a     // Catch:{ all -> 0x01df }
            r1.<init>(r5)     // Catch:{ all -> 0x01df }
            r9 = 0
            r8 = r15
            r10 = r3
            r11 = r14
            r12 = r1
            r13 = r4
            a(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01df }
            int r5 = r1.b     // Catch:{ all -> 0x01df }
            java.util.Map<akr, alc> r11 = r1.a     // Catch:{ all -> 0x01df }
            ala r1 = new ala     // Catch:{ all -> 0x01df }
            long r12 = (long) r5     // Catch:{ all -> 0x01df }
            r8 = r1
            r9 = r0
            r10 = r15
            r8.<init>(r9, r10, r11, r12)     // Catch:{ all -> 0x01df }
            r0 = r1
        L_0x01cf:
            r8 = r15
            r9 = r2
            r10 = r3
            r11 = r14
            r12 = r0
            r13 = r4
            a(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01df }
            r0.close()     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
            r2.a()     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
        L_0x01de:
            return r7
        L_0x01df:
            r15 = move-exception
            goto L_0x01e3
        L_0x01e1:
            r15 = move-exception
            r0 = r1
        L_0x01e3:
            if (r0 == 0) goto L_0x01e8
            r0.close()     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
        L_0x01e8:
            throw r15     // Catch:{ IOException -> 0x01eb, JSONException -> 0x01e9 }
        L_0x01e9:
            r15 = move-exception
            goto L_0x01f1
        L_0x01eb:
            r15 = move-exception
            goto L_0x01f1
        L_0x01ed:
            r15 = move-exception
            goto L_0x01f0
        L_0x01ef:
            r15 = move-exception
        L_0x01f0:
            r7 = r1
        L_0x01f1:
            defpackage.ank.a(r7)
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            java.lang.String r1 = "could not construct request body"
            r0.<init>(r1, r15)
            throw r0
        L_0x01fc:
            r15 = move-exception
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            java.lang.String r1 = "could not construct URL for request"
            r0.<init>(r1, r15)
            goto L_0x0206
        L_0x0205:
            throw r0
        L_0x0206:
            goto L_0x0205
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akr.c(akt):java.net.HttpURLConnection");
    }

    private void c() {
        String str = "access_token";
        if (this.b != null) {
            if (!this.d.containsKey(str)) {
                String str2 = this.b.e;
                and.a(str2);
                this.d.putString(str, str2);
            }
        } else if (!this.h && !this.d.containsKey(str)) {
            String k2 = akq.k();
            String m2 = akq.m();
            if (ank.a(k2) || ank.a(m2)) {
                ank.b(a, "Warning: Request without access token missing application ID or client token.");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(k2);
                sb.append("|");
                sb.append(m2);
                this.d.putString(str, sb.toString());
            }
        }
        this.d.putString("sdk", "android");
        this.d.putString("format", "json");
        String str3 = "debug";
        if (akq.a(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            this.d.putString(str3, LogMessage.SEVERITY_INFO);
            return;
        }
        if (akq.a(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.d.putString(str3, LogMessage.SEVERITY_WARNING);
        }
    }

    private static boolean c(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof e);
    }

    private String d() {
        String format = String.format("%s/%s", new Object[]{ani.b(), e()});
        c();
        Uri parse = Uri.parse(a(format, Boolean.TRUE));
        return String.format("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
    }

    private static boolean d(akt akt) {
        for (defpackage.akt.a aVar : akt.d) {
            if (aVar instanceof defpackage.akt.b) {
                return true;
            }
        }
        Iterator it = akt.iterator();
        while (it.hasNext()) {
            if (((akr) it.next()).e instanceof d) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean d(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    private String e() {
        if (j.matcher(this.l).matches()) {
            return this.l;
        }
        return String.format("%s/%s", new Object[]{this.g, this.l});
    }

    /* access modifiers changed from: private */
    public static String e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    private static boolean e(akt akt) {
        Iterator it = akt.iterator();
        while (it.hasNext()) {
            akr akr = (akr) it.next();
            Iterator it2 = akr.d.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (c(akr.d.get((String) it2.next()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static String f(akt akt) {
        if (!ank.a((String) null)) {
            return null;
        }
        Iterator it = akt.iterator();
        while (it.hasNext()) {
            aki aki = ((akr) it.next()).b;
            if (aki != null) {
                String str = aki.h;
                if (str != null) {
                    return str;
                }
            }
        }
        if (!ank.a((String) null)) {
            return null;
        }
        return akq.k();
    }

    public final aks a() {
        akr[] akrArr = {this};
        anl.a((Object) akrArr, "requests");
        return b(new akt((Collection<akr>) Arrays.asList(akrArr)));
    }

    public final void a(final b bVar) {
        if (akq.a(LoggingBehavior.GRAPH_API_DEBUG_INFO) || akq.a(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.e = new b() {
                public final void a(aku aku) {
                    JSONObject jSONObject = aku.a;
                    JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("__debug__") : null;
                    JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("messages") : null;
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                            String optString = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                            String optString2 = optJSONObject2 != null ? optJSONObject2.optString(MoatAdEvent.EVENT_TYPE) : null;
                            String optString3 = optJSONObject2 != null ? optJSONObject2.optString("link") : null;
                            if (!(optString == null || optString2 == null)) {
                                LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                                if (optString2.equals(LogMessage.SEVERITY_WARNING)) {
                                    loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                                }
                                if (!ank.a(optString3)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(optString);
                                    sb.append(" Link: ");
                                    sb.append(optString3);
                                    optString = sb.toString();
                                }
                                and.a(loggingBehavior, akr.a, optString);
                            }
                        }
                    }
                    b bVar = bVar;
                    if (bVar != null) {
                        bVar.a(aku);
                    }
                }
            };
        } else {
            this.e = bVar;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.b;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.l);
        sb.append(", graphObject: ");
        sb.append(this.c);
        sb.append(", httpMethod: ");
        sb.append(this.k);
        sb.append(", parameters: ");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
