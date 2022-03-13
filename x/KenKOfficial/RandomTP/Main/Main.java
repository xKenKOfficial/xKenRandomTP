package x.KenKOfficial.RandomTP.Main;

import org.bukkit.plugin.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;
import x.KenKOfficial.RandomTP.Listeners.*;

public class Main extends JavaPlugin
{
    private static final /* synthetic */ int[] Il;
    private static final /* synthetic */ String[] l;
    private static /* synthetic */ Main plugin;
    
    private static String ll(final String IIllIllllllllll, final String llIlIllllllllll) {
        try {
            final SecretKeySpec llllIllllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIllllllllll.getBytes(StandardCharsets.UTF_8)), Main.Il[8]), "DES");
            final Cipher IlllIllllllllll = Cipher.getInstance("DES");
            IlllIllllllllll.init(Main.Il[2], llllIllllllllll);
            return new String(IlllIllllllllll.doFinal(Base64.getDecoder().decode(IIllIllllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIllllllllll) {
            lIllIllllllllll.printStackTrace();
            return null;
        }
    }
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerListeners();
        System.out.println(Main.l[Main.Il[0]]);
        System.out.println(Main.l[Main.Il[1]]);
        System.out.println(Main.l[Main.Il[2]]);
        System.out.println(Main.l[Main.Il[3]]);
        System.out.println(Main.l[Main.Il[4]]);
        System.out.println(Main.l[Main.Il[5]]);
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    private void registerListeners() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.l[Main.Il[12]]).append(this.getName())));
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerInteract(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
    
    private static boolean lIIl(final int llllllIllllllll, final int IlllllIllllllll) {
        return llllllIllllllll < IlllllIllllllll;
    }
    
    private static String l(final String lIlIIIlllllllll, final String IllIIIlllllllll) {
        try {
            final SecretKeySpec IlIlIIlllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllIIIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIIlIIlllllllll = Cipher.getInstance("Blowfish");
            lIIlIIlllllllll.init(Main.Il[2], IlIlIIlllllllll);
            return new String(lIIlIIlllllllll.doFinal(Base64.getDecoder().decode(lIlIIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIlIIlllllllll) {
            IIIlIIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void Ill() {
        (l = new String[Main.Il[13]])[Main.Il[0]] = l("cYl5mUZeMGdxiXmZRl4wZ3GJeZlGXjBncYl5mUZeMGdxiXmZRl4wZ3GJeZlGXjBncYl5mUZeMGdYZATiHel1Yg==", "gIXSh");
        Main.l[Main.Il[1]] = l("XeqfqRctzYho0tb3VJyUHA==", "QhnUK");
        Main.l[Main.Il[2]] = ll("w7BYed2d8G8LM+f6rISXi5pd2g9q5U4r", "sBfLS");
        Main.l[Main.Il[3]] = IIl("GSIcNyY3PgkgKHk=", "XIhNQ");
        Main.l[Main.Il[4]] = l("E3Y00WmeysRzXWHdcO4FpKyLzjh5orA+OIr8H98417mG9zYrJBrv8ng7nhgRJSMMrvjI+BQn9YYvxlz+L2gscQ==", "FVwxy");
        Main.l[Main.Il[5]] = ll("Te0wIZ2Jt3FN7TAhnYm3cU3tMCGdibdxTe0wIZ2Jt3FN7TAhnYm3cU3tMCGdibdxTe0wIZ2Jt3HvJx378QLfmg==", "DqRUD");
        Main.l[Main.Il[6]] = ll("Xj3S0YZy3OxePdLRhnLc7F490tGGctzsXj3S0YZy3OxePdLRhnLc7F490tGGctzsXj3S0YZy3OzpJt6Tnl3F/Q==", "BvdEs");
        Main.l[Main.Il[7]] = IIl("AB4XHTcZOxYcCCwF", "xUrse");
        Main.l[Main.Il[8]] = l("Y0AyH6eyUiQfSFmeJk0WnZzeFEvT6q3p", "hilAP");
        Main.l[Main.Il[9]] = l("Vq4WxDPhA4LrHqocIvnWYA==", "HMOEG");
        Main.l[Main.Il[10]] = IIl("KA4jKzMJACQ1PwcEaCcyGwwiJ3YLTyYjJBccMic4CwpoMiQDGGgjIxYAOjE9CwwgYntCNQkABC0hAQ0YJ04=", "boHBV");
        Main.l[Main.Il[11]] = l("uuauEKnfHsW65q4Qqd8exbrmrhCp3x7FuuauEKnfHsW65q4Qqd8exbrmrhCp3x7FuuauEKnfHsWoVI1oHX4sDw==", "vbTBo");
        Main.l[Main.Il[12]] = l("DgGw0q2GrtV/IMNb3leK4GvRfcmFovK2UDgowPvZp34=", "KasvN");
    }
    
    private static void IIIl() {
        (Il = new int[14])[0] = ((0x30 ^ 0x2D) & ~(0xF ^ 0x12));
        Main.Il[1] = " ".length();
        Main.Il[2] = "  ".length();
        Main.Il[3] = "   ".length();
        Main.Il[4] = (0x9 ^ 0xD);
        Main.Il[5] = (97 + 154 - 242 + 147 ^ 105 + 70 - 150 + 128);
        Main.Il[6] = (0x3D ^ 0x20 ^ (0x6C ^ 0x77));
        Main.Il[7] = (0x57 ^ 0x50);
        Main.Il[8] = (0x95 ^ 0x9D);
        Main.Il[9] = (0x95 ^ 0x9C);
        Main.Il[10] = (0x7F ^ 0x75);
        Main.Il[11] = (0x28 ^ 0x23);
        Main.Il[12] = (0xB2 ^ 0xB7 ^ (0x6C ^ 0x65));
        Main.Il[13] = (0xAB ^ 0xC2 ^ (0x6A ^ 0xE));
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        System.out.println(Main.l[Main.Il[6]]);
        System.out.println(Main.l[Main.Il[7]]);
        System.out.println(Main.l[Main.Il[8]]);
        System.out.println(Main.l[Main.Il[9]]);
        System.out.println(Main.l[Main.Il[10]]);
        System.out.println(Main.l[Main.Il[11]]);
    }
    
    static {
        IIIl();
        Ill();
    }
    
    private static String IIl(String lllIlIlllllllll, final String llIllIlllllllll) {
        lllIlIlllllllll = new String(Base64.getDecoder().decode(lllIlIlllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIllIlllllllll = new StringBuilder();
        final char[] lIIllIlllllllll = llIllIlllllllll.toCharArray();
        int IIIllIlllllllll = Main.Il[0];
        final Exception IlIIlIlllllllll = (Object)lllIlIlllllllll.toCharArray();
        final long lIIIlIlllllllll = IlIIlIlllllllll.length;
        long IIIIlIlllllllll = Main.Il[0];
        while (lIIl((int)IIIIlIlllllllll, (int)lIIIlIlllllllll)) {
            final char lIlllIlllllllll = IlIIlIlllllllll[IIIIlIlllllllll];
            IlIllIlllllllll.append((char)(lIlllIlllllllll ^ lIIllIlllllllll[IIIllIlllllllll % lIIllIlllllllll.length]));
            "".length();
            ++IIIllIlllllllll;
            ++IIIIlIlllllllll;
            "".length();
            if ("  ".length() == -" ".length()) {
                return null;
            }
        }
        return String.valueOf(IlIllIlllllllll);
    }
}
