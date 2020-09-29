package defpackage;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: mx reason: default package */
public final class mx {
    final Bundle a;
    List<IntentFilter> b;
    private List<String> c;

    /* renamed from: mx$a */
    public static final class a {
        final Bundle a;
        private ArrayList<String> b;
        private ArrayList<IntentFilter> c;

        public a(String str, String str2) {
            this.a = new Bundle();
            this.a.putString("id", str);
            this.a.putString("name", str2);
        }

        public a(mx mxVar) {
            if (mxVar != null) {
                this.a = new Bundle(mxVar.a);
                if (!mxVar.b().isEmpty()) {
                    this.b = new ArrayList<>(mxVar.b());
                }
                if (!mxVar.j().isEmpty()) {
                    this.c = new ArrayList<>(mxVar.b);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }

        public final a a(Collection<IntentFilter> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (IntentFilter intentFilter : collection) {
                        if (intentFilter != null) {
                            if (this.c == null) {
                                this.c = new ArrayList<>();
                            }
                            if (!this.c.contains(intentFilter)) {
                                this.c.add(intentFilter);
                            }
                        } else {
                            throw new IllegalArgumentException("filter must not be null");
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("filters must not be null");
        }

        public final a a(int i) {
            this.a.putInt("playbackType", i);
            return this;
        }

        public final a b(int i) {
            this.a.putInt("playbackStream", i);
            return this;
        }

        public final a c(int i) {
            this.a.putInt("volume", i);
            return this;
        }

        public final a d(int i) {
            this.a.putInt("volumeMax", i);
            return this;
        }

        public final a e(int i) {
            this.a.putInt("volumeHandling", i);
            return this;
        }

        public final a f(int i) {
            this.a.putInt("presentationDisplayId", i);
            return this;
        }

        public final mx a() {
            ArrayList<IntentFilter> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayList("controlFilters", arrayList);
            }
            ArrayList<String> arrayList2 = this.b;
            if (arrayList2 != null) {
                this.a.putStringArrayList("groupMemberIds", arrayList2);
            }
            return new mx(this.a);
        }
    }

    mx(Bundle bundle) {
        this.a = bundle;
    }

    public final String a() {
        return this.a.getString("id");
    }

    public final String c() {
        return this.a.getString("name");
    }

    public final String d() {
        return this.a.getString("status");
    }

    public final Uri e() {
        String string = this.a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final boolean f() {
        return this.a.getBoolean("enabled", true);
    }

    public final int g() {
        return this.a.getInt("connectionState", 0);
    }

    public final boolean h() {
        return this.a.getBoolean("canDisconnect", false);
    }

    public final IntentSender i() {
        return (IntentSender) this.a.getParcelable("settingsIntent");
    }

    public final List<IntentFilter> j() {
        t();
        return this.b;
    }

    private void t() {
        if (this.b == null) {
            this.b = this.a.getParcelableArrayList("controlFilters");
            if (this.b == null) {
                this.b = Collections.emptyList();
            }
        }
    }

    public final int k() {
        return this.a.getInt("playbackType", 1);
    }

    public final int l() {
        return this.a.getInt("playbackStream", -1);
    }

    public final int m() {
        return this.a.getInt("deviceType");
    }

    public final int n() {
        return this.a.getInt("volume");
    }

    public final int o() {
        return this.a.getInt("volumeMax");
    }

    public final int p() {
        return this.a.getInt("volumeHandling", 0);
    }

    public final int q() {
        return this.a.getInt("presentationDisplayId", -1);
    }

    public final Bundle r() {
        return this.a.getBundle("extras");
    }

    public final boolean s() {
        t();
        return !TextUtils.isEmpty(a()) && !TextUtils.isEmpty(c()) && !this.b.contains(null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouteDescriptor{ ");
        sb.append("id=");
        sb.append(a());
        sb.append(", groupMemberIds=");
        sb.append(b());
        sb.append(", name=");
        sb.append(c());
        sb.append(", description=");
        sb.append(d());
        sb.append(", iconUri=");
        sb.append(e());
        sb.append(", isEnabled=");
        sb.append(f());
        sb.append(", isConnecting=");
        sb.append(this.a.getBoolean("connecting", false));
        sb.append(", connectionState=");
        sb.append(g());
        sb.append(", controlFilters=");
        sb.append(Arrays.toString(j().toArray()));
        sb.append(", playbackType=");
        sb.append(k());
        sb.append(", playbackStream=");
        sb.append(l());
        sb.append(", deviceType=");
        sb.append(m());
        sb.append(", volume=");
        sb.append(n());
        sb.append(", volumeMax=");
        sb.append(o());
        sb.append(", volumeHandling=");
        sb.append(p());
        sb.append(", presentationDisplayId=");
        sb.append(q());
        sb.append(", extras=");
        sb.append(r());
        sb.append(", isValid=");
        sb.append(s());
        sb.append(", minClientVersion=");
        sb.append(this.a.getInt("minClientVersion", 1));
        sb.append(", maxClientVersion=");
        sb.append(this.a.getInt("maxClientVersion", Integer.MAX_VALUE));
        sb.append(" }");
        return sb.toString();
    }

    public static mx a(Bundle bundle) {
        if (bundle != null) {
            return new mx(bundle);
        }
        return null;
    }

    public final List<String> b() {
        if (this.c == null) {
            this.c = this.a.getStringArrayList("groupMemberIds");
            if (this.c == null) {
                this.c = Collections.emptyList();
            }
        }
        return this.c;
    }
}
