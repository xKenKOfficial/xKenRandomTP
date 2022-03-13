package x.KenKOfficial.RandomTP.Utils;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ChatUtil
{
    private static final /* synthetic */ int[] ll;
    private static final /* synthetic */ String[] I;
    
    private static String I(final String llIIIlIllllllll, final String IlIIIlIllllllll) {
        try {
            final SecretKeySpec IllIIlIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIIIlIllllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.ll[8]), "DES");
            final Cipher lIlIIlIllllllll = Cipher.getInstance("DES");
            lIlIIlIllllllll.init(ChatUtil.ll[2], IllIIlIllllllll);
            return new String(lIlIIlIllllllll.doFinal(Base64.getDecoder().decode(llIIIlIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIIlIllllllll) {
            IIlIIlIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIl(String IlllIIIllllllll, final String lIllIIIllllllll) {
        IlllIIIllllllll = new String(Base64.getDecoder().decode(IlllIIIllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIIIlIIllllllll = new StringBuilder();
        final char[] IIIIlIIllllllll = lIllIIIllllllll.toCharArray();
        int llllIIIllllllll = ChatUtil.ll[0];
        final String lIIlIIIllllllll = (Object)IlllIIIllllllll.toCharArray();
        final long IIIlIIIllllllll = lIIlIIIllllllll.length;
        double lllIIIIllllllll = ChatUtil.ll[0];
        while (llIl((int)lllIIIIllllllll, (int)IIIlIIIllllllll)) {
            final char IIlIlIIllllllll = lIIlIIIllllllll[lllIIIIllllllll];
            lIIIlIIllllllll.append((char)(IIlIlIIllllllll ^ IIIIlIIllllllll[llllIIIllllllll % IIIIlIIllllllll.length]));
            "".length();
            ++llllIIIllllllll;
            ++lllIIIIllllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lIIIlIIllllllll);
    }
    
    public static String fixColor(final String IIIlllIllllllll) {
        return IIIlllIllllllll.replaceAll(ChatUtil.I[ChatUtil.ll[0]], ChatUtil.I[ChatUtil.ll[1]]).replace(ChatUtil.I[ChatUtil.ll[2]], ChatUtil.I[ChatUtil.ll[3]]).replace(ChatUtil.I[ChatUtil.ll[4]], ChatUtil.I[ChatUtil.ll[5]]).replace(ChatUtil.I[ChatUtil.ll[6]], ChatUtil.I[ChatUtil.ll[7]]);
    }
    
    private static void lll() {
        (I = new String[ChatUtil.ll[8]])[ChatUtil.ll[0]] = I("rcX+FTSi0EY=", "IxJMr");
        ChatUtil.I[ChatUtil.ll[1]] = I("/eh1YxiipH8=", "aqrUJ");
        ChatUtil.I[ChatUtil.ll[2]] = Il("i0n6RVB9GlY=", "ZLkcd");
        ChatUtil.I[ChatUtil.ll[3]] = Il("cuy0J37ANiQ=", "cCgGq");
        ChatUtil.I[ChatUtil.ll[4]] = Il("vYzkI/hKEvo=", "Fvdsb");
        ChatUtil.I[ChatUtil.ll[5]] = Il("rdqu3/3JbZg=", "RWtIC");
        ChatUtil.I[ChatUtil.ll[6]] = lIl("Chsk", "qUYta");
        ChatUtil.I[ChatUtil.ll[7]] = Il("CVHTe7doAXk=", "WPIzy");
    }
    
    private static void IlIl() {
        (ll = new int[9])[0] = ((0x74 ^ 0x24) & ~(0xE2 ^ 0xB2));
        ChatUtil.ll[1] = " ".length();
        ChatUtil.ll[2] = "  ".length();
        ChatUtil.ll[3] = "   ".length();
        ChatUtil.ll[4] = (0x97 ^ 0x93);
        ChatUtil.ll[5] = (0xAC ^ 0xA9);
        ChatUtil.ll[6] = (69 + 44 - 65 + 110 ^ 143 + 68 - 158 + 99);
        ChatUtil.ll[7] = (49 + 70 - 106 + 181 ^ 101 + 56 - 23 + 63);
        ChatUtil.ll[8] = (0x94 ^ 0xBC ^ (0xBD ^ 0x9D));
    }
    
    static {
        IlIl();
        lll();
    }
    
    private static boolean llIl(final int llIIIIIllllllll, final int IlIIIIIllllllll) {
        return llIIIIIllllllll < IlIIIIIllllllll;
    }
    
    private static String Il(final String IIIIllIllllllll, final String lIllIlIllllllll) {
        try {
            final SecretKeySpec llIIllIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIIllIllllllll = Cipher.getInstance("Blowfish");
            IlIIllIllllllll.init(ChatUtil.ll[2], llIIllIllllllll);
            return new String(IlIIllIllllllll.doFinal(Base64.getDecoder().decode(IIIIllIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIllIllllllll) {
            lIIIllIllllllll.printStackTrace();
            return null;
        }
    }
}
