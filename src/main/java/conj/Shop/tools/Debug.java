package conj.Shop.tools;

import conj.Shop.base.*;

public class Debug
{
    public static boolean debug;
    
    public static void log(final String message) {
        if (Debug.debug) {
            ((Initiate)Initiate.getPlugin((Class)Initiate.class)).getLogger().info(message);
        }
    }
    
    public static void log(final Object o) {
        if (Debug.debug) {
            ((Initiate)Initiate.getPlugin((Class)Initiate.class)).getLogger().info(o.toString());
        }
    }
}
