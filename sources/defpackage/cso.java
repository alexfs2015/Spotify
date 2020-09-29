package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@cfp
/* renamed from: cso reason: default package */
public final class cso implements bhc<csh> {
    private boolean a;

    private static int a(Context context, Map<String, String> map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            dqe.a();
            return cpc.a(context, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
            sb.append("Could not parse ");
            sb.append(str);
            sb.append(" in a video GMSG: ");
            sb.append(str2);
            sb.toString();
            cpn.a(5);
            return i;
        }
    }

    private static void a(Map<String, String> map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        if (str != null) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2});
                cpn.a(5);
                return;
            }
        }
        if (str2 != null) {
            Integer.parseInt(str2);
        }
        if (str3 != null) {
            Integer.parseInt(str3);
        }
        if (str4 != null) {
            Integer.parseInt(str4);
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        int i;
        String[] split;
        Map map2 = map;
        csh csh = (csh) obj;
        String str = (String) map2.get("action");
        if (str == null) {
            cpn.a(5);
            return;
        }
        if (cml.a(3)) {
            JSONObject jSONObject = new JSONObject(map2);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            sb.toString();
            cpn.a(3);
        }
        if ("background".equals(str)) {
            String str2 = (String) map2.get("color");
            if (TextUtils.isEmpty(str2)) {
                cpn.a(5);
                return;
            }
            try {
                csh.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                cpn.a(5);
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str3 = (String) map2.get("mimeTypes");
                if (str3 == null) {
                    cpn.a(5);
                    crt.a(csh, "missingMimeTypes");
                } else if (VERSION.SDK_INT < 16) {
                    cpn.a(5);
                    crt.a(csh, "deficientApiVersion");
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str4 : str3.split(",")) {
                        hashMap.put(str4, cpa.a(str4.trim()));
                    }
                    crt.a(csh, (Map<String, List<Map<String, Object>>>) hashMap);
                }
            } else {
                cry a2 = csh.a();
                if (a2 == null) {
                    cpn.a(5);
                    return;
                }
                boolean equals = "new".equals(str);
                boolean equals2 = "position".equals(str);
                String str5 = "y";
                String str6 = "x";
                if (equals || equals2) {
                    Context context = csh.getContext();
                    int a3 = a(context, map2, str6, 0);
                    int a4 = a(context, map2, str5, 0);
                    int a5 = a(context, map2, "w", -1);
                    int a6 = a(context, map2, "h", -1);
                    if (((Boolean) dqe.f().a(dtg.cd)).booleanValue()) {
                        a5 = Math.min(a5, csh.m() - a3);
                        a6 = Math.min(a6, csh.l() - a4);
                    }
                    try {
                        i = Integer.parseInt((String) map2.get("player"));
                    } catch (NumberFormatException unused2) {
                        i = 0;
                    }
                    boolean parseBoolean = Boolean.parseBoolean((String) map2.get("spherical"));
                    if (!equals || a2.a() != null) {
                        bxo.b("The underlay may only be modified from the UI thread.");
                        if (a2.d != null) {
                            a2.d.a(a3, a4, a5, a6);
                        }
                        return;
                    }
                    csg csg = new csg((String) map2.get("flags"));
                    if (a2.d == null) {
                        dtm.a(a2.b.j().b, a2.b.c(), "vpr2");
                        crt crt = new crt(a2.a, a2.b, i, parseBoolean, a2.b.j().b, csg);
                        a2.d = crt;
                        a2.c.addView(a2.d, 0, new LayoutParams(-1, -1));
                        a2.d.a(a3, a4, a5, a6);
                        a2.b.a(false);
                    }
                    if (a2.a() != null) {
                        a(map);
                    }
                    return;
                }
                crt a7 = a2.a();
                if (a7 == null) {
                    crt.a(csh);
                } else if ("click".equals(str)) {
                    Context context2 = csh.getContext();
                    int a8 = a(context2, map2, str6, 0);
                    int a9 = a(context2, map2, str5, 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a8, (float) a9, 0);
                    if (a7.b != null) {
                        a7.b.dispatchTouchEvent(obtain);
                    }
                    obtain.recycle();
                } else if ("currentTime".equals(str)) {
                    String str7 = (String) map2.get("time");
                    if (str7 == null) {
                        cpn.a(5);
                        return;
                    }
                    try {
                        int parseFloat = (int) (Float.parseFloat(str7) * 1000.0f);
                        if (a7.b != null) {
                            a7.b.a(parseFloat);
                        }
                    } catch (NumberFormatException unused3) {
                        String str8 = "Could not parse time parameter from currentTime video GMSG: ";
                        String valueOf = String.valueOf(str7);
                        if (valueOf.length() != 0) {
                            str8.concat(valueOf);
                        } else {
                            new String(str8);
                        }
                        cpn.a(5);
                    }
                } else if ("hide".equals(str)) {
                    a7.setVisibility(4);
                } else if ("load".equals(str)) {
                    a7.h();
                } else if ("loadControl".equals(str)) {
                    a(map);
                } else {
                    String str9 = "muted";
                    if (str9.equals(str)) {
                        if (Boolean.parseBoolean((String) map2.get(str9))) {
                            a7.j();
                        } else {
                            a7.k();
                        }
                    } else if ("pause".equals(str)) {
                        a7.i();
                    } else if ("play".equals(str)) {
                        if (a7.b != null) {
                            a7.b.c();
                        }
                    } else if ("show".equals(str)) {
                        a7.setVisibility(0);
                    } else {
                        String str10 = "src";
                        if (str10.equals(str)) {
                            a7.d = (String) map2.get(str10);
                        } else if ("touchMove".equals(str)) {
                            Context context3 = csh.getContext();
                            int a10 = a(context3, map2, "dx", 0);
                            int a11 = a(context3, map2, "dy", 0);
                            float f = (float) a10;
                            float f2 = (float) a11;
                            if (a7.b != null) {
                                a7.b.a(f, f2);
                            }
                            if (!this.a) {
                                csh.f();
                                this.a = true;
                            }
                        } else {
                            String str11 = "volume";
                            if (str11.equals(str)) {
                                String str12 = (String) map2.get(str11);
                                if (str12 == null) {
                                    cpn.a(5);
                                    return;
                                }
                                try {
                                    a7.a(Float.parseFloat(str12));
                                } catch (NumberFormatException unused4) {
                                    String str13 = "Could not parse volume parameter from volume video GMSG: ";
                                    String valueOf2 = String.valueOf(str12);
                                    if (valueOf2.length() != 0) {
                                        str13.concat(valueOf2);
                                    } else {
                                        new String(str13);
                                    }
                                    cpn.a(5);
                                }
                            } else if ("watermark".equals(str)) {
                                a7.l();
                            } else {
                                String str14 = "Unknown video action: ";
                                String valueOf3 = String.valueOf(str);
                                if (valueOf3.length() != 0) {
                                    str14.concat(valueOf3);
                                } else {
                                    new String(str14);
                                }
                                cpn.a(5);
                            }
                        }
                    }
                }
            }
        }
    }
}
