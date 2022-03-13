package x.KenKOfficial.RandomTP.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.RandomTP.Main.*;
import x.KenKOfficial.RandomTP.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ String[] Ill;
    private static final /* synthetic */ int[] lll;
    
    private static String lllIl(final String IllIIlllIllllll, final String lllIIlllIllllll) {
        try {
            final SecretKeySpec llIlIlllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlllIllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.lll[8]), "DES");
            final Cipher IlIlIlllIllllll = Cipher.getInstance("DES");
            IlIlIlllIllllll.init(PlayerJoin.lll[2], llIlIlllIllllll);
            return new String(IlIlIlllIllllll.doFinal(Base64.getDecoder().decode(IllIIlllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIlllIllllll) {
            lIIlIlllIllllll.printStackTrace();
            return null;
        }
    }
    
    private static void IlIll() {
        (Ill = new String[PlayerJoin.lll[13]])[PlayerJoin.lll[0]] = lllIl("MxpXVBkBgkMmYLTIyALpdA==", "JfmKW");
        PlayerJoin.Ill[PlayerJoin.lll[1]] = lllIl("TQvEZr8ZV0pZSzIRa96nxI4RH4UOAjVZPXZWlvWFdx4=", "bdBEw");
        PlayerJoin.Ill[PlayerJoin.lll[2]] = IIIll("ZFVNFU9/UFZET39QVkQpZF5NFQoJCAUrEywJBBQmEktTXx4fUFZET39QVkRPfw==", "Bmkyr");
        PlayerJoin.Ill[PlayerJoin.lll[3]] = lllIl("Dy2FIRV4kTY=", "auQHk");
        PlayerJoin.Ill[PlayerJoin.lll[4]] = IIIll("T1ReJTIdAQMTcVdISVQ1XlxZXxUKBgg=", "orirW");
        PlayerJoin.Ill[PlayerJoin.lll[5]] = lIIll("9zLuZKK2F+g=", "HYVqy");
        PlayerJoin.Ill[PlayerJoin.lll[6]] = IIIll("aU1vLBY9AzcfRXFReEsBMSA9AygGDT4EACAKNA==", "IkXmc");
        PlayerJoin.Ill[PlayerJoin.lll[7]] = lllIl("B2ZJjG0qxEs=", "treQj");
        PlayerJoin.Ill[PlayerJoin.lll[8]] = lllIl("1ofmQKUGzLTAd4Yzxg7Qz1StI00o0ciX0VN/As+AsbWAw6tgc2J8EnAOEdGLWlJ6", "VVsqe");
        PlayerJoin.Ill[PlayerJoin.lll[9]] = lllIl("0YGq7y5EbwY=", "WiKbU");
        PlayerJoin.Ill[PlayerJoin.lll[10]] = lllIl("6D7mJYkXGa+YXkPCqVsdUwr1PH8weqh19yQpdFA43DvNDaC5Nz7d/Nn3Ijr2Fw8R", "XoVCm");
        PlayerJoin.Ill[PlayerJoin.lll[11]] = lIIll("k3M+RXwkyWs=", "DxoWH");
        PlayerJoin.Ill[PlayerJoin.lll[12]] = IIIll("fm9NIHBlalZxcGVqVnEWfmRNIDUTMgUeLDYzBCEZCHFTaiEFalZxcGVqVnFwZQ==", "XWkLM");
    }
    
    private static String IIIll(String IllIIIllIllllll, final String IlIlIIllIllllll) {
        IllIIIllIllllll = new String(Base64.getDecoder().decode(IllIIIllIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIIlIIllIllllll = new StringBuilder();
        final char[] IIIlIIllIllllll = IlIlIIllIllllll.toCharArray();
        int lllIIIllIllllll = PlayerJoin.lll[0];
        final long lIIIIIllIllllll = (Object)IllIIIllIllllll.toCharArray();
        final float IIIIIIllIllllll = lIIIIIllIllllll.length;
        float llllllIlIllllll = PlayerJoin.lll[0];
        while (lIlll((int)llllllIlIllllll, (int)IIIIIIllIllllll)) {
            final char IIllIIllIllllll = lIIIIIllIllllll[llllllIlIllllll];
            lIIlIIllIllllll.append((char)(IIllIIllIllllll ^ IIIlIIllIllllll[lllIIIllIllllll % IIIlIIllIllllll.length]));
            "".length();
            ++lllIIIllIllllll;
            ++llllllIlIllllll;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lIIlIIllIllllll);
    }
    
    private static void llIll() {
        (lll = new int[14])[0] = (("  ".length() ^ (0x94 ^ 0x9C)) & (0xF ^ 0x14 ^ (0x7A ^ 0x6B) ^ -" ".length()));
        PlayerJoin.lll[1] = " ".length();
        PlayerJoin.lll[2] = "  ".length();
        PlayerJoin.lll[3] = "   ".length();
        PlayerJoin.lll[4] = (0xA9 ^ 0xAD);
        PlayerJoin.lll[5] = (0x7E ^ 0x52 ^ (0x9A ^ 0xB3));
        PlayerJoin.lll[6] = (0x4 ^ 0x2);
        PlayerJoin.lll[7] = (0x50 ^ 0x6F ^ (0xAB ^ 0x93));
        PlayerJoin.lll[8] = (0x6E ^ 0xE ^ (0xF2 ^ 0x9A));
        PlayerJoin.lll[9] = (0x59 ^ 0x50);
        PlayerJoin.lll[10] = (0x58 ^ 0x52);
        PlayerJoin.lll[11] = (0x85 ^ 0x8E);
        PlayerJoin.lll[12] = (0x3A ^ 0x24 ^ (0x17 ^ 0x5));
        PlayerJoin.lll[13] = (0x5B ^ 0x56);
    }
    
    private static boolean IIlll(final int IIIlllIlIllllll) {
        return IIIlllIlIllllll != 0;
    }
    
    static {
        llIll();
        IlIll();
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent llIIllllIllllll) {
        final Player IlIIllllIllllll = llIIllllIllllll.getPlayer();
        if (IIlll(Main.getPlugin().getConfig().getBoolean(PlayerJoin.Ill[PlayerJoin.lll[0]]) ? 1 : 0) && IIlll(IlIIllllIllllll.hasPermission(PlayerJoin.Ill[PlayerJoin.lll[1]]) ? 1 : 0)) {
            IlIIllllIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[2]]));
            IlIIllllIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[3]]));
            IlIIllllIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[4]]));
            IlIIllllIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[5]]));
            IlIIllllIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[6]]));
            IlIIllllIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[7]]));
            IlIIllllIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[8]]));
            IlIIllllIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[9]]));
            IlIIllllIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[10]]));
            IlIIllllIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[11]]));
            IlIIllllIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[12]]));
        }
    }
    
    private static String lIIll(final String llIllIllIllllll, final String IIIllIllIllllll) {
        try {
            final SecretKeySpec IllllIllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIllIllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIlllIllIllllll = Cipher.getInstance("Blowfish");
            lIlllIllIllllll.init(PlayerJoin.lll[2], IllllIllIllllll);
            return new String(lIlllIllIllllll.doFinal(Base64.getDecoder().decode(llIllIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlllIllIllllll) {
            IIlllIllIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlll(final int llIlllIlIllllll, final int IlIlllIlIllllll) {
        return llIlllIlIllllll < IlIlllIlIllllll;
    }
}
