package defpackage;

import android.media.AudioDeviceInfo;
import android.os.Build.VERSION;
import com.google.common.collect.ImmutableMap;

/* renamed from: vqo reason: default package */
public final class vqo {
    public static final a a;
    public final vqp b;
    public final String c;
    public final String d;

    /* renamed from: vqo$a */
    public interface a {
        String a(AudioDeviceInfo audioDeviceInfo);
    }

    /* renamed from: vqo$b */
    static final class b implements a {
        public final String a(AudioDeviceInfo audioDeviceInfo) {
            return "unknown";
        }

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: vqo$c */
    static class c implements a {
        private static final ImmutableMap<Integer, String> a = new com.google.common.collect.ImmutableMap.a().b(Integer.valueOf(0), "unknown").b(Integer.valueOf(1), "builtin-earpiece").b(Integer.valueOf(2), "builtin-speaker").b(Integer.valueOf(3), "wired_headset").b(Integer.valueOf(4), "wired-headphones").b(Integer.valueOf(7), "bluetooth-sco").b(Integer.valueOf(8), "bluetooth-a2dp").b(Integer.valueOf(9), "hdmi").b(Integer.valueOf(13), "dock").b(Integer.valueOf(12), "usb-accessory").b(Integer.valueOf(11), "usb-device").b(Integer.valueOf(18), "telephony").b(Integer.valueOf(5), "line-analog").b(Integer.valueOf(10), "hdmi-arc").b(Integer.valueOf(6), "line-digital").b(Integer.valueOf(14), "fm").b(Integer.valueOf(19), "aux-line").b(Integer.valueOf(20), "ip").b(Integer.valueOf(15), "builtin-mic").b(Integer.valueOf(16), "fm-tuner").b(Integer.valueOf(17), "tv-tuner").b();

        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public String a(AudioDeviceInfo audioDeviceInfo) {
            int type = audioDeviceInfo.getType();
            return a.containsKey(Integer.valueOf(type)) ? (String) a.get(Integer.valueOf(type)) : "unknown";
        }
    }

    /* renamed from: vqo$d */
    static class d extends c {
        private static final ImmutableMap<Integer, String> a = new com.google.common.collect.ImmutableMap.a().b(Integer.valueOf(21), "bus").b();

        private d() {
            super(0);
        }

        /* synthetic */ d(byte b) {
            this();
        }

        public String a(AudioDeviceInfo audioDeviceInfo) {
            int type = audioDeviceInfo.getType();
            if (a.containsKey(Integer.valueOf(type))) {
                return (String) a.get(Integer.valueOf(type));
            }
            return super.a(audioDeviceInfo);
        }
    }

    /* renamed from: vqo$e */
    static final class e extends d {
        private static final ImmutableMap<Integer, String> a = new com.google.common.collect.ImmutableMap.a().b(Integer.valueOf(22), "usb-headset").b();

        private e() {
            super(0);
        }

        /* synthetic */ e(byte b) {
            this();
        }

        public final String a(AudioDeviceInfo audioDeviceInfo) {
            int type = audioDeviceInfo.getType();
            if (a.containsKey(Integer.valueOf(type))) {
                return (String) a.get(Integer.valueOf(type));
            }
            return super.a(audioDeviceInfo);
        }
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            a = new e(0);
        } else if (VERSION.SDK_INT >= 24) {
            a = new d(0);
        } else if (VERSION.SDK_INT >= 23) {
            a = new c(0);
        } else {
            a = new b(0);
        }
    }

    public vqo(String str, String str2, vqp vqp) {
        this.c = str;
        this.d = str2;
        this.b = vqp;
    }
}
