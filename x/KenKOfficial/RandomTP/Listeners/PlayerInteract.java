package x.KenKOfficial.RandomTP.Listeners;

import org.bukkit.event.player.*;
import org.bukkit.event.block.*;
import org.bukkit.material.*;
import x.KenKOfficial.RandomTP.Main.*;
import org.bukkit.entity.*;
import org.bukkit.block.*;
import org.bukkit.*;
import org.bukkit.event.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class PlayerInteract implements Listener
{
    private static final /* synthetic */ int[] lIl;
    private static final /* synthetic */ String[] IIl;
    
    private static boolean llIIl(final int IIllllllIllllll) {
        return IIllllllIllllll != 0;
    }
    
    private static boolean IlIIl(final Object llllllllIllllll, final Object IlllllllIllllll) {
        return llllllllIllllll == IlllllllIllllll;
    }
    
    @EventHandler
    public void onInteract(final PlayerInteractEvent lIlllIlIlllllll) {
        if (lIIIl(lIlllIlIlllllll.getAction(), Action.RIGHT_CLICK_BLOCK)) {
            return;
        }
        if (lIIIl(lIlllIlIlllllll.getClickedBlock().getType(), Material.STONE_BUTTON) && lIIIl(lIlllIlIlllllll.getClickedBlock().getType(), Material.WOOD_BUTTON) && lIIIl(lIlllIlIlllllll.getClickedBlock().getType(), Material.LEVER)) {
            return;
        }
        final Player IIlllIlIlllllll = lIlllIlIlllllll.getPlayer();
        final Block llIllIlIlllllll = lIlllIlIlllllll.getClickedBlock();
        final Block IlIllIlIlllllll = llIllIlIlllllll.getRelative(((Button)llIllIlIlllllll.getState().getData()).getAttachedFace());
        if (IlIIl(IlIllIlIlllllll.getType(), Material.valueOf(Main.getPlugin().getConfig().getString(PlayerInteract.IIl[PlayerInteract.lIl[0]])))) {
            final World llllIllIlllllll = IIlllIlIlllllll.getWorld();
            final int IlllIllIlllllll = Main.getPlugin().getConfig().getInt(PlayerInteract.IIl[PlayerInteract.lIl[1]]);
            final int lIllIllIlllllll = Main.getPlugin().getConfig().getInt(PlayerInteract.IIl[PlayerInteract.lIl[2]]);
            final Random IIllIllIlllllll = new Random();
            final double llIlIllIlllllll = PlayerInteract.lIl[3] ^ IIllIllIlllllll.nextInt(Main.getPlugin().getConfig().getInt(PlayerInteract.IIl[PlayerInteract.lIl[4]]));
            final double IlIlIllIlllllll = Main.getPlugin().getConfig().getDouble(PlayerInteract.IIl[PlayerInteract.lIl[5]]);
            final double lIIlIllIlllllll = IIllIllIlllllll.nextInt(Main.getPlugin().getConfig().getInt(PlayerInteract.IIl[PlayerInteract.lIl[6]]));
            final Location IIIlIllIlllllll = new Location(llllIllIlllllll, llIlIllIlllllll, Main.getPlugin().getConfig().getDouble(PlayerInteract.IIl[PlayerInteract.lIl[7]]), lIIlIllIlllllll);
            IIIlIllIlllllll.setY((double)(IIIlIllIlllllll.getWorld().getHighestBlockYAt(IIIlIllIlllllll) + PlayerInteract.lIl[6]));
            IIlllIlIlllllll.teleport(IIIlIllIlllllll);
            "".length();
        }
        if (IlIIl(IlIllIlIlllllll.getType(), Material.valueOf(Main.getPlugin().getConfig().getString(PlayerInteract.IIl[PlayerInteract.lIl[8]])))) {
            final World IllIIllIlllllll = IIlllIlIlllllll.getWorld();
            final int lIlIIllIlllllll = Main.getPlugin().getConfig().getInt(PlayerInteract.IIl[PlayerInteract.lIl[9]]);
            final int IIlIIllIlllllll = Main.getPlugin().getConfig().getInt(PlayerInteract.IIl[PlayerInteract.lIl[10]]);
            final Random llIIIllIlllllll = new Random();
            final double IlIIIllIlllllll = PlayerInteract.lIl[3] ^ llIIIllIlllllll.nextInt(Main.getPlugin().getConfig().getInt(PlayerInteract.IIl[PlayerInteract.lIl[11]]));
            final double lIIIIllIlllllll = Main.getPlugin().getConfig().getDouble(PlayerInteract.IIl[PlayerInteract.lIl[12]]);
            final double IIIIIllIlllllll = llIIIllIlllllll.nextInt(Main.getPlugin().getConfig().getInt(PlayerInteract.IIl[PlayerInteract.lIl[13]]));
            final Location lllllIlIlllllll = new Location(IllIIllIlllllll, IlIIIllIlllllll, Main.getPlugin().getConfig().getDouble(PlayerInteract.IIl[PlayerInteract.lIl[14]]), IIIIIllIlllllll);
            lllllIlIlllllll.setY((double)(lllllIlIlllllll.getWorld().getHighestBlockYAt(lllllIlIlllllll) + PlayerInteract.lIl[6]));
            final byte IIllIIlIlllllll = (byte)this.getPlayersInRadius(lIlllIlIlllllll.getClickedBlock().getLocation(), Main.getPlugin().getConfig().getInt(PlayerInteract.IIl[PlayerInteract.lIl[15]])).iterator();
            while (llIIl(((Iterator)IIllIIlIlllllll).hasNext() ? 1 : 0)) {
                final Player lllIIllIlllllll = ((Iterator<Player>)IIllIIlIlllllll).next();
                lllIIllIlllllll.teleport(lllllIlIlllllll);
                "".length();
                "".length();
                if (-(57 + 87 - 8 + 0 ^ 139 + 36 - 159 + 125) >= 0) {
                    return;
                }
            }
        }
    }
    
    private static boolean IllIl(final int lllIIIIIlllllll, final int IllIIIIIlllllll) {
        return lllIIIIIlllllll < IllIIIIIlllllll;
    }
    
    private static void IIIIl() {
        (lIl = new int[17])[0] = ((0x24 ^ 0x66) & ~(0xE0 ^ 0xA2));
        PlayerInteract.lIl[1] = " ".length();
        PlayerInteract.lIl[2] = "  ".length();
        PlayerInteract.lIl[3] = -" ".length();
        PlayerInteract.lIl[4] = "   ".length();
        PlayerInteract.lIl[5] = (0xAA ^ 0xAE);
        PlayerInteract.lIl[6] = (0x7C ^ 0xF ^ (0x54 ^ 0x22));
        PlayerInteract.lIl[7] = (0x38 ^ 0x3E);
        PlayerInteract.lIl[8] = (53 + 23 - 60 + 115 ^ 81 + 70 - 43 + 24);
        PlayerInteract.lIl[9] = (0xAB ^ 0xA3);
        PlayerInteract.lIl[10] = (0x66 ^ 0x6F);
        PlayerInteract.lIl[11] = (0x84 ^ 0x8E);
        PlayerInteract.lIl[12] = (0x8C ^ 0x87);
        PlayerInteract.lIl[13] = (0x1C ^ 0x10);
        PlayerInteract.lIl[14] = (0x7B ^ 0x76);
        PlayerInteract.lIl[15] = (124 + 18 - 123 + 172 ^ 159 + 3 - 62 + 77);
        PlayerInteract.lIl[16] = (0x42 ^ 0x77 ^ (0x1E ^ 0x24));
    }
    
    private static String IIll(String lllllIIIlllllll, final String IllllIIIlllllll) {
        lllllIIIlllllll = new String(Base64.getDecoder().decode(lllllIIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIIIlIIlllllll = new StringBuilder();
        final char[] lIIIIlIIlllllll = IllllIIIlllllll.toCharArray();
        int IIIIIlIIlllllll = PlayerInteract.lIl[0];
        final boolean IlIllIIIlllllll = (Object)lllllIIIlllllll.toCharArray();
        final char lIIllIIIlllllll = (char)IlIllIIIlllllll.length;
        boolean IIIllIIIlllllll = PlayerInteract.lIl[0] != 0;
        while (IllIl(IIIllIIIlllllll ? 1 : 0, lIIllIIIlllllll)) {
            final char lIlIIlIIlllllll = IlIllIIIlllllll[IIIllIIIlllllll];
            IlIIIlIIlllllll.append((char)(lIlIIlIIlllllll ^ lIIIIlIIlllllll[IIIIIlIIlllllll % lIIIIlIIlllllll.length]));
            "".length();
            ++IIIIIlIIlllllll;
            ++IIIllIIIlllllll;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(IlIIIlIIlllllll);
    }
    
    private static boolean lIlIl(final int IlIlllllIllllll) {
        return IlIlllllIllllll <= 0;
    }
    
    private static void llll() {
        (IIl = new String[PlayerInteract.lIl[16]])[PlayerInteract.lIl[0]] = IIll("BiMYIisQFQYpJgwvBBo1FCQCKioBOg==", "uJvEG");
        PlayerInteract.IIl[PlayerInteract.lIl[1]] = lIll("syqHYCL3szstfTtx0OiZ0cGjVmRE1WJl", "vMDPq");
        PlayerInteract.IIl[PlayerInteract.lIl[2]] = IIll("BDgVCjgMNQglIxstMiYlEzw=", "iYmUL");
        PlayerInteract.IIl[PlayerInteract.lIl[4]] = Illl("4FACKn7eGMV+03gNFHWWHOQl6M3Cc2Ra", "JEuCm");
        PlayerInteract.IIl[PlayerInteract.lIl[5]] = Illl("XyYPqxC9gKuPH0hMcquPPw==", "pvIhG");
        PlayerInteract.IIl[PlayerInteract.lIl[6]] = IIll("OSw/JjoxISIJISY5GAonLig=", "TMGyN");
        PlayerInteract.IIl[PlayerInteract.lIl[7]] = IIll("HDktCx8uKzwuAw==", "qXUTf");
        PlayerInteract.IIl[PlayerInteract.lIl[8]] = IIll("LyE4Ez8XIzsHNi0hCBIqJDYnCT08", "HSWfO");
        PlayerInteract.IIl[PlayerInteract.lIl[9]] = Illl("Lye6M6V8Borof12AlZnB5hiUmP7BkVLA", "eXjVJ");
        PlayerInteract.IIl[PlayerInteract.lIl[10]] = lIll("0gfQtAn1BeL7gG+vyf0F0AceyrKPc8eG", "GGAmF");
        PlayerInteract.IIl[PlayerInteract.lIl[11]] = Illl("O8sowkTrIuTufzt0bFASuSROOvnXrctW", "rTYhu");
        PlayerInteract.IIl[PlayerInteract.lIl[12]] = IIll("OTQCGhgLJhM/BA==", "TUzEa");
        PlayerInteract.IIl[PlayerInteract.lIl[13]] = lIll("3MKXNMbuk25PBuItf5E0+w1A5zsxM8NV", "qWttj");
        PlayerInteract.IIl[PlayerInteract.lIl[14]] = Illl("HDVgoBGQCawV6k1sYD0ljw==", "zqPRn");
        PlayerInteract.IIl[PlayerInteract.lIl[15]] = Illl("Z5Oo9QEMWrH4bYBB0EhNVA==", "bDjFz");
    }
    
    private static boolean lIIIl(final Object llIIIIIIlllllll, final Object IlIIIIIIlllllll) {
        return llIIIIIIlllllll != IlIIIIIIlllllll;
    }
    
    public List<Player> getPlayersInRadius(final Location llIIIIlIlllllll, final int IlIIIIlIlllllll) {
        final List<Player> lIIIIIlIlllllll = new ArrayList<Player>();
        final short lIllllIIlllllll = (short)llIIIIlIlllllll.getWorld().getPlayers().iterator();
        while (llIIl(((Iterator)lIllllIIlllllll).hasNext() ? 1 : 0)) {
            final Player lIlIIIlIlllllll = ((Iterator<Player>)lIllllIIlllllll).next();
            if (lIlIl(IIlIl(llIIIIlIlllllll.distance(lIlIIIlIlllllll.getLocation()), IlIIIIlIlllllll))) {
                lIIIIIlIlllllll.add(lIlIIIlIlllllll);
                "".length();
            }
            "".length();
            if ((0x8B ^ 0x8E) <= 0) {
                return null;
            }
        }
        return lIIIIIlIlllllll;
    }
    
    static {
        IIIIl();
        llll();
    }
    
    private static String Illl(final String lIllIIIIlllllll, final String IIllIIIIlllllll) {
        try {
            final SecretKeySpec IlIIlIIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIllIIIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIIIlIIIlllllll = Cipher.getInstance("Blowfish");
            lIIIlIIIlllllll.init(PlayerInteract.lIl[2], IlIIlIIIlllllll);
            return new String(lIIIlIIIlllllll.doFinal(Base64.getDecoder().decode(lIllIIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIlIIIlllllll) {
            IIIIlIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static int IIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static String lIll(final String IlIIllIIlllllll, final String lIIIllIIlllllll) {
        try {
            final SecretKeySpec lllIllIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIllIIlllllll.getBytes(StandardCharsets.UTF_8)), PlayerInteract.lIl[9]), "DES");
            final Cipher IllIllIIlllllll = Cipher.getInstance("DES");
            IllIllIIlllllll.init(PlayerInteract.lIl[2], lllIllIIlllllll);
            return new String(IllIllIIlllllll.doFinal(Base64.getDecoder().decode(IlIIllIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIIlllllll) {
            lIlIllIIlllllll.printStackTrace();
            return null;
        }
    }
}
