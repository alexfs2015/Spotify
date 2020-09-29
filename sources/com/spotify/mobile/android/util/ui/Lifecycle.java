package com.spotify.mobile.android.util.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import java.util.ArrayList;
import java.util.List;

public interface Lifecycle {

    public static final class Listeners implements a {
        private final List<b> a = new ArrayList();
        private b b;
        private Object c;

        public enum Event implements gcp<b> {
            ON_START {
                public final /* synthetic */ void accept(Object obj) {
                    ((b) obj).c();
                }
            },
            ON_STOP {
                public final /* synthetic */ void accept(Object obj) {
                    ((b) obj).a();
                }
            },
            ON_RESUME {
                public final /* synthetic */ void accept(Object obj) {
                    ((b) obj).e();
                }
            },
            ON_PAUSE {
                public final /* synthetic */ void accept(Object obj) {
                    ((b) obj).f();
                }
            },
            ON_DESTROY {
                public final /* synthetic */ void accept(Object obj) {
                    ((b) obj).aN_();
                }
            },
            ON_LOW_MEMORY {
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            };

            static gcp<b> a(final int i, final int i2, final Intent intent) {
                return new gcp<b>() {
                    public final /* synthetic */ void accept(Object obj) {
                        ((b) obj).a(i, i2, intent);
                    }

                    public final String toString() {
                        String str = "tVs.LEYIEU_Te_CATnOTIRSN";
                        return "Event.ON_ACTIVITY_RESULT";
                    }
                };
            }

            static gcp<b> a(final Bundle bundle) {
                return new gcp<b>() {
                    public final /* synthetic */ void accept(Object obj) {
                        ((b) obj).a(bundle);
                    }

                    public final String toString() {
                        String str = "ANse.OvATSAENNVIE_nE_S_CtEST";
                        return "Event.ON_SAVE_INSTANCE_STATE";
                    }
                };
            }

            static gcp<b> a(final Menu menu) {
                return new gcp<b>() {
                    public final /* synthetic */ void accept(Object obj) {
                        ((b) obj).a(menu);
                    }

                    public final String toString() {
                        return "Event.ON_CREATE_OPTIONS_MENU";
                    }
                };
            }

            static gcp<b> b(final Bundle bundle) {
                return new gcp<b>() {
                    public final /* synthetic */ void accept(Object obj) {
                        ((b) obj).b(bundle);
                    }

                    public final String toString() {
                        String str = "ENse_OOSAvnESATECtSERI__R.ETTTN";
                        return "Event.ON_RESTORE_INSTANCE_STATE";
                    }
                };
            }

            static gcp<b> c(final Bundle bundle) {
                return new gcp<b>() {
                    public final /* synthetic */ void accept(Object obj) {
                        ((b) obj).c(bundle);
                    }

                    public final String toString() {
                        return "Event.ON_CREATE";
                    }
                };
            }

            public String toString() {
                String str = "Eesnv.";
                StringBuilder sb = new StringBuilder("Event.");
                sb.append(name());
                return sb.toString();
            }
        }

        public final void a(int i, int i2, Intent intent) {
            a(Event.a(i, i2, intent));
        }

        public final void a(Bundle bundle) {
            a(Event.c(bundle));
        }

        public final void a(Menu menu) {
            a(Event.a(menu));
        }

        public void a(gcp<b> gcp) {
            this.c = gcp;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                this.b = (b) this.a.get(size);
                gcp.accept(this.b);
            }
            this.b = null;
            this.c = null;
        }

        public final boolean a(b bVar) {
            fbp.a(bVar);
            return !this.a.contains(bVar) && this.a.add(bVar);
        }

        public final void b(Bundle bundle) {
            a(Event.a(bundle));
        }

        public final boolean b(b bVar) {
            b bVar2 = this.b;
            if (bVar2 != null) {
                if (bVar != bVar2) {
                    String str = "g stifnnh hnientbiieee nog) additehs vnineo tR o(roueetrr lm ag";
                    StringBuilder sb = new StringBuilder("Removing a listener (other than the one being notified) during ");
                    sb.append(this.c);
                    String str2 = "tesmodop iup.r  ns";
                    sb.append(" is not supported.");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            return this.a.remove(fbp.a(bVar));
        }

        public final void c(Bundle bundle) {
            a(Event.b(bundle));
        }
    }

    public interface a {
        boolean a(b bVar);

        boolean b(b bVar);
    }

    public interface b {
        void a();

        void a(int i, int i2, Intent intent);

        void a(Bundle bundle);

        void a(Menu menu);

        void aN_();

        void b(Bundle bundle);

        void c();

        void c(Bundle bundle);

        void e();

        void f();
    }

    public static abstract class c implements b {
        public void a() {
        }

        public void a(int i, int i2, Intent intent) {
        }

        public void a(Bundle bundle) {
        }

        public void a(Menu menu) {
        }

        public void aN_() {
        }

        public void b(Bundle bundle) {
        }

        public void c() {
        }

        public void c(Bundle bundle) {
        }

        public void e() {
        }

        public void f() {
        }
    }

    public interface d {
        void b();
    }
}
