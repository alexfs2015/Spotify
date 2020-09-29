package androidx.media;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(rx rxVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.b = (md) rxVar.b(audioAttributesCompat.b, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, rx rxVar) {
        rxVar.a((rz) audioAttributesCompat.b, 1);
    }
}
